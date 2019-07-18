create source table topic1(
    key varchar,
    value varchar,
    event_time bigint
) with (
    type = 'ideal.sylph.plugins.flink.source.TestSource'
);

-- 定义数据流输出位置
create sink table print_table_sink(
    key varchar,
    cnt long,
    window_time varchar
) with (
    type = 'ideal.sylph.plugins.flink.sink.PrintSink',   -- print console
    other = 'demo;001'
);

-- 定义 WATERMARK,通常您应该从kafka message中解析出event_time字段
create view TABLE foo
WATERMARK event_time FOR rowtime BY ROWMAX_OFFSET(5000)  --event_time 为您的真实数据产生时间
AS 
with tb1 as (select * from topic1)  --通常这里解析kafka message
select * from tb1;

-- 描述数据流计算过程
insert into print_table_sink
select key,
count(1),
cast(TUMBLE_START(rowtime,INTERVAL '5' SECOND) as varchar)|| '-;->'
|| cast(TUMBLE_END(rowtime,INTERVAL '5' SECOND) as varchar) AS window_time
from foo where key is not null
group by key,TUMBLE(rowtime,INTERVAL '5' SECOND)

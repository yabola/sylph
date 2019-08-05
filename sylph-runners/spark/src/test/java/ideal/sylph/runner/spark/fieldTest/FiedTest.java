package ideal.sylph.runner.spark.fieldTest;

import java.lang.reflect.Field;

public class FiedTest {
    public static void main(String[] args) throws NoSuchFieldException,
            SecurityException,
            IllegalArgumentException,
            IllegalAccessException {
        Person person = new Person();
        person.setName("VipMao");
        person.setAge(24);
        person.setSex("男");
        person.setParent("manParent");

        Field fp = person.getClass().getSuperclass().getDeclaredField("ideal$sylph$runner$spark$fieldTest$Man$$parent");
        fp.setAccessible(true);
        System.out.println(fp.get(person));

        //通过Class.getDeclaredField(String name)获取类或接口的指定属性值。
        Field f1 = person.getClass().getDeclaredField("name");
        //不加报错
        f1.setAccessible(true);
        System.out.println("-----Class.getDeclaredField(String name)用法-------");
        System.out.println(f1.get(person));
        System.out.println("-----Class.getDeclaredFields()用法-------");

        System.out.println("遍历开始...");
        //通过Class.getDeclaredFields()获取类或接口的指定属性值。
        Field[] f2 = person.getClass().getDeclaredFields();
        for (Field field: f2) {
            field.setAccessible(true);
            System.out.println(field.get(person));
        }
        //修改属性值
        System.out.println("----修改name属性------");
        f1.set(person, "Maoge");
        //修改后再遍历各属性的值
        Field[] f3 = person.getClass().getDeclaredFields();
        for (Field fields: f3) {
            fields.setAccessible(true);
            System.out.println(fields.get(person));
        }
    }
}

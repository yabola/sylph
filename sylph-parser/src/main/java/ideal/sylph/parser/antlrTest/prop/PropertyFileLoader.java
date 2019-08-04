package ideal.sylph.parser.antlrTest.prop;

import org.antlr.v4.misc.OrderedHashMap;

import java.util.Map;

public class PropertyFileLoader extends PropertyFileBaseListener {
    Map<String,String> props = new OrderedHashMap<String, String>();

    public void exitProp(PropertyFileParser.PropContext ctx){

        String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;

        String value = ctx.STRING().getText();

        props.put(id,value);

    }

}

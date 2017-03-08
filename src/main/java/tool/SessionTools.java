package tool;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by geyao on 2017/1/1.
 */
public class SessionTools {
	public static Map removeAttributes(Map session, ArrayList<String> attributes){
		Map temp =session;
		for (String attribute:
		     attributes) {
			if (temp.containsKey(attribute))
				temp.remove(attribute);
		}
		return temp;
	}

	public static Map removeAttribute(Map session, String key){
		Map temp = session;
		if (temp.containsKey(key))
			temp.remove(key);
		return temp;
	}
}

package tool;

import java.util.*;

/**
 * Created by Administrator on 2017/3/3.
 */
public class MapSort {

    /**
     * map<Integer,Integer>按照value降序
     * @param oldMap
     * @return
     */
    public static Map sortMap(Map oldMap) {
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(oldMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> arg0,
                               Map.Entry<Integer, Integer> arg1) {
                return arg1.getValue() - arg0.getValue();
            }
        });
        Map newMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            newMap.put(list.get(i).getKey(), list.get(i).getValue());
        }
        return newMap;
    }
}

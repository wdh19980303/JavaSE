package JavaSE.SetUse;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapUse {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(4,"we4");
        map.put(3,"we3");
        map.put(2,"we2");
        map.put(1,"we1");
        System.out.println(map);
    }
}

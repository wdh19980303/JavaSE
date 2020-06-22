package JavaSE.SetUse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("wxz",1998);
        map.put("wxp",1998);
        map.put("wdh",1994);
        map.put("wyz",1995);
        System.out.println(map);
        System.out.println(map.get("wyz"));//根据key返回value
        map.remove("wdh");//根据key移除value
        System.out.println();
        System.out.println(map.size());//返回map的长度
        System.out.println(map.containsKey("wxp"));//看看存不存在这个key
        System.out.println(map.containsValue(1998));//看看存不存在这个value
//        map.clear(); 清空map
        map.values();//获取所有的value值
        System.out.println(map.values());
        Set<String> keys = map.keySet();//获取key集合

        //遍历HashMap
        for(String key:keys){
            System.out.println(key);
        }
    }

}

package JavaSE.SetUse;

import java.util.HashSet;
import java.util.Set;

public class HashSetUse {
    public static void main(String[] args) {
        Set hash = new HashSet();
        int i = 100;
        hash.add(i);
        hash.add("res");//加元素
        hash.add(8);//加元素
        hash.add(3);//加元素
        System.out.println(hash);
        hash.remove(100);//移除元素
        //set集合不可重复的，重复的存不进去，null可以存进去
        System.out.println(hash);
        System.out.println(hash.contains(1));//判断是否包含1，返回是boolean值
        System.out.println(hash.size());//输出元素个数
        for(Object obj : hash){
            System.out.println(obj); //迭代输出
        }
        hash.clear(); //清空集合
        System.out.println(hash);

        Set<String> setString = new HashSet<String>();
        setString.add("sub");

    }
}

package JavaSE.SetUse;

import java.util.ArrayList;
import java.util.List;

public class ListUse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.add("s1");

        List<String> lists = new ArrayList<>();
        lists.add("f1");
        lists.add("f2");
        lists.add("f2");
        lists.add("f3");
        list.add(3,"sInert");//从指定下标插入元素
        System.out.println(list);
        list.addAll(2,lists);//从指定下标插入集合
        System.out.println(list);
        System.out.println(list.indexOf("f2"));//返回元素第一次出现的下标
        System.out.println(list.lastIndexOf("f2"));//返回元素最后一次出现的下标
        list.remove("f2");//根据值移除元素
        list.remove(1);//根据下标移除元素
        list.set(1,"fuck");//根据元素下标修改元素
        List<String> sublist = list.subList(2,5);//根据索引下标截取一段元素形成行新的集合，包含起始位置，不包含结束位置
        System.out.println(sublist);
    }
}

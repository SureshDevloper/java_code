import java.util.*;

class HashMapExample{
    public static void main(String []args){
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"suresh");
        map.put(2,"kumar");
        map.put(3,"yadav");
        map.put(3,"yadav");
        // map.entrySet().stream().forEach(i-> System.out.println(i));
        // System.out.println("hasmap value are:" + map);
        map.put(1,"aman");
        map.put(null,null);
        map.put(null,"sky");
        HashMap<Integer, String> map1=new HashMap<>(map);
        System.out.println(map1);
    }
}
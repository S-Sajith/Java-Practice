package JavaCollections.HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(); // Key pair values
        // has maps by default are not always sorted
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        testMap(hashMap);
        testMap(linkedHashMap);//maintains order that you put it in
        testMap(treeMap); // maintains natural order
    }

    public static void testMap(Map<Integer,String>  map){
        map.put(9,"den");
        map.put(2,"men");
        map.put(5,"ken");
        map.put(1,"jen");
        map.put(4,"ben");

        for(Integer key: map.keySet()){
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }

}

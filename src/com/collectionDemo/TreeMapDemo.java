package com.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args){
        TreeMap<String, Integer> toyInventory = new TreeMap<>();
        toyInventory.put("Action figure", 10);
        toyInventory.put("Age", Integer.parseInt("5"));
        toyInventory.put("Stuffed animal", 15);
        System.out.println("The size of my map is "+toyInventory.size());

        for(Map.Entry<String, Integer> entry : toyInventory.entrySet()){
            String toyName = entry.getKey();
            int quality = entry.getValue();
            System.out.println("Toy: "+ toyName+ ", Quality: "+ quality);
        }
    }
}

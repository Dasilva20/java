package com.collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){
        HashMap<String, Integer> toyInventory = new HashMap<>();
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

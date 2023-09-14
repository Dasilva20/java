package com.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List list = new ArrayList<>();

        list.add("Tobi");
        list.add(23);
        list.add(23);
        list.add(23);

        System.out.println("The size of my list is "+list.size());

        for (int i = 0; i < list.size(); i++)
            System.out.println();
    }
}

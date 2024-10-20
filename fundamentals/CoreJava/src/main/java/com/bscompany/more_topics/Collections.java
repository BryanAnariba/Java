package com.bscompany.more_topics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        
        /*
            Api Collection => tiene List, Queue, Set
                List    -> Tiene ArrayList
                Queue   -> Tiene Dequeue
                Set     -> HashSet, LinkHashSet
        */
        
        System.out.println("=========================LIST=======================");
        Collection<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(4);
        for (int number: nums) {
            System.out.println("Number: " + number);
        }
        
        System.out.println("=========================SET=======================");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(4);
        for (int number: numbers) {
            System.out.println("Number: " + number);
        }
        
        System.out.println("=========================MAP=======================");
        Map<String, Integer> students = new HashMap<>();
        students.put("Goku", 80);
        students.put("Perez", 80);
        students.put("Ariel", 80);
        students.put("Gohan", 80);
        students.put("Trunks", 80); 
        System.out.println(students.keySet());
        
    }
}

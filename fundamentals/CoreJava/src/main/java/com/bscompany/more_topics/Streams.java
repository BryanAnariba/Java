package com.bscompany.more_topics;

import java.util.Arrays;
import java.util.List;

// 13 20 00

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1,2,5,4,6);
                
        for (Integer num: numbs) {
            System.out.println("Num: " + num);
        }
    }
}

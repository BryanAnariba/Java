package com.bscompany.corejava;

// 04:00
public class Arrays {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 9;
        nums[1] = 2;
        nums[2] = 92;
        nums[3] = 90;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("value: " + nums[i]);
        }
    }
}

package com.bscompany.corejava;

class Student {
    public static String college = "IPC";
    private int id;
    private String name;
    private String avg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", avg=" + avg + '}';
    }

    public Student(int id, String name, String avg) {
        this.id = id;
        this.name = name;
        this.avg = avg;
    }
}

public class ArraysStaticPOO {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 9;
        nums[1] = 2;
        nums[2] = 92;
        nums[3] = 90;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("value: " + nums[i]);
        }
        
        for (int n: nums) {
            System.out.println("n = " + n);
        }
        
        // Students array
        Student students[] = new Student[3];
        students[0] = new Student(1, "Goku", "70");
        students[1] = new Student(2, "Gohan", "80");
        students[2] = new Student(3, "Vegeta", "90");
        
        for (Student student: students) {
            System.out.println("College: " + Student.college + " " + student);
        }
    }
}

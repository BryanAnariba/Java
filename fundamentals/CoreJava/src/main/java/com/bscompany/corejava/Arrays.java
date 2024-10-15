package com.bscompany.corejava;

class Student {

    public int rollno;
    public String name;
    public int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + ", marks=" + marks + '}';
    }
}

public class Arrays {

    public static void main(String[] args) {

        int nums[] = new int[4];
        int numbers[][] = new int[3][4];

        nums[0] = 9;
        nums[1] = 2;
        nums[2] = 92;
        nums[3] = 90;

        for (int n : nums) {
            System.out.println("n:" + n);
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = (int) (Math.random() * 100);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }

        Student students[] = new Student[3];
        students[0] = new Student(1, "Goku", 50);
        students[1] = new Student(2, "Gohan", 60);
        students[2] = new Student(3, "Vegeta", 70);
        
        for (Student student: students) {
            System.out.println(student);
        }
    }
}

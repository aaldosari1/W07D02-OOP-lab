package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Teacher teacher1=new Teacher("Ahmed",29,"Good");
        Teacher teacher2=new Teacher("Salem",39,"excellent");

        Student student1 = new Student( "Fahad",8,"A+");
        Student student2 = new Student( "Mohammed",7,"B-");
        Student student3 = new Student( "Salman",6,"A");

        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());




    }
}

package com.company;

public class Student {

    String Name;
    int Age;
    String Grade;

    Student(String name, int age,String grade){
        Name=name;
        Age=age;
        Grade=grade;

    }

    public String toString(){

        return "The Student's name is: "+Name+
                ", The Student's age is: "+Age+
                ", The Student's grade is: "+Grade;
    }
}

package com.company;

public class Teacher {

    String Name;
    int Age;
    String TeachingQuality;

    Teacher(String name, int age,String quality){
        Name=name;
        Age=age;
        TeachingQuality=quality;

    }

    public String toString(){

        return "The teacher's name is: "+Name+
                ", The teacher's age is: "+Age+
                ", The Teacher's TeachingQuality is: "+ TeachingQuality;
    }

}

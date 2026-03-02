package com.corejava.oops.NestedClass;

abstract class Teacher {
    public void teachStudents() {
        System.out.println("I am teaching students");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {     
        Teacher t = new Teacher() {
            public void teachStudents () {
                System.out.println("I am teaching English language");
            }
        };
        t.teachStudents();
      }
}

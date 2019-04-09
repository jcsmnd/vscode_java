//Written by Myungsik Kim
package com.jcsmnd.oop;

class Main{
    public static void main(String[] args){

        Person[] p = new Person[2];

        p[0] = new Freshman("Myungsik Kim", "111-222-3333", "google@google.com", "1111king st, park, california 90010", "1995-01-01", 20190001, 3.99, "active");
        
        //overriding
        p[0].info();
        p[1] = new Teacher("Teacher01", "111-223-4252", "microsoft@microsoft.com", "222dev st, apsw, calwo 22102", "1902-05-12", 200802, "freshman class teacher");
       
        //overriding
        p[1].info();

        //interface object
        viewStudent s = new Student("Student01", "111-222-3333", "student01@google.com", "3333king st, park, california 90011", "1955-02-04", 20190002);
        
        //child interface's class
        s.view();
        
        //super interface's class
        s.info();
    }
}
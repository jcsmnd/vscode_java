package com.mkim.exercise;

class student{
    
    private int sid;
    private String name;

    student(int sid, String name){
        this.sid = sid;
        this.name = name;
    }

    int getSid(){
        return sid;
    }

    void setSid(int sid){
        this.sid = sid;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    void student_info(){
        System.out.println("id:"+sid);
        System.out.println("name:"+name);
    }
}

class freshman extends student{
    private Double GPA; 
    private String status;
    
    freshman(int sid, String name, Double GPA, String status){
        super(sid, name);
        this.GPA = GPA;
        this.status = status;
    }

    Double getGPA(){
        return GPA;
    }

    void setGPA(Double GPA){
        this.GPA = GPA;
    }

    String getStatus(){
        return status;
    }

    void setStatus(String status){
        this.status = status;
    }

    void student_status(){
        System.out.println("sid:"+getSid()+" Student:"+getName()+" GPA:"+GPA+" status:"+status);
    }
}

class E03{
    public static void main(String[] args){
        freshman kim = new freshman(20190001, "Jack", 3.14, "process");
        kim.student_status();
        kim.setSid(20190002);
        kim.student_status();
    }
}
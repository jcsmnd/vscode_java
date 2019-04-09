//Written by Myungsik Kim
package com.jcsmnd.oop;

class Teacher extends Person{

    private int tid;
    private String duty;

    Teacher(String name, String phone, String email, String address, String dob, int tid, String duty){
        super(name,phone,email,address,dob);
        this.tid = tid;
        this.duty = duty;
    }

    public int getTid() {return tid;}
    public String getDuty() {return duty;}

    public void setTid(int tid) {this.tid = tid;}
    public void setDuty(String duty) {this.duty = duty;}

    public void info(){ //method overriding
        super.info();
        System.out.println("Teacher ID:"+getTid());
        System.out.println("Teacher ID:"+getDuty());
    }

}
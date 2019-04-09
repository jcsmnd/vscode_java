//Written by Myungsik Kim
package com.jcsmnd.oop;

class Student extends Person implements viewStudent{
    
    private int sid;

    Student(String name, String phone, String email, String address, String dob, int sid){
        super(name,phone,email,address,dob);
        this.sid = sid;
    }

    public int getSid() {return sid;}
    public void setSid(int sid) { this.sid = sid;}

    public void info(){ //method overriding
        super.info();
        System.out.println("Student ID:"+getSid());
    }

    public void view(){ //interface method
        System.out.println("Student ID:"+getSid());
    }

    @Override
	public void admin() {
        System.out.println("admin access only");
	}
}

class Freshman extends Student{
    
    private Double GPA; 
    private String status;
    
    Freshman(String name, String phone, String email, String address, String dob, int sid, Double GPA, String status){
        super(name,phone,email,address,dob,sid);
        this.GPA = GPA;
        this.status = status;
    }

    public Double getGPA() {return GPA;}
    public String getStatus() {return status;}
    public void setGPA(Double gPA) {GPA = gPA;}
    public void setStatus(String status) {this.status = status;}
    
    public void info(){
        super.info();
        System.out.println("GPA:"+getGPA());
        System.out.println("status:"+getStatus());
    }
}
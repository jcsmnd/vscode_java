//Written by Myungsik Kim
package com.jcsmnd.oop;

abstract class Person implements viewPerson{
    
    private String name, phone, email, address, dob;
    
    Person(String name, String phone, String email, String address, String dob){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dob = dob;
    }

    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}
    public String getAddress() {return address;}
    public String getDoB() {return dob;}
    public void setName(String name) {this.name = name;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail(String email) {this.email = email;}
    public void setAddress(String address) {this.address = address;}
    public void setDoB(String dob) {this.dob = dob;}

    public void info(){
        System.out.println("Full name:"+getName());
        System.out.println("Phone number:"+getPhone());
        System.out.println("Email address:"+getEmail());
        System.out.println("Physical address:"+getAddress());
        System.out.println("Date of Birth:"+getDoB());
    }

    public abstract void admin(); //this is admin access only
}
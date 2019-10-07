//Written by Myungsik Kim
package com.jcsmnd.oop;

class Teacher extends Person{

    private int tid;
    private String duty;

    Teacher(){
        super();
        System.out.println("default constructor");
    }

    Teacher(String name, String phone, String email, String address, String dob, int tid, String duty){
        super(name,phone,email,address,dob);
        this.tid = tid;
        this.duty = duty;
    }

    public int getTid() {return tid;}
    public String getDuty() {return duty;}

    public void setTid(int tid) {this.tid = tid;}
    public void setDuty(String duty) {this.duty = duty;}

    @Override
    public void info(){
        super.info();
        System.out.println("Teacher ID: "+getTid());
        System.out.println("Class room assignment: "+getDuty());
    }

	@Override
	public void admin() {
		System.out.println("admin access only");
	}

}
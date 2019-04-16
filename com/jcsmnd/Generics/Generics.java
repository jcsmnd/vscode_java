//Written by Myungsik Kim

package com.jcsmnd.generics;

class Generics<T>{
    private T info;

    private Generics( T ref){
        this.info = ref;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public static void main(String[] args){

        Generics<String> person = new Generics<>("hi");
        System.out.println(person.getInfo()); 
        person.setInfo("Myungsik Kim");
        System.out.println(person.getInfo()); 
        
    }
}


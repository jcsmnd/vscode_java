//Written by Myungsik Kim

package com.jcsmnd.generics;

class Generics<T>{
    public T info;

    public static void main(String[] args){

        Generics<String> person = new Generics<String>();

        person.info = "Myungsik Kim";
    }
}


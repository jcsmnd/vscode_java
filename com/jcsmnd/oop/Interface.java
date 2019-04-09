//Written by Myungsik Kim
package com.jcsmnd.oop;

interface viewPerson{
    public void info();
}

interface viewStudent extends viewPerson{
    public void view();
}
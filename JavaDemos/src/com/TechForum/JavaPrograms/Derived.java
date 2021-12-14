package com.TechForum.JavaPrograms;

public class Derived extends Base {
    protected int count= 10;
    public int getSize(){
       return count;
    }
    public static void main(String[] args) {
       Base b = new Derived();
       System.out.println (b.count + "," + b.getCount());   
    }
}


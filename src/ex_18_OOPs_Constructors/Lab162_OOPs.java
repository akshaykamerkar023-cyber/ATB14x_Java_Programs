package ex_18_OOPs_Constructors;

import ex_17_OOPs.Baby;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b = new Baby();
        new Baby();
        new Baby();
        Baby b2 = new Baby();
        System.out.println("b2.name: " + b2.name);
    }
}

//Class Baby{
//    String name;
//
//    Baby() {
//        System.out.println("Baby");
//    }
//        }
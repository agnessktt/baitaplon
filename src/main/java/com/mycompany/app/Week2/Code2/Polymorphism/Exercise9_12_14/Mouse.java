package com.mycompany.app.Week2.Code2.Polymorphism.Exercise9_12_14;

public class Mouse extends Rodent{

    public Mouse(String name, Teeth sharedTeeth) {
        super(name, sharedTeeth);
    }

    @Override
    public void eat() {
        System.out.println("Mouse is gobble");
    }

    @Override
    public void run() {
        System.out.println("Mouse run fast");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }

}

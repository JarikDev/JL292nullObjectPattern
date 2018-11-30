package com;

import com.sun.scenario.animation.AnimationPulseMBean;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Animal  animal=getAnimal();
        animal.eat();
    }
    static Animal getAnimal(){
        try {
            if (new File("nosuchfile.txt").exists()) {
                //read file and create lion
                return new Lion();
            }
        }finally {
            return new NullAnimal();
        }
    }
}
interface Animal{
    void eat();
}
class Lion implements Animal{

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }
}
class NullAnimal implements Animal{

    @Override
    public void eat() {

    }
}
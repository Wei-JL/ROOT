package com.Volant;

public class Supermen implements Volant ,Honest{


    @Override
    public void fly() {
        System.out.println("横着飞");
    }

    @Override
    public void stop() {
        System.out.println("竖着停");
    }

    @Override
    public void helpOther() {
        System.out.println("做好事");

    }

    public static void main(String[] args) {
        Volant m=new Supermen();
        m.fly();
        Honest h =(Honest)m;
        h.helpOther();
    }
}

package com.abstractClass;

public class Test {
    public static void main(String[] args) {

        Student s = new SxtStu();
        s.exam();
        s.study();
    }
}
 class SxtStu extends Student{

      @Override
      public void study() {
         System.out.println("好好学习");
      }

      @Override
      public void exam() {
        System.out.println("考120");
      }
  }


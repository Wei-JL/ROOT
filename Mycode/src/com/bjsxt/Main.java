package com.bjsxt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("我的年薪计算器App");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入月薪：");
            int monthSalary = scanner.nextInt();
            System.out.println("请输入一年多少月薪资：");
            int months= scanner.nextInt();
            int yearSalary = monthSalary * months;

            if(yearSalary>100000&&yearSalary<200000){
                System.out.println("恭喜你超过90%国人");
            }
            if (yearSalary>200000){
                System.out.println("恭喜你超过98%国人");
            }

            System.out.println("年薪是：" + yearSalary);
            System.out.print("按任意键继续，输入exit退出:");
            scanner.nextLine();
            String command=scanner.nextLine();
            if("exit".equals(command)){
                System.out.println("退出软件");
                break;
            }
            // write your code here
        }
    }
}

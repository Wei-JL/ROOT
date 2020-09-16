package com.yxy;

public class BankTest {

}
class Bank{
    private Bank(){}//单例模式，同步
    private static Bank instance=null;

    public static  Bank getInstance() {
        if (instance == null) {//减少等待提升效率
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}

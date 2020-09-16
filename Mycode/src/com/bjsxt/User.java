package com.bjsxt;

public class User  {
    int id;
    String name;
    String pwd;

    User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }

    public static void main(String[] args) {
        User user=new User(1001,"yx","333");
        User user2=new User(1001,"jl","666");




    }
}

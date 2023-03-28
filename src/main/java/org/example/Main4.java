package org.example;

interface Speaker{
    void print(String str);
}

public class Main4 {
    public static void main(String[] args) {
        new Speaker(){
            @Override
            public void print(String str) {
                System.out.println("hello world"+str);
            }
        }.print("南昌");
    }
}

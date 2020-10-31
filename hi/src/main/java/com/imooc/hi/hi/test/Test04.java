package com.imooc.hi.hi.test;

public class Test04 {
    public static void main(String[] args) {
        /*System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("/"));
        System.out.println();*/
        
        try {
            test();
            System.out.println(123);
        }catch(Exception e) {
            System.out.println(1);
            System.out.println(e);
        }
        System.out.println(3);
    }

    private static void test() {
        String ss = "".split(",")[2];
    }

}

package com.atguigu.primeNumber;

import java.sql.SQLOutput;

/*
* 100以内所有质数的输出
*
*
* */
public class primeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean isFlag = true;
        int count = 0;
        for (int i = 2 ;i<=100000; i++){
            for(int j = 2;j<=Math.sqrt(i);j++) {
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag==true){
                count++;
                //System.out.println(i);
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为："+count);
        System.out.println("所花费的时间为："+(end-start));
    }
}

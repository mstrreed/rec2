package com.company;

import java.util.Scanner;

public class fib {
    static int sum=0;
    public static void main(String[] args) {
        int v11 = 1;
        int v21 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(v11 + " ");
        System.out.print(v21 + " ");
        fib1(n,v11,v21);
    }
    public static void fib1(int num,int v1,int v2)
    {
        if(num==0)
        {
            return;
        }
        else
        {
           sum=v1+v2;
            System.out.print(sum+" ");
           fib1(--num,v2,sum);
        }
    }
}

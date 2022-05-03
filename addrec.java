package com.company;

import java.util.Scanner;

public class addrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(add(x,y));
    }
    public static int add(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
       return add((a^b),((a&b)<<1));
    }
}
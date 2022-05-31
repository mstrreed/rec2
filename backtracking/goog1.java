package com.company.backtracking;

import java.util.Scanner;

public class goog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int no1 = sc.nextInt();
        String[] arr1 = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        pal(arr1[no],arr1[no1],arr1[no1]);
    }
        public static void pal(String g,String f,String up)
        {
            String p="";
            if(g.length()==0&&f.length()==0)
            {
                return;
            }
            if(f.length()==0&&g.length()==1)
            {
                pal(g.substring(1),f,up);
            }

            if (f.length()==0&&g.length()!=0)
            {
                f=up;
                pal(g.substring(1),f,up);
            }
            p=p+g.charAt(0)+f.charAt(0);
            System.out.println(p);
            pal(g,f.substring(1),up);


    }
}

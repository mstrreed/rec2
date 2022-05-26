package com.company.backtracking;

import java.util.Scanner;

public class Maze1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][] =new int [3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println(paths(arr1,3,3));
    }
    public static int paths(int [][] arr,int r,int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
       return paths(arr,r-1,c)+paths(arr,r,c-1);
    }
}

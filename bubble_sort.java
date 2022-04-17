package com.company;

import java.util.Scanner;

public class bubble_sort
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int[] arr=new int[c];
        for(int i=0;i<c;i++)
        {
            arr[i]=sc.nextInt();
        }
        bub(arr,c,1);
        for(int j=0;j<c-1;j++)
        {
            System.out.print(arr[j]+",");
        }
        System.out.print(arr[arr.length-1]);
    }
    public static void bub(int [] arr1,int n,int ch)
    {
        if(n==0)
        {
            return;
        }
        if(ch<n)
        {
            if(arr1[ch-1]>arr1[ch])
            {
                arr1[ch-1]=arr1[ch-1]^arr1[ch];
                arr1[ch]=arr1[ch]^arr1[ch-1];
                arr1[ch-1]=arr1[ch-1]^arr1[ch];
            }
           bub(arr1,n,ch+1);
        }
        else
        {
            bub(arr1,n-1,1);
        }
    }
}


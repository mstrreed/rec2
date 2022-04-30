package com.company;

import java.util.*;

class Sams {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int S = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int out = solve(arr, N,S);
            System.out.println(out);
        }
    }
    static int solve(int[] arr, int N,int S){
        // Please write your code here
        int arr1[]=new int[arr.length+1];
        int place=0;
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
        arr1[arr.length]=S;
        sort(arr1);
        for(int j=0;j<arr1.length;j++)
        {
            if(arr1[j]==S)
            {
                place=j;
            }
        }
        if((2*place)>arr1.length)
        {
            int temp= arr1.length-place;
            return (place-(temp-1));
        }
        else
        {
            return((arr1.length-1)-(2*(place)));
        }

    }
    public static int[] sort(int[] arr2)
    {
        int n=arr2.length;
        while(n!=0)
        {
            for(int i=1;i<+arr2.length;i++)
            {
                if(arr2[i-1]>arr2[i])
                {
                    arr2[i-1]=arr2[i-1]^arr2[i];
                    arr2[i]=arr2[i-1]^arr2[i];
                    arr2[i-1]=arr2[i-1]^arr2[i];
                }
            }
            --n;
        }
        return arr2;
    }

}
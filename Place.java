package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Place {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        mergeSort(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));

    }
    public static void mergeSort(int[] arr,int s,int e) {
        if ((e-s) == 1) {
            return ;
        }
        int m = (s + e) / 2;
       mergeSort(arr, s, m);
         mergeSort(arr, m, e);
         merge(arr, s, m, e);
    }
    public static void merge(int[] arr1,int s1,int m1,int e1){
        int i=s1;int j=m1;
        int k=0;
        int[] arr2=new int[e1-s1];
        while(i<m1&&j<e1)
        {
            if (arr1[i]>arr1[j])
            {
                arr2[k]=arr1[j];
                j++;
            }
            else
            {
                arr2[k]=arr1[i];
                    i++;
            }
            k++;
        }
        while(i<m1)
        {
            arr2[k]=arr1[i];
            i++;
            k++;
        }
        while(j<e1)
        {
         arr2[k]=arr1[j];
         j++;
         k++;
        }



        for(int l=0;l<arr2.length;l++)
        {
            arr1[s1+l]=arr2[l];
        }
    }
}

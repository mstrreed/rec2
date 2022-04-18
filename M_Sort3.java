package com.company;
import java.util.*;
public class M_Sort3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        arr1 = mergesort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] mergesort(int [] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] first,int [] second)
    {
        int[] arr2=new int[first.length+second.length];
        int i=0;int j=0;int k=0;
        while(i<first.length&&j<first.length)
        {
            if(first[i]<second[j])
            {
                arr2[k]=first[i];
                i++;
            }
            else
            {
                arr2[k]=second[j];
                j++;
            }
            k++;
        }

            while(j<second.length)
            {
                arr2[k]=second[j];
                j++;k++;
            }



            while(i<first.length)
            {
                arr2[k]=first[i];
                i++;k++;
            }

        return arr2;
    }
}

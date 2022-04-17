package com.company;

public class pat1 {
    public static void main(String[] args) {
     pat(5,0);
    }
    public static void pat(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            pat(r,c+1);
        }
        else
        {
            System.out.println();
            pat(r-1,0);
        }



    }
}

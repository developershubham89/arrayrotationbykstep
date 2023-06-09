package Array;

import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array :");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter "+n+" elements :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter k :");
        int k=sc.nextInt();
        int ans[]=new int[n];
        int j=0;
        k= k % n;
        for(int i=n-k;i<n;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+ans[i]);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Day7{
    public static void main(String[] args) {
        // rotate array 
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a[]=new int[n];
        // int a[]=new int[n];
        // int a[]={1,0,0,2,3,4,5};
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        // System.out.println("rotate times:");
        // int n=5;
        // int k=sc.nextInt();
        // rev(a, 0, n-1);
        // rev(a, 0, n-k-1);
        // rev(a, n-k, n-1);
        // System.out.println(Arrays.toString(a));
        //program to find the goven array is sorted or not
        // for(int i=0;i<n-1;i++){
        //     if(a[i]>a[i+1]){
        //         System.out.println("not sorted");
        //         return;
        //     }
        // }
        // System.out.println("sorted");
        // int i=0;
        // for(int j=0;j<a.length;j++){
        //     if(a[j]!=0){
        //         int t=a[i];
        //         a[i]=a[j];
        //         a[j]=t;
        //         i++;
        //     }
        // }
        // System.out.println(Arrays.toString(a));
        // int a[] = { 1, 3, 4, 2, 3, 2, 2, 4, 4 };
        // int n = a.length;
        // for(int i=0;i<n;i++){
        //     int c=0;
        //     for(int j=0;j<n;j++){
        //         if(a[i]==a[j]){
        //             c++;
        //         }
        //     }
        //     System.out.println(a[i]+" is repeated "+c+" times");
        //     c=0;
        // }
        // works but prints repeated values
        // boolean b[]= new boolean[n];
        // for(int i=0;i<n;i++){
        //     if(!b[i]){
        //         int c=0;
        //         for(int j=0;j<n;j++){
        //             if(a[i]==a[j]){
        //                 c++;
        //                 b[j]=true;
        //             }
        //         }
        //         System.out.println(a[i]+" repeats "+c+" times");
        //     }
        // }
        // works removing dups and printing frequency
    //     int a[] = { 1, 3, 4, 2, 3, 2, 2, 4, 4 ,4,2,2};
    //     int n = a.length;
    //     int maxCount=0;
    //     int maxElement=-1;
    //     boolean b[]=new boolean[n];
    //     for(int i=0;i<n;i++){
    //         if(!b[i]){
    //             int count=0;
    //             for(int j=0;j<n;j++){
    //                 if(a[i]==a[j]){
    //                     count++;
    //                     b[j]=true;
    //                 }
    //             }
    //             if(count>maxCount){
    //                 maxCount=count;
    //                 maxElement=a[i];
    //             }
    //         }
    //     }
    //     System.out.println(maxCount+" "+maxElement);
    // }
    // static void rev(int[] a,int i,int j){
    //     while(i<j){
    //         int t=a[i];
    //         a[i]=a[j];
    //         a[j]=t;
    //         i++;
    //         j--;
    //     }
    // }
}
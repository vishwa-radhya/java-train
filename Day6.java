import java.util.Arrays;
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        // binary to decimal
        // String str="1101";
        // int decimal=0,power=0;
        // for(int i=str.length()-1;i>=0;i--){
        //     decimal+=(Character.getNumericValue(str.charAt(i))*Math.pow(2,power));
        //     // or else subtract with - '0' works
        //     power++;
        // }
        // System.out.println(decimal);

        //given number is power of 2 or not
        //brute force
        // Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();

        // for(int i=0;i<=num/2;i++){
        //     if(Math.pow(2,i)==num){
        //         System.out.println("yes");
        //         return;
        //     }
        // }
        // System.out.println("no");
        // using log
        // double n = Math.log(num) / Math.log(2);
        // if(n==Math.floor(n)){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }
        // using bit manipulation
        // int val = num & (num-1);
        // System.out.println(val==0?"yes":"no");

        /*
         *  arrays
         */
        // int arr[]={1,2,3,4,5};
        // System.out.println(arr.length);
        // System.out.println(arr);
        // for(int num:arr){
        //     System.out.println(num);
        // }
        //
        // int size=-1;
        // int a[]=new int[size];
        // System.out.println(a.length);
        // a[0]=1;
        // ArrayIndexOutOfBoundsException:
        // NegativeArraySizeException
        // int size =1234553455;
        // int a[]=new int[size];
        // System.out.println(a.length);
        //OutOfMemoryError

        // int a[]=new int[num];
        // for(int i=0;i<num;i++){
        //     a[i]=sc.nextInt();
        // }
        // for(int e : a){
        //     if(e%2==0){
        //         System.out.println(e);
        //     }
        // }
        // System.out.println(Arrays.toString(a));
        // System.out.println("enter length for ar1");
        // int n1 = sc.nextInt();
        // System.out.println("enter nums");
        // int a[]=new int[n1];
        // for(int i=0;i<n1;i++){
        //     a[i]=sc.nextInt();
        // }
        // System.out.println("enter length for ar2");
        // int n2 = sc.nextInt();
        // int b[]=new int[n2];
        // for(int i=0;i<n2;i++){
        //     b[i]=sc.nextInt();
        // }
        // int c[]=new int[Math.max(n1,n2)];
        // int a[]={1,2,3,4};
        // int b[]={1,2,3,4,5,6};
        // int c[]=new int[Math.max(a.length,b.length)];
        // boolean isABig = a.length > b.length ? true : false;
        // for(int i=0;i<c.length;i++){
        //     c[i] = isABig ? 
        //                 (i<b.length ? a[i]*b[i] : a[i])
        //                 :(i<a.length ? a[i]*b[i]:b[i]);
        // }
        // System.out.println(Arrays.toString(c));
        // int a[]={1,2,3};
        // int b[]={4,5,6};
        // int max=a.length>b.length?a.length:b.length;
        // int c[]=new int[max];
        // int min=a.length<b.length?a.length:b.length;
        // for(int i=0;i<min;i++){
        //     c[i]=a[i]*b[i];
        // }
        // for(int i=min;i<max;i++ )
        // {
        //     if(a.length>b.length)
        //     {
        //         c[i]=a[i];
        //     }
        //     else if(b.length>a.length)
        //     {
        //         c[i]=b[i];
        //     }
        // }
        // System.out.println(Arrays.toString(c));
        //maximum ele in an array
        // int n = sc.nextInt();
        // int a[]=new int[n];
        // // int max=0;
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }        
        // second max and second min
        // Arrays.sort(a);
        // System.out.println(a[a.length-1]);
        // System.out.println(a[1]);
        // int max = Integer.MIN_VALUE;
        // int secondMax = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int secondMin = Integer.MAX_VALUE;
        
        // for (int i = 0; i < n; i++) {
        //     // For second maximum
        //     if (a[i] > max) {
        //         secondMax = max;
        //         max = a[i];
        //     } else if (a[i] > secondMax && a[i] != max) {
        //         secondMax = a[i];
        //     }
            
        //     // For second minimum
        //     if (a[i] < min) {
        //         secondMin = min;
        //         min = a[i];
        //     } else if (a[i] < secondMin && a[i] != min) {
        //         secondMin = a[i];
        //     }
        // }
        //program to reverse an array
        // int i=0;
        // int j=a.length-1;
        // while(i<j){
        //     int t=a[i];
        //     a[i]=a[j];
        //     a[j]=t;
        //     i++;
        //     j--;
        // }
        // System.out.println(Arrays.toString(a));
    }
}

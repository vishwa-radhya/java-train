import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //         int num =i;
        //         for(int j=0;j<i;j++){
        //                 System.out.print(num+" ");
        //         }
        //         System.out.println();
        // }
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
        // for(int i=1;i<=n;i++){
        //         int num =i;
        //         for(int j=0;j<n-i;j++){
        //             System.out.print("  ");
        //         }
        //         for(int j=0;j<i;j++){
        //                 System.out.print(num+" ");
        //         }
        //         System.out.println();
        // }
//         1 
//       2 2 
//     3 3 3 
//   4 4 4 4 
// 5 5 5 5 5 
    // for(int i=1;i<=n;i++){
    //             int num =i;
    //             for(int j=0;j<i;j++){
    //                 System.out.print("  ");
    //             }
    //             for(int j=0;j<=n-i;j++){
    //                     System.out.print(num+" ");
    //             }
    //             System.out.println();
    //     }
//   1 1 1 1 1 
//     2 2 2 2 
//       3 3 3 
//         4 4 
//           5
        // for(int i=n;i>=1;i--){
        //         int num =i;
        //         for(int j=i;j<n;j++){
        //             System.out.print("  ");
        //         }
        //         for(int j=0;j<i;j++){
        //                 System.out.print(num+" ");
        //         }
        //         System.out.println();
        // }
// 5 5 5 5 5 
//   4 4 4 4 
//     3 3 3 
//       2 2 
//         1
        // for(int i=n;i>=1;i--){
        //         for(int j=0;j<=n-i;j++){
        //                 System.out.print(i+" ");
        //         }
        //         System.out.println();
        // }
// 5 
// 4 4 
// 3 3 3 
// 2 2 2 2 
// 1 1 1 1 1 
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //             sum+=1;
        //                 System.out.print(sum+" ");
        //         }
        //         System.out.println();
        // }
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        //     int start = num + i - 1; 
        //     for (int j = start; j >= num; j--) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        //     num = start + 1;
        // }
// 1 
// 3 2 
// 6 5 4 
// 10 9 8 7 
// 15 14 13 12 11 
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=i-1;j>=1;j--){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }
// 1 
// 1 2 1 
// 1 2 3 2 1 
// 1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
        // for(int i=1;i<=n;i++){
        //         for(int j=0;j<n-i;j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=i;j>=1;j--){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=2;j<=i;j++){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }
//         1 
//       2 1 2 
//     3 2 1 2 3 
//   4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5
        // int l=1;
        // for(int i=0;i<n;i++){
        //         int k=l;
        //         for(int j=0;j<=i;j++){
        //                 System.out.print(k+" ");
        //                 k=k==0?1:0;
        //         }
        //         l=l==0 ? 1:0;
        //         System.out.println();
        // }
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i+1;j++){
        //                 System.out.print(j+" ");
        //         }
        //         for(int j=1;j<i;j++){
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }
// 1 2 3 4 5 
// 1 2 3 4 1 
// 1 2 3 1 2 
// 1 2 1 2 3 
// 1 1 2 3 4
        // count number of digits
        // int c=0;
        // while(n>0){
        //         c++;
        //         n=n/10;
        // }
        // System.out.println(c);
        //optimal
        // System.out.println((int)Math.log10(n)+1);
        // System.out.println(1);
        // for(int i=2;i<=n/2;i++){
        //         if(n%i==0){
        //                 System.out.println(i);
        //         }
        // }
        // System.out.println(n);
        // common divisors of 3 and 5
        // for(int i=1;i<=n;i++){
        //         if(i%3==0 && i%5==0){
        //                 System.out.println(i);
        //         }
        // }
        //lcm = a*b/gcd(a,b)
        // sum of digits
        // int sum=0;
        // while(n>0){
        //         int last = n%10;
        //         sum+=last;
        //         n=n/10;
        // }
        // System.out.println(sum);
        // reverse and print digits
        // while(n>0){
        //         System.out.print(n%10+"");
        //         n=n/10;
        // }
        // int s=0;
        // while(n>0){
        //         s=s*10+n%10;
        //         n=n/10;
        // }
        // System.out.println(s);
        //armstrong number
        // int sum=0;
        // int t=n;
        // while(n>0){
        //         int last =n%10;
        //         sum+=last*last*last;
        //         n=n/10;
        // }
        // if(sum==t){
        //         System.out.println("yes");
        // }else{
        //         System.out.println("no");
        // }
        //given number is prime
        // for(int i=2;i<=n/2;i++){
        //         if(n%i==0){
        //                 System.out.println("not prime");
        //                 return;
        //         }
        // }
        // System.out.println("prime");
        //also print prime numbers for 1 to 10
//         for(int i=1;i<=n;i++){
//                 if(isPrime(i,n)){
//                         System.out.println(i);
//                 }
//         }
//     }
//     static boolean isPrime(int num,int n){
//         if(num==2) return true;
//         for(int i=2;i<=n/2;i++){
//                 if(num%i==0){
//                         return false;
//                 }
//         }
//         return true;
    }
}

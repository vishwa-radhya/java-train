import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
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
        for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                        System.out.print(j+" ");
                }
                for(int j=1;j<i;j++){
                        System.out.print(j+" ");
                }
                System.out.println();
        }
// 1 2 3 4 5 
// 1 2 3 4 1 
// 1 2 3 1 2 
// 1 2 1 2 3 
// 1 1 2 3 4
    }
}

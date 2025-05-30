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
    }
}

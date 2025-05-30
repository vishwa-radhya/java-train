import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){

        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        /*
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
         */
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){

        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
/*
* * * * * 
* * * * 
* * * 
* * 
* 
*/
    // for(int i=1;i<2*n;i++){
    //     int r=i>n ? 2*n-i : i;
    //         for(int j=0;j<r;j++){

    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }      
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
        // for(int i=0;i<n;i++){
        //     // for spaces
        //     for(int j=0;j<=n-i;j++){

        //         System.out.print("  ");
        //     }
        //     // for stars
        //     for(int j=0;j<=i;j++){

        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }  
/*
            * 
          * * 
        * * * 
      * * * * 
    * * * * *
 */
        // for(int i=0;i<n;i++){
        //     // for spaces
        //     for(int j=0;j<i;j++){

        //         System.out.print("  ");
        //     }
        //     // for stars
        //     for(int j=0;j<n-i;j++){

        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         *
        //  for(int i=1;i<=n;i++){
        //    for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //    }
        //    for(int j=1;j<=(2*i)-1;j++){
        //     System.out.print("*");
        //    }
        //     System.out.println();
        // }
//     *
//    ***
//   *****
//  *******
// *********
        // for(int i=n;i>=1;i--){
        //    for(int j=0;j<n-i;j++){
        //     System.out.print(" ");
        //    }
        //    for(int j=i*2-1;j>=1;j--){
        //     System.out.print("*");
        //    }
        //     System.out.println();
        // }
// *********
//  *******
//   *****
//    ***
//     *
    // for(int i=n;i>=1;i--){
    //     for(int j=0;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     }
    // for(int i=2;i<=n;i++){
    //     for(int j=0;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //     }
    // for(int row=0;row<n;row++)
    //     {
    //         for(int space=1;space<=row;space++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int col=1;col<=n-row;col++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     //! lower part
    //     for(int row=2;row<=n;row++)
    //     {
    //         for(int space=1;space<=n-row;space++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int col=1;col<=row;col++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
//  * * * * * 
//   * * * *
//    * * *
//     * * 
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//       for(int i=1;i<=n;i++){
//         for(int j=0;j<i;j++){
//                 System.out.print("* ");
//         }
//         for(int j=1;j<=n*2-i*2;j++){
//                 System.out.print("  ");
//         }
//         for(int j=0;j<i;j++){
//                 System.out.print("* ");
//         }
//         System.out.println();
//       }
//       for(int i=n-1;i>0;i--){
//         for(int j=i;j>0;j--){
//                 System.out.print("* ");
//         }
//         for(int j=n*2-i*2;j>=1;j--){
//                 System.out.print("  ");
//         }
//         for(int j=i;j>0;j--){
//                 System.out.print("* ");
//         }
//         System.out.println();
//       }
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 
        // for(int i=1;i<=n;i++){
        //         for(int j=0;j<=n-i;j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=0;j<2*i-1;j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //         for(int j=n-i;j>=0;j--){
        //                 System.out.print("  ");
        //         }
        //         for(int j=2*i-1;j>0;j--){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 
        // for(int i=n;i>0;i--){
        //         for(int j=0;j<=n-i;j++){
        //                 char c = (char)(65+i+j-1);
        //                 System.out.print(c+" ");
        //         }
        //         System.out.println();
        // }
// E 
// D E
// C D E
// B C D E
// A B C D E
        // int f=0;
        // for(int i=n;i>0;i--){
        //         for(int j=0;j<=n-i;j++){
        //                 char c = (char)(65+f);
        //                 c= f%2==0 ? Character.toLowerCase(c) : Character.toUpperCase(c);
        //                 System.out.print(c+" ");
        //                 f++;
        //         }
        //         System.out.println();
        // }
// a 
// B c 
// D e F 
// g H i J 
// k L m N o 
        
    }
}

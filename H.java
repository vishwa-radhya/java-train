public class H{
    public static void main(String[] args) {
        //A
        // for(int row=0;row<7;row++)
        // {
        //     for(int col=0;col<5;col++)
        //     {
        //         if(col==0&& row!=0||row==3||col==4&&row!=0||row==0&& col!=0&&col!=4){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
       // B
    //    for(int row=0;row<7;row++)
    //     {
    //         for(int col=0;col<5;col++)
    //         {
    //             if(
    //                 col==0||
    //                 row==0&&col!=4||
    //                 row==3&&col!=4||
    //                 row==6&&col!=4||
    //                 col==4 &&row!=0 &&row!=3&&row!=6
    //                 )
    //             {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // J
    // for(int i=0;i<7;i++){
    //     for(int j=0;j<5;j++){
    //         if(
    //          i==0||
    //          i==6 && j!=3 && j!=4||
    //         j==2||
    //         i==5 && j!=1&&j!=3&&j!=4
    //         ){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    //K
    // for(int i=0;i<7;i++){
    //     for(int j=0;j<5;j++){
    //         if(
    //          j==0 ||
    //         i==3 && j==1 ||
    //         j==2 && i==2 ||
    //         j==2 && i==4 ||
    //         j==3 && i==1 ||
    //         j==3 && i==5 ||
    //         j==4 && i==0 ||
    //         j==4 && i==6
    //         ){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // for (int row = 0; row < 7; row++) {
    //         for (int col = 0; col < 5; col++) {
    //             if (col==0||row+col==4||row-col==2) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // Q
    // for(int i=0;i<6;i++){
    //     for(int j=0;j<6;j++){
    //         if (
    //             j==0 && i!=5||j==4 && i!=5||i==0 && j!=5||i==4 && j!=5||
    //             // j==2 && i==2 || j==3 && i==3
    //             i==j && i!=1
    //         ) {
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //     }
    //     System.out.println();
    // }
    // V
    // for(int i=0;i<6;i++){
    //     for(int j=0;j<11;j++){
    //         if(
    //             i==j || i+j==10
    //         ){
    //             System.out.print("* ");
    //         }else{
    //                 System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    //W
    // for(int i=0;i<4;i++){
    //     for(int j=0;j<7;j++){
    //         if(
    //             j==0  ||
    //             j==6  ||
    //             i+j==3 ||
    //             j-i==3
    //             ){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // X
    // for(int i=0;i<7;i++){
    //     for(int j=0;j<7;j++){
    //         if(
    //             i==j || i+j==6
    //             ){
    //             System.out.print("* ");
    //         }else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    //Y
    for(int i=0;i<7;i++){
        for(int j=0;j<7;j++){
            if(
                i==j && j<4 ||
                i+j==6 && j>3 ||
                j==3 && i>3 
                ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}
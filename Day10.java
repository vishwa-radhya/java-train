import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        /*
         * object is the combination of state and behaviour
         * class is a template or blueprint
         * class is a container, collection of objects, doesnt occupy space ex notepad
         * class defines variables and methods common to all objects of a certain kind
         * 
         */ 
        // syntax of clas
        /*
         * class MyClass{
         *  field, constructor and method declarations
         * }
         */
        /*
         * object is a real time entity
         * object is a memory reference of a class
         * object occupy space
         * object is combination of state and behaviour
         */
        /*
         * modifier     class       package(same)     subclass    world(other package)
         * public       y           y                   y           y
         * protected    y           y                   y           n
         * no modifier( y           y                   n           n
         * package
         * private
         * )  
         * private      y           n                   n           n
         */

         /*
          *access specifier used to specify access to method class or variable
          /*
           *public 
           *protected
           *default
           *private
           */
          
          /*
           * to compile -> javac -d Filename.java
           * to run -> java packagename.classname
           * 
           * 
           */
        // print from middle
        // PROGRAM
        //G
        //GR
        //GRA
        //GRAM
        //GRAMP
        //GRAMPR
        //GRAMPRO
        // String s="PROGRAM";
        // int st =(0+s.length())/2;
        // for(int i=1;i<=s.length();i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(s.charAt((j+st)%s.length()));
        //     }
        //     System.out.println();
        // }
        // StringBuilder st = new StringBuilder();
        // int mid = s.length()/2;
        // for(int i=mid;i<s.length();i++){
        //     st.append(s.charAt(i));
        //     System.out.println(st);
        // }
        // for(int i=0;i<mid;i++){
        //     st.append(s.charAt(i));
        //     System.out.println(st);
        // }

        // num of Commas
        // 1,000 -> 1,001 -> ++++
        // 10,000
        // int num=10101;
        // int numOfCommas=0;
        // for(int i=999;i<=num;i++) {
        //     String s = String.valueOf(i);
        //     numOfCommas+=(s.length()-1)/3;
        // }
        // System.out.println(numOfCommas);

        //roman to integer
        // System.out.println(romanToInt("III"));
        // System.out.println(romanToInt("VI"));
        //

        /*
         * default values
         * byte,short, int,long:0
         * float,double:0.0
         * boolean:false
         * char:''(empty)
         * String:null
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
    }
    public static  int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int s1=value(s.charAt(i));
            if(i+1<s.length())
            {
                 int s2=value(s.charAt(i+1));
                 if(s1>=s2)
                 {
                    ans+=s1;
                 }
                 else{
                    ans-=s1;
                 }
            }else{
                ans=ans+s1;
            }
        }
        return ans;

    }
    public static int value(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return -1;
    }
}

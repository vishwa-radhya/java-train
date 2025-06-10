import java.util.Arrays;
import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        // vowel swap
        // google - ooe
        //geoglo - eoo  
        // vowelSwap("google");
        // vowelSwap("Zoho Corportation");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int sumOfNumbersDivisibleByN=0;
        // int sumOfNumbersNotDivisibleByN=0;
        // for(int i=1;i<=m;i++){
        //     if(i%4==0){
        //         System.out.print(i+" ");
        //         sumOfNumbersDivisibleByN+=i;
        //     }else{
        //         sumOfNumbersNotDivisibleByN+=i;
        //     }
        // }
        // System.out.println(Math.abs(sumOfNumbersDivisibleByN-sumOfNumbersNotDivisibleByN));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(!str.contains("$")){
            System.out.println("-1");
            return;
        }
        int dollarCount=0;
        String stAr[] = str.split("");
        for(String s:stAr){
            if(s.equals("$")) dollarCount++;
        }
        int dollarArrCounter=0;
        int nonDollarArrCounter=0;
        String dollarArr[] = new String[dollarCount];
        String nonDollarArr[] = new String[stAr.length-dollarCount];
        String returnArr[] = new String[stAr.length];
        for(int i=0;i<stAr.length;i++){
            if(stAr[i].equals("$")){
                dollarArr[dollarArrCounter++]="$";
            }
        }
        for(int i=0;i<stAr.length;i++){
            if(!stAr[i].equals("$")){
                nonDollarArr[nonDollarArrCounter++]=stAr[i];
            }
        }
        dollarArrCounter=0;
        nonDollarArrCounter=dollarCount;
        for(int i=0;i<returnArr.length;i++){
            if(i<dollarCount){
                returnArr[dollarArrCounter++]=dollarArr[i];
            }else{
                returnArr[nonDollarArrCounter++]=nonDollarArr[i-dollarCount];
            }
        }
        System.out.println(String.join("", returnArr));
    }
    static void vowelSwap(String str){
        int i=0;
        String strArr[]=str.split("");
        int j=strArr.length-1;
        // System.out.println(Arrays.toString(strArr));
        while(i<=j){
            while(i<=j && !isVowel(strArr[i])) i++;
            while(i<=j && !isVowel(strArr[j])) j--;
            String t =strArr[i];
            strArr[i]=strArr[j];
            strArr[j]=t;
            i++;
            j--;
        }
        System.out.println(String.join("", strArr));
    }
    static boolean isVowel(String c){
        return ((c.equalsIgnoreCase("a"))||(c.equalsIgnoreCase("e"))||(c.equalsIgnoreCase("i"))||(c.equalsIgnoreCase("o"))||(c.equalsIgnoreCase("u")));
    }
}

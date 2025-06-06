import java.util.Arrays;
import java.util.Scanner;

public class Day9{
    public static void main(String[] args) {
        // string is immutable , StringBuffer, StringBuilder
        //when string object needs to be modified often we should not use string object
        // it means (immutable)- when we modify a string a new string object is created
        // if no new object is created then it is called mutable
        // StringBuffer - Mutable class - synchronized class
        // we cannot make the string literal as mutable by using StringBuffer
        // synchronized -> a thread safe, mutable sequence of characters.
        
        /*
         * StringBuilder - non synchronous class -java 
         * a mutable sequence of chars this class provides an API compatible with StringBuffer but with no guarantee of synchronization
         * 
         * not synchronized (nultiple activity) parallel activity
         * string builder is not threa safe all methods are not sync methods
         * 
         * methods---
         * append()
         * insert(offset,"char seq")
         * reverse()
         * deleteCharAt(index)
         * replace(start,end,"char seq")
         * hashCode()
         */
        // program to check given string i spalindrome ot not
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // palin(str);
        // System.out.println(palin_space("A man, a plan, a canal: Panama"));
        // System.out.println(palin_space("Ant in ni tan"));
        // System.out.println(isValidAnagram("anagram", "nagaram"));
        // System.out.println(isValidAnagram("rat", "car"));
        // System.out.println(isValidAnagram("a", "b"));
        // System.out.println(isValidAnagram("a", "a"));
        // System.out.println(isValidAnagram("ggii", "eekk"));
        System.out.println(sentence_is_panagram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(sentence_is_panagram("leetcode"));
    }
    // static void palin(String str){
    //     int i=0,j=str.length()-1;
    //     while(i<j){
    //         if(str.charAt(i)!=str.charAt(j)){
    //             System.out.println("not palindrome");
    //             return;
    //         }
    //         i++;
    //         j--;
    //     }
    //     System.out.println("its is a palindrome");
    // }
    // static boolean palin_space(String str){
    //     int left=0;
    //     int right=str.length()-1;
    //     while(left<right){
    //         while(left<right && !checkSpace(str.charAt(left))) {
    //             left++;
    //         }
    //         while(left<right && !checkSpace(str.charAt(right))) {
    //             right--;
    //         }
    //         char leftChar = str.toLowerCase().charAt(left);
    //         char rightChar = str.toLowerCase().charAt(right);
    //         if(leftChar!=rightChar){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    // static boolean checkSpace(char c){
    //     return (c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z');
    // }
    // static boolean isValidAnagram(String s,String t){
    //     if(s.length() != t.length()) return false;
    //     int hash[]=new int[26];
    //     int len = s.length();
    //     for(int i=0;i<len;i++){
    //         hash[s.charAt(i)-'a']++;
    //         hash[t.charAt(i)-'a']--;
    //     }
    // //    System.out.println(Arrays.toString(hash));
    // for(int i=0;i<26;i++){
    //     if(hash[i]!=0){
    //         return false;
    //     }
    // }
    //    return true;
    // }
    static boolean sentence_is_panagram(String sentence){
        int hash[] = new int[26];
        for(int i=0;i<sentence.length();i++){
            hash[(sentence.charAt(i)-97)%26]++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]==0){
                return false;
            }
        }
        return true;
        //another approach
        // if(sentence.length()<26) return false;
        // for(int i = 'a'; i <= 'z'; i++){
        //     if(sentence.indexOf(i)<0){
        //         return false;
        //     }
        // }
        // return true;
    }
}
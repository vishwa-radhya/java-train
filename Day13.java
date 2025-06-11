public class Day13 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    static String addBinary(String a, String b) {
    int aDecimal=0;
    int bDecimal=0;
    int k=0;
    for(int i= a.length()-1;i>=0;i--){
        aDecimal+=(a.charAt(i)-'0')*(Math.pow(2,k));
        k++;
    }
    k=0;
    for(int i= b.length()-1;i>=0;i--){
        bDecimal+=(b.charAt(i)-'0')*(Math.pow(2,k));
        k++;
    }
    int sum = aDecimal+bDecimal;
    if(sum==0){
        return "0";
    }
    StringBuilder binary=new StringBuilder();
    while(sum>0){
        binary.append(sum%2);
        sum/=2;
    }
    return binary.reverse().toString();
    }
}

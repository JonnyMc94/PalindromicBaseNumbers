import java.util.*;
public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int palCount = 0;

        for(int i =2; i<11; i++) {
            //String result = asDiffBase(num, i);
            System.out.println(asDiffBase(num, i));
            if(isPalindrome(asDiffBase(num, i))) {
                palCount++;
            }
        }


        System.out.println(palCount);

    }

    static String asDiffBase(int num, int base) {
        String num2 = "" + num;
        return Integer.toString(Integer.parseInt(num2, 10), base);

    }


    public static boolean isPalindrome(String num) {

        int j = num.length()-1;

        for(int i =0; i<num.length(); i++) {

            if(num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }
}

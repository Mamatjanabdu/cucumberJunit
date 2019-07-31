package InterviewQuestions;

import java.util.Arrays;

public class javaInterviewQuestions {

    public static void main(String[] args) {
        boolean b = isAnagaram("read", "read");
        System.out.println(b);
        // Swapping variables without using temp variable
        int x = 10;
        int y = 4;
        y = x + y; // 4 + 10 = 14
        x = y - x; // 14 - 10 = 4;
        y = y - x; // 14 - 4 = 10;
        String result = revSent("I love Finra");
        System.out.println(result);
    }
    String str = "I love Finra";
    // Finra love I
    public static String revSentence(String str) {
        String result = "";
        String[] words = str.split(" ");
        for (int idx = words.length - 1; idx >= 0; idx--) {
            result += words[idx] + " ";
        }
        return result;
    }
    public static String revSent(String str) {
        String rev = "";
        rev = str.substring(7) + str.substring(1, 7) + str.substring(0, 1);
        return rev;
    }
    // Anagaram for example:    listen -> silent
    public static boolean isAnagaram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char [] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        for (int idx = 0; idx < ch1.length; idx++){
            if(ch1[idx] != ch2[idx]) return false;
        }
        return true;
    }


    public class Practice07_isAnagram {
        // A word phrase formed by rearranging the letters of another.
        // for exam: Tool- Stool, Read - Dear, Worth - Throw, Pore- Rope, charm - march.


        public static void main(String[] args) {
            String first ="read";
            String second ="read";
            System.out.println(isAnagram(first, second));
        }
        public static boolean isAnagram(String str1, String str2) {
            if (str1.length()!=str2.length()) {
                return false;
            }
            char [] firstCharArr =str1.toCharArray();// charm=> 'c','h','a','r','m'

            char [] secondCharArr = str2.toCharArray();// march=> 'm','a','r','c','h'
            //sorted==>a,c,h,m,r
            Arrays.sort(firstCharArr);
            Arrays.sort(secondCharArr);
            for(int i =0; i<firstCharArr.length;i++) {
                if(firstCharArr[i]!=secondCharArr[i]) {
                    return false;
                }
            }
            return true;
        }
    }

}


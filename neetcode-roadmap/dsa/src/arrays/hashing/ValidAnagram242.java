package arrays.hashing;

import java.util.Arrays;

public class ValidAnagram242 {
    //Programs has time complexity of 0(n) and space complexity of O(1)
    public static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        if(s.equals(t))
            return true;
        char[] sMap = new char[26];
        char[] tMap = new char[26];
        for(int i=0;i<s.length();i++){
            sMap[s.charAt(i)-'a']++;
            tMap[t.charAt(i)-'a']++;
        }
        return Arrays.equals(sMap,tMap);
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "anagrma";

        System.out.println(s + " and " + t + " are anagrams: " + isValidAnagram(s,t));
    }
}

package two.pointers;

public class ValidPalindromeLC125 {

    public static boolean isPalindrome(String s) {
        s = s.strip();
        s = s.toLowerCase();
        StringBuilder pStringBuilder = new StringBuilder();
        for(char c:s.toCharArray()){
            if((c >= 97 && c <=122) || (c >=48 && c<=57)){
                pStringBuilder.append(c);
            }
        }
        String pString = pStringBuilder.toString();
        int k = pString.length() - 1;
        for(int i = 0;i<pString.length();i++){
            if(pString.charAt(i) != pString.charAt(k)){
                return false;
            }
            k--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

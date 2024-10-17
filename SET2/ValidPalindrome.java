package SET2;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(str));
    }
    static boolean isPalindrome1(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}

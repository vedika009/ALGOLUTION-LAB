package SET3;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        if(happy(n)==1){
            System.out.println(n+ " is a happy number.");
        }
        else{
            happy(n);
        }
    }
    static int happy(int n){
        int rem = 0;
        int sum = 0;
        while(n > 0) {
            rem = n % 10;
            sum = sum + (rem*rem);
            n = n / 10;
        }
        return sum;
    }
}

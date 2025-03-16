import java.util.Scanner;

interface PerformOperation{
    boolean check(int a);
}

public class Lambdas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();

        PerformOperation isOdd= n -> n % 2 !=0;
        PerformOperation isPrime=n -> {
            if(n<2) return false;
            for(int i=2; i * i <n;i++){
                if(n%i==0) return false;
            }
            return true;
        };
        PerformOperation isPalindrome=n -> {
            String str=Integer.toString(n);
            String reversed=new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        while(testCases-- > 0){
            int operation=scanner.nextInt();
            int number=scanner.nextInt();

            if(operation==1){
                System.out.println(isOdd.check(number) ? "ODD":"EVEN");
            }
            if(operation==2){
                System.out.println(isPrime.check(number)? "PRIME": "COMPOSITE");
            }
            if(operation==3){
                System.out.println(isPalindrome.check(number)? "PALINDROME" : "NOT PALINDROME");
            }
        }
        scanner.close();
    }
}

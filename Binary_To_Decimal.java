import java.util.Scanner;

public class BinaryTODecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A 'BINARY' NUMBER : ");
        int a = sc.nextInt();
        int b=a;
        int result = 0;
        int n =0;
        while (a > 0) {
           int remainder = a%10;
           if(remainder != 0 && remainder !=1){
               System.err.println("error : invalid binary number re-run the code and enter a valid binary number only '0' and '1' number \n example : '10101' \n");
               System.exit(1);
           }
            a/=10;

        }

        while(b>0){
           int remainder = b%10;
            result += remainder*Math.pow(2,n);
            b/=10;
            n++;
        }
        System.out.println("your decimal number is : " + result);
    }
}

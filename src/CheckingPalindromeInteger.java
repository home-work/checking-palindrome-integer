import java.util.Scanner;

public class CheckingPalindromeInteger {
    public static void main(String[] args) {
        if (isPalindrome(getNumber())) {
            System.out.println("Là số đối xứng");
        } else System.out.println("Không phải là số đối xứng");
    }

    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        return scanner.nextInt();
    }

    private static boolean isPalindrome(int number) {
        if (reverse(number) == number) {
            return true;
        }
        return false;
    }

    private static int reverse(int number) {
        String textOfNumber = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(textOfNumber);
        String numberReverse = stringBuffer.reverse().toString();
        return Integer.parseInt(numberReverse);
    }
}

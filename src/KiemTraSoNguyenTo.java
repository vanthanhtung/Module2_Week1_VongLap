import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = true;
        if (number<2) {
            check  = false;
        }
        else {
            for (int i= 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {System.out.println(number + " is prime");}
        else {System.out.println(number + " is not prime");}
    }
}

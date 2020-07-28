import java.util.Scanner;

public class SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số lượng cần in ra:");
        int number = input.nextInt();
        int count=0;
        int N=2;

        while (count<number) {
            if (isPrime(N)){
                System.out.print(N + ", ");
                count++;
            }
            N++;
        }
    }
    static boolean isPrime(int num){
        boolean check=true;
        for (int i=2; i<=Math.sqrt(num);i++) {
            if (num%i==0){
                check=false;
            }
        }
        return check;
    }
}
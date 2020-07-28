import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so1 = 0, so2 = 0;
        System.out.println("Nhap so thu nhat");
        so1 = scanner.nextInt();
        System.out.println("Nhap so thu hai");
        so2 = scanner.nextInt();

        if (so1==0 && so2==0) {
            System.out.println("Khong co uoc chung lon nhat");
        }
        else {
            while (so1 != so2) {
                if (so1<so2) {
                    so2 = so2 - so1;
                }
                else {
                    so1 = so1 - so2;
                }
            }
        }
        System.out.println("Uoc chung lon nhat cua 2 so la: "+ so1);
    }
}

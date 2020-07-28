import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tienBanDau=0, tienSauGui=0;
        int soThang = 0; double tiLeLaiSuat=0;

        System.out.println("Nhap vao so tien gui");
        tienBanDau = scanner.nextDouble();
        System.out.println("Nhap vao so thang gui");
        soThang = scanner.nextInt();
        System.out.println("Nhap vao ti le lai suat");
        tiLeLaiSuat = scanner.nextDouble();

        for (int i = 0; i <soThang ; i++) {
            tienSauGui += tienBanDau * (tiLeLaiSuat/100)/12 * soThang;
        }
        System.out.println("Tien sau gui la: "+ tienSauGui);
    }
}

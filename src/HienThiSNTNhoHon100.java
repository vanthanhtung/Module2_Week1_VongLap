public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        for (N=2;N<=100;N++) {
            if (isPrime(N)) {
                System.out.print(N+", ");
            }
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

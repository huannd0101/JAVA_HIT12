package Bai5;

public class RunMain {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(22L));
        System.out.println(isPrime(3.2f));
        System.out.println(isPrime(6.7));
    }

    public static boolean isPrime(int n){
        if (n<2) return false;
        for (int i=2; i*i<=n; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime(long n){
        if (n<2) return false;
        for (int i=2; i*i<=n; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime(float n){
        return false;
    }

    public static boolean isPrime(double n){
        return false;
    }
}

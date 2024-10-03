public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime Numbers are  ");
        for(int iterator=1;iterator<=30;iterator++){
           if(isPrime(iterator)){
               System.out.print(iterator+" ");
           }
        }
    }
    static boolean isPrime(int number){

        if(number<=1)return false;

        for(int i=2;i<=number/2;i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

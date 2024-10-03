import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number need to be Multiply");
        int multiplicator=scanner.nextInt();

        int multipicand=1;
        while(multipicand<=10){
            System.out.printf("%2d * %d = %2d\n",multipicand,multiplicator ,multipicand*multiplicator);
            multipicand++;
        }
    }
}

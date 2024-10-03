import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1");
        int input1=scanner.nextInt();

        System.out.println("Enter number 2");
        int input2=scanner.nextInt();

        System.out.println("Enter number 3");
        int input3=scanner.nextInt();

        if(input1>input2 && input1>input3){
            System.out.println("Greatest Number is "+input1);
        }
        else if(input2>input3){
            System.out.println("Greatest Number is "+input2);
        }
        else {
            System.out.println("Greatest Number is "+input3);
        }
    }
}

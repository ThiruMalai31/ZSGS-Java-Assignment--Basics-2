import java.sql.Array;
import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Digit need to be find for a Second Occurence ");
        int digit=scanner.nextInt();

        System.out.println("Enter Array Size ");
        int arraySize=scanner.nextInt();

        int[] array=new int[arraySize];
        System.out.println("Input number in an Array");

        for(int iterator=0;iterator<arraySize;iterator++){
            array[iterator]= scanner.nextInt();
        }

        int secondOccurence=-1,countOccurence=0;
        for(int iterator=0;iterator<arraySize;iterator++){
            if(array[iterator]==digit){
                countOccurence++;
                if(countOccurence==2){
                    secondOccurence=iterator;
                    break;
                }
            }
        }
        System.out.println("Second Occurence of a Digit "+digit +" is " + secondOccurence);
    }
}

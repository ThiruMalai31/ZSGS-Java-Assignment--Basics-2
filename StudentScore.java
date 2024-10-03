import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Mark");
        int studentMark=scanner.nextInt();
        if(studentMark>=0 && studentMark<=100) {
            switch (studentMark / 10) {
                case 10:
                case 9:
                    System.out.println("Grade O");
                    break;
                case 8:
                    System.out.println("Grade A");
                    break;
                case 7:
                    System.out.println("Grade B");
                    break;
                case 6:
                    System.out.println("Grade C");
                    break;
                case 5:
                case 4:
                    System.out.println("Grade D");
                    break;
                default:
                    System.out.println("Fail");
            }
        }
        else{
            System.out.println("Invalid Input!!! Enter StudentMarks between 0 to 100...");
        }
    }
}

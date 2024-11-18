import java.util.Scanner;

public class Multipleof7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of multiples of 7 to print: ");
        
        int count = scanner.nextInt();
        
        scanner.close();
        
        for (int i = 1; i <= count; i++) {

            int multipleOf7 = i * 7;
            
            if (i % 2 == 0) {
                System.out.println("\t" + multipleOf7);
            } else {
                System.out.println(multipleOf7);
            }
        }
    }
}

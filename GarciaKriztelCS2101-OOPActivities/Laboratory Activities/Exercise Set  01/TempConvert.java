import java.util.Scanner;
import java.text.DecimalFormat;

public class tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Celsius value: ");
        
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsius * 9 / 5 + 32;
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println(celsius + " Celsius is " + df.format(fahrenheit) + " Fahrenheit.");
        
        scanner.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(reader.readLine());

        //double sum = num1 + num2;
       // System.out.println("Sum: " + sum);
        double mul = num1 * num2;
        System.out.println("sub " + mul);
    }
}

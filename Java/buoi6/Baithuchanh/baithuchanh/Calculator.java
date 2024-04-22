package baithuchanh;
import java.util.Scanner;

public class Calculator{
    int number1;
    int number2;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        number1 = sc.nextInt();
        System.out.print("Nhap so thu 2: ");
        number2 = sc.nextInt();
    }
    public void Output(){
        System.out.println("So thu nhat: ");
        System.out.println("So thu hai: ");
    }
    public void addition(){
        int sum = number1 + number2;
        System.out.println("num1 + num2 = " + sum);
    }
    public void subtraction(){
        int sub = number1 - number2;
        System.out.println("num1 - num2 = " + sub);
    }
    public void multi(){
        int mul = number1 * number2;
        System.out.println("num1 * num2 = " + mul);
    }
    public void division(){
        int div = number1 / number2;
        System.out.println("num1 / num2 = " + div);

    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.Input();
        c.Output();
        c.addition();
        c.subtraction();
        c.multi();
        c.division();
    }
}

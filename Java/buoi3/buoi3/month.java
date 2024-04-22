package buoi3;
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your month: ");
        int month = scanner.nextInt();
        switch(month){
                case 1:
                case 2:
                case 3: System.out.println("Mua Xuan");;break;
                case 4:
                case 5:
                case 6: System.out.println("Mua He");;break;
                case 7:
                case 8:
                case 9: System.out.println("Mua Thu");;break;
                case 10:
                case 11:
                case 12: System.out.println("Mua Dong");;break;
                
                default: break;
            }
        
    }
}

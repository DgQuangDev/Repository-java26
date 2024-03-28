package buoi1;
import java.util.Scanner;

public class theky {
    public void theky1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int nam = sc.nextInt();
        int theky = (nam/100) +1;
        System.out.println("The ky = " + theky);
        System.out.println("-----------------------------------------------");
    }
}

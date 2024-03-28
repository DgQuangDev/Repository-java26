package buoi1;
import java.util.Scanner;

public class BMI {
    public void BMI1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap can nang cua ban(kg): ");
        float weigh = sc.nextFloat();
        System.out.print("nhap chieu cao cua ban(met): ");
        float height = sc.nextFloat();
        float BMI = weigh/(height*height);
        System.out.print("Chi so BMI cua ban la: "+BMI);
        System.out.println("---------------------------------------------------------------- ");
    }
}
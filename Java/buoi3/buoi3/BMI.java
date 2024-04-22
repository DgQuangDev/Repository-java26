package buoi3;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap chieu cao cua ban(don vi m): ");
    float height = sc.nextFloat();
    System.out.print("Nhap can nang cua ban(don vi kg): ");
    float weight = sc.nextFloat();
    float bmi = weight / (height * height);
    if(bmi < 18.5){
        System.out.println("BMI: " + bmi);
        System.out.println("Bạn dang bi thieu can");
    }
    else if(bmi >= 18.5 && bmi <= 24.9){
        System.out.println("BMI: " + bmi);
        System.out.println("Bạn dang rat khoe manh");
    }
    else{
        System.out.println("BMI: " + bmi);
        System.out.println("Bạn dang bi thua can");
    }
    }
}

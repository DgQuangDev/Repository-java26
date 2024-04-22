package buoi3;
import java.util.Scanner;

public class mark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = sc.nextInt();
        if(mark >= 85){
            System.out.println("Your grade is A");
        }
        else if(mark < 85 && mark >= 70){
            System.out.println("Your grade is B");
        }
        else if(mark < 70 && mark >= 40){
            System.out.println("Your grade is C");
        }
        else{
            System.out.println("Your grade is D");
        }
    }
    
}

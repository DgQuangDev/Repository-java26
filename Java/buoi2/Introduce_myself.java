package buoi2;
import java.util.Scanner;

public class Introduce_myself {
    String name;
    String sex;
    int age;
    String Live;
    public void InputIntroduce(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten cua ban: ");
        name = sc.nextLine();
        System.out.print("nhap gioi tinh cua ban: ");
        sex = sc.nextLine();
        System.out.print("nhap noi o cua ban: ");
        Live = sc.nextLine();
        System.out.print("nhap tuoi cua ban: ");
        age = sc.nextInt();
        System.out.println("----------------------------------------------");
    }
    
    public void OutputIntroduce(){
        System.out.println("Xin chao cac ban, minh ten la "+name+", nam nay minh "+age+" tuoi, gioi tinh "+ sex +" .Hien tai minh dang song va lam viec tai "+ Live);
        System.out.println("-------------------------------------------------");
    }
}

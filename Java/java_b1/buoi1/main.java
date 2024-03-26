package buoi1;
import java.util.Scanner;

public class main {
    static void menu(){
        System.out.println("Hay chon tinh nang ban muon su dung");
        System.out.println("1. In ra 'xin chao cac ban");
        System.out.println("2. In ra 'xin chao cac ban + 'x'");
        System.out.println("3. In ra Xin chao cac ban + ...");
        System.out.println("4. Tinh tong 2 so a va b");
        System.out.println("5. Tinh binh phuong so nhap vao");
        System.out.println("6. Nhap nam , xuat the the ky");
        System.out.println("7. Tinh chi so BMI cua ban");
        System.out.println("nhap 0 de thoat");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chon;
        helloworld1 hl1 = new helloworld1();
        helloworld2 hl2 = new helloworld2();
        helloworld3 hl3 = new helloworld3();
        Sum sum = new Sum();
        theky tk = new theky();
        binhphuong bp = new binhphuong();
        BMI bmi = new BMI();
        
            do{
            menu();
            System.out.print("Hay dua ra lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    hl1.xinchao();
                    break;
                case 2:
                    hl2.xinchaox();
                    break;
                case 3:
                    hl3.xinchao3();
                    break;
                case 4:
                    sum.sum1();
                    break;
                case 5:
                    bp.binhphuong1();
                    break;
                case 6:
                    tk.theky1();
                    break;
                case 7:
                    bmi.BMI1();
                    break;
                case 0:
                    System.out.println("Ket thuc");
                    break;
                default: 
                    break;
            }
                
            }while(chon!=0);
    }
}

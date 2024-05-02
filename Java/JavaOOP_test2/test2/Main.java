package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Dang ky tai khoan");
            System.out.println("2. Dang nhap tai khoan");
            System.out.println("3. Quen mat khau");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userList.registerUser();
                    break;
                case 2:
                    System.out.println("Nhap thong tin đang nhap: ");
                    System.out.print("Email: ");
                    String email = scanner.next();
                    System.out.print("Password: ");
                    String password = scanner.next();
                    userList.loginUser(email, password);
                    break;
                case 3:
                    System.out.println("Nhap thong tin de dat lai mat khau:");
                    System.out.print("Ten dang nhap: ");
                    String username = scanner.next();
                    System.out.print("Email: ");
                    String resetEmail = scanner.next();
                    userList.resetPassword(username, resetEmail);
                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.Vui long lua chon lai.");
                    break;
            }
        } while (choice != 4);
    }
}

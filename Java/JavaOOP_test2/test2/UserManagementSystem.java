package test2;

import java.util.Scanner;

public class UserManagementSystem extends User {
    public UserManagementSystem(String username, String email, String password) {
        super(username, email, password);
    }

    // Hàm tạo, getter, setter
    public UserManagementSystem() {
        super();
    }

    // Phương thức nhập thông tin từ người dùng
    public void inputUserInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten dang nhap: ");
        setUsername(scanner.nextLine());
        System.out.print("Nhap email: ");
        setEmail(scanner.nextLine());
        System.out.print("Nhap mat khau: ");
        setPassword(scanner.nextLine());
    }

    // Phương thức xuất thông tin người dùng
    public void displayUserInformation() {
        System.out.println("Ten dang nhap: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Mat khau: " + getPassword());
    }
}

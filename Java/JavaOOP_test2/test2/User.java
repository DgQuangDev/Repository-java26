package test2;

import java.util.Scanner;

public class User {
    private String username;
    private String email;
    private String password;

    public User(){

    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
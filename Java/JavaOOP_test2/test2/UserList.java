package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    private List<User> userList;

    public UserList() {
        this.userList = new ArrayList<>();
    }

    // Hàm tạo, getter, setter
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    // Chức năng đăng ký tài khoản
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dang ky tai khoan moi: ");
        User newUser = new User();
        newUser.inputUserInformation(); // Nhập thông tin từ người dùng
        userList.add(newUser); // Thêm vào danh sách người dùng
        System.out.println("Tai khoan cua ban da duoc dang ky thanh cong!");
    }

    // Chức năng đăng nhập
    public void loginUser(String email, String password) {
        boolean isLoggedIn = false;
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                isLoggedIn = true;
                break;
            }
        }
        if (isLoggedIn) {
            System.out.println("Dang nhap thanh cong!");
        } else {
            System.out.println("Email hoac mat khau khong chinh xac.");
        }
    }

    // Chức năng quên mật khẩu
    public void resetPassword(String username, String email) {
        boolean isFound = false;
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getEmail().equals(email)) {
                isFound = true;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhap mat khau moi: ");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword); // Thay đổi mật khẩu
                System.out.println("Mat khau da duoc thay doi thanh cong!");
                break;
            }
        }
        if (!isFound) {
            System.out.println("Ten dang nhap hoac email khong ton tai.");
        }
    }
}

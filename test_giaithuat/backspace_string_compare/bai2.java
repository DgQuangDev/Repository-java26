package backspace_string_compare;

import java.util.Scanner; 

public class bai2{
    // Phương thức kiểm tra xem hai chuỗi s và t có bằng nhau sau khi xử lý các ký tự '#' không
    public static boolean backspaceCompare(String s, String t) {
        // Xử lý chuỗi s để loại bỏ các ký tự '#' và các ký tự bị xóa
        String finalS = processString(s);
        // Xử lý chuỗi t tương tự như trên
        String finalT = processString(t);
        // So sánh hai chuỗi đã được xử lý và trả về kết quả
        return finalS.equals(finalT);
    }

    // Phương thức xử lý chuỗi để loại bỏ các ký tự '#' và các ký tự bị xóa
    private static String processString(String str) {
        // Sử dụng StringBuilder để xây dựng chuỗi kết quả sau khi xử lý
        StringBuilder result = new StringBuilder();
        // Duyệt qua từng ký tự trong chuỗi
        for (char c : str.toCharArray()) {
            if (c != '#') { // Nếu ký tự không phải '#', thêm vào kết quả
                result.append(c);
            } else if (result.length() > 0) { // Nếu ký tự là '#', và kết quả không rỗng
                result.deleteCharAt(result.length() - 1); // Xóa ký tự cuối cùng trong kết quả
            }
        }
        // Trả về chuỗi đã xử lý
        return result.toString();
    }

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi s
        System.out.println("Nhap chuoi s: ");
        String s = sc.nextLine(); 

        // Yêu cầu người dùng nhập chuỗi t
        System.out.println("Nhap chuoi t: ");
        String t = sc.nextLine(); 

        // Kiểm tra xem hai chuỗi s và t có bằng nhau sau khi xử lý không
        boolean result = backspaceCompare(s, t);
        // In kết quả ra màn hình
        System.out.println("Hai chuoi s va t sau khi su ly co bang nhau khong:  " + result);
        
    }
}
    //Độ phức tạp của thuật toán: O(n+m)
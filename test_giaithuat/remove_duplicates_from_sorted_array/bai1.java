public class bai1 {
    public static int removeDuplicates(int[] nums) { //Phương thức này có nhiệm vụ thực hiện yêu cầu của bài toán: xóa các
        // phần tử trùng lặp trong một mảng số nguyên đã được sắp xếp và trả về số lượng phần tử duy nhất trong mảng.
        
        if (nums.length == 0) return 0; //tránh mảng bị rỗng

        int k = 1; // Vị trí của phần tử duy nhất cuối cùng
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Phần tử hiện tại khác với phần tử trước đó
                nums[k] = nums[i]; // Đặt phần tử hiện tại vào vị trí k
                k++; // Tăng k lên 1
            }
        }
        return k; // k là số phần tử duy nhất
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 6};
        int k = removeDuplicates(nums);
        System.out.println("So phan tu duy nhat cua mang: " + k);
        System.out.print("Mang sau khi loai bo cac phan tu trung lap: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
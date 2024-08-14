package same_tree;

// Định nghĩa lớp nút cây nhị phân
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class bai3 {

    // Phương thức chính để kiểm tra xem hai cây có giống nhau không
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Nếu cả hai nút đều null, cây là giống nhau
        if (p == null && q == null) return true;
        
        // Nếu một trong hai nút null, cây không giống nhau
        if (p == null || q == null) return false;
        
        // Nếu giá trị của các nút hiện tại khác nhau, cây không giống nhau
        if (p.val != q.val) return false;
        
        // Đệ quy kiểm tra cây con bên trái và bên phải
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Tạo hai cây nhị phân ví dụ
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Kiểm tra và in kết quả
        boolean result = isSameTree(tree1, tree2);
        System.out.println("Hai cay co giong nhau:  " + result);
    }
}


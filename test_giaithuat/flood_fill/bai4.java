package flood_fill;

public class bai4 {
    
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Lấy màu hiện tại của pixel bắt đầu
        int startColor = image[sr][sc];
        
        // Nếu màu hiện tại đã là màu đích, không cần thay đổi
        if (startColor == color) {
            return image;
        }
        
        // Gọi phương thức DFS để thực hiện đổ đầy
        dfs(image, sr, sc, startColor, color);
        
        return image;
    }

    // Phương thức DFS để thực hiện đổ đầy
    private static void dfs(int[][] image, int sr, int sc, int startColor, int newColor) {
        // Kiểm tra điều kiện biên
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }

        // Kiểm tra nếu màu hiện tại không phải màu cần thay đổi
        if (image[sr][sc] != startColor) {
            return;
        }

        // Thay đổi màu của pixel hiện tại
        image[sr][sc] = newColor;

        // Thực hiện DFS cho các pixel liên kết
        dfs(image, sr + 1, sc, startColor, newColor); // Xuống dưới
        dfs(image, sr - 1, sc, startColor, newColor); // Lên trên
        dfs(image, sr, sc + 1, startColor, newColor); // Sang phải
        dfs(image, sr, sc - 1, startColor, newColor); // Sang trái
    }

    public static void main(String[] args) {
        // Ví dụ hình ảnh ma trận
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        
        // Gọi phương thức flood fill
        int sr = 1, sc = 1, color = 2;
        int[][] result = floodFill(image, sr, sc, color);
        
        // In kết quả
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
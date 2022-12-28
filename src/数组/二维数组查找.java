package src.数组;

public class 二维数组查找 {
    public static void main(String[] args) {
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;

        for(int i = 0; i < n; ++i) {
            int x = this.findNum(matrix, target, i);
            if (x >= 0) {
                return true;
            }
        }

        return false;
    }

    public int findNum(int[][] matrix, int target, int i) {
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;

        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if (matrix[i][mid] > target) {
                right = mid - 1;
            } else {
                if (matrix[i][mid] >= target) {
                    return mid;
                }

                left = mid + 1;
            }
        }

        return -1;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int x = 0;
        int y = m - 1;

        while(x < n && y >= 0) {
            if (matrix[x][y] > target) {
                --y;
            } else if (matrix[x][y] < target) {
                ++x;
            } else if (matrix[x][y] == target) {
                return true;
            }
        }

        return false;
    }
}

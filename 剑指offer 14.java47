

/* method1 递归(存在重复运算，并非最优解) */
public class Solution {
    public static int maxValue(int [][] array) {
    	if (array.length == 0) {
    		return 0;
    	}
    	int rows = array.length;
    	int cols = array[0].length;
    	return findMaxValue(array, 0, rows, cols, 0, 0);
    	
    }
    public static int findMaxValue(int[][] array, int value, int rows, int cols, int i, int j) {
    	
    	if (i == rows || j == cols) {
    		return 0;
    	}
    	value += array[i][j];
    	if (i == rows - 1 && j == cols - 1) {
    		return value;
    	}
    	if (i != rows && j != cols) {
    		int temp1 = findMaxValue(array, value, rows, cols, i+1, j);
    		int temp2 = findMaxValue(array, value, rows, cols, i, j+1);
    		value = temp1 > temp2 ? temp1 : temp2;
    	}
    	return value;
    }
    public static void main(String[] args) {
    	int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(maxValue(values));  //29
        int[][] values1 = {{1, 10, 3, 8}};
        System.out.println(maxValue(values1));  //22
        int[][] values2 = {
                {1},
                {1},
                {5},
                {3}};
        System.out.println(maxValue(values2));
    }
}


/* method2 (循环) */
//二维数组存储最大值，空间浪费；采用一维数组
public class Solution {
    public static int maxValue(int [][] array) {
    	if (array.length == 0) {
    		return 0;
    	}
    	int rows = array.length;
    	int cols = array[0].length;
    	int[] values = new int[cols];
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < cols; j++) {
    			int left = 0;
    			int up = 0;
    			if (i > 0) {
    				up = values[j];
    			}
    			if (j > 0) {
    				left = values[j-1];
    			}
    			values[j] = Math.max(up, left) + array[i][j];
    		}
    	}
    	return values[cols-1];   	
    }
    
    public static void main(String[] args) {
    	int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(maxValue(values));  //29
        int[][] values1 = {{1, 10, 3, 8}};
        System.out.println(maxValue(values1));  //22
        int[][] values2 = {
                {1},
                {1},
                {5},
                {3}};
        System.out.println(maxValue(values2));
    }
}

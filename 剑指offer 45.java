//m1: 全排列
//m2: int转str, 数组排序后拼接
//定义排序规则，调用排序函数
import java.util.*;

public class Solution {
    public static String PrintMinNumber(int [] numbers) {
    	if (numbers == null || numbers.length == 0) {
    		return "";
    	}
    	String[] strs = new String[numbers.length];
    	for (int i = 0; i < numbers.length; i++) {
    		strs[i] = String.valueOf(numbers[i]);
    	}
    	StringBuilder result = new StringBuilder();
    	Arrays.sort(strs, new Comparator<String>() {
    		public int compare(String str1, String str2) {
    			String s1 = str1 + str2;
    			String s2 = str2 + str1;
    			return s1.compareTo(s2);
    		}
    	});
    	for (int i = 0; i < strs.length; i++) {
    		result.append(strs[i]);
    	}
    	
    	return result.toString();
    }
    public static void main(String[] args) {
    	int[] array = {3, 32, 321};
    	System.out.println(PrintMinNumber(array));
    }
}

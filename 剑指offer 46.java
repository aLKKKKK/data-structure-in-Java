//m1: 递归，从上到下，由于存在重复的子问题，并非最优解
//m2: 从下到上, 动态规划
//定义排序规则，调用排序函数
import java.util.*;

public class Solution {
    public static int numberToStr(int numbers) {
    	if (numbers < 0) {
    		return 0;
    	}else if(numbers < 10) {
    		return 1;
    	}
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    	int n = numbers;
    	while(n!=0) {
    		nums.add(0, n%10);
    		n = n/10;
    	}
    	int[] counts = new int [nums.size()];
    	for (int i = nums.size()-1; i >= 0; i--) {
    		if (i == nums.size()-1) {
    			counts[i] = 1;
    		}else {
    			counts[i] = counts[i+1];
    			int temp = nums.get(i) * 10 + nums.get(i+1);
    			if ( temp >= 10 && temp <= 25 ) {
    				counts[i] += counts[i+2];
    			}
    		}
    	}
    	return counts[0];
    	
    }
    public static void main(String[] args) {
    	int a = 12258;
    	System.out.println(numberToStr(a));
    }
}

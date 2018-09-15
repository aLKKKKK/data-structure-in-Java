//边界条件（第一个数字为0），每一个数字，如370 索引寻找相应位
//个位0-9, 10个数字
//十位10-99, 90个数字
//百位100-999, 900个数字
public class problem14 {
	public static int findNumber(int n) {
		if (n < 0) return -1;
		int i = 1;
		while (true) {
			int numbers = numbersIn(i) * i;
			if (n < numbers) {
				break;
			}else {
				n = n - numbers;
				i += 1;
			}
				
		}
		
		//find the number
		int indexIn = n % i;
		int index = n / i + beginDigits(i);
		//System.out.println(indexIn);
		//find
		for (int j = 0; j < i - indexIn - 1; j++) {
			index = index / 10;
		}
		//System.out.println(index);
		return index % 10;
	}
	public static int numbersIn(int i) {
		if (i == 1) {
			return 10;
		}else {
			return 9 * (int)Math.pow(10, i-1);
		}
	}
	public static int beginDigits(int i) {
		if (i == 1) {
			return 0;
		}
		return (int)Math.pow(10, i-1);
	}
	public static void main(String[] args) {
		System.out.println(findNumber(9)); //9
        System.out.println(findNumber(189)); //数字99的最后一位：9
        System.out.println(findNumber(190)); //数字100的第一位：1
	}
}

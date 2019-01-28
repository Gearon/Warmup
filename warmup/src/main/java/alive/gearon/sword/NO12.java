package alive.gearon.sword;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * 计算机中负数为补码表示，所以只需要根据位操作判断二进制中1的个数
 */
public class NO12 {
	public int NumberOf1(int n) {
		int flag = 1;
		int count = 0;
		while (flag != 0) {
			if((n & flag) != 0)
				count++;
			flag = flag << 1;
		}
		return count;
	}

	public static void main(String args[]) {
		NO12 obj = new NO12();
		System.out.println(obj.NumberOf1(10));
	}
}

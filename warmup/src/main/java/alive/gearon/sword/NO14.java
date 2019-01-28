package alive.gearon.sword;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 两次遍历，多引入一个结果数组，时间复杂度和空间复杂度均为O（n）
 *
 */
public class NO14 {
    public void reOrderArray(int [] array) {
    	int resultArray[] = new int[array.length];
    	int index = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] % 2 == 1) {
    			resultArray[index] = array[i];
    			index++;
    		}
    	}
		for(int i = 0; i < array.length; i++) {
    		if(array[i] % 2 == 0) {
    			resultArray[index] = array[i];
    			index++;
    		}
    	}
    	for(int i = 0; i < resultArray.length; i++) {
    		array[i] = resultArray[i];
    	}
    }
    
    public static void main(String args[]) {
    	NO14 obj = new NO14();
    	int array[] = {1,4,3,6,7};
    	obj.reOrderArray(array);
    	for(int i = 0; i < array.length; i++) {
    		System.out.println(array[i]);
    	}
    }
}

package alive.gearon.sword;

public class NO1 {
	/**
	 * 在一个二维数组中（每个一维数组的长度相同），
	 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
	 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 * @param target
	 * 		  The target to find
	 * @param array
	 * 		  The array to be searched
	 * @return
	 * 		  True: Found
	 * 		  False: Not-found
	 */
    public boolean Find(int target, int [][] array) {
    	if(array.length == 0){
    		return false;
    	}
    	for(int i = 0; i < array.length; i++){
    		for(int j = array[0].length - 1; j > -1; j--){
    			if(array[i][j] == target){
    				return true;
    			}
    			if(array[i][j] < target){
    				break;
    			}
    		}
    	}
        return false;
    }
}

package alive.gearon.sword;

public class NO10 {
  /**
   * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
   * 
   * 找规律，斐波那契数列
   */
  public int RectCover(int target) {
    if (target == 0)
      return 0;
    if (target == 1)
      return 1;
    if (target == 2)
      return 2;
    return RectCover(target - 1) + RectCover(target - 2);
  }
  
  public static void main(String args[]) {
    NO10 obj = new NO10();
    System.out.println(obj.RectCover(1));
  }
}

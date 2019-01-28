package alive.gearon.sword;

public class NO13 {
	public double Power(double base, int exponent) {
		double res = 1;
		if(exponent<0){
			if(base==0)
				throw new RuntimeException("分母不能为0"); 
			exponent = -exponent;
		}else if(exponent == 0){
			return 1;
		}
		for(int i=0;i<Math.abs(exponent);i++){
			res*=base;
		}
		return exponent>=0?res:(1/res);       
	}
}

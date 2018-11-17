package alive.gearon.sword;

public class NO2 {
    public String replaceSpace(StringBuffer str) {
    	for(int i = 0; i < str.length(); i++){
    		if(str.charAt(i) == ' '){
    			str.replace(i, i+1, "%20");
    		}
    	}
    	return str.toString();
    }
    
    public static void main(String args[]){
    	NO2 obj = new NO2();
    	System.out.println(obj.replaceSpace(new StringBuffer("Hello World Haha")));
    }
}

package prob4;

public class StringUtil {
	//문자열을 결합하여 리턴 하는 메소드 구현
	
	public static String concatenate(String[] stringarray) {
		
		String resultStr = new String();
		
		for(int i=0; i<stringarray.length; i++) {
			resultStr += stringarray[i];	
		}
		
		return resultStr;
	}
}

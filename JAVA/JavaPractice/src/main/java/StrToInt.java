// Integer.parseInt

public class StrToInt {
	public int getStrToInt(String str) {
		boolean Sign = true;
		int result = 0;
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='-')
				Sign = false;
			else if (ch!='+')
				result = result * 10 + (ch - '0');
		}
		return Sign?1:-1 * result;
	}
	
	public static void main(String args[]) {
		StrToInt strToInt = new StrToInt();
		System.out.println(strToInt.getStrToInt("-1234"));
		System.out.println(strToInt.getStrToInt("4321"));	// 여기 출력 1 ...
		
	}
}

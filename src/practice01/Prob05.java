package practice01;

public class Prob05 {

	public static void main(String[] args) {
		// 3, 6, 9
		
		int n = 6391;
		String s = String.valueOf(n);
		
		int clapCount = 0;
		int length = s.length();
		for(int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if(c == '3' || c == '6' || c == '9') {
				clapCount++;
			}
		}

		for(int j = 0; j < clapCount; j++) {
			System.out.print('짝');
		}
		
		
		
		
		for( int i = 1; i <= 100; i++ ) {
		}
	}
}

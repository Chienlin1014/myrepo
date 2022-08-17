package homework4;

public class EightPlanet {

	public static void main(String[] args) {
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		String[] s={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowel=0;
		for(int i = 0;i<s.length; i++) {
			for(int j =0;j<s[i].length();j++) { //逐字元檢查
				if(s[i].charAt(j)=='a'||s[i].charAt(j)=='e'||
						s[i].charAt(j)=='i'||s[i].charAt(j)=='o'||s[i].charAt(j)=='u') {
					vowel++;
				}
			}
		}
		System.out.println("母音總數共："+vowel+"個");
	}
}

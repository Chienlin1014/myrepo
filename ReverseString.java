package homework4;


import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args){
		System.out.print("請輸入要反轉之文字：");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		System.out.print("\n文字反轉後為：");
		for(int i = (str.length()-1); i>=0;i--)
			System.out.print(str.charAt(i));
	}

}

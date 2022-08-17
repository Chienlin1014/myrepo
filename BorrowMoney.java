package homework4;

import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Scanner;

public class BorrowMoney {

	public static void main(String[] args) {
		System.out.print("阿文想借多少錢：");
		Scanner sc =new Scanner(System.in);
		int borrow=sc.nextInt();
		int count=0;
		System.out.print("阿文可以跟員工編號：");
		int[][] availableMoney={{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		for(int i =0;i<availableMoney.length;i++) {
			if(availableMoney[i][1]>=borrow) {
				System.out.print(availableMoney[i][0]+" ");
				count++;
			}
		}
		System.out.println("借錢，共"+count+"人。");

	}

}

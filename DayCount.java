package homework4;

import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) {
		// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31}; //設定各月份天數
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入年月日(空格隔開)：");
		int yyyy=sc.nextInt();
		int mm=sc.nextInt();
		int dd=sc.nextInt();
		int totalDays=0;
		while(yyyy<0) { // 判斷年份輸入是否正確
			System.out.print("年份不得小於0，請重新輸入年份：");
			yyyy=sc.nextInt();
		}
		while(mm<=0||mm>12) { //判斷月份是否正確
			System.out.print("月份介於1~12之間，請重新輸入月份：");
			mm=sc.nextInt();
		}
		if((yyyy%4==0&&yyyy%100!=0)||yyyy%400==0) {//閏年2月為29天
			days[1]=29;
		}
		while(dd>days[mm-1]||dd<0) { //判斷天數是否正確
			System.out.print(mm+"月只有"+days[mm-1]+"天，請重新輸入幾號：");
			dd=sc.nextInt();
		}
		if(mm!=1) { //計算天數，如果是1月的話，不用全部加入，所以不進入迴圈
			for(int i=0;i<mm-1;i++) { //指定月份前的天數全部加總
				totalDays+=days[i];
			}
		}
		totalDays+=dd;
		System.out.println(yyyy+"年"+mm+"月"+dd+"日，為此年份第"+totalDays+"天");
	}

}

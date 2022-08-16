package hw;

import java.util.Scanner;

public class ChiaHomework003 {
	private static void triagleJudge() {
		System.out.println("請輸入三邊長度以判斷是否為三角形：");
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextByte();
		double side2 = sc.nextByte();
		double side3 = sc.nextByte();
		double i, j, k;
		i = Math.pow(side1, 2);
		j = Math.pow(side2, 2);
		k = Math.pow(side3, 2);
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			if (side1 == side2 || side1 == side3) {
				if (side2 == side3) {
					System.out.println("正三角形");
				} else {
					System.out.println("等腰三角形");
				}
			} else if (i + j == k || i + k == j || j + k == i) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("這不是三角形");
		}
	}

	private static void guessNum9() {
		int rightNum = (int) (Math.random() * 10 - 0.00000001);// -0.0.00000001為避免出現剛好等於10
		System.out.print("開始猜數字囉，請輸入0~9之整數：");
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		while (guessNum < 0 && guessNum > 9) {
			System.out.print("數字超出範圍，請重新輸入：");
			guessNum = sc.nextInt();
		}
		while (guessNum != rightNum) {
			System.out.print("猜錯囉，請再猜一次：");
			guessNum = sc.nextInt();
		}
		if (guessNum == rightNum) {
			System.out.println("答對了，答案就是" + rightNum);
		}
	}

	private static void guessNum100() {
		int rightNum = (int) (Math.random() * 101);
		System.out.print("開始猜數字囉，請輸入0~100之整數：");
		Scanner sc = new Scanner(System.in);
		int guessNum = sc.nextInt();
		while (guessNum < 0 && guessNum > 100) {
			System.out.print("數字超出範圍，請重新輸入：");
			guessNum = sc.nextInt();
		}
		while (guessNum > rightNum) {
			System.out.print("猜錯囉，您的數字比中獎數字大，請再猜一次：");
			guessNum = sc.nextInt();
			while (guessNum < rightNum) {
				System.out.print("猜錯囉，您的數字比中獎數字小，請再猜一次：");
				guessNum = sc.nextInt();
			}
		}
		while (guessNum < rightNum) {
			System.out.print("猜錯囉，您的數字比中獎數字小，請再猜一次：");
			guessNum = sc.nextInt();
			while (guessNum > rightNum) {
				System.out.print("猜錯囉，您的數字比中獎數字大，請再猜一次：");
				guessNum = sc.nextInt();
			}
		}
		if (guessNum == rightNum) {
			System.out.println("答對了，答案就是" + rightNum);
		}
	}

	private static void lottery() {
		System.out.print("請輸入阿文不喜歡的數字(1~9)：");
		Scanner sc = new Scanner(System.in);
		int hateNum = sc.nextInt();
		int count = 0;
		int[] autoLottery = new int[49];
		while (hateNum > 9 && hateNum <= 0) {
			System.out.println("錯誤，數字範圍1~9，請重新輸入：");
			hateNum = sc.nextInt();
		}
		for (int i = 1; i <= 49; i++) {
			if ((i % 10) != hateNum) {
				if (hateNum >= 5) {
					autoLottery[count] = i;
					System.out.print(i + " "); // print符合條件之數字
					count++; // 初始值為0，每進入if區塊之次數+1
				} else if (hateNum < 5) {
					if (i - hateNum * 10 >= 10 || i < hateNum * 10) {
						autoLottery[count] = i;
						System.out.print(i + " "); // print符合條件之數字
						count++; // 初始值為0，每進入if區塊之次數+1
					}
				}
			}
		}
		System.out.println();
		System.out.println("可選的數字有：" + count + "個");
		System.out.println("輸入1開始自動選號(輸入其他訊息則程式結束)");
		int autoChoose = sc.nextInt();
		if (autoChoose == 1) {
			System.out.print("系統自動選號：");
			int[] choosedNum = new int[6];
			int temp = 0;
			for (int i = 0; i < 6; i++) {
				choosedNum[i] = autoLottery[(int) (Math.random() * (count - 1))];
				for (int j = 1; j < 6; j++) {
					if (choosedNum[i] == choosedNum[j]) {
						choosedNum[i] = autoLottery[(int) (Math.random() * (count - 1))];
					}
				}
				System.out.print(choosedNum[i] + " ");
			}
		} else {
			System.out.println("程式結束");
		}
	}

	public static void main(String[] args) {
		System.out.println("======作業======");
		System.out.println("1.三角形判斷");
		System.out.println("2.猜數字遊戲");
		System.out.println("3.阿文買樂透");
		System.out.print("請輸入作業代號以檢閱作業內容：");
		Scanner sc = new Scanner(System.in);
		int chooseNum = sc.nextInt();
		if (chooseNum == 1) {
			triagleJudge();
		} else if (chooseNum == 2) {
			System.out.println("請輸入你想要玩的猜字遊戲代號");
			System.out.println("1. 0~9猜字遊戲");
			System.out.println("2. 0~100猜字遊戲");
			int guessGameNum = sc.nextInt();
			switch (guessGameNum) {
			case 1:
				guessNum9();
				break;
			case 2:
				guessNum100();
			}
		} else if (chooseNum == 3) {
			lottery();

		} else {
			System.out.println("僅限輸入1~3之數字");
		}
	}
}

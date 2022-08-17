package homework4;

public class HighestScore {

	public static void main(String[] args) {
		//列出每位同學得分最高的次數
		int[][] score= {{10,35,40,100,90,85,75,70},
						{37,75,77,89,64,75,70,95},
						{100,70,79,90,75,70,79,90},
						{77,95,70,89,60,75,85,89},
						{98,70,89,90,75,90,89,90},
						{90,80,100,75,50,20,99,75}};
		
		int[][] highestTimes=new int[8][2];//紀錄座號及最高分次數的陣列
		for(int i=0;i<highestTimes.length;i++)
			highestTimes[i][0]=i+1; //將學生座號放入陣列中
		for(int i=0;i<score.length;i++) { //第幾次考試
			for(int j=0;j<score[i].length;j++) { //第i次考試，索引值j的同學幾分
				int count=0; //計算比多少人高分
				for(int k=0;k<score[i].length;k++) {
					//第i次考試，索引值j的同學與第i次考試索引值k的同學比分數(有同分的可能性用>=)
					if(score[i][j]>=score[i][k]) { 
						count++; //每大於等於一個就計次一次
					}
					if(count==8) { //大於等於8人，就為最高
						highestTimes[j][1]+=1; //將最高分的次數計入陣列中
					}
				}
			}
		}
		for(int i=0;i<highestTimes.length;i++) {
			System.out.println("座號："+highestTimes[i][0]+"號，考"+highestTimes[i][1]+"次最高分");
		}
		}
}
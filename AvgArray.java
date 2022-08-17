package homework4;

public class AvgArray {

	public static void main(String[] args) {
		int[] numArray= {29,100,39,41,50,8,66,77,95,15};
		int sum=0;
		for(int i =0; i<numArray.length;i++) {
			sum+=numArray[i];
		}
		int avg=(sum/=numArray.length);
		System.out.print("元素平均值為："+avg+"，大於平均值的元素有：");
		for(int i =0; i<numArray.length;i++) {
			if(numArray[i]>avg)
				System.out.print(numArray[i]+" ");
		}
		System.out.println("等");
	}

}

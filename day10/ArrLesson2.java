public class ArrLesson2{
	public static void main(String[] args){
		int[] data=new int[5];
		System.out.printf("%d\n",data[0]);
		System.out.printf("%d\n",data.length);
		data[0]=100;
		data[4]=150;
		data[2]=120;
		data[1]=data[2]-data[0];
		System.out.printf("%d\n",data[1]);

	}
}

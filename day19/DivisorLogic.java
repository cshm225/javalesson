package divisorapp.logics;
public class DivisorLogic{

	public static int[] createDivisorArr(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		int x=0;
		int[] retArr=new int[count];
		for(int i=1;i<=n;i++){
			if(n%i==0){
				retArr[x++]=i;
			}
		}
		return retArr;
	}
}

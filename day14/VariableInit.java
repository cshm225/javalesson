import java.util.*;
public class VariableInit{
	public static void main(){
		/*int n;
		int x=5;
		System.out.print(n);*/
		
	/*int n;
		int x=5;
		if(x>0{
			n=10;
		}
		System.out.println(n);javaは条件式を見ないのでエラー*/
		/*ok
		int n;
		if(5>0){
			n=10
		}*/
		/*ok
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=20;
		}*/

		/*ダメ
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<=0){
			n=20;
		}*/
/*ok
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<=0){
			n=20;
		}else{
			n=3;
		}*/
/*ng
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<=0){
			//n=20;
		}else{
			n=3;
			}*/
		/*int n=new Random().nextInt(3); ng
		String fortune;
		switch(n){
			case 0:
				fortune="daiki";
				break;
			case 1:
				fortune="daiki";
				break;
			case 2:
				fortune="daiki";
				break;
		}*/

		/*int n = new java.util.Random().nextInt(3);
		String fortune;
		switch(n){
		case 0:
			fortune="大吉";
			break;
		case 1:
			fortune="吉";
			break;
		default:
			fortune="凶";
		}ok*/
		/*ok
		int n;
		if(true){
			n=10;
		}
		*/
		/*ng
		int n;
		boolean isOk=true;
		if(isOk){
			n=10;
		}*/
/*ok
		int n;
		do{
			n=10;
		}while(false);
*/

/*ok
		int n;
		for(;;){
			n=3;
			break;
		}
*/
		

/*ok
	int n;
	for(int i=0;i<10;i++){
		n=3
	}
	*/
	}
}

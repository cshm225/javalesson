import java.util.*;
public class AkitaRocket{
	public static void main(String[] args){
		String[] pencil={"A","B","C","D","E"};
		String user;
		System.out.println(Arrays.toString(pencil));
		while(true){
			System.out.print("もう1度？(適当なキー or q:終わる)>>");
			user=new Scanner(System.in).nextLine();
			if(user.equals("q")){
				break;
			}
			for(int i=0;i<4;i++){
				String tmp="";
				tmp=pencil[i];
				pencil[i]=pencil[i+1];
				pencil[i+1]=tmp;
			}
			System.out.println(Arrays.toString(pencil));
		}
	}
}

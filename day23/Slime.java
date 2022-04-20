import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		ArrayList<Slime> slimes=new ArrayList<>();
		while(true){
			int select;
			System.out.print("スライムをついかする？(1...yes,2...no):");
			select=new Scanner(System.in).nextInt();
			if(select==2)break;
			System.out.print("追加するスライムの名前を決めてね:");
			String name=new Scanner(System.in).nextLine();
			slimes.add(new Slime(name));

		}
			for(int i=0;i<slimes.size();i++){
				slimes.get(i).attack();
			}
	}
}
class Slime{
	String name;
	Slime(String name){
		this.name=name;
		System.out.printf("%sが現れた\n",this.name);
	}
	void attack(){
		System.out.println(this.name+"の攻撃:5ポイントのダメージを与えた!");
	}
}

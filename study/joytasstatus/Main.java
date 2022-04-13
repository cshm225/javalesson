import java.util.*;
public class Main{
	public static void main(String[] args){
		String[] namestatus={"体力","魔力","パワー","きようさ","すばやさ"};
		Scanner scan=new Scanner(System.in);
		System.out.print("名前を入力してください>");
		String name=scan.nextLine();
		Hikasen h=new Hikasen(name);
		System.out.println("初期ステータスが決まりました。");
		System.out.printf("[体力:%d 魔力:%d パワー:%d きようさ:%d すばやさ:%d ]\n",h.hp,h.magicpower,h.power,h.dex,h.speed);
		System.out.print("種族を選んでください 0…人間,1…ハイエルフ,2…トロル,3…ノーム>");
		int num=scan.nextInt();
		Tribe syuzoku=new Tribe(h,num);
		System.out.printf("[体力:%d 魔力:%d パワー:%d きようさ:%d すばやさ:%d ]\n",h.hp,h.magicpower,h.power,h.dex,h.speed);
		System.out.printf("%sのボーナスが適用されました。\n",syuzoku.name);
		System.out.print("職業を選んでください 0…戦士,1…盗賊,2…僧侶,3…魔術師>");
		int jobnum=scan.nextInt();
		Job syokugyou=new Job(h,jobnum);
		System.out.printf("[体力:%d 魔力:%d パワー:%d きようさ:%d すばやさ:%d ]\n",h.hp,h.magicpower,h.power,h.dex,h.speed);
		System.out.printf("%sのボーナスが適用されました。\n",syokugyou.name);
		System.out.printf("***作成成功!***\n私は%sの%s、%sです。\n",syokugyou.name,syuzoku.name,h.name);
		int status[]={h.hp,h.magicpower,h.power,h.dex,h.speed};
		sort(namestatus,status);
		for(int i=0;i<status.length;i++){
			System.out.printf("%s:%d\n",namestatus[i],status[i]);
		}
		System.out.println("です.");
	}
	static void sort(String[] name,int[] status){
		for(int i=0;i<status.length-1;i++){
			for(int j=i+1;j<status.length;j++){
				int tmp;
				String tmpname;
				if(status[i]<status[j]){
					tmp=status[i];
					status[i]=status[j];
					status[j]=tmp;
					tmpname=name[i];
					name[i]=name[j];
					name[j]=tmpname;
					
				}
			}
		}
	}
}

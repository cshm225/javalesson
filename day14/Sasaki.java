import java.util.*;
public class Sasaki{
	public static void main(String[] args){
		System.out.printf("□□□%n□□□\n□□□\n\n空いてる箇所(□)に先行は〇,後攻は×を入れて盤面を全部埋めてください\n");
		String[][] map={
			{"□","□","□"},
			{"□","□","□"},
			{"□","□","□"}
		};
		int mapnum1,mapnum2;
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		int count=0;
		while(true){
			if(count%2!=0){
				System.out.print("後攻の人は入れる場所を選択\n");
			}else{
				System.out.print("先攻の人は入れる場所を選択\n");
			}
			while(true){
				System.out.print("上から何番目 ");
				mapnum1=scan1.nextInt();
				System.out.print("下から何番目");
				mapnum2=scan2.nextInt();
				if(map[mapnum1-1][mapnum2-1].equals("□")){
					break;
				}
			}
			if(count%2!=0){
				map[mapnum1-1][mapnum2-1]="×";
			}else{
				map[mapnum1-1][mapnum2-1]="●";
			}
			count++;
			for(int i=0;i<map.length;i++){
				for(int j=0;j<map[i].length;j++){
					System.out.printf("%s",map[i][j]);
				}
				System.out.println();
			}

			if(count==9){
				break;
			}
		}

	}
}

import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何本>");
		int pencilnum=scan.nextInt();
		ColorPencil[] pencils=new ColorPencil[pencilnum];
		for(int i=0;i<pencils.length;i++){
			System.out.print("色は>");
			String color=scan.next();
			System.out.print("長さは>");
			int length=scan.nextInt();
			pencils[i]=new ColorPencil(color,length);
		}
		while(true){
			menu(pencils);
			int select;
			System.out.print("何で描く>");
			select=scan.nextInt();
			if(select==pencils.length+1)break;
			if(select==pencils.length){
				System.out.println("描いたTOTALは"+ColorPencil.getTotalDraw());
				System.out.println();
			}
			if(select<pencils.length){
				pencils[select].draw();
				System.out.println();
			}
		}
	}
	static void menu(ColorPencil[] pencils){
		for(int i=0;i<pencils.length;i++){
			System.out.printf("%d.%s\n",i,pencils[i].color);
		}
		System.out.printf("%d.描いた長さのトータルを見る\n",pencils.length);
		System.out.printf("%d.終了\n",pencils.length+1);
	}
}

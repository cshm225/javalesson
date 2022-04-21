import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int page,price;
		System.out.print("本のページ数を入力して下さい >");
		page=scan.nextInt();
		System.out.print("本の価格を入力して下さい >");
		price=scan.nextInt();
		Book book=new Book(page,price);
		System.out.print("ノートのページ数を入力して下さい >");
		page=scan.nextInt();
		System.out.print("ノートの価格を入力して下さい >");
		price=scan.nextInt();
		NoteBook notebook=new NoteBook(page,price);
		menu(book,notebook);
		System.out.println("アプリケーションを終了します");
	}
	static void menu(Book book,NoteBook notebook){
		while(true){
			Scanner scan=new Scanner(System.in);
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select=scan.nextInt();
			if(select==4)break;
			if(select==1){
				book.showInfo();
			}
			if(select==2){
				notebook.showInfo();
			}
			if(select==3){
				System.out.print("書き込む内容を入力して下さい >");
				String word=scan.next();
				notebook.write(word);
			}
		}
	}
}

import java.util.*;
import java.io.*;
public class WordApp{
	public static void main(String[] args)throws Exception{
	Scanner scan=new Scanner(System.in);
	ArrayList<Word> list=new ArrayList<>();

	FileInputStream fis=new FileInputStream("qs.csv");
	InputStreamReader isr=new InputStreamReader(fis,"utf-8");
	BufferedReader br=new BufferedReader(isr);

	String line;
	while((line=br.readLine())!=null){
		String[] params=line.split(",");
		//Word word=new Word(params[0],params[1]);
		list.add(new Word(params[0],params[1]));

	}
	br.close();
	for(Word w:list){
		System.out.print(w.ja+">");
		String ans=scan.next();
		System.out.println(w.check(ans)?"正解":"不正解正解は"+w.en);
	}
}
}

package Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingtoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("D:\\Java\\Demo.txt");
		fw.write("Hello");
		fw.close();


		FileReader fr=new FileReader("D:\\\\Java\\\\Demo.txt");
		int i;
		while((i=fr.read())!=-1)//reading file till end of file so chek with -1
		{

			char ch=(char)i;
			System.out.print(ch);


		}


}
}
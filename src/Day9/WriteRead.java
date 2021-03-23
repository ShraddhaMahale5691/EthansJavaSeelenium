package Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("D:\\Java\\Demo.txt");
		FileWriter fw1=new FileWriter("D:\\Java\\Character.txt");
		FileWriter fw2=new FileWriter("D:\\Java\\Numeric.txt");
		System.out.println("Enter some data");
		Scanner s=new Scanner(System.in);
         String s1=s.nextLine();
         
         fw.write(s1);
         fw.close();
         
        FileReader fr=new FileReader("D:\\Java\\Demo.txt");
 		int i;
 		char ch;
 		while((i=fr.read())!=-1)//reading file till end of file so chek with -1
		{
            
        	ch=(char)i;
        	System.out.println(ch);
        	if(Character.isAlphabetic(ch))
			fw1.write(ch);
        	else if(Character.isDigit(ch))
        	fw2.write(ch);
        	else
        	System.out.println("Entered data is not a character");
			
		}
 		fw1.close();
 		fw2.close();
	}

}

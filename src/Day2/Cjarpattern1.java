package Day2;

public class Cjarpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{   
			char ch='A';
			char ch1='a';
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch+""+ch1);
				ch++;
				ch1++;
			}

			System.out.println();
		}
	}

}



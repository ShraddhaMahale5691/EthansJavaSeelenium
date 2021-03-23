package Day7;

public class WholeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result R1=new Result();
				R1.getData(1, 20, "Saish");
				R1.getMarks(75, 75, 85);
				R1.getsportmarks(100);
				R1.calc();
				R1.printresult();
				
				if(Result.perc>90 && Result.perc<=100)
				{
					System.out.println("Grade is A");
				}
				else if(Result.perc>80 && Result.perc<=90)
				{
					System.out.println("Grade is B");
				}
				else if(Result.perc>70 && Result.perc<=80)
				{
					System.out.println("Grade is C");
				}
				else
				{
					System.out.println("Grade is D");	
				}
				
		
	}

}

package Day7;

public class Result extends Marks implements SportsMarks {
	static  int sportmarks;
	static float perc;
	 float average,total;
	char grade;
	@Override
	public void getsportmarks(int sportmarks) {
		System.out.println("Sportsmarks are"+sportmarks);
		this.sportmarks=sportmarks;
	}
	void calc()
	{
		float total=super.m1+super.m2+super.m3+sportmarks;
		this.total=total;
		average=total/4;
		this.average=average;
		perc=(total/400)*100;
		
	}
	
	void printresult()
	{
		super.showAll();
		System.out.println("Total is : "+total);
		System.out.println("Avg is : "+average);
		System.out.println("Perc is : "+perc);
	}
	
	
	
	

	

}

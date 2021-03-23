package Day2;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		int marks=59;
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade is A+ ");
			
		}
		else if(marks>=80 && marks<=90)
		{
			grade='A';
			System.out.println("Grade is :"+grade);
			
		}
		else if(marks>=70 && marks<80)
		{
			grade='B';
				System.out.println("Grade is :"+grade);
			}
		else if(marks>=60 && marks<70)
		{
			grade='C';
				System.out.println("Grade is :"+grade);
			}
		else if(marks<60)
		{
			System.out.println("Student is Failed");
		}
		else
			System.out.println("You have entered wrong details");

	}

}

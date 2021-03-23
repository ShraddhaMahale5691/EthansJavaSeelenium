package Day2;

public class Largestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100000,6666,45,32222211,15,657777777,78,8,6789,88};
		int temp1=0,temp2=0;
		for(int i=0;i<=a.length-1;i++)
		{
			temp1=a[0];
			temp2=a[0];
		}
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>temp1)
			{
				temp1=a[i];
			}
		}
		System.out.println("largest number of an array "+temp1);


		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<temp2)
			{
				temp2=a[i];
			}
		}
		System.out.println("Smallest number of an array "+temp2);
	}
}

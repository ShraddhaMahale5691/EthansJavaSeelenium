package Daay6;

public class Worker extends Person {
int id,working_hr;
String name;
	@Override
	void getData11(int id,String name, int working_hr) {
		
		this.id=id;
		this.name=name;
		this.working_hr=working_hr;
		
	}

	@Override
	void display11() {
		System.out.println("Id of Worker is : "+id);
		System.out.println("Name of Worker is : "+name);
		System.out.println("Working hours of Worker is : "+working_hr);
		
	}
	

}

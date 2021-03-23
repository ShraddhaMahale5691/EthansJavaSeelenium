package Daay6;

public class RuntimepolyMain1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Admin a=new Admin();
	a.getData(1, "Saisha", 10, 5000);
	Employee ref;
	ref=a;
	a.calSal();
	
	HR h=new HR();
	h.getData(2, "Madhu", 20, 3000);
	ref=h;
	h.calSal();
		
		
    Developers d=new Developers();
    d.getData(3, "Ranjit", 30, 4000);
    ref=d;
    d.calSal();

	}

}

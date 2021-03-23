package Day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> temp=new HashSet<String>();
temp.add("Sai1");
temp.add("Sai2");
temp.add("Sai3");
temp.add(null);
temp.add(null);
System.out.println("Hash list "+temp);	

Set<String> temp1=new TreeSet<String>();
temp1.add("Sai1");
temp1.add("Apple");
temp1.add("Ballons");
//temp1.add(null);---------->gives error
System.out.println("Tree list "+temp1);	

Set<String> temp2=new LinkedHashSet<String>();
temp2.add("Sai200");
temp2.add("Sai600");
temp2.add("Sai3");
temp2.add("Sai4");
temp2.add(null);
temp2.add(null);
System.out.println("LinkHash list "+temp2);	



	}

}

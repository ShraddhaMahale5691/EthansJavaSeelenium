package Day11;

import java.util.HashMap;

public class Countnumchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Helloworld";
		//int counter=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<s1.length();i++)
		{
			if(hm.containsKey(s1.charAt(i)))
			{
				int counter=hm.get(s1.charAt(i));
				hm.put(s1.charAt(i), counter+1);
			}
			else
			{
				hm.put(s1.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
	}

}

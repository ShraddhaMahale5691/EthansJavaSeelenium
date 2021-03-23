package Day12;

import java.util.HashMap;

public class Practise {

	public static void main(String[] args) {
		
		String s1="Helloworld";
		HashMap<Character,Integer> hm=new HashMap<>();
		HashMap<Character,Integer> hm1=new HashMap<>();
		for(int i=0,j=0;i<s1.length();i++,j++)
		{
			if(hm.containsValue(s1.charAt(i)))
			{
				hm1.putAll(hm);
				
			}
		}
		System.out.println(hm1);
		
	}

}

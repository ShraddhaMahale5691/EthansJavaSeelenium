package Day11;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Value;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "saish");
        hm.put(2, "Gauri");
        hm.put(null, "Gauri");
        hm.put(null, "Test");
        hm.put(3, null);
        hm.put(4, null);
        System.out.println(hm);
         
         TreeMap<Integer,String> hm1=new TreeMap<>();
         hm1.put(2, "Vikram");
         hm1.put(1, "Gauri");
      // hm1.put(null, "Gauri");--------->Error as sorting is on Key
     
         hm1.put(3, null);
        hm1.put(4, null);
         System.out.println(hm1);
         
         LinkedHashMap<Integer,String>hm2=new LinkedHashMap<>();
         hm2.put(1, "Vikram");
         hm2.put(2, "Gauri");
         hm2.put(null, "Gauri");
         hm2.put(null, "Test");
         hm2.put(3, null);
         hm2.put(4, null);
         System.out.println(hm2);
         
		
	}

}

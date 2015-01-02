/**
 * 
 */
package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dalvir
 *
 */
public class stringPermutation {
	
	
	/*
	 * @param args
	 */
	public  void perm(String s,String temp) {
		
		 if(s.contains("a") && s.contains("b") && s.contains("c") && s.contains("d")){
			 System.out.println(s);
		 }else{
			 perm(s,temp+" ");
		 }
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		String str = "abcd";
		int factor = 0;
		String s = "";
		for(int i=1;i<=str.length();i++){
			factor++;
			for(int j=1;j<=str.length();j++){
				if(j%i==0){
					s+=Character.toString(str.charAt(j-1))+" ";
				}
			}
			System.out.println(s);
			s = "";
		}
		

	}

}

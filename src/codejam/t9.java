/**
 * 
 */
package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author dalvir
 *
 */
public class t9 {

	/**
	 * @param args
	 */
	
	/*
	 * Problem definition here: https://code.google.com/codejam/contest/dashboard?c=351101#s=p2
	 * 
	 */
	
	public static HashMap<Integer, char[]> map = new HashMap<Integer, char[]>();
	public static int lastNum;
	static{
		map.put(2, new char[]{'a','b','c'});
		map.put(3, new char[]{'d','e','f'});
		map.put(4, new char[]{'g','h','i'});
		map.put(5, new char[]{'j','k','l'});
		map.put(6, new char[]{'m','n','o'});
		map.put(7, new char[]{'p','q','r','s'});
		map.put(8, new char[]{'t','u','v'});
		map.put(9, new char[]{'w','x','y','z'});
		map.put(0, new char[]{' '});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\dalvir\\Downloads\\C-large-practice.in";
		try{
			
			Scanner in = new Scanner(new FileReader(new File(filename)));
			int numberOfTestCases = Integer.parseInt(in.nextLine());
			for(int k=0;k<numberOfTestCases;k++){
				String temp = in.nextLine();
				String finalTemp = "";
				char[] t = temp.toCharArray();
				for(int i=0;i<t.length;i++){
					finalTemp+=getNumberFromCharacter(t[i]);
					
				}
				System.out.println("Case #"+(k+1)+": "+finalTemp);
				finalTemp="";
			}
		}catch(FileNotFoundException e){
			System.out.println("File Not found "+filename);
		}

	}
	
	public static String getNumberFromCharacter(char a){
		for(int number: map.keySet()){
			char[] temp = map.get(number);
			for(int i=0;i<temp.length;i++){
				if(Character.toLowerCase(a)==temp[i]){
					//return number;
					
					String tempChar="";
					if(lastNum==number) tempChar+=" ";
					for(int j=0;j<=i;j++){
						
						tempChar+=Integer.toString(number);
					}
					lastNum = number;
					return tempChar;
				}
			}
		}
		return null;
	}

}

/**
 * 
 */
package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author dalvir
 * 
 */
public class reverseWords {

	/**
	 * @param args
	 * Problem definition here: https://code.google.com/codejam/contest/dashboard?c=351101#s=p1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner in = new Scanner(new FileReader(new File("C:\\Users\\dalvir\\Downloads\\large.in")));
		int numberOfTestCases = Integer.parseInt(in.nextLine());
		for(int i=1;i<=numberOfTestCases;i++){
			String test = in.nextLine();
			new reverseWords().reverseString(test, i);
		}
		}catch(FileNotFoundException e){
			System.out.println("The file large.in couldn't be found");
		}
		
		
	}
	
	public void reverseString(String str,int cNo){
		Stack<String> s = new Stack<String>();
		String temp="";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++){
			s.push(arr[i]);
		}
		while(s.size()!=1){
			temp+=s.pop()+" ";
		}
		temp+=s.pop();
		
		System.out.println("Case #"+cNo+": "+temp);
		
	}

}

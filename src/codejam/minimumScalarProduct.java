/**
 * 
 */
package codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author dalvir
 *
 */
public class minimumScalarProduct {

	/**
	 * @param args
	 * 
	 * Problem definition here: https://code.google.com/codejam/contest/32016/dashboard#s=p0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "C:\\Users\\dalvir\\Downloads\\minimumScalarProduct-large.in";
		try{
		Scanner in = new Scanner(new FileReader(new File(filename)));
		int numberOfTestCases = Integer.parseInt(in.nextLine());
		for(int i=0;i<numberOfTestCases;i++){
			int numberOfValues = Integer.parseInt(in.nextLine());
			String firstInput = in.nextLine();
			String secondInput = in.nextLine();
			String[] tempFirstVector = firstInput.split(" ");
			String[] tempSecondVector = secondInput.split(" ");
			if(tempFirstVector.length != tempSecondVector.length){
				System.out.println("The two vectors must be of equal length");
				System.exit(1);
			}
			long[] firstVector = new long[tempFirstVector.length];
			long[] secondVector = new long[tempSecondVector.length];
			for(int j=0;j<tempFirstVector.length;j++){
				firstVector[j] = Integer.parseInt(tempFirstVector[j]);
				secondVector[j] = Integer.parseInt(tempSecondVector[j]);
			}
			
			Arrays.sort(firstVector); Arrays.sort(secondVector);
			long count = 0;
			for(int j=0;j<firstVector.length;j++){
				count+= firstVector[j]*secondVector[firstVector.length-1-j];
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
	}catch(FileNotFoundException e){
		System.out.println("File "+filename+" could not be found");
	}
		
	}

}

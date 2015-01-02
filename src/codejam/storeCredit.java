package codejam;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author dalvir
 * Problem definition here: https://code.google.com/codejam/contest/dashboard?c=351101#s=p0
 */
public class storeCredit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\dalvir\\Downloads\\A-large-practice.in";
		try{
		
			Scanner in = new Scanner(new FileReader(new File(filename)));
			int numberOfTestCases = Integer.parseInt(in.nextLine());
			for(int i=0;i<numberOfTestCases;i++){
				
					int credit = Integer.parseInt(in.nextLine());
					int numberOfItemsInStore = Integer.parseInt(in.nextLine());
					
					String pricesOfItems = in.nextLine();
					
					String prices[] = pricesOfItems.split(" ");
					if(numberOfItemsInStore!=prices.length){
						System.out.println("Not enough values listed"); System.exit(1);
					}
					int[] priceArray = new int[prices.length];
					for(int j=0;j<priceArray.length;j++){
						priceArray[j] = Integer.parseInt(prices[j]);
					}
					
					boolean found = false;
					for(int j=0;j<priceArray.length;j++){
						int temp = credit;
						temp-=priceArray[j];
						
						for(int k=0;k<priceArray.length;k++){
							if(j!=k && temp==priceArray[k] && !found){
								System.out.println("Case #"+(i+1)+": "+(j+1)+" "+(k+1));
								found = true;
							}else{
								
							}
						}
					}
					if(!found){System.out.println("No match"); System.exit(1);}
					
				
			}
		}catch(FileNotFoundException e){
			System.out.println("File "+filename+" couldn't be found!");
		}
		
		
	}

}

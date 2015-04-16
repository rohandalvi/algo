package mathematical;

/**
 * Created by dalvir on 4/16/2015.
 */
public class sqrt {

    public static void main(String args[]){ //Newton's method
        int n = 16;
        Double x = (double) n;
        Double y = (double)1;
        while((x-y)>0.01){
            System.out.println(x+" "+y);
            x = (x+y)/2;
            y = n/x;
        }

        System.out.println(x);
    }
}

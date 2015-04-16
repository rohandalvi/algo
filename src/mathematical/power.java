package mathematical;

import java.math.BigDecimal;

/**
 * Created by dalvir on 4/16/2015.
 */
public class power {

    public BigDecimal power(Integer x, Integer y){ //Time Complexity: O(log n)
        if(y==1) return new BigDecimal(x);
        else{
            BigDecimal returnValue = power(x,y/2);
            if(y%2==0){
                return returnValue.pow(2);
            }else{
                return returnValue.pow(2).multiply(new BigDecimal(x));
            }
        }

    }

    public static void main(String args[]){
        power p = new power();
        System.out.println(p.power(9,3));
        System.out.println(p.slowPower(9,3));
    }

    public BigDecimal slowPower(Integer x, Integer y){ //Time Complexity: O(n)
        if(y==1) return new BigDecimal(x);
        else{
            return new BigDecimal(x).multiply(slowPower(x,y-1));
        }
    }
}

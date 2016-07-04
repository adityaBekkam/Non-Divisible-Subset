import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      int rem[] = new int[k] ;
      for( int i=0 ; i<n ; i++ ){
        arr[i] = in.nextInt();
        rem[ arr[i]%k ]++ ;
      }
      //System.out.println( Arrays.toString(rem));
      int max = 0 ;
      for( int i=1 ; i<=(k/2) ; i++ ){
        if( rem[i]>=rem[k-i] ){
          max += rem[i] ;
        }
        else{
          max += rem[k-i] ;
        }
      }
      if( k%2==0 && rem[k/2]>1 ){
        max -= (rem[k/2]-1) ;
      }
      if( rem[0]>1 ){
        max++ ;
      }
      if( max==0 ){
        max = 1; 
      }
      System.out.println(max);
    }
}

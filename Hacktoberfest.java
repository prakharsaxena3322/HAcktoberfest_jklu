import java.util.*;

public class Hactoberfest{
  public stativ void main(String [] args){
    System.out.print("Hello Coders and Hackers");
    int a = 12, b=3;
    int c = a*b;
    System.out.print("Calculation of a multiply by b is: "+c);
    for(int i=0; i<10;i++){
      if(a<b){
        System.out.print("A is less than B");
      }
      else{
        System.out.print("A is Greater than B ");
      }
      
    }
    Scanner sc = Scanner (System.in);
    int newno = sc.nextInt();
    int arr[] = new int[newno];
    
    for(int i=0; i<=newno; i++){
      arr[i] = nextInt();
    }
    int count =0 ;
    if( newno >5 ){
      System.out.print("Array Length is Acceptable.");
     }
    else{
      System.out.print("Array Length Declined.");
      count++;
    }
    
    
      }
}

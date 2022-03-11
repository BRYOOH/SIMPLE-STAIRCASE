import java.util.Scanner;
 public class Main{
 public static void main(String[] args){
  System.out.println("Enter a value for the binary number;");
   Scanner scan= new Scanner(System.in);
   String binaryNo= scan.nextLine();
   scan.close();
   int binary= Integer.parseInt(binaryNo);// converts the string into an integer
   
   
   int power=0, sum=0;
   while( binary >0){
   int rem= binary % 10;
    sum= sum + (int)(rem * Math.pow (2,power));// Math.pow(arg0,arg1) used to raise a number ie arg0 by arg1
     power++;
     binary= binary /10 ;
   }
   System.out.println("The binary number "+ binaryNo +" is equal to the decimal " +sum);
 }
 }

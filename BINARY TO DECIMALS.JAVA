import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      System.out.println("Enter the value for the binary number; ");
      Scanner scan= new Scanner(System.in);
      String binaryNo= scan.nextLine();
      
      scan.close();
      int Decimal= Integer.parseInt(binaryNo,2);// an API for conversion. 
      
      System.out.println("The decimal value of the "+ binaryNo +" is equal to " + Decimal);
      
    }
    
}

import java.util.Scanner;

public class Convertion {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter the dollar: ");
        int dollar = myScanner.nextInt();
        int peso = dollar * 50;
        
        System.out.println( dollar + " dollars is " + peso + " peso");
        
    }
}
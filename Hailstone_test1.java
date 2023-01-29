import java.util.Scanner;
 

public class Hailstone_test1 {
    public static void main(String args[]){
        int y;{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int x = scanner.nextInt();
        while(true){
        if(x % 2==0){
            y = x/2;
            
            System.out.print(y);
            x = y;
            System.out.print("\n");
          }
        else{
            y = (x * 3) + 1;
            
            System.out.print(y);
            x = y;
            System.out.print("\n");
        }
        
     }
    
    }
 }
}

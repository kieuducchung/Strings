
package btapstrings;
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        String swapped = "";
        
        for(int i = 0; i < s.length(); i++){
            char n = s.charAt(i);
            if(Character.isUpperCase(n)){
                swapped = swapped + Character.toLowerCase(n);
            }else if(Character.isLowerCase(n)){
                swapped = swapped + Character.toUpperCase(n);
            }else{
                swapped = swapped + n;
            }
        }
        System.out.println("Chuoi sau khi chuyen doi: " +swapped);
        
         
    }
    
    
}

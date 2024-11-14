
package btapstrings;
import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
       
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        
        System.out.println("Chuoi sau khi dao nguoc: " + sb);
        
    }
}

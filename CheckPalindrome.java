
package btapstrings;
import java.util.Scanner;


public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
       
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        
        if(s.equals(sb.toString())){
            System.out.println("Chuoi " + s + " la Palindrome");
        }else{
            System.out.println("Chuoi " + s + " khong phai la Palindrome");
        }
        
    }
    
    
}

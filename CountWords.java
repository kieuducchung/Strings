
package btapstrings;
import java.util.Scanner;


public class CountWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        
        Scanner word = new Scanner(s);
        int count = 0;
        
        while (word.hasNext()) {
            word.next();
            count++;
        }
        
        System.out.println("So tu co trong chuoi la: " + count);
    }
    
}

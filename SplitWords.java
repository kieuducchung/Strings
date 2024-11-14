
package btapstrings;
import java.util.Scanner;


public class SplitWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        
        String[] n = s.split(" ");
        System.out.println("Cac tu trong chuoi sau khi tach: ");
        for(String word : n){
            System.out.println(word);
        }
        
    } 
}

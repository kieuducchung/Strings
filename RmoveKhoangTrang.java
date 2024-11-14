
package btapstrings;
import java.util.Scanner;


public class RmoveKhoangTrang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        
        s = s.trim();
        System.out.println("Chuoi sau khi xoa khoang trang: " + s);
    }
}

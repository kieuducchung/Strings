package btapstrings;
import java.util.Scanner;

public class CoutnStrings {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");
        String s = scanner.nextLine();
        System.out.println("Nhap ky tu can dem: ");
        char n = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == n){
                count++;
            }

        }
        System.out.println("So lan xuat hien cua " + n + " la: " + count);
    }

}

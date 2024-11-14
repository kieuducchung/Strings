package btapstrings;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();

        String[] word = s.split(" ");
        String Max = "";

        for (String words : word) {
            if (words.length() > Max.length()) {
                Max = words;
            }
        }
        System.out.println("Tu dai nhat trong chuoi la: " + Max);
    }

}

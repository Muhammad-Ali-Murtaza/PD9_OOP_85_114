
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Ali Murtaza
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Functions f = new Functions();
        System.out.println("Please enter a sentence:");
        String s = input.nextLine();
        System.out.print("Your sentence printed vertically is: \n" + f.displayVertical(s));
    }

}

class Functions {

    public String displayVertical(String s) {
//        char ch[] = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//          ch[i] = s.charAt(i);
//        }
        String str = new String();
        for (int i = 0; i < s.length(); i++) {
//            if ((i+2) == s.length()) {
//                continue;
//            }
            if (s.charAt(i) != ' ') {
                str += s.charAt(i) + "\n";
            }
        }
        return str;
    }
}

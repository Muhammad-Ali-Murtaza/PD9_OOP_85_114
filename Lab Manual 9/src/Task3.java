
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
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Functions3 f = new Functions3();
        Scanner input = new Scanner(System.in);
        System.out.println("Input String :");
        String s = input.nextLine();
        System.out.println(  f.ridMultipleBlank(s));
        System.out.println("Input String for Integer removal :");
        s = input.nextLine();
        System.out.println(  f.removeInteger(s));
        System.out.println("Enter String for Encription: ");
        s = input.nextLine();
        System.out.println(f.stringEncription(s));

    }

}

class Functions3 {

    public String ridMultipleBlank(String s) {
        String str = "";
        int i = 0;
        while (s.charAt(i) == ' ') {
            i++;
        }
        for (; i < s.length();) {

            if (s.charAt(i) == ' ') {
                str += s.charAt(i);
                i++;
                while (s.charAt(i) == ' ') {
                    i++;
                }
            } else {
                str += s.charAt(i);
                i++;
            }

        }
        return str;
    }
    
    public String removeInteger(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                continue;
            }
            else{
                str += s.charAt(i);
            }
            
        }
        return str;
    }
    
    public String stringEncription(String s)
    {
        String str = "";
        int num;
        char c;
        for (int i = 0; i < s.length(); i++) {
            num = s.charAt(i);
            num = num - 28;
            c = (char) num;
            str += c;
        }
        return str;
    }
}

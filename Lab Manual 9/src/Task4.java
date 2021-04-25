
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
public class Task4 {
    public static void main(String[] args) {
        functions4 f = new functions4();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String for Length Discarder : ");
        String n = input.nextLine();
        System.out.println("Enter length of String : ");
        int len = input.nextInt();  input.nextLine();
        System.out.println("String of length = "+len +"\n"+f.lengthDiscarder(n, len));
        System.out.println("Enter String for Character Remove : ");
        String s = input.nextLine();
        System.out.println("Enter Character to remove : ");
        String c =  input.nextLine();
        char ch = c.charAt(0);
        System.out.println("After removal String : \n" + f.charRemover(s, ch));
        System.out.println("Enter string for inversio : ");
        n= input.nextLine();
        System.out.println("String after inversion : \n" + f.stringInverter(n));
        System.out.println("Enetr string for number validator : ");
        n= input.nextLine();
        if (f.numberValidator(n)) {
            System.out.println("Enetred String is a number");
        }
        else
        {
            System.out.println("Enetr string is not a number : ");
        }
    }
}

class functions4{
    // This function is used to count how many times given character
    // repeat in the given String
    public String lengthDiscarder(String s, int length)
    {
        String str = "";
        for (int i = 0; i < length; i++) {
            str += s.charAt(i);
            
        }
        return str;
    }
    
    //This function removes the given character from the given String
    public String charRemover(String s , char ch)
    {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i))
            {
                continue;
            }
            else
            {
                str += s.charAt(i);
            }
        }
        return str;
    }
    
    
    // This Function inverts the whole given String
    public String stringInverter(String s)
    {
        String str = "";
        for (int i = s.length() -1; i >= 0; i--) {
            str += s.charAt(i);
            
        }
        return str;
    }
    
    
    //This function converts character array into the String
    public String stringConverter(char [] ch)
    {
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str += ch[i];
        }
        return str;
    }
    
    //This function validate that whole string consist of digits
    public boolean numberValidator(String s)
    {
        boolean flag=true;
        for (int i = 0; i < s.length(); i++) {
            s = s.toLowerCase();
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                flag= false;
            }
            
        }
        return flag;
    }
}
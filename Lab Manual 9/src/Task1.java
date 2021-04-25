
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
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Functions f = new Functions();
        System.out.println("Enter the string:");
        String s = input.nextLine();
        System.out.println("Enter the sub-string:");
        String sub = input.nextLine();
        System.out.println("Number of words : " + f.wordCounter(s));
        System.out.println("Number of vowels : " + f.vowelcounter(s));
        System.out.println("Number of punctuation : " + f.puncCount(s));
        if(f.findSubString(s,sub))
        {
            System.out.println("\""+sub+"\""+ "  is the part of this String");
        }
        else
        {
            System.out.println("\""+sub+"\""+ " is not the part of this String");
            
        }
    }

}

class Functions {

    public int wordCounter(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public int vowelcounter(String s) {
//        s = s.toUpperCase();
        int vowel = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                    || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            }
        }
        return vowel;
    }

    public int puncCount(String s) {
        int count = 0;
        char [] c = new char[s.length()+2];
        for (int i = 0; i < s.length(); i++)
        {
            c[i] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
//            c = s.charAt(i);
            if (c[i] == '.' && c[i+1] == '.' && c[i+2] == '.') {
                count++;
            }
            if (c[i] == '.' || c[i] == '?' || c[i] == '!'
                    || c[i] == ',' || c[i] == ';' || c[i] == ':' || c[i] == '-'
                    || c[i] == '(' || c[i] == ')' || c[i] == '{' || c[i] == '}'
                    || c[i] == '[' || c[i] == ']' || c[i] == '/' || c[i] == '\'') {
                count++;
            }

        }
        return count;
    }
    
    public boolean findSubString(String s , String sub)
    {
        boolean flag = false;
        char [] ch = new char[s.length()];
        char [] ch1 = new char[sub.length()];
        for(int i = 0 ; i < s.length() ; i++)
        {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < sub.length(); i++) {
            ch1[i] = sub.charAt(i);
            if(ch1[i] >= 65 && ch1[i] <= 90)
            {
                try {
                    int c = ch1[i];
                    c += 32;
                    ch1[i] = (char)c;
                } catch (Exception e) {
                }
            }
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(ch[i] >= 65 && ch[i] <= 90)
            {
                try {
                    int c = ch[i];
                    c += 32;
                    ch[i] = (char)c;
                } catch (Exception e) {
                }
            }
            if (((i) + sub.length()) > s.length()) {
//                System.out.println("Return false from index condition");
                return false;
            }
            if (ch[i] == ch1[0]) {
                flag = false;
                for (int j = 1; j < sub.length(); j++) {
                    if (ch[i + j] == ch1[j]) {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                    
                }
                if (flag) {
                return true;   
                }
            }
        }
        return false;
    }

}

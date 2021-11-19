import java.util.Scanner;

public class Disemvoweling {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.println("Enter Your Phrase:");
        String s = scan.next();

    }
    public boolean disemvowel(String s) {
        boolean isVowel(char c);
        if (c == 'a') {
            return true;
        else if (c == 'e') {
                return true;
            } else if (c == 'i') {
                return true;
            } else if (c == 'o') {
                return true;
            } else if (c == 'u') {
                return true;
            }
            return false;
        }
        String noVowel = " ";
        int l = s.length();
        for (int m = 0; m <= 1; m++) {
            boolean yesVowel = isVowel(s.charAt(m));
            if (isVowel == "false") {
                char x = s.charAt(m);
                noVowel = noVowel + x;
            }
        }
        return noVowel;
        System.out.println(noVowel);
    }

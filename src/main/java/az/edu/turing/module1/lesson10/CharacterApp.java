package az.edu.turing.module1.lesson10;

public class CharacterApp {
    public static void main(String[] args) {
        char [] arr={'J','A','V','A',' ','B','A','C','K','E','N','D'};
        print(arr);
    }
    public static void print(char[] word){
        for (char c : word) {
            System.out.print(c);
        }
    }
}

import java.util.Scanner;

public class WordGuessor {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Word Guessor Game!");
    System.out.println("You have 5 attempts to guess the correct word");
    System.out.println("Guess the Word!");

    int i = 0;
    String isWord = "Coder"; 
    
    for(i = 0; i<5; i++) {
        System.out.println("Enter your word!");
        String newWord = scanner.nextLine();
        if (newWord.equals(isWord)) {
            System.out.println("Word is correct!");
        }
        else {
            System.out.println("Word is Wrong");
        }
        }
        
    }
    
}


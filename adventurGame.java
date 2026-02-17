import java.util.Scanner;

public class adventurGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        System.out.println(" _  _             _  _\r\n" + //
                        " .       /\\\\/%\\       .   /%\\/%\\     .\r\n" + //
                        " __.<\\\\%#//\\,_       <%%#/%%\\,__  .\r\n" + //
                        ".    <%#/|\\\\%%%#///\\    /^%#%%\\///%#\\\\\r\n" + //
                        " \"\"/%/\"\"\\ \\\"\"//|   |/\"\"'/ /\\//\"//'\r\n" + //
                        " .     L/'`   \\ \\  `    \"   / /  ```\r\n" + //
                        " `      \\ \\     .   / /       .\r\n" + //
                        " .       .      \\ \\       / /  .\r\n" + //
                        " .        \\ \\     / /          .\r\n" + //
                        " .      .    ..:\\ \\:::/ /:.     .     .\r\n" + //
                        "______________/ \\__;\\___/\\;_/\\________________________________\r\n" + //
                        "YwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYwYw");
        
        System.out.println("You have been transported to the year 3433. You wake up and notice that you're no longer on Earth. Gravity feels different. It's dark outside and as you stand up, you realize you're outside... a house?");
        System.out.print("Lets Start!");
         
        
        String a = "You fell off the cliff and plummeted to your death. Sorry... Press [y] to restart.";
        String b = "You ate some berries and didn't die. Peeta is that you? Press [y] to play again.";
        String c = "The Computer says you live on!";

    
        while (true) {

        System.out.println("Enter your action");
        String input = scanner.nextLine();
        
        if (input.equals("d")) {
            System.out.println(a);
        }
        else if (input.equals("e")) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        System.out.println("Enter Y/N to proceed");
        String choice = scanner.nextLine();

        if (choice.equals("N")) {
            break;
        }
        
        
    }
}}

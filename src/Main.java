import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        String input;
        String output;
        //Input could be used for gameStart
        //String gameStart;
        //reading user input - Joe N
        Scanner begin = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // start game feature; Raven and Alan
        System.out.println("--------------------------");
        System.out.println("Type 'start' to start game");
        System.out.println("--------------------------");

        Player.setPlayerHealth(10);
      //  Player.setPlayerAttkDamage(1);

       input = begin.next();

        //@author:Raven Gardner & Alan Oliver;
        // modified to allow the user to exit out of
        // the program while they are in the start menu
        while (begin.hasNextLine()) {
            if (input.equalsIgnoreCase("start")) {
                break;
            }
             else if(input.equalsIgnoreCase("quit")){
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
            else {
                System.out.println("invalid command\n");
                System.out.println("--------------------------");
                System.out.println("Type 'start' to start game");
                System.out.println("--------------------------");
                input = begin.next();
            }
        }
        game.showIntro();
        //author Joe F Nsengiyumva
        do {

            System.out.print("> ");
            input = in.readLine();
            output = game.runCommand(input);
            System.out.println(output);
        } while (!"quit".equals(input));

    }

}

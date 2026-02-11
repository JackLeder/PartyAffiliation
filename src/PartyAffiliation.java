/*
(This task uses Strings:) A program that prompts the user for their party affiliation (Democrat, Republican, or Independent) they respond with the first letter, and the program responds accordingly with a Donkey, Elephant, Person, or Other. (i.e. "You get a Democratic Donkey.")
Notes: create a menu so the user chooses D, R, or I and assume that any other choice will be Other.
Tests: just the four options D, R, I, Other. Use as cascaded if structure not separate if statements!
\\
Test runs: (insert the output widow copies here for 4 test runs)

 */

import java.util.Scanner;


public class PartyAffiliation {
    public static void main(String[] args) {
        String trash;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter party number [DRI]: ");
        if (input.hasNextLine()) {
            String party = input.nextLine();

          if (party.equals("d") || party.equals("D")) {
              System.out.print("You get a Democratic Donkey.");

            } else if (party.equals("r") || party.equals("R")) {
              System.out.print("You get a Republican Elephant.");

            } else if (party.equals("i") || party.equals("I")) {
              System.out.print("You get an Independent Person.");

            } else {
              System.out.print("invalid choice must be DRI.");

          }

        }else{
            trash = input.nextLine();
            System.out.println("invalid input");
            System.exit(0);
        }


    }
}

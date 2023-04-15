package edu.upenn.cit594;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.err.println("incorrect number of arguments");
            return;
        }

    Scanner scanner = new Scanner(System.in);
        int choice = 0;

       do{ System.out.println(" Please Choose :\n" + "1.show all \n" +
                "2.show \n" + "3.show \n");
           choice = scanner.nextInt();
           switch(choice){
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:

           default:
               System.out.println("invlid, try again");
               break;
    }
    } while(choice<8);
}}
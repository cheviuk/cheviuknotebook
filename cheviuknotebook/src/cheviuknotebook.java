/**
 * Created by cheviuk on 04.09.2015.
 */
import notebook.*;

import java.util.Scanner;

public class cheviuknotebook {
   public static void main(String[] args) {

       NotebookView notebookView = new NotebookView();
       NotebookController notebookController = new NotebookController();
       NotebookModel notebookModel = new NotebookModel();

       Scanner scanner = new Scanner(System.in);
       int command = 0;

       while(true){

           System.out.println("Please choose command:");
           System.out.println("1 - print all notes");
           System.out.println("2 - create new note");
           System.out.println("3 - delete note");
           System.out.println("4 - print info about note");
           System.out.println("5 - save to file");
           System.out.println("6 - load from file");
           System.out.println("7 - Exit");

           try { command = Integer.parseInt(scanner.nextLine()); }
           catch (NumberFormatException ex){ System.out.println("Wrong input!"); }

           switch (command) {
               case (1): { notebookView.printAll(notebookController); break;}
               case (2): {System.out.println("Create new note:"); notebookView.createNewNote(); System.out.println(); break;}
               case (3): {System.out.println("Delete note:"); notebookView.deleteNote(); System.out.println(); break;}
               case (4): {System.out.println("Print note info:"); notebookView.printNoteInfo(); System.out.println(); break;}
               case (5): {System.out.println("Save to file:"); notebookView.saveToFile(); System.out.println(); break; }
               case (6): {System.out.println("Load from file:"); notebookView.loadFromFile(); System.out.println(); break; }
               case (7): {System.out.println("Exit"); scanner.close(); return;}
               default: {System.out.println("Incorrect command!"); System.out.println(); break;}
           }
       }
    }
}

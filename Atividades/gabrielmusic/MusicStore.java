package co.gabrielmusic;

import java.io.PrintStream;

public class MusicStore {

    void displayHoursOfOperation(PrintStream show){
        show.println("\nPeríodo: \n" +"Diariamente das 9:00 - 22:00");}

    void setOwner(String owner , PrintStream show){
        owner = "Roberto";
        show.println("\n" + owner + ", Proprietário");
    }



}

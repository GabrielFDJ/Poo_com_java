package gabrielmusic;

import java.io.PrintStream;

public class MusicTitle {
    public String title;
    public String Artist; 

    public MusicTitle(){
        this.title="Sem nome";
        this.Artist="Sem nome";        
    }

    void displayMusicTitles(PrintStream show){
        //for(int i = 0; i<2 ; i++){
            show.println("\nTitulo 1 ");
            show.println("\n Titulo: " + this.title);
        //}
        
    }

    public void set_Titles(String title){
        this.title=title;
    }

    public void set_Artist(String Artist){
        this.Artist=Artist;
    }

    
}

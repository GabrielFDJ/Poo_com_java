package co.gabrielmusic;

import java.io.PrintStream;

public class TestMusicStore {
    public static void main(String[] args) {
        //LabVi : A Classe MusicStore
        MusicStore music = new MusicStore();
        PrintStream show = System.out;
        music.displayHoursOfOperation(show);
        //LabVII: MusicStore com um Dono
        String owner = "sem dono";
        music.setOwner(owner,show);

    }
}

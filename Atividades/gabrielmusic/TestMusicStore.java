package co.gabrielmusic;

import java.io.PrintStream;

public class TestMusicStore {
    public static void main(String[] args) {
        MusicStore music = new MusicStore();
        PrintStream show = System.out;
        music.setOwner("Gabriel");
        music.displayHoursOfOperation(show);
        //LabVi : A Classe MusicStore
        //LabVII: MusicStore com um Dono
        //LabVIII: MusicStore com checagem de horário

    }
}

package co.gabrielmusic;

import java.util.Scanner;
import java.io.PrintStream;
import java.util.Calendar;

public class MusicStore {

    private Scanner texto = new Scanner(System.in);
    private String owner;
    private int openTime;
    private int closeTime;

    public MusicStore(){
        this.owner="Sem dono";
        this.openTime=9;
        this.closeTime=21;
    }

    void displayHoursOfOperation(PrintStream show){
        show.println("\nDigite o Horário de abertura : ");
        this.openTime = texto.nextInt();
        show.println("\nDigite o Horário de fechamento : ");
        this.closeTime = texto.nextInt();
        show.println("\n" + this.owner + ", Proprietário");
        show.println(this.openCloseMessage());
        show.println(toString(owner,openTime,closeTime));
    }

    private String openCloseMessage(){
        String message="Estamos fechados";
        if(this.isopen())
            message="Estamos abertos";
        return message;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public void setOpenTime(int openTime){
        this.openTime=openTime;
    }

    public void setCloseTime(int closeTime){
        this.closeTime=closeTime;
    }

    public int getOpenTime(){
        return this.openTime;
    }

    public int getCloseTime(){
        return this.closeTime;
    }


    private int getHourInt() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.HOUR_OF_DAY);
    }

    private boolean isopen(){
        boolean result = false;
        if((this.getHourInt() >= this.openTime) && (this.getHourInt() <= this.closeTime))
            result = true;
        return result;
    }

    private String toString(String owner, int openTime , int closeTime){
        String concatenacao = "[ Dono , = " + this.owner + ", Abre = " + this.openTime + ", Fecha = " + this.closeTime + "]";
        return concatenacao;
    }
}

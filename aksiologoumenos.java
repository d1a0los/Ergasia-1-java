import java.util.*;

class aksiologoumenos {
    private int code;
    private String name;
    private String surname;
    private int erotis;
    private int correct;
    private double perc;

    aksiologoumenos(int code, String name, String surname) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.erotis=0;
        this.correct=0;
    }

    public String getName() {return name;}

    public int getCode() {return code;}
    public String getSurname() {return surname;}

    public int getErot() {return erotis;}

    public void addErot() {erotis++;}

    public int getCorr() {return correct;}

    public void addCorr() {correct++;}

    public double getPercAks() {return perc;}

    public void makePercAks(int x , int y){
        this.perc = (double)x / (double)y * 100.0;
    }

    public String toString() {
        return "[*]Code: " + code + ", Name: " + name + ", Surname: " + surname;
    }
}
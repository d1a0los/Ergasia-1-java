import java.util.*;
import random;

class erotiseis {
    private int code;
    private String ekfonisi;
    private String[] answerList;

    erotiseis(int code, String ekfonisi, String[] answerList) {
        this.code = code;
        this.ekfonisi = ekfonisi;
        this.answerList=answerList;
    }

    public String getEkfonisi(){
        return ekfonisi;
    }

    public int getCode(){
        return code;
    }

    public String[] getAnswer(){
        return answerList;
    }

    public static void printApantiseis(String[] lista)
    { 
        ArrayList help = new ArrayList();
        for(String item : lista){
            help.add(item);
        }
        Collections.shuffle(help);
        System.out.println(help);
    }

    public String toString(){
        return "[*] Code: " + code + ", Ekfonisi: " + ekfonisi;
    }
}

class er_multChoice extends erotiseis {
    private String[] rightAnswerList;

    er_multChoice(int code, String ekfonisi, String[] answerList, String[] rightAnswerList) {
        super(code, ekfonisi,answerList);
        this.rightAnswerList=rightAnswerList;
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String[] getAnswer(){
        return super.getAnswer();
    }

    public String[] getRightAnswers()
    {
        return rightAnswerList;
    }
}

class er_oneWord extends erotiseis{

    er_oneWord(int code, String ekfonisi, String[] rightAnswer) {
        super(code, ekfonisi,rightAnswer);
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String[] getAnswer(){
        return super.getAnswer();
    }
}

class er_kena extends erotiseis{
    er_kena(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String[] getAnswer(){
        return super.getAnswer();
    }
}
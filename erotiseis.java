import java.util.*;

class erotiseis {
    private int code;
    private String ekfonisi;
    private String[] answerList;
    private String[] rightAnswerList;
    private int ans;
    private int cors;
    private double perc;

    erotiseis(int code, String ekfonisi, String[] answerList, String[] rightAnswerList) {
        this.code = code;
        this.ekfonisi = ekfonisi;
        this.answerList=answerList;
        this.rightAnswerList=rightAnswerList;
        ans=0;
        cors=0;
    }

    public String getEkfonisi() {return ekfonisi;}

    public int getCode() {return code;}

    public String[] getAnswer() {return answerList;}

    public String[] getRightAnswers() {return rightAnswerList;}

    public int getAns() {return ans;}

    public void addAns() {ans++;}
    
    public int getCors() {return cors;}

    public void addCors() {cors++;}

    public double getPerc() {return perc;}

    public void makePerc(int x , int y){
        this.perc = (double)x / (double)y * 100.0;
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

    private int ans=0;
    private int cors=0;
    private float perc;

    er_multChoice(int code, String ekfonisi, String[] answerList, String[] rightAnswerList) {
        super(code, ekfonisi,answerList,rightAnswerList);
        ans=0;
        cors=0;
    }

    public String getEkfonisi() {return super.getEkfonisi();}

    public int getCode() {return super.getCode();}

    public String[] getAnswer() {return super.getAnswer();}

    public String[] getRightAnswers() {return super.getRightAnswers();}

    public int getAns() {return super.getAns();}

    public void addAns() {super.addAns();}
    
    public int getCors() {return super.getCors();}

    public void addCors() {super.addCors();}

    public double getPerc() {return super.getPerc();}

    public void makePerc(){
        super.makePerc();
    }
}

class er_oneWord extends erotiseis{

    private int ans;
    private int cors;
    private float perc;

    er_oneWord(int code, String ekfonisi, String[] Answer, String[] rightAnswer) {
        super(code, ekfonisi,Answer,rightAnswer);
        ans=0;
        cors=0;
    }

    public String getEkfonisi() {return super.getEkfonisi();}

    public int getCode() {return super.getCode();}

    public String[] getAnswer() {return super.getAnswer();}

    public String[] getRightAnswers() {return super.getRightAnswers();}

    public int getAns() {return super.getAns();}

    public void addAns() {super.addAns();}
    
    public int getCors() {return super.getCors();}

    public void addCors() {super.addCors();}

    public double getPerc() {return super.getPerc();}

    public void makePerc(){
        super.makePerc();
    }
}

class er_kena extends erotiseis{

    private int ans;
    private int cors;
    private float perc;

    er_kena(int code, String ekfonisi, String[] answerList, String[] rightAnswer) {
        super(code, ekfonisi,answerList,rightAnswer);
        ans=0;
        cors=0;
    }

    public String getEkfonisi() {return super.getEkfonisi();}

    public int getCode() {return super.getCode();}

    public String[] getAnswer() {return super.getAnswer();}

    public String[] getRightAnswers() {return super.getRightAnswers();}

    public int getAns() {return super.getAns();}

    public void addAns() {super.addAns();}
    
    public int getCors() {return super.getCors();}

    public void addCors() {super.addCors();}

    public double getPerc() {return super.getPerc();}

    public void makePerc(){
        super.makePerc();
    }
}
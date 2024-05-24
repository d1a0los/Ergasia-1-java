import java.util.*;

class erotiseis {
    public static ArrayList listaEr = new ArrayList();
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

    public int getSize(String[] x){
        return x.length;
    }

    public void printApantiseis(String[] lista)
    {
        List<String> strList = Arrays.asList(lista);
        Collections.shuffle(strList);
        lista = strList.toArray(new String[strList.size()]);

        System.out.println(strList);
    }

    public String toString(){
        return "[*] Code: " + code + ", Ekfonisi: " + ekfonisi;
    }

    public static void printList() {
        for(Object items : listaEr)
        {
            if(items instanceof er_kena)
            {
                System.out.print(items.toString());
            }

            if(items instanceof er_oneWord)
            {
                System.out.print(items.toString());
            }

            if(items instanceof er_multChoice)
            {
                System.out.print(items.toString());
            }
        }
    }
}

class er_kena extends erotiseis {

    er_kena(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
        listaEr.add(this);
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

class er_oneWord extends erotiseis{

    er_oneWord(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
        listaEr.add(this);
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

class er_multChoice extends erotiseis{
    private String[] rightAnswr = new String[1];

    er_multChoice(int code, String ekfonisi, String[] rightAnswr,String[] answerList) {
        super(code, ekfonisi,answerList);
        this.rightAnswr = rightAnswr;
        listaEr.add(this);
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
import java.util.*;

class erotiseis {
    protected static ArrayList listaEr = new ArrayList();
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

    public String getAnswer(){
        return "Oi swstes apantiseis einai: "+answerList;
    }

    public String toString(){
        return "Code: " + code + ", Ekfonisi: " + ekfonisi;
    }
}

class er_kena extends erotiseis {

    er_kena(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
    }

    public static void printList() {
        System.out.println("\n         Erotiseis Me Kena Sto Keimeno          ");
        System.out.println("           -----------------------------              ");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
            System.out.println("______________________________________________________________________");
        }
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String getAnswer(){
        return super.getAnswer();
    }
}

class er_oneWord extends erotiseis{

    er_oneWord(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
    }

    public static void printList()
    {
        System.out.println("\n         Erotiseis Me Mono Mia Swsti Apantisi           ");
        System.out.println("           ------------------------------------              ");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
            System.out.println("______________________________________________________________________");
        }
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String getAnswer(){
        return super.getAnswer();
    }
}

class er_multChoice extends erotiseis{
    
    er_multChoice(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList);
        //erotiseis erObj = new erotiseis(code, ekfonisi);
        //listaEr.add(erObj);
    }

    public static void printList()
    {
        System.out.println("\n             Erotiseis Multiple Choice           ");
        System.out.println("               -------------------------          ");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
            System.out.println("______________________________________________________________________");
        }
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public String getAnswer(){
        return super.getAnswer();
    }
}
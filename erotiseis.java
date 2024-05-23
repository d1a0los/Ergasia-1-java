import java.util.*;

class erotiseis {
    protected static ArrayList listaEr = new ArrayList();
    private int code;
    private String ekfonisi;
    private String[] answerList;
    private String typeOfEr;

    erotiseis(int code, String ekfonisi, String[] answerList, String typeOfEr) {
        this.code = code;
        this.ekfonisi = ekfonisi;
        this.answerList=answerList;
        this.typeOfEr = typeOfEr;
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

    public String getTypeOfEr()
    {
        return typeOfEr;
    }

    public int getSize(){
        return listaEr.size();
    }

    public void printApantiseis(ArrayList lista){
        System.out.println("Bale Tis Lejeis Sth Seira:");
        for(int i=0; lista.getSize(); i++){
            System.out.println(lista[i]);
        }
        
    }

    public String toString(){
        return "Code: " + code + ", Ekfonisi: " + ekfonisi;
    }

    public static void printList() {
        Iterator itr = listaEr.iterator();
        while(itr.hasNext())
        {
            erotiseis items = (erotiseis)itr.next();
            if(items.getTypeOfEr().equals("er_kena"))
            {
                System.out.print("\n[!]Erotish me kena: ");
                System.out.print(items.toString());
            }

            if(items.getTypeOfEr().equals("er_oneWord"))
            {
                System.out.print("\n[!]Erotish me mono mia swsti lexi gia apantisi: ");
                System.out.print(items.toString());
            }

            if(items.getTypeOfEr().equals("er_multChoice"))
            {
                System.out.print("\n[!]Erotiseis me pollaplis epilogis: ");
                System.out.print(items.toString());
            }
            //System.out.println(items.toString());
        }
    }
}

class er_kena extends erotiseis {
    private int kena;

    er_kena(int code, String ekfonisi, String[] answerList, int kena) {
        super(code, ekfonisi,answerList,"er_kena");
        this.kena=kena;
        erotiseis erObj = new erotiseis(code, ekfonisi,answerList,"er_kena");
        listaEr.add(erObj);
    }

    public String getEkfonisi(){
        return super.getEkfonisi();
    }

    public int getCode(){
        return super.getCode();
    }

    public int getKena(){
        return kena;
    }

    public String[] getAnswer(){
        return super.getAnswer();
    }
}

class er_oneWord extends erotiseis{

    er_oneWord(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList,"er_oneWord");
        erotiseis erObj = new erotiseis(code, ekfonisi,answerList,"er_oneWord");
        listaEr.add(erObj);
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
    
    er_multChoice(int code, String ekfonisi, String[] answerList) {
        super(code, ekfonisi,answerList,"er_multChoice");
        erotiseis erObj = new erotiseis(code, ekfonisi,answerList,"er_multChoice");
        listaEr.add(erObj);
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
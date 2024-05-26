import java.util.*;

class apantiseis {
    private erotiseis ques;
    protected aksiologoumenos stud;
    private ArrayList listaAp;

    apantiseis(erotiseis ques, aksiologoumenos stud, ArrayList listaAp){
        this.ques=ques;
        this.stud=stud;
        this.listaAp=listaAp;
    }

    public String toString(){
        return ques.toString()+"[*] Apantish/eis:"+ listaAp+"\n";
    }
}

class ap_kena extends apantiseis{
    private ArrayList listaAp;
    private boolean swsto;

    ap_kena(erotiseis ques, aksiologoumenos stud, ArrayList listaAp, boolean swsto){
        super(ques, stud,listaAp);
        this.listaAp=listaAp;
        this.swsto = swsto;
    }

    public ArrayList getListaAp(){
        return listaAp;
    }

    public boolean apKenaResult(){
        return swsto;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }
}

class ap_oneWord extends apantiseis {
    private ArrayList apWord;
    private boolean swsto;

    ap_oneWord(erotiseis ques, aksiologoumenos stud, ArrayList apWord, boolean swsto) {
        super(ques, stud,apWord);
        this.apWord = apWord;
        this.swsto = swsto;
    }

    public ArrayList getApWord(){
        return apWord;
    }

    public boolean apKenaResult(){
        return swsto;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }
}

class ap_multiChoice extends apantiseis{
    private ArrayList listaAp;
    private boolean swsto;

    ap_multiChoice(erotiseis ques, aksiologoumenos stud, ArrayList listAp, boolean swsto){
        super(ques, stud,listAp);
        this.listaAp=listAp;
        this.swsto = swsto;
    }

    public ArrayList getListaAp(){
        return listaAp;
    }

    public boolean apKenaResult(){
        return swsto;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }
}
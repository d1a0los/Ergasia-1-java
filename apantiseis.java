import java.util.*;

class apantiseis {
    protected aksiologoumenos stud;
    protected erotiseis ques;
    protected String[] listaAp;

    apantiseis(aksiologoumenos stud, erotiseis ques, String[] listaAp){
        this.ques=ques;
        this.stud=stud;
        this.listaAp=listaAp;
    }

    public String toString(){
        return ques.toString()+"[*] Apantish/eis:"+ listaAp;
    }
}

class ap_kena extends apantiseis{
    private final String apType = "FILL";

    ap_kena(aksiologoumenos stud, erotiseis ques, String[] listaAp){
        super(stud, ques,listaAp);
    }

    public String[] getListaAp(){
        return listaAp;
    }

    public aksiologoumenos getStudent()
    {
        return stud;
    }

    public String getApType()
    {
        return apType;
    }
}

class ap_oneWord extends apantiseis {
    private final String apType = "ONE_WORD";

    ap_oneWord(aksiologoumenos stud, erotiseis ques, String[] oneWord) {
        super(stud, ques,  oneWord);
    }

    public String[] getApWord(){
        return oneWord;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }

    public String getApType()
    {
        return apType;
    }
}

class ap_multiChoice extends apantiseis{
    private final String apType = "MC";

    ap_multiChoice(aksiologoumenos stud, erotiseis ques, String[] listaAp){
        super(stud,ques, listaAp);
    }

    public ArrayList getListaAp(){
        return listaAp;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }

    public String getApType()
    {
        return apType;
    }
}
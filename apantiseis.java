import java.util.*;

class apantiseis {
    private erotiseis ques;
    private aksiologoumenos stud;
    private String quesEk;
    private int codeAks;

    apantiseis(erotiseis ques, aksiologoumenos stud){
        this.ques=ques;
        this.stud=stud;
        this.quesEk = ques.getEkfonisi();
        this.codeAks= stud.getCode();
    }

    public String getQuesEk(){
        return quesEk;
    }

    public int getCodeAks(){
        return codeAks;
    }

    public String toSting(){
        return "Erotisi: "+ques.toString()+"\nAksiologoumenos:"+stud.toString();
    }
}

class ap_kena extends apantiseis{
    private ArrayList listaAp;

    ap_kena(erotiseis ques, aksiologoumenos stud, ArrayList listaAp){
        super(ques, stud);
        this.listaAp=listaAp;
    }
    //apantiseis apObj = new apantiseis();
    //  listaAp.add(apObj);

    public ArrayList getListaAp(){
        return listaAp;
    }
}

class ap_oneWord extends apantiseis {
    private String apWord;

    ap_oneWord(erotiseis ques, aksiologoumenos stud, String apWord) {
        super(ques, stud);
        this.apWord = apWord;
    }

    public String getApWord(){
        return apWord;
    }
}

class ap_multiChoice extends apantiseis{
    private ArrayList listaAp;

    ap_multiChoice(erotiseis ques, aksiologoumenos stud, ArrayList listAp){
        super(ques, stud);
        this.listaAp=listAp;
    }

    public ArrayList getListaAp(){
        return listaAp;
    }
}
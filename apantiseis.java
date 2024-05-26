import java.util.*;

class apantiseis {
    private erotiseis ques;
    private aksiologoumenos stud;

    apantiseis(erotiseis ques, aksiologoumenos stud){
        this.ques=ques;
        this.stud=stud;
    }

    public String toSting(){
        return "Erotisi: "+ques.toString()+"Aksiologoumenos:"+stud.toString()+"\n";
    }
}

class ap_kena extends apantiseis{
    private ArrayList listaAp;

    ap_kena(erotiseis ques, aksiologoumenos stud, ArrayList listaAp){
        super(ques, stud);
        this.listaAp=listaAp;
    }

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
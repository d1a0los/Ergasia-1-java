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
    
    public aksiologoumenos getStudent()
    {
        return stud;
    }

    public String[] getListaAp(){return listaAp;}

    public erotiseis getErot()
    {
        return ques;
    }

    public String toString(){
        return ques.toString()+"[*] Apantish/eis:"+ listaAp;
    }
}

class ap_kena extends apantiseis{
    private final String apType = "FILL";

    ap_kena(aksiologoumenos stud, erotiseis ques, String[] listaAp){
        super(stud, ques,listaAp);
        stud.addErot();
        ((er_kena)ques).addAns();
        if(Arrays.asList(ques.getRightAnswers()).equals(Arrays.asList(listaAp))){
            stud.addCorr();
            ((er_kena)ques).addCors();
        }
    }

    public String[] getListaAp(){
        return listaAp;
    }

    public aksiologoumenos getStudent()
    {
        return stud;
    }

    public erotiseis getErot()
    {
        return ques;
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
        stud.addErot();
        ((er_oneWord)ques).addAns();
        if(functions.search(ques.getRightAnswers(), oneWord)){
            stud.addCorr();
            ((er_oneWord)ques).addCors();
        }
    }

    public String[] getApWord(){
        return super.getListaAp();
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }

    public erotiseis getErot()
    {
        return ques;
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
        stud.addErot();
        ((er_multChoice)ques).addAns();
        if(Arrays.asList(ques.getRightAnswers()).equals(Arrays.asList(listaAp))){
            stud.addCorr();
            ((er_multChoice)ques).addCors();
        }
    }

    public String[] getListaAp(){
        return listaAp;
    }

    public aksiologoumenos getAksiolog()
    {
        return stud;
    }

    public erotiseis getErot()
    {
        return ques;
    }

    public String getApType()
    {
        return apType;
    }
}
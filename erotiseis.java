import java.util.*;

class erotiseis {
    private int code;
    private String ekfonisi;

    erotiseis(int code, String ekfonisi) {
        this.code = code;
        this.ekfonisi = ekfonisi;
    }

    public String toString(){
        return "[>]Code: " + code + ", Ekfonisi: " + ekfonisi;
    }
}

class er_kena extends erotiseis {
    private static ArrayList listaEr = new ArrayList();

    er_kena(int code, String ekfonisi) {
        super(code, ekfonisi);
        erotiseis erObj = new erotiseis(code, ekfonisi);
        listaEr.add(erObj);
    }

    public static void printList()
    {
        System.out.println("\n[!]Erotiseis Me Kena Sto Keimeno:");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
        }
    }
}

class er_oneWord extends erotiseis{
    private static ArrayList listaEr = new ArrayList();

    er_oneWord(int code, String ekfonisi) {
        super(code, ekfonisi);
        erotiseis erObj = new erotiseis(code, ekfonisi);
        listaEr.add(erObj);
    }

    public static void printList()
    {
        System.out.println("\n[!]Erotiseis Me Mono Mia Swsti Apantisi:");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
        }
    }
}

class er_multChoice extends erotiseis{
    private static ArrayList listaEr = new ArrayList();

    er_multChoice(int code, String ekfonisi) {
        super(code, ekfonisi);
        erotiseis erObj = new erotiseis(code, ekfonisi);
        listaEr.add(erObj);
    }

    public static void printList()
    {
        System.out.println("\n[!]Erotiseis Multiple Choice:");
        for(Object items : listaEr)
        {
            System.out.println(items.toString());
        }
    }
}
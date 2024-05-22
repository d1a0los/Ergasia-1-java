import java.util.*;

class aksiologoumenos {
    private int code;
    private String name;
    private String surname;

    aksiologoumenos(int code, String name, String surname) {
        this.code = code;
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Surname: " + surname;
    }

    public int getCode(){
        return code;
    }
}

class aks_list_creator extends aksiologoumenos {
    private static ArrayList aksiologoumenoi = new ArrayList();

    aks_list_creator(int code, String name, String surname) {
        super(code,name,surname);
        aksiologoumenos aksObj = new aksiologoumenos(code,name,surname);
        aksiologoumenoi.add(aksObj);
    }

    public static void printList()
    {
        for(Object items : aksiologoumenoi)
        {
            System.out.println(items.toString());
            System.out.println("===========================================");
        }
    }
}
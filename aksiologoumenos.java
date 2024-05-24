import java.util.*;

class aksiologoumenos {
    public static ArrayList aksiologoumenoi = new ArrayList();
    private int code;
    private String name;
    private String surname;

    aksiologoumenos(int code, String name, String surname) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        aksiologoumenoi.add(this);
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
    public String getSurname(){
        return surname;
    }

    public static ArrayList getList(){
        return aksiologoumenoi;
    }

    public static void printList()
    {
        for(Object items : aksiologoumenoi)
        {
            System.out.println(items.toString());
        }
    }



    int getSize(){
        return aksiologoumenoi.size();
    }

    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Surname: " + surname;
    }
}
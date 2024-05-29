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

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
    public String getSurname(){
        return surname;
    }

    public String toString() {
        return "[*]Code: " + code + ", Name: " + name + ", Surname: " + surname;
    }
}
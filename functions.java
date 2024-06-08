import java.util.*;

public class functions {

    static void clear_console() {
        for (int i = 0; i < 80 * 2; i++)
            System.out.println("\b");
    }
    
    static void menuPrinter()
    {
        System.out.println("                      --Main Menu-- ");
        System.out.println("                                             ");
        System.out.println("[1] Eisagogh Aksiologoumenou");
        System.out.println("[2] Eisagogh Erotisewn");
        System.out.println("[3] Eisagogh Apantisewn");
        System.out.println("[4] Emfanisi Erwtisewn");
        System.out.println("[5] Emfanisi Apantisewn Enos Aksiologoumenou");
        System.out.println("[6] Emfanisi Plithous Swstwn Apantisewn Ana Aksiologoumenou");
        System.out.println("[7] Ypologismos Posostou Swstwn Apantisewn Gia Kathe Erwtisi");
        System.out.println("[8] Emfanisi Posostou Swstwn Apantisewn Ana Aksiologoumeno");
        System.out.println("                                             ");
        System.out.println("[>] To exit press 0.");
        System.out.print("> ");
    }

    static void await() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(850);
        }
    }

    public ArrayList conv(String[] lista){
        ArrayList newList=new ArrayList();
        for(int i=0; i<lista.length; i++){
            newList.add(lista[i]);
        }
        return newList;
    }

    public static boolean search(String[] list1, String[] list2){
        boolean x=false;
        int a=0;
        for(String item:list2){
            for(String item2:list1){
                if(item.equals(item2)){
                    a++;
                    break;
                }
            }
        }
        if(a==list2.length){
            x=true;
        }
        return x;
    }
}
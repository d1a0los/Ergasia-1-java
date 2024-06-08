import java.util.*;

public class appMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        functions.clear_console();

        ArrayList<aksiologoumenos> aksiologoumenoi = new ArrayList<aksiologoumenos>();
        ArrayList<erotiseis> questionList = new ArrayList<erotiseis>();
        ArrayList<apantiseis> answerList = new ArrayList<apantiseis>();

        //-----------------------------------------------------------------Aksiologoumenoi-----------------------------------------------------------------------------
        aksiologoumenoi.add(new aksiologoumenos(4001, "Xristos", "Kalergis"));
        aksiologoumenoi.add(new aksiologoumenos(3001, "Xristos", "Koutsikas"));
        aksiologoumenoi.add(new aksiologoumenos(2124, "Stauros", "Toumpis"));
        aksiologoumenoi.add(new aksiologoumenos(5667, "Antonis", "Dimakis"));

        //---------------------------------------------------------------------Erotiseis Pollaplis Epilogis-----------------------------------------------------------
        String[] capital={"Athina"};
        String[] ansList1={"Thessaloniki","Patra","Athina","Hraklio"};
        questionList.add(new er_multChoice(2367, "Poia einai h proteuousa ths Elladas?", ansList1,capital));

        String[] planet={"Aris"};
        String[] ansList2={"Gh","Dias","Ouranos","Aris"};
        questionList.add(new er_multChoice(6565, "Poios planitis einai gnwstos ws kokkinos planitis?", ansList2,planet));

        String[] ximia={"H2O"};
        String[] ansList3={"H2O","CO2","O2","Nacl"};
        questionList.add(new er_multChoice(8535, "Poio einai to xeimiko stoixeio tou nerou?",ansList3, ximia));

        //----------------------------------------------------------------Erotiseis Me Mia Lexi Swsti-------------------------------------------------------------------
        String[] oneWord1={"int","Integer","Int","integer","INT"};           
        questionList.add(new er_oneWord(4325, "Poia lexi kleidi anaferomste se akereo arithmo ston programatismo?",oneWord1,oneWord1));

        String[] oneWord2={"enthilakosi","Enthilakosi","ENTHILAKOSI"};
        questionList.add(new er_oneWord(5852, "Pos onomazetai h prosthiki san perivlima twn plhroforion elegxou sta dedomena?",oneWord2,oneWord2));

        String[] oneWord3={"pelati-ejipiretiti","Pelati-Ejipiretiti","PELATI-EJIPIRETITT"};
        questionList.add(new er_oneWord(8962, "Se poio montelo stirizontai oi uporesies sto diadiktio?",oneWord3,oneWord3));

        //--------------------------------------------------------------------Erotiseis Me Kena--------------------------------------------------------------------------
        String[] erkena1={"tetragono","mhkous","iso","tetragonon","dyo"};
        questionList.add(new er_kena(5467, "To [?] tou [?] tis ipoteinousas einai [?] me to athrisma twn [?] twn mikwn twn allwn [?] pleurwn.",erkena1,erkena1));

        String[] erkena2={"dieuthinseis","ip","dromologites"};
        questionList.add(new er_kena(8901, "Oi [?] enos idiotikou diktiou [?] den dromologountai apo tous [?] sto diadiktio.",erkena2,erkena2));

        String[] erkena3={"stoiva","FIFO","LIFO"};
        questionList.add(new er_kena(5747,"Mia [?] ston programatismo ilopoihtai me thn texniki [?] kai oxi [?].",erkena3,erkena3));

        //--------------------------------------------------------------------Menu---------------------------------------------------------------------------------------------

        System.out.println("                                          __ ");
        System.out.println("            _ _ _     _                  |  |");
        System.out.println("           | | | |___| |___ ___ _____ ___|  |");
        System.out.println("           | | | | -_| |  _| . |     | -_|__|");
        System.out.println("           |_____|___|_|___|___|_|_|_|___|__|");
        System.out.println("                                             ");
        System.out.println("          -Creators: 3230098, 3230016, 3230078-");
        System.out.println("                                             ");

        while (true) {

            functions.menuPrinter();
            
            try {
                choice = Integer.parseInt(input.nextLine());
            } 
            catch (Exception e) {
                System.out.print("[X] To Menu Dexete Mono Arithmous Ws Epipilogi!");
                functions.await();
                functions.clear_console();
            }

            switch (choice) {
                case 1:
                    while (true) {
                        int kodikos = 0;
                        String onoma;
                        String eponimo;
                        String epilogi;

                        functions.clear_console();
                        System.out.println("               --Eisagogh Aksiologoumenwn-- ");
                        System.out.println("                                             ");
                        System.out.print("[>] Kodikos Aksiologoumenou(Arithmoi mono!): ");

                        try {
                            kodikos = Integer.parseInt(input.nextLine());

                            boolean foundDouplicate = false;
                            for(aksiologoumenos item: aksiologoumenoi)
                            {
                                if(kodikos == item.getCode())
                                {
                                    foundDouplicate = true;
                                    System.out.print("\n[!] Aytos o aksiologoumenos Yparxei Idi Parakalw Eisagete Neo Kodiko!");
                                    functions.await();
                                    break;
                                }
                            }
    
                            if (!foundDouplicate)
                            {
                                System.out.print("[>] Onoma Aksiologoumenou: ");
                                onoma = input.nextLine();
    
                                System.out.print("[>] Eponimo Aksiologoumenou: ");
                                eponimo = input.nextLine();
    
                                System.out.println("                                             ");
                                System.out.println("[?]: Prosthesi Akolothou Aksiologoumenou?[y/n]");
                                System.out.print("[>] Kodikos: " + kodikos + ", Onoma: " + onoma + ", Eponimo: " + eponimo + "\n> ");
                                epilogi = input.nextLine();
    
                                if (epilogi.equals("y")) {
                                    aksiologoumenoi.add(new aksiologoumenos(kodikos, onoma, eponimo));
                                    functions.clear_console();
                                    break;
                                }
                                else {
                                    System.out.print("[!] Epistrofi Sto Menu, O Neos Aksiologoumenos Den Apothikeutike!");
                                    functions.await();
                                    functions.clear_console();
                                    break;
                                }
                            }

                            else{
                                continue;
                            }

                        } catch (Exception e) {
                            System.out.print("[X] O Codikos Prepei Na Einai Austira Mono Arithmoi!");
                            functions.await();
                            functions.clear_console();
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        int kodikos = 0;
                        String erotisi;
                        String epilogi;

                        functions.clear_console();
                        System.out.println("             --Eisagogh Erwtisewn-- \n");
                        System.out.println("[>] Kodikos Erwtisis: ");
                        System.out.print("> ");

                        
                        try {
                            kodikos = Integer.parseInt(input.nextLine());
                            boolean foundDuplicate = false;
                            for(erotiseis item: questionList)
                            {
                                if(kodikos == item.getCode())
                                {
                                    foundDuplicate = true;
                                    System.out.print("\n[!] Ayth H Erotisi Yparxei Idi Parakalw Eisagete Neo Kodiko!");
                                    functions.await();
                                    break;
                                }
                            }

                            if (!foundDuplicate)
                            {
                                System.out.println("\n[>] Epelekse Typo Erwtisis: ");
                                System.out.println("[1] Keimeno Me kena ");
                                System.out.println("[2] Erwtisi Me Monaxa Mia Swsth Lexi ");
                                System.out.println("[3] Erwtisi Pollaplis Epilogis\n");
                                System.out.println("[>] Pata 0 h Otidipote Allo Gia Epistrofi Sto Main Menu");
                                System.out.print("> ");
                                
                                epilogi = input.nextLine();

                                if (epilogi.equals("1")) {
                                    functions.clear_console();
                                    System.out.println("             --Erwtisi Me Kena-- \n");
                                    System.out.println("[!] Odigies: Opou Einai Na Mpei Keno Valte '[?]' ");
                                    System.out.println("[>] Parakalo Eisagete To Keimeno.");
                                    System.out.print("> ");
                                
                                    erotisi = input.nextLine();
                                
                                    System.out.println("\n[?]: Prosthesi Akolouthis Erwtisis?[y/n]");
                                    System.out.println("[>] " + erotisi);
                                    System.out.print("> ");
                                
                                    epilogi = input.nextLine();
                                
                                    if (epilogi.equals("y")) {
                                        int numOfKena = 0;
                                        String nextApantisi;
                                    
                                        System.out.println("\n[!] Dimiourgia Apantishs Gia Thn Akolouthi Erwtisi: " + erotisi);
                                        System.out.println("[!] Odigies: Dwse Arithmo Kenwn Kai Epeita Pliktrologise Tis Apantiseis Me Thn Swsti Seira ");
                                        System.out.print("> ");
                                    

                                        try{
                                            numOfKena = Integer.parseInt(input.nextLine());
                                        }catch(Exception e){
                                            System.err.print("[X] Error Lathos Eisagogi Pliroforias! | " + e);
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }

                                        String[] erMeKena = new String[numOfKena];
                                        System.out.println("[!] Dwse Tis Apantiseis Me Tin Swsti Seira! | Aritmos Apantisewn: " + numOfKena);
                                    
                                        for(int i = 0; i < numOfKena; i++)
                                        {
                                            System.out.print("\n> ");
                                            nextApantisi = input.nextLine();
                                            erMeKena[i] = nextApantisi;
                                        }
                                    
                                        System.out.println("[?] Dimiourgia Akolouthis Erwtisis Me Tis Sigkekrimenes Apantiseis?[y/n]");
                                        System.out.println("[*] Erwtisi: " + erotisi);
                                        System.out.println("[*] Apantiseis: " + Arrays.toString(erMeKena));
                                        System.out.print("> ");
                                        epilogi = input.nextLine();
                                    
                                        if (epilogi.equals("y"))
                                        {
                                            questionList.add(new er_kena(kodikos, erotisi ,erMeKena,erMeKena));
                                            System.out.print("[!] H Erotisi Apothikeutike Me Epituxia!");
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }
                                        else
                                        {
                                            System.out.print("Epistrofi Sto Menu");
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }
                                    
                                    } 
                                    else
                                    {
                                        System.out.print("Epistrofi Sto Menu");
                                        functions.await();
                                        functions.clear_console();
                                        break;
                                    }
                                }
                            
                                else if (epilogi.equals("2")) {
                                    functions.clear_console();
                                    System.out.println("                --Erwtisi Monaxa Mia Swsth Lexi-- ");
                                    System.out.println("                                             ");
                                    System.out.println("[>] Parakalo Eisagete Thn Ekfonisi.");
                                    System.out.print("> ");
                                
                                    erotisi = input.nextLine();
                                
                                    System.out.println("                                             ");
                                    System.out.println("[?]: Prosthesi Akolouthis Erwtisis?[y/n]");
                                    System.out.println("[>] " + erotisi);
                                    System.out.print("> ");
                                
                                    epilogi = input.nextLine();
                                
                                    if (epilogi.equals("y")) {
                                        String[] finalApantisi = new String[1];
                                        String finalApant;
                                    
                                        System.out.println("\n[!] Dimiourgia Apantishs Gia Thn Akolouthi Erwtisi: " + erotisi);
                                        System.out.print("> ");
                                        finalApant = input.nextLine();
                                    
                                        System.out.println("[?] Dimiourgia Akolouthis Erwtisis Me Thn Sigkekrimeni Apantisi?[y/n]");
                                        System.out.println("[*] Erwtisi: " + erotisi);
                                        System.out.println("[*] Apantish: " + finalApant);
                                        System.out.print("> ");
                                        epilogi = input.nextLine();
                                    
                                        if (epilogi.equals("y"))
                                        {
                                            finalApantisi[0] = finalApant;
                                            questionList.add(new er_oneWord(kodikos, erotisi,finalApantisi,finalApantisi));
                                            System.out.print("[!] H Erotisi Apothikeutike Me Epituxia!");
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }
                                        else
                                        {
                                            System.out.print("Epistrofi Sto Menu");
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }
                                    
                                    } else{
                                        System.out.print("Epistrofi Sto Menu");
                                        functions.await();
                                        functions.clear_console();
                                        break;
                                    }
                                }
                            
                                else if (epilogi.equals("3")) {
                                    functions.clear_console();
                                    System.out.println("                --Erwtisi Pollaplis Epilogis-- ");
                                    System.out.println("                                             ");
                                    System.out.println("[>] Parakalo Eisagete Thn Ekfonisi.");
                                    System.out.print("> ");
                                
                                    erotisi = input.nextLine();
                                
                                    System.out.println("                                             ");
                                    System.out.println("[?]: Prosthesi Akolouthis Erwtisis?[y/n]");
                                    System.out.println("[>] " + erotisi);
                                    System.out.print("> ");
                                
                                    epilogi = input.nextLine();
                                
                                    if (epilogi.equals("y")) {
                                        int numCantidate = 0;
                                        int numRightCantidate = 0;
                                        String nextApantisi;
                                        int nextRightApantisi;
                                    
                                        System.out.println("\n[!] Dimiourgia Apantishs Gia Thn Akolouthi Erwtisi: " + erotisi);
                                        System.out.println("[!] Odigies: Dwse Arithmo Apantisewn Kai Epeita Arithmo Swntwn Apantisewn, \nMeta Pliktrologise Tis Ypopsifies Apantiseis ");
                                    
                                        System.out.print("[>] Dwse Arithmo Apantisewn: ");
                                        numCantidate = Integer.parseInt(input.nextLine());
                                    
                                        System.out.print("[>] Dwse Arithmo Swstwn Apantisewn: ");
                                        numRightCantidate = Integer.parseInt(input.nextLine());
                                    
                                        String[] erMultCh = new String[numCantidate];
                                        String[] erMultCh_Right = new String[numRightCantidate];
                                    
                                        System.out.println("[!] Dwse Tis Apantiseis | Aritmos Apantisewn: " + numCantidate);
                                    
                                        for(int i = 0; i < numCantidate; i++)
                                        {
                                            System.out.print("\n> ");
                                            nextApantisi = input.nextLine();
                                            erMultCh[i] = nextApantisi;
                                        }
                                    
                                        System.out.println("[!] Telos Epelekse Poies/a Einai Oi/H Swsth/es Apantisi/eis");
                                        System.out.println("[!] Odigies: Apo Tin Parakato Lista Me apantiseis \n--  (PARADEIGMA)An H Swsti Apantisi Einai H 2 \n--  Tote Pliktrologise Ton Arithmo '2'");
                                        System.out.println("[!]" + Arrays.toString(erMultCh));
                                        if(numRightCantidate>0)
                                        {
                                            System.out.println("\n[!] Oi Swstes Apantiesis Einai: " + numRightCantidate);
                                            for(int i = 0; i < numRightCantidate; i++)
                                            {
                                                System.out.print("\n> ");
                                                nextRightApantisi = Integer.parseInt(input.nextLine());
                                                erMultCh_Right[i] = erMultCh[nextRightApantisi-1];
                                            }
                                        
                                            System.out.println("[?] Dimiourgia Akolouthis Erwtisis Me Tis Sigkekrimenes Apantiseis?[y/n]");
                                            System.out.println("[*] Erwtisi: " + erotisi);
                                            System.out.println("[*] Apantish/eis: " + Arrays.toString(erMultCh_Right));
                                        
                                            System.out.print("> ");
                                            epilogi = input.nextLine();
                                        
                                            if (epilogi.equals("y"))
                                            {
                                                questionList.add(new er_multChoice(kodikos, erotisi,erMultCh_Right,erMultCh));
                                                System.out.print("[!] H Erotisi Apothikeutike Me Epituxia!");
                                                functions.await();
                                                functions.clear_console();
                                                break;
                                            }
                                            else
                                            {
                                                functions.clear_console();
                                                break;
                                            }
                                        }
                                        else{
                                            System.out.print("[X] Oi Swstes Apantiseis Prepei Na Einai Toulaxiston Mia!");
                                            functions.await();
                                            functions.clear_console();
                                        }
                                    
                                        }
                                        else{
                                            System.out.print("Epistrofi Sto Menu");
                                            functions.await();
                                            functions.clear_console();
                                            break;
                                        }
                                    }
                                
                                    else
                                    {
                                        System.out.print("Epistrofi Sto Menu");
                                        functions.await();
                                        functions.clear_console();
                                        break;
                                    }
                            } 
                        }

                        catch (Exception e) {
                            System.out.print("[X] O Codikos Prepei Na Einai Austira Mono Arithmoi!");
                            functions.await();
                            functions.clear_console();
                        }
                    }
                break;

                case 3:
                    while(true){
                        functions.clear_console();

                        boolean foundAksiolog=false;
                        System.out.println("Aksiologoumenoi:");
                        for(aksiologoumenos item: aksiologoumenoi){
                            System.out.println(item.toString());
                        }


                        System.out.println("\n"+"[>] Epelekse Kodiko Aksiologoumenou Pou Tha Apantisei Mia Erotisi: ");
                        System.out.print("> ");
                        int epilogi=Integer.parseInt(input.nextLine());


                        int pos1=0;

                        for(int i=0; i<aksiologoumenoi.size(); i++){   
                            if(aksiologoumenoi.get(i).getCode() == epilogi){
                                foundAksiolog=true;
                                pos1=i;
                                break;
                            }
                        
                        }

                        if(foundAksiolog){

                            int er_code;
                            boolean foundErot = false;

                            System.out.println("Erotiseis:");

                            for(erotiseis item: questionList){
                                System.out.println(item.toString());
                            }
                        
                            System.out.println("[>] Epelekse Ton Kodiko Tis Erwtisis Pou Tha Apantiseis: \n");

                            System.out.print("> ");
                            er_code= Integer.parseInt(input.nextLine());

                            int pos2=0;
                            for(int i=0; i<questionList.size(); i++){
                                if(questionList.get(i).getCode() == er_code){
                                    foundErot = true;
                                    pos2=i;
                                    break;
                                }
                            }

                            if (foundErot)
                            {

                                System.out.println(questionList.get(pos2).getEkfonisi());

                                if(questionList.get(pos2) instanceof er_kena){
                                    System.out.println("[*] Apantiseis Me Mperdemenh Seira: "); 
                                    erotiseis.printApantiseis(questionList.get(pos2).getAnswer());
                                    System.out.println("Vale Tis Lexeis Stin Swsti Seira, ");
                                    System.out.println("Pliktrologontas Mia-Mia Tis Lexeis Stin Seira Pou Theorite Eseis Swsth.");

                                    int b=questionList.get(pos2).getAnswer().length;
                                    String[] listaAp= new String[b];
                                    String c;
                                    for(int i=0; i<b; i++){
                                        System.out.print("\n>");
                                        
                                        c=input.nextLine();
                                        listaAp[i]=c;
                                    }



                                    answerList.add(new ap_kena( aksiologoumenoi.get(pos1),questionList.get(pos2), listaAp));
                                }

                                else if(questionList.get(pos2) instanceof er_oneWord){
                                    System.out.print("Dwse Monolektiki Apantisi:  ");
                                    String[] app =new String[1];
                                    app[0]=input.nextLine();

                                    answerList.add(new ap_oneWord(aksiologoumenoi.get(pos1), questionList.get(pos2), app));
                                }

                                else{
                                    for(String item:(questionList.get(pos2).getAnswer()))
                                    {
                                        System.out.println("> "+item);
                                    }
                                    ArrayList<String> given=new ArrayList<String>();
                                    
                                    System.out.print("Dialexe Swstes epiloges H 0 Gia Na Teleiwseis: \n");

                                    String m;
                                    for(int i=0; i<questionList.get(pos2).getAnswer().length; i++)
                                    {

                                        System.out.print(">> ");
                                        m=input.nextLine();

                                        if (m.equals("0"))
                                        {
                                            break;
                                        }
                                        else
                                        {
                                            given.add(m);
                                        }
                                    }
                                    String[] app= new String[given.size()];

                                    for(int i=0; i<given.size(); i++){
                                        app[i]=given.get(i);
                                    }
                                    answerList.add(new ap_multiChoice(aksiologoumenoi.get(pos1), questionList.get(pos2), app));
                                }
                                break;
                            }
                            

                            else{
                                System.out.println("[!] H Erotisi Pou Ypovalate Den Yparxei Stin Lista!");
                                System.out.println("Dwse 0 Gia Epistrofi Sto Menu H Otidhpote Allo Gia Nea Prospatheia");
                                if(input.nextLine().equals("0")){break;}
                                functions.await();
                                functions.clear_console();
                            }
                        
                        }
                        else
                        {
                            System.out.println("[!] O Aksiologoumenos Den Uparxei Sth Lista, Prospathise Jana!");
                            System.out.println("Dwse 0 Gia Epistrofi Sto Menu H Otidhpote Allo Gia Nea Prospatheia");
                            if(input.nextLine().equals("0")){break;}
                            functions.await();
                            functions.clear_console();
                        }

                    }
                    System.out.print("Epistrofi Sto Menu");
                    functions.await();
                    functions.clear_console();
                    break;

                case 4:

                    functions.clear_console();
                    System.out.println("                               --Erotiseis-- \n");
                    for(erotiseis item:questionList){
                        System.out.println(item.toString());
                    }

                    System.out.println("\n[>] To exit, to Main menu press 0 or any other key.");
                    System.out.print("> ");
                    input.nextLine();
                    System.out.print("[!] Epistrofi Sto Menu");
                    functions.await();
                    functions.clear_console();
                    break;

                case 5:
                    functions.clear_console();
                    
                    while(true)
                    {
                        System.out.println("                  -Emfanisi Apantisewn Enos Aksiologoumenou-\n");
                        int code;
                        boolean found = false;

                        for(aksiologoumenos item: aksiologoumenoi){
                            System.out.println(item.toString());
                        }

                        System.out.print("> ");
                        code = Integer.parseInt(input.nextLine());
    
                        for(aksiologoumenos items : aksiologoumenoi){   
                            if(items.getCode() == code){
                                found = true;
                                for(apantiseis item : answerList)
                                {
                                    if(item.getStudent() == items)
                                    {
                                        System.out.println(Arrays.toString(item.getListaAp()));
                                    }
                                }
                            }
                        }
                        
                        if(!found)
                        {
                            System.out.print("[!] O Aksiologoumenos Den Uparxei Sth Lista, Prospathise Jana!");
                            functions.await();
                            break;
                        }
                        
                        System.out.println("[!] Gia Epistofi Sto Main Menu Pata 0, Pata Otidipote Allo Gia Epaneisagogi Aksiologoumenou");
                        String epilogi = input.nextLine();

                        if(epilogi.equals("0"))
                        {
                            System.out.print("[!] Epistrofi sto menu");
                            functions.await();
                            break;
                        }
                        else{
                            functions.clear_console();
                            continue;
                        }
                    }
                    functions.clear_console();
                    break;

                case 6:
                    ArrayList<aksiologoumenos> copyAks=new ArrayList();

                    for(aksiologoumenos item:aksiologoumenoi){
                        copyAks.add(item);
                    }

                    int a = copyAks.size();
                    aksiologoumenos max;
                    while(a > 0){
                        max=(aksiologoumenos)copyAks.get(0);
                        for(aksiologoumenos item:copyAks){
                            if(item.getCorr()>max.getCorr()){
                                max=item;
                            }
                        }
                        System.out.println(max+" | Exei "+max.getCorr()+" Swstes Apantiseis");
                        copyAks.remove(max);
                        a--;
                    }
                    System.out.println("Pathse Otidhpote Gia Epistrofi Sto Menu");
                    input.nextLine();
                    System.out.print("Epistrofi Sto Menu");
                    functions.await();
                    break;

                case 7:
                    
                    //count swstes apantiseis
                    //count oles oi apantiseis

                    //swstes / oles * 100
                    break;

                case 8:
                    //count swstes apantiseis aksiologoumenwn
                    //count oles oi apantiseis pou exoun dwsei oi aksiologoumenoi

                    //swstes / oles * 100
                    break;

                default:
                    break;
            }

            if(choice == 0)
            {
                System.out.print("\nExiting");
                functions.await();
                functions.clear_console();
                break;
            }
        }
    }
}
/*
--> exceptions
--> dhmiourgia mc apantisewn







 */
import java.util.*;

public class Main {
    static void clear_console() {
        for (int i = 0; i < 80 * 2; i++)
            System.out.println("\b");
    }
    static void error_print() throws InterruptedException {
        System.out.print("[!] Lathos Epilogi, Epistrofi Sto Main Menu");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            Thread.sleep(800);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList listaAnswers= new ArrayList();
        int choice = 0;
        Scanner input = new Scanner(System.in);
        clear_console();

        //-----------------------------------------------------------------Aksiologoumenoi-----------------------------------------------------------------------------
        aksiologoumenos aks1 = new aksiologoumenos(4001, "Xristos", "Kalergis");
        aksiologoumenos aks2 = new aksiologoumenos(3001, "Xristos", "Koutsikas");
        aksiologoumenos aks3 = new aksiologoumenos(2124, "Stauros", "Toumpis");
        aksiologoumenos aks4 = new aksiologoumenos(5667, "Antonis", "Dimakis");

        //---------------------------------------------------------------------Erotiseis Pollaplis Epilogis-----------------------------------------------------------
        String[] capital={"Athina"};
        String[] ansList1={"Thessaloniki","Patra","Athina","Hraklio"};
        er_multChoice er_multChoice1 = new er_multChoice(2367, "Poia einai h proteuousa ths Elladas?", capital,ansList1); //α) Θεσσαλονίκη,β) Πάτρα,γ) Αθήνα,δ) Ηράκλειο

        String[] planet={"Aris"};
        String[] ansList2={"Gh","Dias","Ouranos","Aris"};
        er_multChoice er_multChoice2 = new er_multChoice(6565, "Poios planitis einai gnwstos ws kokkinos planitis?", planet,ansList1);//a) Gh,b) Dias,c) Ouranos,d) Aris

        String[] ximia={"H2O"};
        String[] ansList3={"H2O","CO2","O2","Nacl"};
        er_multChoice er_multChoice3 = new er_multChoice(8535, "Poio einai to xeimiko stoixeio tou nerou?", ximia,ansList1);//a) H2O,b) CO2,c) O2,d) NaCl

        //----------------------------------------------------------------Erotiseis Me Mia Lexi Swsti-------------------------------------------------------------------
        String[] oneWord1={"int","Integer","Int","integer","INT"};           
        er_oneWord er_oneWord1 = new er_oneWord(4325, "Poia lexi kleidi anaferomste se akereo arithmo ston programatismo?",oneWord1);//int,Integer,Int,integer

        String[] oneWord2={"enthilakosi","Enthilakosi","ENTHILAKOSI"};
        er_oneWord er_oneWord2 = new er_oneWord(5852, "Pos onomazetai h prosthiki san perivlima twn plhroforion elegxou sta dedomena?",oneWord2);//ενθυλακωση

        String[] oneWord3={"pelati-ejipiretiti","Pelati-Ejipiretiti","PELATI-EJIPIRETITT"};
        er_oneWord er_oneWord3 = new er_oneWord(8962, "Se poio montelo stirizontai oi uporesies sto diadiktio?",oneWord3);//πελατη-εξηπηρετιτη

        //--------------------------------------------------------------------Erotiseis Me Kena--------------------------------------------------------------------------
        String[] erkena1={"tetragono","mhkous","iso","tetragonon","dyo"};
        er_kena er_kena1 = new er_kena(5467, "To [?] tou [?] tis ipoteinousas einai [?] me to athrisma twn [?] twn mikwn twn allwn [?] pleurwn.",erkena1);
        //Το τετράγωνο του μήκους της υποτείνουσας είναι ίσο με το άθροισμα των τετραγώνων των μηκών των άλλων δύο πλευρών.

        String[] erkena2={"dieuthinseis","ip","dromologites"};
        er_kena er_kena2 = new er_kena(8901, "Oi [?] enos idiotikou diktiou [?] den dromologountai apo tous [?] sto diadiktio.",erkena2);
        //Οι διευθύνσεις ενός ιδιωτικού δικτύου IP δε δρομολογούνται από τους δρομολογητές στο Διαδίκτυο.

        String[] erkena3={"stoiva","FIFO","LIFO"};
        er_kena er_kena3 = new er_kena(5747,"Mia [?] ston programatismo ilopoihtai me thn texniki [?] kai oxi [?].",erkena3);
        //Mia stoiva ston programatismo ilopoihtai me thn texniki FIFO kai oxi LIFO.




        //apantiseis gia erwtiseis logothetis job 
        //gamw ton logotheti, asxetos





        System.out.println("                                          __ ");
        System.out.println("            _ _ _     _                  |  |");
        System.out.println("           | | | |___| |___ ___ _____ ___|  |");
        System.out.println("           | | | | -_| |  _| . |     | -_|__|");
        System.out.println("           |_____|___|_|___|___|_|_|_|___|__|");
        System.out.println("                                             ");
        System.out.println("          -Creators: 3230098, 3230016, 3230078-");
        System.out.println("                                             ");

        while (true) {
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
            System.out.println("[9] {LOGGER}");
            System.out.println("                                             ");
            System.out.println("[>] To exit press 0 or any other key.");
            System.out.print("> ");

            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                choice = 0;
                System.exit(0);
            }
            switch (choice) {
                case 1:
                    while (true) {
                        int kodikos = 0;
                        String onoma;
                        String eponimo;
                        String epilogi;

                        clear_console();
                        System.out.println("               --Eisagogh Aksiologoumenwn-- ");
                        System.out.println("                                             ");
                        System.out.print("[>] Kodikos Aksiologoumenou: ");
                        try {
                            kodikos = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            error_print();
                            clear_console();
                            break;
                        }

                        System.out.print("[>] Onoma Aksiologoumenou: ");
                        onoma = input.nextLine();

                        System.out.print("[>] Eponimo Aksiologoumenou: ");
                        eponimo = input.nextLine();

                        System.out.println("                                             ");
                        System.out.println("[?]: Prosthesi Akolothou Aksiologoumenou?[y/n]");
                        System.out.print("[>] Kodikos: " + kodikos + ", Onoma: " + onoma + ", Eponimo: " + eponimo + "\n> ");
                        epilogi = input.nextLine();

                        if (epilogi.equals("y")) {
                            aksiologoumenos neos_aks = new aksiologoumenos(kodikos, onoma, eponimo);
                            clear_console();
                            break;
                        } else if (epilogi.equals("n")) {
                            System.out.println("[?] Epaneisagogi Aksiologoumenou?[y/n]");
                            System.out.print("> ");

                            epilogi = input.nextLine();

                            if (epilogi.equals("n")) {
                                clear_console();
                                break;
                            } else if (epilogi.equals("y")) {
                                clear_console();
                                continue;
                            } else {
                                error_print();
                                clear_console();
                                break;
                            }
                        } else {
                            error_print();
                            clear_console();
                            break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        int kodikos = 0;
                        String erotisi;
                        String epilogi;

                        clear_console();
                        System.out.println("             --Eisagogh Erwtisewn-- ");
                        System.out.println("                                             ");
                        System.out.println("[>] Kodikos Erwtisis: ");
                        System.out.print("> ");


                        try {
                            kodikos = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            error_print();
                            clear_console();
                            break;
                        }

                        System.out.println("                                             ");
                        System.out.println("[>] Epelekse Typo Erwtisis: ");
                        System.out.println("[1] Keimeno Me kena ");
                        System.out.println("[2] Erwtisi Me Monaxa Mia Swsth Lexi ");
                        System.out.println("[3] Erwtisi Pollaplis Epilogis");
                        System.out.println("                                             ");
                        System.out.println("[>] Pata 0 h Otidipote Allo Gia Epistrofi Sto Main Menu");
                        System.out.print("> ");

                        epilogi = input.nextLine();
                        if (epilogi.equals("1")) {
                            clear_console();
                            System.out.println("             --Erwtisi Me Kena-- ");
                            System.out.println("                                             ");
                            System.out.println("[!] Odigies: Opou Einai Na Mpei Keno Valte '[?]' ");
                            System.out.println("[>] Parakalo Eisagete To Keimeno.");
                            System.out.print("> ");

                            erotisi = input.nextLine();

                            System.out.println("                                             ");
                            System.out.println("[?]: Prosthesi Akolouthis Erwtisis?[y/n]");
                            System.out.println("[>] " + erotisi);
                            System.out.print("> ");

                            epilogi = input.nextLine();

                            if (epilogi.equals("y")) {
                                int numOfKena = 0;
                                String nextApantisi;
                                
                                System.out.println("\n[!] Dimiourgia Apantishs Gia Thn Akolouthi Erwtisi: " + erotisi);
                                System.out.println("[!] Odigies: Dwse Arithmo Kenwn Kai Epeita Pliktrologise Tis Apantiseis Me Thn Swsti Seira ");
                                System.out.print("> ");

                                numOfKena = Integer.parseInt(input.nextLine());
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
                                    er_kena er_kObj = new er_kena(kodikos, erotisi ,erMeKena);
                                    clear_console();
                                    break;
                                }
                                else if (epilogi.equals("n"))
                                {
                                    clear_console();
                                    break;
                                }

                            } else if (epilogi.equals("n")) {
                                System.out.println("[?] Epaneisagogi Neas Erotisis?[y/n]");
                                System.out.print("> ");

                                epilogi = input.nextLine();

                                if (epilogi.equals("n")) {
                                    clear_console();
                                    break;
                                } else if (epilogi.equals("y")) {
                                    clear_console();
                                    continue;
                                } else {
                                    error_print();
                                    clear_console();
                                    break;
                                }
                            }
                        }

                        else if (epilogi.equals("2")) {
                            clear_console();
                            System.out.println("                --Erwtisi Monaxa Mia Swsth Lexi-- ");
                            System.out.println("                                             ");
                            System.out.println("[>] Parakalo Eisagete To Keimeno.");
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
                                    er_oneWord er_kObj = new er_oneWord(kodikos, erotisi,finalApantisi);
                                    clear_console();
                                    break;
                                }
                                else if (epilogi.equals("n"))
                                {
                                    clear_console();
                                    break;
                                }

                            } else if (epilogi.equals("n")) {
                                System.out.println("[?] Epaneisagogi Neas Erotisis?[y/n]");
                                System.out.print("> ");

                                epilogi = input.nextLine();

                                if (epilogi.equals("n")) {
                                    clear_console();
                                    break;
                                } else if (epilogi.equals("y")) {
                                    clear_console();
                                } else {
                                    error_print();
                                    clear_console();
                                    break;
                                }
                            }
                        }

                        else if (epilogi.equals("3")) {
                            clear_console();
                            System.out.println("                --Erwtisi Pollaplis Epilogis-- ");
                            System.out.println("                                             ");
                            System.out.println("[>] Parakalo Eisagete To Keimeno.");
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
                                String nextRightApantisi;
                                
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

                                System.out.println("[!] Telos Epelekse Poies/a Einai Oi/H Swsth/es Erotisi/eis");
                                System.out.println("[!] Odigies: Apo Tin Parakato Lista Me apantiseis \n--  (PARADEIGMA)An H Swsti Apantisi Einai H 2 \n--  Tote Pliktrologise Ton Arithmo '2'");
                                System.out.println("[!]" + Arrays.toString(erMultCh_Right));
                                if(numRightCantidate>0)
                                {
                                    System.out.println("\n[!] Oi Swstes Apantiesis Einai: " + numRightCantidate);
                                }

                                System.out.print("> ");
                                
                                for(int i = 0; i < numRightCantidate; i++)
                                {
                                    System.out.print("\n> ");
                                    nextRightApantisi = input.nextLine();
                                    erMultCh_Right[i] = nextRightApantisi;
                                }

                                System.out.println("[?] Dimiourgia Akolouthis Erwtisis Me Tis Sigkekrimenes Apantiseis?[y/n]");
                                System.out.println("[*] Erwtisi: " + erotisi);
                                System.out.println("[*] Apantish/eis: " + Arrays.toString(erMultCh_Right));

                                System.out.print("> ");
                                epilogi = input.nextLine();

                                if (epilogi.equals("y"))
                                {
                                    er_multChoice er_kObj = new er_multChoice(kodikos, erotisi,erMultCh_Right,erMultCh);
                                    clear_console();
                                    break;
                                }
                                else if (epilogi.equals("n"))
                                {
                                    clear_console();
                                    break;
                                }
                                

                            } else if (epilogi.equals("n")) {
                                System.out.println("[?] Epaneisagogi Neas Erotisis?[y/n]");
                                System.out.print("> ");

                                epilogi = input.nextLine();

                                if (epilogi.equals("n")) {
                                    clear_console();
                                    break;
                                } else if (epilogi.equals("y")) {
                                    clear_console();
                                    continue;
                                } else {
                                    error_print();
                                    clear_console();
                                    break;
                                }
                            };
                        }

                        else
                        {
                            clear_console();
                            break;
                        }
                    }
                    break;

                case 3:
                    while(true){
                        clear_console();

                        aksiologoumenos.printList();
                        boolean found=false;
                        
                        System.out.println("\n"+"[>] Epelekse Kodiko Aksiologoumenou Pou Tha Apantisei Mia Erotisi: ");
                        System.out.println("> ");
                        int epilogi=input.nextInt();
                        
                        int pos1 = 0;
                        int position=0;

                        for(Object items : aksiologoumenos.aksiologoumenoi){
                            
                            if(((aksiologoumenos)items).getCode() == epilogi){
                                found=true;
                                position=pos1;
                            }
                            pos1++;
                        }

                        if(found){
                            
                            int er_code;
                            //int size = erotiseis.listaEr.size();
                            System.out.println("[>] Epelekse Ton Kodiko Tis Erwtisis Pou Tha Apantiseis: ");
                            erotiseis.printList();
                            System.out.println("> ");
                            er_code=input.nextInt();
                            
                            int pos2 = 0;
                            for(Object items : erotiseis.listaEr){
                                pos2++;
                                if(((erotiseis)items).getCode() == er_code){
                                    break;
                                }
                            }

                            ArrayList listaAp = new ArrayList();
                            
                            System.out.println(((erotiseis)(erotiseis.listaEr).get(pos2-1)).getEkfonisi());
                            
                            if(((erotiseis)(erotiseis.listaEr).get(pos2-1)) instanceof er_kena){
                                ((erotiseis)(erotiseis.listaEr).get(pos2-1)).printApantiseis(((erotiseis)(erotiseis.listaEr).get(pos2-1)).getAnswer());
                                System.out.print("----------------------\n");
                                listaAp.add(input.nextLine());

                                for(int i=0; i < (((erotiseis)(erotiseis.listaEr).get(pos2-1)).getSize(((erotiseis)(erotiseis.listaEr).get(pos2-1)).getAnswer())); i++){
                                    System.out.print("Dwse Leji Gia To Keno:  ");
                                    listaAp.add(input.nextLine());
                                }
                                ap_kena rew=new ap_kena(((erotiseis)(erotiseis.listaEr).get(pos2-1)), ((aksiologoumenos)(aksiologoumenos.aksiologoumenoi).get(position)), listaAp);
                                listaAnswers.add(new ap_kena(((erotiseis)(erotiseis.listaEr).get(pos2-1)), ((aksiologoumenos)(aksiologoumenos.aksiologoumenoi).get(position)), listaAp));
                            }

                            else if(((erotiseis)(erotiseis.listaEr).get(pos2-1)) instanceof er_oneWord){
                                System.out.print("Dwse Monolektiki Apantisi:  ");
                                String app = input.nextLine();
                                listaAnswers.add(new ap_oneWord(((erotiseis)(erotiseis.listaEr).get(pos2-1)), ((aksiologoumenos)(aksiologoumenos.aksiologoumenoi).get(position)), app));
                            }
                            
                            else{
                                System.out.print("Dialexe Swstes epiloges H 0 Gia Na Teleiwseis: ");
                                String app = input.nextLine();
                                listaAp.add(app);
                                int x=((((erotiseis)(erotiseis.listaEr).get(pos2-1)).getAnswer()).length)-1;
                                while(app!="0" && x>0){
                                    x--;
                                    listaAp.add(input.nextLine());
                                }

                                listaAnswers.add(new ap_multiChoice(((erotiseis)(erotiseis.listaEr).get(pos2-1)), ((aksiologoumenos)(aksiologoumenos.aksiologoumenoi).get(position)),listaAp));
                            }
                            break;
                        }

                        else{
                            System.out.println("O Aksiologoumenos Den Uparxei Sth Lista, Prospathise Jana");
                        }
                    }   
                    break;

                case 4:
                //Εμφάνιση των ερωτήσεων: Το πρόγραμμα να τυπώνει τη λίστα των ερωτήσεων.
                    clear_console();
                    System.out.println("                               --Erotiseis-- \n");
                    erotiseis.printList();

                    System.out.println("\n[>] To exit, to Main menu press 0 or any other key.");
                    System.out.print("> ");
                    String epilogi = input.nextLine();
                    clear_console();
                    break;

                case 5:
                //Εμφάνιση των απαντήσεων ενός αξιολογούμενου: Το πρόγραμμα να τυπώνει
                //τη λίστα των αξιολογούμενων από την οποία ο χρήστης επιλέγει τον
                //αξιολογούμενο. Το πρόγραμμα θα τυπώνει τις απαντήσεις του αξιολογούμενου.
                    clear_console();
                    break;

                case 6:
                /*Εμφάνιση το πλήθος των σωστών απαντήσεων ανά αξιολογούμενο: Το
                πρόγραμμα να υπολογίζει το πλήθος των σωστών απαντήσεων ανά
                αξιολογούμενο για όλες τις απαντήσεις του αξιολογούμενου και να τυπώνει για
                κάθε αξιολογούμενο το πλήθος των σωστών απαντήσεών του. Το αποτέλεσμα
                να είναι ταξινομημένο με βάση το πλήθος των σωστών απαντήσεων (από τον
                αξιολογούμενο με τις περισσότερες σωστές απαντήσεις προς το αξιολογούμενο
                με τις λιγότερες σωστές απαντήσεις).
                 */
                    clear_console();
                    break;

                case 7:
                /*Υπολογισμός του ποσοστού σωστών απαντήσεων για κάθε ερώτηση: Το
                πρόγραμμα θα υπολογίζει και θα εκτυπώνει το ποσοστό σωστών απαντήσεων
                για όλες τις ερωτήσεις. Το αποτέλεσμα να είναι ταξινομημένο με βάση το
                ποσοστό των σωστών απαντήσεων (από την ερώτηση με το μεγαλύτερο
                ποσοστό προς την ερώτηση με το μικρότερο ποσοστό).
                 */
                    clear_console();
                    break;

                case 8:
                /*Εμφάνιση του ποσοστού των σωστών απαντήσεων ανά αξιολογούμενο: Το
                πρόγραμμα να υπολογίζει το ποσοστό των σωστών απαντήσεων ανά
                αξιολογούμενο για όλες τις απαντήσεις που έχει δώσει και να τυπώνει για κάθε
                αξιολογούμενο το ποσοστό των σωστών απαντήσεών του. Το αποτέλεσμα να
                είναι ταξινομημένο με βάση το ποσοστό των σωστών απαντήσεων (από τον
                αξιολογούμενο με το μεγαλύτερο ποσοστό προς τον αξιολογούμενο με το
                μικρότερο ποσοστό). */
                    clear_console();
                    break;

                case 9:
                    clear_console();
                    System.out.println("-------------LOGGER------------------\n");

                    System.out.println("Aksiologoumenoi class list print: \n");
                    aksiologoumenos.printList();

                    System.out.println("\nErotiseis class list print: \n");
                    erotiseis.printList();

                    String apantiseis = "\nAn ta ftiaksei pote o logothetis tha printarw alliws arxidia!!!!!11111!!!!!!11!";
                    System.out.print("Apantiseis: "+ apantiseis);
                    epilogi = input.nextLine();

                    clear_console();
                    break;

                default:
                System.exit(0);
                break;
            }
        }
    }
}
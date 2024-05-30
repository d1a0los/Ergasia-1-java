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
        questionList.add(new er_oneWord(4325, "Poia lexi kleidi anaferomste se akereo arithmo ston programatismo?",oneWord1));

        String[] oneWord2={"enthilakosi","Enthilakosi","ENTHILAKOSI"};
        questionList.add(new er_oneWord(5852, "Pos onomazetai h prosthiki san perivlima twn plhroforion elegxou sta dedomena?",oneWord2));

        String[] oneWord3={"pelati-ejipiretiti","Pelati-Ejipiretiti","PELATI-EJIPIRETITT"};
        questionList.add(new er_oneWord(8962, "Se poio montelo stirizontai oi uporesies sto diadiktio?",oneWord3));

        //--------------------------------------------------------------------Erotiseis Me Kena--------------------------------------------------------------------------
        String[] erkena1={"tetragono","mhkous","iso","tetragonon","dyo"};
        questionList.add(new er_kena(5467, "To [?] tou [?] tis ipoteinousas einai [?] me to athrisma twn [?] twn mikwn twn allwn [?] pleurwn.",erkena1));

        String[] erkena2={"dieuthinseis","ip","dromologites"};
        questionList.add(new er_kena(8901, "Oi [?] enos idiotikou diktiou [?] den dromologountai apo tous [?] sto diadiktio.",erkena2));

        String[] erkena3={"stoiva","FIFO","LIFO"};
        questionList.add(new er_kena(5747,"Mia [?] ston programatismo ilopoihtai me thn texniki [?] kai oxi [?].",erkena3));

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
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        int kodikos = 0;
                        String erotisi;
                        String epilogi;

                        function.clear_console();
                        System.out.println("             --Eisagogh Erwtisewn-- \n");
                        System.out.println("[>] Kodikos Erwtisis: ");
                        System.out.print("> ");

                        try {
                            kodikos = Integer.parseInt(input.nextLine());

                            System.out.println("\n[>] Epelekse Typo Erwtisis: ");
                            System.out.println("[1] Keimeno Me kena ");
                            System.out.println("[2] Erwtisi Me Monaxa Mia Swsth Lexi ");
                            System.out.println("[3] Erwtisi Pollaplis Epilogis\n");
                            System.out.println("[>] Pata 0 h Otidipote Allo Gia Epistrofi Sto Main Menu");
                            System.out.print("> ");
    
                            epilogi = input.nextLine();

                            if (epilogi.equals("1")) {
                                clear_console();
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
                                        er_kena er_kObj = new er_kena(kodikos, erotisi ,erMeKena);
                                        clear_console();
                                        break;
                                    }
                                    else if (epilogi.equals("n"))
                                    {
                                        clear_console();
                                        break;
                                    }
    
                                } 
                                else
                                {
                                    clear_console();
                                    break;
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
                                    clear_console();
                                    break;
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
                                }
                            }
    
                            else
                            {
                                clear_console();
                                break;
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
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;
            }
        }
    }
}
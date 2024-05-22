import java.util.*;

public class Main {
    static void clear_console() {
        for (int i = 0; i < 80 * 5; i++)
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
        int choice = 0;
        Scanner input = new Scanner(System.in);
        clear_console();

        aks_list_creator aks1 = new aks_list_creator(4001, "Xristos", "Kalergis");
        aks_list_creator aks2 = new aks_list_creator(3001, "Xristos", "Koutsikas");
        aks_list_creator aks3 = new aks_list_creator(2124, "Stauros", "Toumpis");
        aks_list_creator aks4 = new aks_list_creator(5667, "Antonis", "Dimakis");

        String[] capital={"c"};
        er_multChoice er_multChoice = new er_multChoice(2367, "Poia einai h proteuousa ths Elladas?",capital);
        //α) Θεσσαλονίκη,β) Πάτρα,γ) Αθήνα,δ) Ηράκλειο

        String[] oneWord1={"int","Integer","Int","integer"};           
        er_oneWord er_oneWord1 = new er_oneWord(4325, "Poia lexi kleidi anaferomste se akereo arithmo ston programatismo?",oneWord1);
        //int,Integer,Int,integer

        String[] oneWord2={"entilakosi"};
        er_oneWord er_oneWord2 = new er_oneWord(5852, "Pos onomazetai h prosthiki san perivlima twn plhroforion elegxou sta dedomena?",oneWord2);
        //ενθυλακωση

        String[] oneWord3={"pelati-ejipiretiti"};
        er_oneWord er_oneWord3 = new er_oneWord(8962, "Se poio montelo stirizontai oi uporesies sto diadiktio?",oneWord3);
        //πελατη-εξηπηρετιτη


        String[] erkena1={"tetragono","mhkous","iso","tetragonon","dyo"};
        er_kena er_kena1 = new er_kena(5467, "Το [?] tou [?] tis ipoteinousas einai [?] me to athrisma twn [?] twn mikwn twn allwn [?] pleurwn.",erkena1);
        //Το τετράγωνο του μήκους της υποτείνουσας είναι ίσο με το άθροισμα των τετραγώνων των μηκών των άλλων δύο πλευρών.

        String[] erkena2={"dieuthinseis","ip","dromologites"};
        er_kena er_kena2 = new er_kena(5467, "Oi [?] enos idiotikou diktiou [?] den dromologountai apo tous [?] sto diadiktio.",erkena2);
        //Οι διευθύνσεις ενός ιδιωτικού δικτύου IP δε δρομολογούνται από τους δρομολογητές στο Διαδίκτυο.


        //apantiseis


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
                            aks_list_creator neos_aks = new aks_list_creator(kodikos, onoma, eponimo);
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
                                er_kena er_kObj = new er_kena(kodikos, erotisi);
                                clear_console();
                                break;

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
                                er_oneWord er_kObj = new er_oneWord(kodikos, erotisi);
                                clear_console();
                                break;

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
                                er_multChoice er_kObj = new er_multChoice(kodikos, erotisi);
                                clear_console();
                                break;

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
                                //code
                        }

                        else
                        {
                            clear_console();
                            break;

                        }
                    }
                    break;

                case 3:
                    clear_console();
                    while(true)
                    {   

                    }
                    break;

                case 4:
                    clear_console();
                    System.out.println("                               --Erotiseis-- \n");
                    er_kena.printList();
                    er_oneWord.printList();
                    er_multChoice.printList();

                    System.out.println("\n[>] To exit, to Main menu press 0 or any other key.");
                    System.out.print("> ");
                    String epilogi = input.nextLine();
                    clear_console();
                    break;

                case 5:
                    clear_console();
                    break;

                case 6:
                    clear_console();
                    break;

                case 7:
                    clear_console();
                    break;

                case 8:
                    clear_console();
                    break;

                case 9:
                    clear_console();
                    System.out.println("-------------LOGGER------------------");
                    System.out.println("                                      ");

                    System.out.println("Aksiologoumenoi class list print: ");
                    System.out.println("                         ");
                    aks_list_creator.printList();
                    System.out.println("                         ");


                    System.out.println("Erotiseis class list print: ");
                    System.out.println("                         ");
                    er_kena.printList();
                    er_oneWord.printList();
                    er_multChoice.printList();

                    String apantiseis = null;
                    System.out.print("aapntiseis: "+ apantiseis);
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
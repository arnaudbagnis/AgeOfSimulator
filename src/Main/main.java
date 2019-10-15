package Main;


import House.Castle.Castle;
import House.Farm.Farm;
import House.House;
import Mayor.Mayor;
import Store.Store;
import PNJ.Bourgeois.Bourgeois;
import PNJ.PNJ;
import PNJ.Poor.Poor;
import PNJ.Wife.Wife;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mayor maire = new Mayor(); // en paramètres le nom ou pas
        maire.setRessources(20);
        maire.setMoney(400);
        ArrayList<House> house = new ArrayList<House>();
        int day = 0;
        int choix;

        while (true){
            System.out.println("Que voulez vous faire ?");
            System.out.println("1- Créer une maison de Bourgeois (" + Store.getCoastBourgeoisHouse() + ") (Disposant déjà d un H et une F)");
            System.out.println("2- Créer un Bourgeois (" + Store.getCoastBourgeois() + ")");
            System.out.println("3- Créer une maison de Pauvres (" + Store.getCoastPoorHouse() + " ) (Disposant déjà d’un H et une F)");
            System.out.println("4- Créer un Pauvre (" + Store.getCoastPoor() + ")");
            System.out.println("5- Créer une Femme (" + Store.getCoastWife() + ")");
            System.out.println("6- Continuer");
            choix = sc.nextInt();
            if (choix == 1){
                //moneyMayor = maire.(get.Money)
                 }
            if (choix == 2){

            }
            else if (choix == 3){
                //moneyMayor = maire.(get.Money)
                if(maire.getMoney() < Store.getCoastPoorHouse()){
                    System.out.println("Pas assez d'argent");
                }
                Poor y = new Poor();
                Wife z = new Wife();
                Farm x = new Farm();
                house.add(x);
                x.setRessources(20);
            }

            else if (choix == 5){
                int choix2;
                System.out.println("Etes vous sur de bien vouloir continuer ?");
                System.out.println("OUI : 1 NON : 2");
                choix2 = sc.nextInt();
                if (choix2 == 1){
                    break; }
                else if (choix2 == 2){
                // On fait rien pour que ça recommence la boucle.
                }
                while (choix <1 || choix>2){
                    System.out.print("Choix incorrect. ");
                    System.out.print("Votre choix: ");
                    choix = sc.nextInt();
                }
//                else{
//                    System.out.println("Choix incorrect !");
//                }
            }
            while(day != 7){
                for (int i = 0; i < house.size(); ++i){
                    House CurrentHouse = house[i];
                    //int Numb = SelectHouse.getNumberPNJ();
                    CurrentHouse.Product(); // ON POINTE VERS UNE MAISON
                }


                for (int i = 0; i < house.size(); ++i){
                    house.get(i).toString(); // Affiche l’humeur et les ressources de chaque maison Chaque Jour
                    // Sleep de 500ms pour lui laisser le temps de lire, à faire sur le thread.
                }
                day += 1;
            }

            for (int i = 0; i < house.size(); ++i){
                house.get(i).toString();// Affiche l’humeur et les ressources de chaque maison à la fin de la semaine
                // Sleep de 500ms pour lui laisser le temps de lire, à faire sur le thread.
            }


            for (int i = 0; i < house.size(); ++i){
                house.get(i).getRessources();

                int x;
                if(house.get(i).getName() == "Bourgeois"){// Si c’est bourgeois
                    int ask = (house.get(i).getRessources() / 2);
                    System.out.println("cette maison reclame"+ ask);
                    System.out.println("Combien voulez vous donner ?");
                    x = sc.nextInt();
                    maire.setRessources(maire.getRessources()-x); // Maire donne un nbr de ressources
                    maire.setRessources(maire.getRessources()+(house.get(i).getRessources())); // Il récupère toutes les ressources de la maison bourgeoise(Argent qu’ils ont récoltés)
                    house.get(i).setRessources(0); // On met les ressources de la maison à 0
                    if( x < ask ){
                        house.get(i).ChangeHumor(-1);
                        System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                    }
                    if( x > ask ){
                        house.get(i).ChangeHumor(+1);
                        System.out.println("Cette maison vous remercie pour votre confiance !");
                    }
                    if( x == ask ){
                        System.out.println("L’échange s'est effectué avec succès !");
                    }
                }


                else{ // Si c’est pauvre
                        int ask = (house.get(i).getRessources());
                        System.out.println("cette maison reclame"+ ask);
                        System.out.println("Combien voulez vous donner ?");
                        x = sc.nextInt();
                        maire.setRessources(maire.getRessources()-x); // Maire donne un nbr de ressources
                        maire.setRessources(maire.getRessources()+(house.get(i).getRessources())); // Il récupère toutes les ressources de la maison pauvre(Ressources qu’ils ont récoltés)
                        house.get(i).setRessources(0); // On met les ressources de la maison à 0
                        if( x < ask ){
                        house.get(i).ChangeHumor(-1);
                        System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                        }
                        if( x > ask ){
                            house.get(i).ChangeHumor(+1);
                            System.out.println("Cette maison vous remercie pour votre confiance !");
                        }
                        if( x == ask ){
                            System.out.println("L’échange s'est effectué avec succès !");
                        }
                    }


            }
            for (int i=0 ; i < house.size(); ++i){
                System.out.println(house.get(i));
                //house.get(i).toString();
            }
        }
}
}


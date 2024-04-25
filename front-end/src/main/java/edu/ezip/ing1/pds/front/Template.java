package edu.ezip.ing1.pds.front;


import java.awt.*;

public interface Template {
    //Valeurs constantes pour les frames qui vont implémenter l'interface :
    int LONGUEUR = 1400;
    int LARGEUR = 820;
    int HAUTEUR_HEADER = 90;
    String COULEUR_PRINCIPALE = "#E7EBE4";
    String COULEUR_SECONDAIRE = "#7B8275";
    String COULEUR_HEADER = "#FFFFFF";
    String POLICE = "Avenir";
    Font FONT_ECRITURE= new Font(Template.POLICE, Font.BOLD, 15);
    Font FONT_ECRITURE2= new Font(Template.POLICE, Font.BOLD, 18);




    Font FONT_TITRES= new Font(Template.POLICE, Font.BOLD, 20);
}
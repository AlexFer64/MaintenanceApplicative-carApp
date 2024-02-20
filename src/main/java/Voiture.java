public class Voiture {
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public String getModele(){
        return this.modele;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public void setVitesse(int vitesse){
        this.vitesse = vitesse;
    }

    public void setModele(String modele){
        this.modele = modele;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
    public void accelerer() {
        if (vitesse + 10 <= 120) {
            vitesse += 10;
            afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - 10 >= 0) {
            vitesse -= 10;
            afficherDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void afficherDetails() {
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse);
    }
}
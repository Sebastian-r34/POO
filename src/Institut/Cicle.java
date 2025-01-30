package Institut;

public class Cicle {
    private String nom;
    private int nombreAlumnes;
    private Cicle cicle;
    private Modul afegirModul;

    public Cicle(String nom, int nombreAlumnes){
        this(nom, nombreAlumnes, null);
    }

    public Cicle(String nom, int nombreAlumnes, Cicle cicle){
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
        if(cicle != null){
            cicle.afegirModul(this);
            this.cicle = cicle;
        }
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getNombreAlumnes(){
        return nombreAlumnes;
    }
    public void setNombreAlumnes(int nombreAlumnes){
        this.nombreAlumnes = nombreAlumnes;
    }


    public Cicle getCicle(){
        return cicle;
    }
    public void setCicle(Cicle cicle){
        this.cicle = cicle;
    }


    @Override
    public String toString() {
        return "Cicle{" +
                "nom='" + nom + '\'' +
                ", nombreAlumnes='" + nombreAlumnes + '\'' +
                '}';
    }
}

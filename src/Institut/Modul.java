package Institut;

public class Modul {
    //atributs, constructors, getters i setters



    //TOSTRING


    //Atributs
    private String nom;
    private int horesSetmanals;
    private Cicle cicle;

    //Constructors
    public Modul(String nom, int horesSetmanals){
        this(nom, horesSetmanals, null);
    }

    public Modul(String nom, int horesSetmanals, Cicle cicle){
        //Inicialitzar instància(objecte)
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
        this.cicle = cicle;
    }



    //Mètodes
    public String getNom(){
        return nom;
        // return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public int getHoresSetmanals() {
        return horesSetmanals;
    }

    public void setHoresSetmanals(int horesSetmanals) {
        this.horesSetmanals = horesSetmanals;
    }

    public Cicle getCicle() {
        return cicle;
    }
    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }



    @Override
    public String toString() {


        // "".equals(s)


       /* return "Modul2{" +
                "nom='" + nom + '\'' +
                ", horesSetmanals=" + horesSetmanals +
                ", cicle=" + cicle.getNom() +
                '}';
        */

        //String resultat;
        //  if (cicle != null) {
        //      resultat = "nom cicle";
        //  } else {
        //    resultat = "cicle null";
        //  }

        //ternaria
        //expresió if else
        //(condició if) ? valors cas true : valor cas false
       //resultat = (cicle != null) ? "nom cicle" : "cicle null";
       //return resultat;
       // return  resultat = (cicle != null) ? "nom cicle" : "cicle null";

        return "Modul{" +
                "nom='" + nom + '\'' +
                ", horesSetmanals=" + horesSetmanals +
                ", cicle=" + ((cicle != null) ? cicle.getNom() : "null") +
                '}';


        //(condicio if) ? cas true : (condicio else if) ? cas true else if : null;






    }
}


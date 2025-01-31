package Institut;

public class CicleArray {
    private String nom;
    private int nombreAlumnes;
    private Modul[] moduls;
    private int nombreModuls;
    private Modul afegirModul;
    private Modul tornaModul;

    public CicleArray(String nom, int nombreAlumnes){
        this(nom, nombreAlumnes, 10);
    }

    public CicleArray(String nom, int nombreAlumnes, int maximModuls){
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
        this.moduls = new Modul[maximModuls];
        this.nombreModuls = 0;
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

    public Modul[] getModuls() {
        return moduls;
    }

    public boolean afegirModul (Modul modul){
        if (modul == null){
            return false;
        }
        if(nombreModuls < moduls.length){
            //Me passen un modul i queden lloc lliures a l'array
            //afegim el modul a la darrera posició ocupada
            moduls[nombreModuls] = modul;
            modul.setCicle(this);
            nombreModuls++;
            return true;
        } else if (nombreModuls == moduls.length){
            //Array ha de tenir un més de longitud
            //Afegir

        }
    }



    public boolean eliminarModul(String nomModul){
        if(nomModul == null){
            return false;
        }
        for (int i = 0; i < nombreModuls; i++){
            if(moduls[i] != null && nomModul.equals(moduls[i].getNom())){
                //Llevam referencia de modul al cicle
                moduls[i].setCicle(null);
                //Mai hem de deixar espais buits entre mitges
                moduls[i] = moduls[nombreModuls - 1];
                moduls[nombreModuls - 1] = null;
                nombreModuls--;
                return true;
            }
        }
        return false;
    }

    public Modul tornaModul(String nom){
        if(nom == null){
            return null;
        }
        Modul modul;
        for(int i = 0; i < nombreModuls; i++){
            modul = moduls[i];
            if (modul != null && nom.equals(modul.getNom())){
                return modul;
            }
        }
        return null;
    }

    public void setModuls(Modul[] moduls) {
        this.moduls = moduls;
        if (moduls != null) {
            int countModuls = 0;
            for (int i = 0; i < moduls.length; i++){
                if (moduls[i] != null) {
                    countModuls++;
                } else {
                    break;
                }
            }
            this.nombreModuls = countModuls;
        }
    }
    public int getNombreModuls() {
        return nombreModuls;
    }

    @Override
    public String toString() {
        return "Cicle{" +
                "nom='" + nom + '\'' +
                ", nombreAlumnes='" + nombreAlumnes + '\'' +
                '}';
    }
}

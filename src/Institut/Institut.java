package Institut;

public class Institut {

    public static void main(String[] args) {
        Cicle daw = new Cicle("Desenvolupament d'aplicacions web", 50);


        // System.out.println(daw);
        System.out.println(daw.getNom());
        System.out.println(daw.getNombreAlumnes());
        daw.setNombreAlumnes(daw.getNombreAlumnes() - 1);
        System.out.println(daw.getNombreAlumnes());

        Modul programacio = new Modul("Programació", 7, daw);

        System.out.println(programacio);

        Modul ceramica = new Modul("ceramica", 4);

        System.out.println(ceramica);

        daw.afegirModul(programacio);
        System.out.println(daw);

     //   Modul tornat1 = daw.tornaModul("Programació");

    //    Modul tornat2 = daw.tornaModul("Inventari");

    //    Modul tornat3 = daw.tornaModul("null");

    }
}

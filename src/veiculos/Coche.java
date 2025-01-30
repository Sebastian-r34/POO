package veiculos;

public class Coche {

    private String marca;
    private String modelo;
    private int año;
    private int velocidad;

    public Coche(String modelo, String marca, int año){
        this(modelo, marca, año, 40);
    }

    public Coche(String modelo, String marca, int año, int velocidad){
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.velocidad = velocidad;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public void acelerar(int cantidad){
        velocidad += cantidad + 5;
    }

    public void frenar(int cantidad){
        velocidad -= cantidad;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    @Override
    public String toString() {
        return "coche {" +
                " marca=" + marca + '\'' +
                ", modelo=" + modelo + '\'' +
                ", año=" + año +
                ", velocidad=" + velocidad  +
                " '}'";
    }
}

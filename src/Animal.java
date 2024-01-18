import java.util.Random;

public  abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    private static final String[] nombres = {"Alguien", "NoSe", "Salvar", "Bea", "Fernandez"};
    public Animal() {
        Random random = new Random();
        nombre = nombres[(int) Math.random() * nombres.length];
        edad = random.nextInt(1, 14);
        peso = random.nextDouble(45, 100);
    }

    public Animal(String nombre, double peso, int edad) {
        this.nombre= nombre;
        this.edad=edad;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ANIMAL{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}

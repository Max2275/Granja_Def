import java.util.Arrays;
import java.util.Random;


public class Vaca extends Animal {

    private double[] lecheSemana;

    public Vaca() {
        super();
        Random random = new Random();
        lecheSemana = new double[7];
        for (int i = 0; i < lecheSemana.length; i++) {
            lecheSemana[i] = random.nextDouble(20, 40);
        }
    }

    public Vaca(String nombre, double peso, int edad, double[] lecheSemana) {
        super(nombre, peso, edad);
        lecheSemana = new double[7];
    }

    @Override
    public String toString() {
        return super.toString() + "Vaca{" +
                "lecheSemana=" + Arrays.toString(lecheSemana) +
                '}';
    }

    public double[] getLecheSemana() {
        return lecheSemana;
    }

    public void setLecheSemana(double[] lecheSemana) {
        this.lecheSemana = lecheSemana;
    }
}

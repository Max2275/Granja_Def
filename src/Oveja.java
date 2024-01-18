import java.util.Arrays;
import java.util.Random;

public class Oveja  extends Animal {


    private double[] lanaMes;



    public Oveja() {
        super();
        Random random = new Random();
        lanaMes = new double[12];
        for (int i = 0; i < lanaMes.length; i++) {
            lanaMes[i] = random.nextDouble(1, 4);
        }
    }

    public Oveja(String nombre, double peso, int edad, double[] lanaMes) {
        super(nombre,peso,edad);
        lanaMes = new double[12];
    }


    public void setLecheSemana(double[] lecheSemana) {
        this.lanaMes = lecheSemana;
    }

    public double[] getLanaMes() {
        return lanaMes;
    }

    @Override
    public String toString() {
        return super.toString()+ "Oveja{" +
                "lanaMes=" + Arrays.toString(lanaMes) +
                '}';
    }
}

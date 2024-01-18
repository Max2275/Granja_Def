import java.util.Arrays;

public class Gallina extends Animal {

    private int [] huevosSemana;

    public Gallina(){
        super();
        huevosSemana = new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]= (int) (Math.random()*3);
        }
    }
    public Gallina(String nombre, double peso, int edad, int[] huevosSemana) {
        super(nombre,peso,edad);
        huevosSemana = new int[7];
    }

    public void huevosDia(int dia, int huevos){
        huevosSemana[dia-1] = huevos;

    }


    @Override
    public String toString() {
        return  super.toString()+"Gallina{" +
                "huevosSemana=" + Arrays.toString(huevosSemana) +
                '}';
    }

    public int[] getHuevosSemana() {
        return huevosSemana;
    }

    public void setHuevosSemana(int[] huevosSemana) {
        this.huevosSemana = huevosSemana;
    }
}


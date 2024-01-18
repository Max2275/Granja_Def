public class Granja {
    private Animal[] animales;

    public Granja() {
        animales = new Animal[10];
        for (int i = 0; i < animales.length; i++) {
            if (i % 2 == 0) {
                animales[i] = new Oveja();
            } else if (i % 5 == 0) {
                animales[i] = new Vaca();
            } else if (i % 2 != 0) {
                animales[i] = new Gallina();
            }
        }
    }

    public Granja(Animal[] animales) {
        this.animales = animales;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
}


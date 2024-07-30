package product;

public class Moble extends Gheyre_Barghi {
    private int nafar;

    public int getNafar() {
        return nafar;
    }

    public void setNafar(int nafar) {
        this.nafar = nafar;
    }

    @Override
    public String toString() {
        return "Moble{" +
                "nafar=" + nafar +
                ", vazn=" + getVazn() +
                ", name='" + getName() + '\'' +
                ", gheymat=" + getGheymat() +
                '}';
    }
}

package product;

public class Asus extends Laptop{
    private int bateri;

    public int getBateri() {
        return bateri;
    }

    public void setBateri(int bateri) {
        this.bateri = bateri;
    }

    @Override
    public String toString() {
        return "Asus{" +
                "bateri=" + bateri +
                ", ram=" + getRam() +
                ", cpu='" + getCpu() + '\'' +
                ", volt=" + getVolt() +
                ", name='" + getName() + '\'' +
                ", gheymat=" + getGheymat() +
                '}';
    }
}

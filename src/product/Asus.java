package product;

public class Asus extends Laptop{
    int bateri;

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
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", volt=" + volt +
                ", name='" + name + '\'' +
                ", gheymat=" + gheymat +
                '}';
    }
}

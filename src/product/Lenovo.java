package product;

public class Lenovo extends Laptop{
    Boolean tachpad;

    public Boolean getTachpad() {
        return tachpad;
    }

    public void setTachpad(Boolean tachpad) {
        this.tachpad = tachpad;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "tachpad=" + tachpad +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", volt=" + volt +
                ", name='" + name + '\'' +
                ", gheymat=" + gheymat +
                '}';
    }
}

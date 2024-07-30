package product;

public class Lenovo extends Laptop{
    private Boolean tachpad;

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
                ", ram=" + getRam() +
                ", cpu='" + getCpu() + '\'' +
                ", volt=" + getVolt() +
                ", name='" + getName() + '\'' +
                ", gheymat=" + getGheymat() +
                '}';
    }
}

package product;

public class Main {
    public static void main(String[] args) {
        Asus asus = new Asus();

        asus.setBateri(120);
        asus.setCpu("intel i3");
        asus.setRam(16);
        asus.setVolt(200);
        asus.setName("Asus book 13");
        asus.setGheymat(12000);

        Lenovo lenovo = new Lenovo();

        lenovo.setTachpad(false);
        lenovo.setCpu("intel i9");
        lenovo.setRam(64);
        lenovo.setVolt(300);
        lenovo.setName("Lenovo legion 5pro");
        lenovo.setGheymat(20000);

        Moble moble = new Moble();
        moble.setName("moble memberan");
        moble.setGheymat(12000);
        moble.setVazn(15);
        moble.setNafar(4);

        System.out.println(asus);
        System.out.println(lenovo);
        System.out.println(moble);
    }
}

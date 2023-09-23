package gettingbusy;

public class main {
    public static void main(String[] args) {
        Dimension caseDimension = new Dimension(200, 200,100);
        Resolution monitorResolution = new Resolution(50,50);
        Case digitalStorm = new Case("Windows xp", "Microsoft", "200 volts", caseDimension );
        Monitor samsung = new Monitor(monitorResolution, "samsung12x", "samsung");
        Motherboard raspberryPi = new Motherboard("iOS", "apple", 2, 4, "apple-bios");
        Pc cyberPower = new Pc(digitalStorm, raspberryPi ,samsung );
        System.out.println("===================================");
        cyberPower.description();
        System.out.println("===================================");
        cyberPower.powerUp();
    }
}

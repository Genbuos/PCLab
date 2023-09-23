package gettingbusy;

public class Motherboard {
    private String model;
    private String manufacurer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacurer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacurer = manufacurer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacurer='" + manufacurer + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }

    public void loadProgram(String progamName){
        System.out.println(progamName + " is now running...");
    }
}

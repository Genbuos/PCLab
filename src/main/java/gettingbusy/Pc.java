package gettingbusy;

public class Pc {
    private Case aCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public Pc(Case aCase, Motherboard motherboard, Monitor monitor){
        this.aCase = aCase;
        this.motherboard =motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(1,2,"blue");
    }

    public void description(){
        System.out.println( "Welcome to worst buy below is the description of the pc on sale today"+"\n"+ monitor.toString()+ "\n"+aCase.toString() + "\n" + motherboard.toString());
    }
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("IntelliJ");
    }
}

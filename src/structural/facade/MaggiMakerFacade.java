package structural.facade;

public class MaggiMakerFacade {
    private BoilWater boilWater;
    private AddMasala addMasala;
    private Serve serve;

    public MaggiMakerFacade(BoilWater boilWater, AddMasala addMasala, Serve serve){
        this.boilWater = boilWater;
        this.addMasala = addMasala;
        this.serve = serve;
    }

    public void makeMaggi(int numberOfPackets){
        System.out.println(STR."Get ready to cook \{numberOfPackets} maggi packets!");
        boilWater.fetchWater();;
        boilWater.SimmerWater();

        addMasala.addSachet();

        serve.serveMaggi();
    }
}

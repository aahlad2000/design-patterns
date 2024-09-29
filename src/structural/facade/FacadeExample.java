package structural.facade;

public class FacadeExample {
    public static void main(String[] args){
        BoilWater boilWater = new BoilWater();
        AddMasala addMasala = new AddMasala();
        Serve serve = new Serve();

        MaggiMakerFacade maggiMakerFacade = new MaggiMakerFacade(boilWater, addMasala, serve);
        maggiMakerFacade.makeMaggi(3);

        System.out.println();
    }
}

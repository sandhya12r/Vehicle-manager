public class vehicle{
    public static void main(String[] args){
        PetrolEngine pE = new PetrolEngine();
        pE.start();
        pE.stop();
        DieselEngine dE = new DieselEngine();
        dE.start();
        dE.stop();
    }
} 
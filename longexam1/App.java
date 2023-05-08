import Locations.*;
import Tourists.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locations Baguio = new Baguio();
        Locations Baler = new Baler();
        Locations Launion = new Launion();
        Locations Palawan = new Palawan();
        Locations Pampanga = new Pampanga();
        Locations Rizal = new Rizal();

        Tourist Me = new Me();

        Baguio.accept(Me);
        Baler.accept(Me);
        Launion.accept(Me);
        Palawan.accept(Me);
        Pampanga.accept(Me);
        Rizal.accept(Me);

    }
}
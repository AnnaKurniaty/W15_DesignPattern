import Components.*;

public class MainClass {
    public static void main(String[] args) {
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheatreLights(),
                new Screen(),
                new PopcornPopper());

        theaterFacade.watchMovie("Avengers");
        System.out.println("The movie is over");
        theaterFacade.endMovie();
    }
}

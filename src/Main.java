// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("ice age", 2016);
        System.out.println("Movie name: " + myMovie.getName());
        System.out.println("Movie release date: " + myMovie.getRelease());
        myMovie.invite();

        Comedy myComedy = new Comedy("funny movie", 2025, 6);
        System.out.println("Comedy name: " + myComedy.getName()); // inherited method
        System.out.println("Comedy release date: " + myComedy.getRelease()); // inherited method
        System.out.println(myComedy.getFunScale()); // method ONLY available on Car objects/ inherited method
        myComedy.invite();
        myComedy.crowdReaction();

        Horror myHorror = new Horror("insideous", 2023, 8);
        System.out.println("Horror name: " + myHorror.getName()); // inherited method
        System.out.println("Horror release date: " + myHorror.getRelease()); // inherited method
        System.out.println(myHorror.getScareScale()); // method ONLY available on Bicycle objects
        myHorror.invite(); // method ONLY available on Car objects
        myHorror.crowdReaction(); // method ONLY available on Car objects

    }
}
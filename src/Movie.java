public class Movie {

    private String name;

    private int release;

    public Movie(String name, int release)
    {
        this.name = name;
        this.release = release;
    }

    public String getName()
    {
        return name;
    }

    public int getRelease()
    {
        return release;
    }
    public void invite()
    {
        System.out.println("Come watch this new movie releasing in " + release + " and enjoy some popcorn!");
    }


}

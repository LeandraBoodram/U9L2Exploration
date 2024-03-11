public class Horror extends Movie{
    private int scareMeter;

    public Horror(String name, int release, int scareMeter){
        super(name, release);
        this.scareMeter = scareMeter;
    }


    public String getScareScale() {
        return scareMeter + "/10";
    }


    public void crowdReaction()
    {
        System.out.println("AHHHHHH!");
    }
}

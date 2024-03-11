public class Comedy extends Movie{
    private int funnyMeter;
    
    public Comedy(String name, int release, int funnyMeter){
        super(name, release);
        this.funnyMeter = funnyMeter;
    }

    public String getFunScale() {
        return funnyMeter + "/10";
    }


    public void crowdReaction()
    {
        System.out.println("HAHAHAHA!");
    }
}

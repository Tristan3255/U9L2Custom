public class Cookies extends Food{

    private boolean hasPowderedSugar;
    public Cookies(String name, int calories, boolean hasPowderedSugar){
        super(name,calories);
        this.hasPowderedSugar = hasPowderedSugar;
    }

    public boolean isHasPowderedSugar() {
        return hasPowderedSugar;
    }

    public void addPowderedSugar(){
        System.out.println("You have added a light sprinkle of powdered sugar to your cookie.");
    }
}


public class Burger extends Food{

    private boolean hasCondiments;
    public Burger(String name, int calories, boolean hasCondiments){
        super(name,calories);
        this.hasCondiments = hasCondiments;
    }

    public boolean isHasCondiments() {
        return hasCondiments;
    }

    public void addCondiment(){
        System.out.println("You have added ketchup and mayo");
    }
}

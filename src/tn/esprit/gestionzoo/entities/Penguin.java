package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
        System.out.println("constructeur penguin");
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }




    @Override
    public String toString() {
        return super.toString() + "SwimmingDepth:" + this.swimmingDepth;
    }
}

package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrlegs;

    public Terrestrial() {
        System.out.println("constructor terrestrial");
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrlegs){
        super(family,name,age,isMammal);
    this.nbrlegs=nbrlegs;

    }
}


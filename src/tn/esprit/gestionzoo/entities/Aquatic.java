package tn.esprit.gestionzoo.entities;



public /*abstract*/ class Aquatic extends Animal{
        protected String habitat;

    public Aquatic() {
        System.out.println("constructor aquatic");
    }


    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {

        super(family,name,age,isMammal);

        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+ "habitat:" + this.habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }


//redefinition equals
    //inst 31
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() == Aquatic.class){
            Aquatic aqua=(Aquatic) obj;
            return name.equals(aqua.name) && age == aqua.age && habitat.equals(aqua.habitat);
        }

        return false;
    }
}


package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

//prosit5
        Terrestrial terr=new Terrestrial();
        Aquatic aq=new Aquatic();
        Dolphin D=new Dolphin();
        Penguin p=new Penguin();

        System.out.println(dog.toString());
        System.out.println(aq.toString());
        System.out.println(terr.toString());
        System.out.println(D.toString());
        System.out.println(p.toString());


        aq.swim();
        D.swim();
        p.swim();

        //inst26
        Aquatic A1 = new Aquatic("houta","katkouta",3,true,"felbhar");
        myZoo.addAquaticAnimal(A1);
        Aquatic A2 = new Aquatic("hwita","mklya",4,false,"fzwita");
        myZoo.addAquaticAnimal(A2);
        Aquatic A3 = new Aquatic("gaza","free",22,true,"palestine");
        myZoo.addAquaticAnimal(A3);
        //inst27

        A1.swim();
        A2.swim();
        A3.swim();
        System.out.println(A1.equals(A3));



        //inst 28
//        Aquatic A1 = (Aquatic) new Penguin();
//        myZoo.addAquaticAnimal(A1);
//        Aquatic A2 = new Dolphin();
//        myZoo.addAquaticAnimal(A2);
//        Aquatic A3 = new Penguin();
//        myZoo.addAquaticAnimal(A3);
//        A1.swim();
//        A2.swim();
//        A3.swim();
    }


}

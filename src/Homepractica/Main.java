package Homepractica;

public class Main {
    public static void main(String[] args) {
        Character rogue = new Character();
        rogue.setValues(65,99,70,85,99,"Athletic",new byte[] {9, 10, 77});
        String valuesRog = rogue.getValues();
        System.out.println(valuesRog);
        rogue.strength = 65;
        rogue.dexterity = 99;
        rogue.intelligence = 70;
        rogue.stamina = 85;
        rogue.oratory = 99;
        rogue.constitution = "Athletic";
        rogue.coordinate = new byte[] {9, 10, 77};

        Character barbarian = new Character();
        barbarian.strength = 99;
        barbarian.dexterity = 65;
        barbarian.intelligence = 50;
        barbarian.stamina = 99;
        barbarian.oratory = 65;
        barbarian.constitution = "Strong";
        barbarian.coordinate = new byte[] {20, 120, 33};

        String valuesBarb = barbarian.getValues();
        System.out.println(valuesBarb);

    }
}

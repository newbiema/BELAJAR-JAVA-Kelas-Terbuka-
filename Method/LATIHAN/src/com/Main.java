package com;


class Player{
    String name;
    Double health;
    // Objek Member
    Weapon weapon;
    Armor armor;

    Player(String name,double health){
        this.name = name;
        this.health = health;

    }    
}

class Weapon{
    int attackPower;

    Weapon(int attackPower){
        this.attackPower = attackPower;

    }
}

class Armor{
    double armordefence;

    Armor(double armordefence){
        this.armordefence = armordefence;

    }
}


public class Main {

    public static void main(String[] args) {

        // Objek player
        Player player1 = new Player("Alok", 100);

        // Objek Senjata
        Weapon pedang = new Weapon(15);

        // Objek Armor

        Armor bajuzirah = new Armor(10);




        
    }
    
}

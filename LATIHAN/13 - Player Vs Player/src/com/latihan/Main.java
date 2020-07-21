package com.latihan;

class Player{
    String name;
    double health;
    //Data Member
    Weapon weapon;
    Armor armor;

    //Constructur
    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: "+this.name);
        System.out.println("Health: "+this.health);
        this.weapon.display();
        this.armor.display();
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name+" attacking "+opponent.name+" with power "+attackPower);
        opponent.defence(attackPower);
    }
        void defence(double attackPower){
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name+" gets damage "+damage);
        
    }
}

class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon: "+this.name+" attack power: "+this.attackPower);
    }
}

class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Defence: "+this.name+" defence power: "+this.defencePower);
    }
}

public class Main {
    public static void main(String[] args){
        //membuat object player
        Player player1 = new Player("Ucup",100);
        Player player2 = new Player("Otong",50);

        //membuat object weapon
        Weapon pedang = new Weapon("Padang",15);
        Weapon ketapel = new Weapon("Ketapel",1);

        //membuat object armor
        Armor bajuBesi = new Armor("Baju Besi",15);
        Armor kaos = new Armor("Kaos",0);
        
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player1.display();
        player2.display();
        System.out.println("\n======BATTLE!======");
        System.out.println("======Phase 1======");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\n======Phase 2======");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
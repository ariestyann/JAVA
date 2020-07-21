package com.tutorial;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private Boolean isAlive;

    //object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }
    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - totalDamage;
    }

    public void display() {
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Health\t\t: " + this.getHealth() +" / "+this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Status\t\t: "+this.isAlive+"\n");
    }

    public void attack(Player opponent){
        int damage = this.getAttackPower();
        System.out.println("Player "+this.name+ " is attacking "+ opponent.getName() +" with "+damage);
        opponent.defence(damage);
        this.levelUp();
    }

    public void defence(int damage){
        
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;
        System.out.println(this.name+" defence power = "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        }else{
            deltaDamage = 0;
        }
        this.totalDamage += deltaDamage;
        System.out.println("Damage earned = "+totalDamage);
        if(this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }
        this.display();
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp() {
        this.level++;
    }

}

class Armor {
    private String name;
    private int strenght;
    private int health;

    public Armor(String name, int strenght, int health) {
        this.name = name;
        this.strenght = strenght;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strenght * 10 + this.health;
    }

    public int getDefencePower(){
        return this.strenght*2;
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Parul");
        Armor armor1 = new Armor("Baju Besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Dara");
        Armor armor2 = new Armor("Gaun Pesta", 1, 40);
        Weapon weapon2 = new Weapon("Pecut", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();
        player1.attack(player2);
        player2.attack(player1);
        player2.attack(player1);
    }
}
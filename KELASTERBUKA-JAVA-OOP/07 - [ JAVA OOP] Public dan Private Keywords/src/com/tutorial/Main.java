package com.tutorial;

class Player{
  String name; //default, bisa dibaca dan ditulis dari luar class
  public int exp; //public, bisa dibaca dan ditulis dari luar class
  private int health;

  Player(String name, int exp, int health){
    this.name = name;
    this.exp = exp;
    this.health = health;
  }

  //default
  void display(){
    tambahExp();
    System.out.println("\nName: "+this.name);
    System.out.println("Exp: "+this.exp);
    System.out.println("Health: "+this.health);
  }
  
  //public
  public void ubahName(String name){
    this.name = name;
  }

  //private
  private void tambahExp(){
    this.exp += 100;
  }
}
public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("Marni",0,100);
    player1.display(); //membaca 
    player1.name = "Surti"; //menulis
    player1.display(); //membaca

    player1.exp = 100; //memnulis
    player1.display(); //membaca

    //private tidak bisa membaca diluar class nya
    // player1.health = 80; //menulis
    // player1.display(); //membaca

    player1.ubahName("Naruto");
    player1.display();

  }
}
package com.company;

class Tommy{
    public void hit(){
        System.out.println("Hitting your enemy");
    }
    public void run(){
        System.out.println("Running from your enemy");
    }
    public void fire(){
        System.out.println("Firing your enemy");
    }
    public void steal(){
        System.out.println("Steal from your enemy");
    }
}
public class GameCharacter {
    public static void main(String[] args) {


        Tommy player = new Tommy();
        player.fire();
        player.hit();
        player.run();
        player.steal();
        System.out.println();
        System.out.println("Mission Completed");
    }
}
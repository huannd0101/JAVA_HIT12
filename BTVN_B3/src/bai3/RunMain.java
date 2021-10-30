package bai3;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Random random = new Random();

        Guns DiepBeDe  = new Guns("gun1", 100);
        Guns DoanXinhGai  = new Guns("gun2", 100);

        while(DiepBeDe.getAmmoNumber() > 0 && DoanXinhGai.getAmmoNumber() > 0) {
            DiepBeDe.load(random.nextInt(10) + 1);
            DiepBeDe.shoot(random.nextInt(10) + 1);

            DoanXinhGai.load(random.nextInt(10) + 1);
            DoanXinhGai.shoot(random.nextInt(10) + 1);

            System.out.println("DiepBeDe: " + DiepBeDe.getAmmoNumber());
            System.out.println("DoanXinhGai: " + DoanXinhGai.getAmmoNumber());
        }

        System.out.println("\n------Kết quả-------");
        if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
            System.out.println("Hòa");
        }else if(DiepBeDe.getAmmoNumber() == 0) {
            System.out.println("DiepBeDe thua.");
        }else {
             System.out.println("DoanXinhGai thua.");
        }

    }
}

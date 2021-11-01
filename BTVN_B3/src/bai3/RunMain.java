package bai3;

import java.util.Random;

public class RunMain {

    public static void main(String[] args) {
        Guns DiepBeDe = new Guns("gun1", 100);
        Guns DoanXinhGai  = new Guns("gun2", 100);

        process(DiepBeDe, DoanXinhGai);

        System.out.println("\n------Kết quả-------");

        showRes(DiepBeDe, DoanXinhGai);
    }

    private static void process(Guns DiepBeDe, Guns DoanXinhGai) {
        Random random = new Random();
        while(DiepBeDe.getAmmoNumber() > 0 && DoanXinhGai.getAmmoNumber() > 0) {
            DiepBeDe.load(random.nextInt(10) + 1);
            DiepBeDe.shoot(random.nextInt(10) + 1);

            DoanXinhGai.load(random.nextInt(10) + 1);
            DoanXinhGai.shoot(random.nextInt(10) + 1);

            System.out.println("DiepBeDe: " + DiepBeDe.getAmmoNumber());
            System.out.println("DoanXinhGai: " + DoanXinhGai.getAmmoNumber());
        }
    }

    private static void showRes(Guns DiepBeDe, Guns DoanXinhGai) {
        if(DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
            System.out.println("Hòa");
        }else if(DiepBeDe.getAmmoNumber() == 0) {
            System.out.println("DiepBeDe thua.");
        }else {
            System.out.println("DoanXinhGai thua.");
        }
    }
}

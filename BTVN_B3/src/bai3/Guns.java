package bai3;

public class Guns {
    private String weaponName;
    private int ammoNumber;

    public Guns() {
    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public void load(int x) {
        setAmmoNumber(getAmmoNumber() + x);
    }

    public void shoot(int x) {
        if(getAmmoNumber() - x > 0) {
            setAmmoNumber(getAmmoNumber() - x);
        }else {
            setAmmoNumber(0);
        }
//        setAmmoNumber(Math.max(getAmmoNumber() - x, 0));
    }
}

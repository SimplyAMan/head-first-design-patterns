package strategy.puzzle;

public abstract class Character {
    WeaponBehaviour weapon;
    public abstract void fight();

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
}

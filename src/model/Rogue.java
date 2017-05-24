package model;

/**
 * Created by Asus on 4/24/2017.
 */
public class Rogue extends Hero {
    public Rogue(String id, String name, Integer level, Integer attack, Integer defense, Integer hp, Integer strength,
                    Integer dexterity, Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(id, name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors, report);
//        update(weapons,armors);
    }

    public Rogue(String name, Integer level, Integer attack, Integer defense, Integer hp, Integer strength, Integer dexterity,
                 Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors, report);
        update(weapons,armors);
    }

    public Rogue(String name, Weapons weapons, Armors armors, Report report) {
        super(name, weapons, armors, report);
//        update(weapons,armors);
    }


    @Override
    public void update(Weapons weapons, Armors armors) {
        super.update(weapons, armors);
        if (weapons instanceof Bow){
            Bow bow = (Bow) weapons;
            this.setDexterity( getDexterity() + bow.getBonusDexterity());
        }
        if (armors instanceof Leather){
            Leather leather = (Leather) armors;
            setDexterity(getDexterity() + leather.getBonusDexterity());
        }
        this.setAttack( this.getAttack() + (this.getDexterity() + weapons.getDexterity()));
        this.setDefense(this.getDefense() + (this.getDexterity() + armors.getDexterity()));
    }
}

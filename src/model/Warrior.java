package model;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesHandlerImpl;

/**
 * Created by Asus on 4/24/2017.
 */
public class Warrior extends Hero {
    public Warrior(String id, String name, Integer level, Integer attack, Integer defense, Integer hp, Integer strength,
                      Integer dexterity, Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(id, name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors, report);
//        update(weapons,armors);
    }

    public Warrior(String name, Integer level, Integer attack, Integer defense, Integer hp, Integer strength, Integer dexterity,
                   Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors, report);
        update(weapons,armors);
    }

    public Warrior(String name, Weapons weapons, Armors armors, Report report) {
        super(name, weapons, armors, report);
//        update(weapons,armors);
    }


    @Override
    public void update(Weapons weapons, Armors armors) {
        super.update(weapons, armors);
        if (weapons instanceof Axe){
            Axe axe = (Axe) weapons;
            this.setStrength(this.getStrength() + axe.getBonusStrength());
        }
        if (armors instanceof Chainmail){
            Chainmail chainmail = (Chainmail) armors;
            this.setStrength(this.getStrength() + chainmail.getBonusStrength());
        }
        this.setAttack(this.getAttack()+ this.getStrength()+ weapons.getStrength());
        this.setDefense(this.getDefense()+this.getStrength()+armors.getStrength());
    }

}

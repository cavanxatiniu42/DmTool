package model;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Mage extends Hero {
    public Mage(String id, String name, Integer level, Integer attack, Integer defense, Integer hp,
                   Integer strength, Integer dexterity, Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(id, name, level, attack, defense, hp, strength, dexterity, intelligent, weapons, armors, report);
//        update(weapons,armors);
    }

    public Mage(String name, Integer level, Integer attack, Integer defense, Integer hp,
                Integer strength, Integer dexterity, Integer intelligent, Weapons weapons, Armors armors, Report report) {
        super(name, level, attack, defense, hp,strength, dexterity, intelligent, weapons, armors, report);
        update(weapons,armors);
    }

    public Mage(String name, Weapons weapons, Armors armors, Report report) {
        super(name, weapons, armors, report);
//        update(weapons,armors);
    }

    @Override
    public void update(Weapons weapons, Armors armors) {
        super.update(weapons, armors);
        if (weapons instanceof Staff){
            Staff staff = (Staff) weapons;
            this.setIntelligent(getIntelligent() + staff.getBonusIntelligent());
        }
        if (armors instanceof Robe){
            Robe robe = (Robe) armors;
            this.setIntelligent( getIntelligent() + robe.getBonusIntelligent());
        }
        this.setAttack(this.getAttack() + (this.getIntelligent() + weapons.getIntelligent()));
        this.setDefense( this.getDefense() + (this.getIntelligent() + armors.getIntelligent()));

    }
}

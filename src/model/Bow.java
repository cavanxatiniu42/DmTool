package model;

import domainapp.basics.model.meta.DAttr;
import org.apache.derby.iapi.store.raw.RePreparable;

/**
 * Created by Asus on 4/23/2017.
 */
public class Bow extends Weapons {
    @DAttr(name = "bonusDexterity", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
    private Integer bonusDexterity;
    public Bow(String id, String name, Integer strength, Integer dexterity, Integer intelligent,Hero hero,  Integer bonusDexterity) {
        super(id, name, strength, dexterity, intelligent, hero);
        this.bonusDexterity = bonusDexterity;
    }

    public Bow(String name, Integer strength, Integer dexterity, Integer intelligent,Hero hero, Integer bonusDexterity) {
        this(null, name, 10,10,10, null,  2);
    }

    public Bow(String name, Integer bonusDexterity) {
        this(null, name, 10,10,10, null, 2);
    }

    public Integer getBonusDexterity() {
        return bonusDexterity;
    }

    public void setBonusDexterity(Integer bonusDexterity) {
        this.bonusDexterity = bonusDexterity;
    }
}

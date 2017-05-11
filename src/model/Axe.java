package model;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Axe extends Weapons {
    @DAttr(name = "bonusStrength",type = DAttr.Type.Integer, mutable = false,min = 1, max = 10)
    private Integer bonusStrength;

    public Axe(String  id, String name, Integer strength, Integer dexterity, Integer intelligent, Hero hero, Integer bonusStrength ) {
        super(id, name, strength, dexterity, intelligent, hero);
        this.bonusStrength = bonusStrength;
    }

    public Axe(String name, Integer strength, Integer dexterity, Integer intelligent, Hero hero, Integer bonusStrengtht) {
        this("",name,10,10,10, null, 2);

    }

    public Axe(String name, Integer bonusStrength) {
        this("",name,10,10,10,null, 2);

    }


    public Integer getBonusStrength() {
        return bonusStrength;
    }

    public void setBonusStrength(Integer bonusStrength) {
        this.bonusStrength = bonusStrength;
    }
}

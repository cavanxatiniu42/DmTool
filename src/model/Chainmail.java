package model;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Hoang Phuong on 4/10/2017.
 */
public class Chainmail extends Armors {

    @DAttr(name = "bonusStrength", type = DAttr.Type.Integer,mutable = false, min = 1, max = 10)
    private Integer bonusStrength;
    public Chainmail(String id, String name, Integer strength, Integer intelligent, Integer dexterity, Hero hero,
                     Integer bonusStrength) {
        super(id, name, strength, intelligent, dexterity, hero);
        this.bonusStrength = bonusStrength;
    }

    public Chainmail(String name, Integer strength, Integer intelligent, Integer dexterity, Hero hero, Integer bonusStrength) {
        this("",name,10,10,10,null,2);

    }


    public Chainmail(String name, Integer bonusStrength) {
        this("",name,10,10,10, null,2);

    }

    public Integer getBonusStrength() {
        return bonusStrength;
    }

    public void setBonusStrength(Integer bonusStrength) {
        this.bonusStrength = bonusStrength;
    }
}

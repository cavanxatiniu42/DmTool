package model;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Asus on 4/23/2017.
 */
public class Leather extends Armors{
    @DAttr(name = "bonusDexterity", type = DAttr.Type.Integer, mutable = false, min = 1, max = 10)
    private Integer bonusDexterity;
    public Leather(String id, String name, Integer strength, Integer intelligent, Integer dexterity, Hero hero, Integer bonusDexterity) {
        super(id, name, strength, intelligent, dexterity, hero);
        this.bonusDexterity = bonusDexterity;
    }

    public Leather(String name, Integer strength, Integer intelligent,Integer dexterity,Hero hero, Integer bonusDexterity) {
        this("", name, 10,10,10, null,2);
    }

    public Leather(String name, Integer bonusDexterity) {
        this("", name, 10,10,10,null, 2);
    }

    public Integer getBonusDexterity() {
        return bonusDexterity;
    }

    public void setBonusDexterity(Integer bonusDexterity) {
        this.bonusDexterity = bonusDexterity;
    }
}

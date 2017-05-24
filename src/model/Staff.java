package model;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Asus on 4/23/2017.
 */
public class Staff extends Weapons {
    @DAttr(name = "bonusIntelligent", type = DAttr.Type.Integer, mutable =  false,min = 1, max = 10)
    private Integer bonusIntelligent;
    public Staff(String id, String name, Integer strength, Integer dexterity, Integer intelligent, Hero hero, Integer bonusIntelligent) {
        super(id, name, strength, dexterity, intelligent, hero);
        this.bonusIntelligent = bonusIntelligent;
    }

    public Staff(String name, Integer strength, Integer dexterity, Integer intelligent,Hero hero,  Integer bonusIntelligent) {
        this(null, name, 10,10,10,null, 2);
    }

    public Staff(String name, Integer bonusIntelligent) {
        this(null, name, 10,10,10,null, 2);
    }

    public Integer getBonusIntelligent() {
        return bonusIntelligent;
    }

    public void setBonusIntelligent(Integer bonusIntelligent) {
        this.bonusIntelligent = bonusIntelligent;
    }
}

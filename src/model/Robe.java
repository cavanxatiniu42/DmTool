package model;

import domainapp.basics.model.meta.DAttr;

/**
 * Created by Asus on 4/23/2017.
 */
public class Robe extends Armors {
    @DAttr(name = "bonusIntelligent", type = DAttr.Type.Integer, mutable =  false,min = 1, max = 10)
    private Integer bonusIntelligent;
    public Robe(String id, String name, Integer strength, Integer intelligent, Integer dexterity, Hero hero, Integer bonusIntelligent) {
        super(id, name, strength, intelligent, dexterity, hero);
        this.bonusIntelligent = bonusIntelligent;
    }

    public Robe(String name, Integer strength, Integer intelligent, Integer dexterity, Hero hero, Integer bonusIntelligent) {
        this(null, name, 10,10,10,null, 2);
    }

    public Robe(String name, Integer bonusIntelligent) {
        this(null, name, 10,10,10,null, 2);
    }

    public Integer getBonusIntelligent() {
        return bonusIntelligent;
    }

    public void setBonusIntelligent(Integer bonusIntelligent) {
        this.bonusIntelligent = bonusIntelligent;
    }
}

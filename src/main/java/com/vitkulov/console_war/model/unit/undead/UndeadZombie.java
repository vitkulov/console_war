package com.vitkulov.console_war.model.unit.undead;

import com.vitkulov.console_war.model.unit.Warrior;
import com.vitkulov.console_war.model.weapon.Spear;

public class UndeadZombie extends Warrior {

    public UndeadZombie() {
        // Установим начальное оружие и силу урона
        setPrimary(new Spear(18)); // атаковать копьём : урон 18 ед.
    }
}

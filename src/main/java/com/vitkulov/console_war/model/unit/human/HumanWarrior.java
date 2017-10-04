package com.vitkulov.console_war.model.unit.human;

import com.vitkulov.console_war.model.unit.Warrior;
import com.vitkulov.console_war.model.weapon.Sword;

public class HumanWarrior extends Warrior {

    public HumanWarrior() {
        // Установим начальное оружие и силу урона
        setPrimaryWeapon(new Sword(18)); // атаковать мечом : урон 18 ед.
    }
}

package com.vitkulov.console_war.model.unit.orc;

import com.vitkulov.console_war.model.unit.Archer;
import com.vitkulov.console_war.model.weapon.Bow;
import com.vitkulov.console_war.model.weapon.Dagger;

public class OrcArcher extends Archer {

    public OrcArcher() {
        // Установим начальное оружие и силу урона
        setPrimary(new Bow(3)); // стрелять из лука : урон 3 ед.
        setSecondary(new Dagger(2)); // ударить клинком : урон 2 ед.
    }
}

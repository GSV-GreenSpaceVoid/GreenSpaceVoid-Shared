package com.greenspacevoidshared.entities.faction.israel.ship.military.fighter;

import com.greenspacevoidnode.common.core.entity.vessel.ship.Ship;

public class Gideon extends Ship {

    public static final double baseStructureHP = 100;
    public static final double baseHullHP = 100;
    public static final double baseShieldHP = 0;
    public static final double baseShieldRegenerationRate = 0;

    public static final double baseStructureEnergyResist = 0.05;
    public static final double baseStructureThermalResist = 0.05;
    public static final double baseStructureEMPResist = 0.05;
    public static final double baseStructureExplosiveResist = 0.05;
    public static final double baseHullEnergyResist = 0.05;
    public static final double baseHullThermalResist = 0.05;
    public static final double baseHullEMPResist = 0.05;
    public static final double baseHullExplosiveResist = 0.05;
    public static final double baseShieldEnergyResist = 0.05;
    public static final double baseShieldThermalResist = 0.05;
    public static final double baseShieldEMPResist = 0.05;
    public static final double baseShieldExplosiveResist = 0.05;


    public static final double baseSensorStrength = 0.5;
    public static final double baseSensorRadius = 5000;
    public static final double baseSignatureStrength = 0.5;
    public static final double baseSignatureRadius = 2500;



    





    public static final double basePowerGrid = 1000;
    public static final double baseCapacitorCapacity = 4000;
    public static final double baseCapacitorRegenerationRate = 150;

    public static final double baseInertiaModifier = 1;
    public static final double baseSpeed = 1000;
    public static final double baseAccelerationRate = 0.1;
    public static final double baseTurnRate = 20;

    public static final double baseCargoHoldCapacity = 100;

    public static final int hullModuleSlots = 2;
    public static final int armorModuleSlots = 2;
    public static final int shieldModuleSlots = 0;
    public static final int weaponModuleSlots = 2;
    public static final int miningModuleSlots = 0;
    public static final int weaponSlots = 4;
    public static final int maxTargets = 2;

    public static final double baseRailGunDamageModifier = 0;
    public static final double baseMissileDamageModifier = 0.2;
    public static final double baseLaserDamageModifier = 0;
    public static final double baseArtilleryDamageModifier = 0.2;
    public static final double baseMiningYieldModifier = 0;
    public static final double baseRailGunROFModifier = 0;
    public static final double baseMissileROFModifier = 0;
    public static final double baseLaserROFModifier = 0;
    public static final double baseArtilleryROFModifier = 0;
    public static final double baseMiningROFModifier = 0;

    public static final double baseDroneControlRange = 0;
    public static final int maxNumberOfDrones = 0;
    public static final double baseDroneDamageModifier = 0;
    public static final double baseDroneDefenseModifier = 0;
    public static final double baseDroneSpeedModifier = 0;
    public static final double baseDroneRateOfFireModifier = 0;
    public static final double baseDroneMiningYieldModifier = 0;





















    public Gideon(String name, long systemID, long x, long y, double volume, boolean isInvincible, boolean isTargetable, boolean canMove, double baseCargoCapacity) {
        //super(name, systemID, x, y, volume, isInvincible, isTargetable, canMove, baseCargoCapacity);
    }

    @Override
    public void initializeBaseStructureHP() {
        this.setBaseStructureHP(baseStructureHP);
    }

    @Override
    public void initializeBaseHullHP() {
        this.setBaseHullHP(baseHullHP);
    }

    @Override
    public void initializeBaseShieldHP() {
        this.setBaseShieldHP(baseShieldHP);
    }

    @Override
    public void initializeBaseShieldRegenerationRate() {
        this.setBaseShieldRegenerationRate(baseShieldRegenerationRate);
    }

    @Override
    public void initializeBaseStructureEnergyResist() {
        this.setBaseStructureEnergyResist(baseStructureEnergyResist);
    }

    @Override
    public void initializeBaseStructureThermalResist() {
        this.setBaseStructureThermalResist(baseStructureThermalResist);
    }

    @Override
    public void initializeBaseStructureEMPResist() {
        this.setBaseStructureEMPResist(baseStructureEMPResist);
    }

    @Override
    public void initializeBaseStructureExplosiveResist() {
        this.setBaseStructureExplosiveResist(baseStructureExplosiveResist);
    }

    @Override
    public void initializeBaseHullEnergyResist() {
        this.setBaseHullEnergyResist(baseHullEnergyResist);
    }

    @Override
    public void initializeBaseHullThermalResist() {
        this.setBaseHullThermalResist(baseHullThermalResist);
    }

    @Override
    public void initializeBaseHullEMPResist() {
        this.setBaseStructureEMPResist(baseHullEMPResist);
    }

    @Override
    public void initializeBaseHullExplosiveResist() {
        this.setBaseHullExplosiveResist(baseHullExplosiveResist);
    }

    @Override
    public void initializeBaseShieldEnergyResist() {
        this.setBaseShieldEnergyResist(baseShieldEnergyResist);
    }

    @Override
    public void initializeBaseShieldThermalResist() {
        this.setBaseShieldThermalResist(baseShieldThermalResist);
    }

    @Override
    public void initializeBaseShieldEMPResist() {
        this.setBaseShieldEMPResist(baseShieldEMPResist);
    }

    @Override
    public void initializeBaseShieldExplosiveResist() {
        this.setBaseShieldExplosiveResist(baseShieldExplosiveResist);
    }

    @Override
    public void initializeBaseSensorStrength() {
        this.setBaseSensorStrength(baseSensorStrength);
    }

    @Override
    public void initializeBaseSensorRadius() {
        this.setBaseSensorRadius(baseSensorRadius);
    }

    @Override
    public void initializeBaseSignatureStrength() {
        this.setBaseSignatureStrength(baseSignatureStrength);
    }

    @Override
    public void initializeBaseSignatureRadius() {
        this.setBaseSignatureRadius(baseSignatureRadius);
    }

    @Override
    public void initializeBasePowerGrid() {
        this.setBasePowerGrid(basePowerGrid);
    }

    @Override
    public void initializeBaseCapacitorCapacity() {
        this.setBaseCapacitorCapacity(baseCapacitorCapacity);
    }

    @Override
    public void initializeBaseCapacitorRegenerationRate() {
        this.setBaseCapacitorRegenerationRate(baseCapacitorRegenerationRate);
    }

    @Override
    public void initializeBaseInertiaModifier() {
        this.setBaseInertiaModifier(baseInertiaModifier);
    }

    @Override
    public void initializeBaseSpeed() {
        this.setBaseSpeed(baseSpeed);
    }

    @Override
    public void initializeBaseAccelerationRate() {
        this.setBaseAccelerationRate(baseAccelerationRate);
    }

    @Override
    public void initializeBaseTurnRate() {
        this.setBaseTurnRate(baseTurnRate);
    }

    @Override
    public void initializeBaseCargoHoldCapacity() {
        this.setBaseCargoHoldCapacity(baseCargoHoldCapacity);
    }

    @Override
    public void initializeHullModuleSlots() {
        this.setHullModuleSlots(hullModuleSlots);
    }

    @Override
    public void initializeArmorModuleSlots() {
        this.setArmorModuleSlots(armorModuleSlots);
    }

    @Override
    public void initializeShieldModuleSlots() {
        this.setShieldModuleSlots(shieldModuleSlots);
    }

    @Override
    public void initializeWeaponModuleSlots() {
        this.setWeaponModuleSlots(weaponModuleSlots);
    }

    @Override
    public void initializeMiningModuleSlots() {
        this.setMiningModuleSlots(miningModuleSlots);
    }

    @Override
    public void initializeWeaponSlots() {
        this.setWeaponSlots(weaponSlots);
    }

    @Override
    public void initializeMaxTargets() {
        this.setMaxTargets(maxTargets);
    }

    @Override
    public void initializeBaseRailGunDamageModifier() {
        this.setBaseRailGunDamageModifier(baseRailGunDamageModifier);
    }

    @Override
    public void initializeBaseMissileDamageModifier() {
        this.setBaseMissileDamageModifier(baseMissileDamageModifier);
    }

    @Override
    public void initializeBaseLaserDamageModifier() {
        this.setBaseLaserDamageModifier(baseLaserDamageModifier);
    }

    @Override
    public void initializeBaseArtilleryDamageModifier() {
        this.setBaseArtilleryDamageModifier(baseArtilleryDamageModifier);
    }

    @Override
    public void initializeBaseMiningYieldModifier() {
        this.setBaseMiningYieldModifier(baseMiningYieldModifier);
    }

    @Override
    public void initializeBaseRailGunROFModifier() {
        this.setBaseRailGunROFModifier(baseRailGunROFModifier);
    }

    @Override
    public void initializeBaseMissileROFModifier() {
        this.setBaseMissileROFModifier(baseMissileROFModifier);
    }

    @Override
    public void initializeBaseLaserROFModifier() {
        this.setBaseLaserROFModifier(baseLaserROFModifier);
    }

    @Override
    public void initializeBaseArtilleryROFModifier() {
        this.setBaseArtilleryROFModifier(baseArtilleryROFModifier);
    }

    @Override
    public void initializeBaseMiningROFModifier() {
        this.setBaseMiningROFModifier(baseMiningROFModifier);
    }

    @Override
    public void initializeBaseDroneControlRange() {
        this.setBaseDroneControlRange(baseDroneControlRange);
    }

    @Override
    public void initializeMaxNumberOfDrones() {
        this.setMaxNumberOfDrones(maxNumberOfDrones);
    }

    @Override
    public void initializeBaseDroneDamageModifier() {
        this.setBaseDroneDamageModifier(baseDroneDamageModifier);
    }

    @Override
    public void initializeBaseDroneDefenseModifier() {
        this.setBaseDroneDefenseModifier(baseDroneDefenseModifier);
    }

    @Override
    public void initializeBaseDroneSpeedModifier() {
        this.setBaseDroneSpeedModifier(baseDroneSpeedModifier);
    }

    @Override
    public void initializeBaseDroneRateOfFireModifier() {
        this.setBaseDroneRateOfFireModifier(baseDroneRateOfFireModifier);
    }

    @Override
    public void initializeBaseDroneMiningYieldModifier() {
        this.setBaseDroneMiningYieldModifier(baseDroneMiningYieldModifier);
    }


}

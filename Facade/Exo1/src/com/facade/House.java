package com.facade;

public class House {
    private PlumbingSystem plumbingSystem = new PlumbingSystem();
    private ElectricalSystem electricalSystem = new ElectricalSystem();

    public void turnOnSystem(){

        this.electricalSystem.setVoltage(120);
        this.electricalSystem.turnOn();

        this.plumbingSystem.setPressure(500);
        this.plumbingSystem.turnOn();
    }

    public void turnOffSystem(){
            this.electricalSystem.turnOff();
            this.plumbingSystem.turnOff();

    }

}

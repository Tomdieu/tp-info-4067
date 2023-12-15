package com.command;

import com.reciever.Reciever;

public class ConcreteCommand implements Command {

    private final Reciever reciever;

    public ConcreteCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        reciever.action();
    }
    
}

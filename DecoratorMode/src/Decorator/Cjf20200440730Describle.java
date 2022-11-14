package Decorator;

import Component.Cjf20200440730Man;

public abstract class Cjf20200440730Describle extends Cjf20200440730Man {

    private Cjf20200440730Man man;

    public void setMan(Cjf20200440730Man man) {
        this.man = man;
    }

    @Override
    public void Operation() {
        if(man!=null) {
            man.Operation();
        }
    }
}

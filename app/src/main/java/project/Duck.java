package project;

interface IFlyBehavior {
    void fly();
}

class FlyNormally implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying normally.");
    }
}

class FlyWithJetPack implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a jet pack.");
    }
}

interface IQuackBehavior {
    void quack();
}

class QuackNormally implements IQuackBehavior {
    public void quack() {
        System.out.println("I'm quacking normally.");
    }
}

class QuackLoudly implements IQuackBehavior {
    public void quack() {
        System.out.println("I'm quacking loudly.");
    }
}

interface IDisplayBehavior {
    void display();
}

class DisplayNormally implements IDisplayBehavior {
    public void display() {
        System.out.println("I'm displaying normally.");
    }
}

class DisplayWithColors implements IDisplayBehavior {
    public void display() {
        System.out.println("I'm displaying with colors.");
    }
}

public class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    IDisplayBehavior displayBehavior;

    Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void display() {
        displayBehavior.display();
    }
}

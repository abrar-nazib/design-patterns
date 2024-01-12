package project;

class JetPackDuck extends Duck {
    JetPackDuck() {
        super(new FlyWithJetPack(), new QuackLoudly(), new DisplayWithColors());
    }
}

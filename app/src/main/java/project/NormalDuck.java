package project;

class NormalDuck extends Duck {
    NormalDuck() {
        super(new FlyNormally(), new QuackNormally(), new DisplayNormally());
    }
}

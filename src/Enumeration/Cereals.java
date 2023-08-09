package Enumeration;

public enum Cereals {
    CAPATAIN_CRUNCH(50),
    FROOT_LOOPS(60),
    REESES_PUFFS(100),
    COCOA_PUFFS(40);

    //Just like classes, an Enum can have fields, constructors and methods
    final int levelOfDeliciousness;  //make it final so that it cannot be changed

    Cereals (int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

    //When we create a constructor with a parameter like the above,
    //So that whenever we create an enum's object, we need to pass in its levelOfDeliciousness
    //So we need to provide the levelOfDeliciousness for all the constants in the enum

}

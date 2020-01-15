package com.company;

public class FactoryMethod2 {

    public static void main(String[] args) {
        Ivan ivan = new Ivan();
        ivan.getIDE();//eclipse

        Alla alla = new Alla();
        alla.getIDE();//intellij
    }
}


abstract class Employee { //Programming Language
    abstract IDE getIDE();
}

class Ivan extends Employee { //Java
    @Override
    IDE getIDE() {            //Environment
        return new Eclipse(); //JDK
    }
}

class Alla extends Employee { //C#
    @Override
    IDE getIDE() {              //Environment
        return new Intellij();  //.NET
    }
}



abstract class IDE {
}

class Intellij extends IDE {}
class Eclipse extends IDE {}
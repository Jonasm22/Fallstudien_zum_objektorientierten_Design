package Aufgabe_4;

public abstract  class Animal implements IDescribable{
    public abstract  String getSound();
}


class Dog extends Animal{

    @Override
    public String getSound() {
        return " Woof, Woof";
    }

    @Override
    public String describe() {
        return "I am a Dog: ";
    }
}

class Cat extends Animal{

    @Override
    public String getSound() {
        return " Meow Meow";
    }

    @Override
    public String describe() {
        return "I am an Orange Cat ";
    }
}
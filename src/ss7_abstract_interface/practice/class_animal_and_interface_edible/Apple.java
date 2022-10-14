package ss7_abstract_interface.practice.class_animal_and_interface_edible;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}

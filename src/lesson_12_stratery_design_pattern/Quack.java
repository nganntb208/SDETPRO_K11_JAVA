package lesson_12_stratery_design_pattern;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack!!");
    }
}
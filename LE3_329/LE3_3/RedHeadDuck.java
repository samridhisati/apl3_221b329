class RedHeadDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking.");
    }
}

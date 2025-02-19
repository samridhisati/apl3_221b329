class Pandav extends Bharatvanshi {
    boolean isKind;
    public Pandav(String name, boolean isKind) {
        super(name);
        this.isKind = isKind;
    }
    @Override
    public String fight() {
        return this.name + " fights bravely!";
    }
    @Override
    public String obey() {
        return this.name + " obeys the rules with dedication.";
    }
    public String kind() {
        return isKind ? this.name + " is kind!" : this.name + " is not very kind.";
    }
}
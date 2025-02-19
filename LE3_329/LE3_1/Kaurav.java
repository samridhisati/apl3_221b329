
class Kaurav extends Bharatvanshi {

    public Kaurav(String name) {
        super(name);
    }

    @Override
    public String fight() {
        return this.name + " fights fiercely!";
    }
    @Override
    public String obey() {
        return this.name + " refuses to obey.";
    }
}
abstract class Chambre {
    public abstract String getType();
    public abstract String getServices();

    @Override
    public String toString() {
        return "Type de chambre: " + this.getType() + ", Services: " + this.getServices();
    }
}
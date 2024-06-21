class ChambreStandard extends Chambre {
    private String type = "Chambre Standard";
    private String services = "Petit déjeuner, Wifi";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getServices() {
        return services;
    }
}
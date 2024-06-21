class Suite extends Chambre {
    private String type = "Suite";
    private String services = "Petit déjeuner, Wifi, Accès au spa";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getServices() {
        return services;
    }
}
class HotelReservation {
    private Chambre chambre;
    private StrategieTarification strategieTarification;
    private boolean breakfastIncluded;
    private boolean hasWifi;
    private boolean accessToGym;

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public void setStrategieTarification(StrategieTarification strategieTarification) {
        this.strategieTarification = strategieTarification;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setAccessToGym(boolean accessToGym) {
        this.accessToGym = accessToGym;
    }

    public double getPrice(double basePrice) {
        return strategieTarification.calculatePrice(basePrice);
    }

    @Override
    public String toString() {
        return "Reservation: " + chambre.toString() +
                ", Petit déjeuner inclus: " + breakfastIncluded +
                ", Wifi: " + hasWifi +
                ", Accès à la salle de sport: " + accessToGym +
                ", Prix: " + getPrice(200);
    }
}

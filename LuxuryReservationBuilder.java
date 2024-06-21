class LuxuryReservationBuilder extends ReservationBuilder {
    public void buildRoom() {
        reservation.setChambre(new SuiteFactory().creerChambre());
    }

    public void buildBreakfastIncluded() {
        reservation.setBreakfastIncluded(true);
    }

    public void buildWifi() {
        reservation.setHasWifi(true);
    }

    public void buildGymAccess() {
        reservation.setAccessToGym(true);
    }
}
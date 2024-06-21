class BudgetReservationBuilder extends ReservationBuilder {
    public void buildRoom() {
        reservation.setChambre(new ChambreStandardFactory().creerChambre());
    }

    public void buildBreakfastIncluded() {
        reservation.setBreakfastIncluded(false);
    }

    public void buildWifi() {
        reservation.setHasWifi(true);
    }

    public void buildGymAccess() {
        reservation.setAccessToGym(false);
    }
}
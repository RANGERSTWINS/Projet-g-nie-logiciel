abstract class ReservationBuilder {
    protected HotelReservation reservation;

    public HotelReservation getReservation() {
        return reservation;
    }

    public void createNewReservationProduct() {
        reservation = new HotelReservation();
    }

    public abstract void buildRoom();
    public abstract void buildBreakfastIncluded();
    public abstract void buildWifi();
    public abstract void buildGymAccess();
}

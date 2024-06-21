class ReservationDirector {
    private ReservationBuilder reservationBuilder;

    public void setReservationBuilder(ReservationBuilder rb) {
        reservationBuilder = rb;
    }

    public HotelReservation getReservation() {
        return reservationBuilder.getReservation();
    }

    public void constructReservation() {
        reservationBuilder.createNewReservationProduct();
        reservationBuilder.buildRoom();
        reservationBuilder.buildBreakfastIncluded();
        reservationBuilder.buildWifi();
        reservationBuilder.buildGymAccess();
    }
}

class TarificationOffreSpeciale implements StrategieTarification {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.8; // Réduction de 20% pour les offres spéciales
    }
}
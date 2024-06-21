class TarificationSaisonniere implements StrategieTarification {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 1.2; // Augmentation de 20% pendant la haute saison
    }
}
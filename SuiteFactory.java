class SuiteFactory implements ChambreFactory {
    @Override
    public Chambre creerChambre() {
        return new Suite();
    }
}

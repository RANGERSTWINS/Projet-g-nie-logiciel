class ChambreStandardFactory implements ChambreFactory {
    @Override
    public Chambre creerChambre() {
        return new ChambreStandard();
    }
}
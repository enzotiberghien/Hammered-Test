package se.hkr;

public abstract class Drink implements MassOfRawAlcohol<Drink> {

    double volumeInMillilitres, alcoholContentInPercent;

    public Drink (double volumeInMillilitres, double alcoholContentInPercent) {
        this.volumeInMillilitres = volumeInMillilitres;
        this.alcoholContentInPercent = alcoholContentInPercent;
    }

    public abstract double findMassOfRawAlcohol(Drink drink);
}

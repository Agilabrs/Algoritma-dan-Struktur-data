package ArrayBalok;

public abstract class BangunRuang {
    abstract double hitungLuasPermukaan();

    abstract double hitungVolume();
}

class Kerucut extends BangunRuang {
    private double jariJari;
    private double sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    @Override
    double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}

class LimasSegiEmpatSamaSisi extends BangunRuang {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * Math.pow(panjangSisiAlas, 2);
    }

    @Override
    double hitungVolume() {
        return (1.0 / 2.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}

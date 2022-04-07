public class AM extends A {
    private double powerCV;

    AM(String sigla, double powerCV) {
        super(sigla);
        this.powerCV = powerCV;
    }

    public double getPowerCV() {
        return this.powerCV;
    }

    public void setPowerCV(double powerCV) {
        this.powerCV = powerCV;
    }

    public boolean equals(Object am2) {
        if (am2 instanceof AM) {
            if (((AM) am2).getPowerCV() == this.getPowerCV()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return "Aeromotore con sigla " + this.getSigla() + " e potenza " + this.getPowerCV();
    }

    @Override
    public boolean superiore(CMP x) {
        if (x == null) {
            return false;
        } else if (!(this.getClass().equals(x.getClass()))) {
            return false;
        } else {
            return this.powerCV > ((AM) x).powerCV;
        }
    }
}

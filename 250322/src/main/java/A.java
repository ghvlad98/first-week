public abstract class A implements CMP {
    private String sigla;

    A(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public boolean equals(Object aer2) {
        if (aer2 instanceof A) {
            if (((A) aer2).getSigla() == this.getSigla()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return "Aeromobile con sigla " + this.sigla;
    }

    public abstract boolean superiore(CMP x);
}

public class AL extends A {
    private int effAer;

    AL(String sigla, int effAer) {
        super(sigla);
        this.effAer = effAer;
    }

    public int getEffAer() {
        return effAer;
    }

    public void setEffAer(int effAer) {
        this.effAer = effAer;
    }

    public boolean equals(Object al2) {
        if (al2 instanceof AL) {
            if (((AL) al2).getEffAer() == this.getEffAer()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return "Aliante con sigla " + this.getSigla() + " e efficenza " + this.getEffAer();
    }

    @Override
    public boolean superiore(CMP x) {
        if (x == null) {
            return false;
        } else if (!(this.getClass().equals(x.getClass()))) {
            return false;
        } else {
            return this.effAer > ((AL) x).effAer;
        }
    }
}

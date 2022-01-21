package no.hvl.dat109.Controller;

public class Rute {

    private int pos;

    public Rute(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object rute) {
        return pos == ((Rute)rute).getPos();
    }

    @Override
    public int hashCode() {
        Integer temp = pos;
        return temp.hashCode();
    }
}

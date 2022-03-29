import java.util.Objects;

public class Komplex {
    double re;
    double im;


    @Override
    public String toString() {
        return re + "+" + im + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.re, re) == 0 && Double.compare(komplex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public Komplex(double re, double im) {
        this.re = re;
        this.im = im;

    }

    public Komplex add(Komplex b) {
        return new Komplex(re + b.re, im + b.im);
    }

    public Komplex multiply(Komplex b) {
        return new Komplex(re*b.re - im*b.im, re*b.im + b.re*im);
    }

    public double arg() {
        return Math.atan(im/re);
    }
}

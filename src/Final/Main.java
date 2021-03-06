package Final;

public class Main {
    public static void main(String[] args) {
        Simulated sa = new Simulated(10);
        Problem p = new Problem() {
            @Override
            public double fit(double x) {
                return x*x*x*x + 12*x*x*x + 80*x*x + 12*x + 20;
                //
            }

            @Override
            public boolean isNeighborBetter(double f0, double f1) {
                return f0 < f1;
            }
        };
        double x = sa.solve(p, 100, 0.99, 0, 0, 31);
        System.out.println(x);
        System.out.println(p.fit(x));
        System.out.println(sa.hist);
    }
}

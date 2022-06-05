public class Alphabet {
    //TODO
    private int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    public int setA(int a) {
        this.a = a;
        return getSum();
    }
    public int setW(int w) {
        this.w = w;
        return getSum();
    }

    public int setS(int s) {
        this.s = s;
        return getSum();
    }
    public int setD(int d) {
        this.d = d;
        return getSum();
    }

        public int getSum() {
            return a + b + c + d + e + f + g + h + i + j + k + l +
                    m + n + o + p + q + r + s + t + u + v +
                    w + x + y + z;
        }
}

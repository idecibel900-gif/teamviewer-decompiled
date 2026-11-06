package o;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends io.sentry.l6 {
    public static t3 c;

    public final boolean D(int i) {
        if (i <= 0 || l().charAt(i - 1) == '\n') {
            return false;
        }
        return i == l().length() || l().charAt(i) == '\n';
    }

    @Override // io.sentry.l6
    public final int[] g(int i) {
        int length = l().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && l().charAt(i) == '\n' && (l().charAt(i) == '\n' || (i != 0 && l().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !D(i2)) {
            i2++;
        }
        return k(i, i2);
    }

    @Override // io.sentry.l6
    public final int[] u(int i) {
        int length = l().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && l().charAt(i - 1) == '\n' && !D(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (l().charAt(i2) == '\n' || (i2 != 0 && l().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return k(i2, i);
    }
}

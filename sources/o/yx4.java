package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yx4 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException(fx3.d(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(fx3.f(i, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException(fx3.d(i, i2, "toIndex (", ") is more than than the list size (", ")"));
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException(fx3.d(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}

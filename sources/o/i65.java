package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i65 {
    public static final Object[] a = new Object[0];
    public static final zw4 b = new zw4(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            hk0.r(fx3.d(i, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            hk0.g(fx3.d(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            hk0.r(fx3.f(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}

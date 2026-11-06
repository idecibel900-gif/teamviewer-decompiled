package o;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mv0 extends qf0 {
    public static int Z(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}

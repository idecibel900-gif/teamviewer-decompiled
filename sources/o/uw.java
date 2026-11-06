package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uw implements Iterable, su3 {
    public int a() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i, xp xpVar) {
        throw new IllegalStateException();
    }

    public Object get(int i) {
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new w92();
    }
}

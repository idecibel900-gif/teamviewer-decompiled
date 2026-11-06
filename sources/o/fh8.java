package o;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fh8 {
    public final WeakReference a;
    public final int b;

    public fh8(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fh8) && this.a.get() == ((fh8) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}

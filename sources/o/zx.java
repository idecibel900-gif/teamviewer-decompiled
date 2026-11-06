package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class zx {
    public volatile Object a;

    static {
        AtomicReferenceFieldUpdater.newUpdater(zx.class, Object.class, "a");
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}

package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {
    public final g m = new g();
    public final g n = new g();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int iCompare = Long.compare(this.m.f123o, bVar.m.f123o);
        return iCompare == 0 ? Long.compare(this.n.f123o, bVar.n.f123o) : iCompare;
    }
}

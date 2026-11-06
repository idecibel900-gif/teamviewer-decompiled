package o;

/* JADX INFO: loaded from: classes.dex */
public final class wx4 extends g2 {
    public final bg5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f2457o;

    public wx4(Object obj) {
        super((byte) 7);
        this.n = h57.p(obj);
        this.f2457o = h57.p(obj);
    }

    @Override // o.g2
    public final Object p0() {
        return this.n.getValue();
    }

    @Override // o.g2
    public final Object r0() {
        return this.f2457o.getValue();
    }

    @Override // o.g2
    public final void y0(Object obj) {
        this.n.setValue(obj);
    }
}

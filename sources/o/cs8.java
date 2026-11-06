package o;

/* JADX INFO: loaded from: classes.dex */
public final class cs8 extends vq8 {
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f555o;

    public cs8(Object obj) {
        super((byte) 1);
        this.n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f555o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f555o) {
            yq4.p();
            return null;
        }
        this.f555o = true;
        return this.n;
    }
}

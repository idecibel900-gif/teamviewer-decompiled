package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ly2 implements Comparable {
    public final short m;
    public final yl8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1418o;

    /* JADX WARN: Multi-variable type inference failed */
    public ly2(int i, yl8 yl8Var, boolean z) {
        this.m = i;
        this.n = yl8Var;
        this.f1418o = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.m - ((ly2) obj).m;
    }
}

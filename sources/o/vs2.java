package o;

/* JADX INFO: loaded from: classes.dex */
public final class vs2 implements Comparable {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2340o;
    public final String p;

    public vs2(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.m = i;
        this.n = i2;
        this.f2340o = str;
        this.p = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vs2 vs2Var = (vs2) obj;
        vs2Var.getClass();
        int i = this.m - vs2Var.m;
        return i == 0 ? this.n - vs2Var.n : i;
    }
}

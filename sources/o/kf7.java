package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class kf7 implements ug6 {
    public final bf7 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1261o;

    public kf7(bf7 bf7Var, String str) {
        this.m = bf7Var;
        this.n = str;
    }

    public final void e() {
        if (this.f1261o) {
            us1.P(21, "statement is closed");
            throw null;
        }
    }
}

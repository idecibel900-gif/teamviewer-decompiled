package o;

/* JADX INFO: loaded from: classes.dex */
public interface eg6 {
    static fs4 a(fs4 fs4Var, float f) {
        if (f <= 0.0d) {
            ii3.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return fs4Var.f(new s14(f, true));
    }
}

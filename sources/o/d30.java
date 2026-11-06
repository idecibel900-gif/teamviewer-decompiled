package o;

/* JADX INFO: loaded from: classes.dex */
public class d30 {
    public static final b30 c = new b30(-1, false, false);
    public final boolean a;
    public final boolean b;

    static {
        new d30(-1, true, false);
        new d30(76, false, true);
        new d30(64, false, true);
    }

    public d30(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            hk0.g("Failed requirement.");
            throw null;
        }
    }
}

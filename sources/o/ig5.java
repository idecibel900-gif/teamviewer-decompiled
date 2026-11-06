package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ig5 {
    public static final ig5 c;
    public static final ig5 d;
    public static final ig5 e = new ig5(0, false);
    public static final ig5 f = new ig5(1, false);
    public static final ig5 g = new ig5(1, true);
    public final boolean a;
    public final boolean b;

    static {
        boolean z = false;
        c = new ig5(z, z);
        boolean z2 = true;
        d = new ig5(z2, z2);
    }

    public /* synthetic */ ig5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public void a(ly lyVar) {
        if (this.b) {
            return;
        }
        for (int i = 0; i < lyVar.m; i++) {
            String str = lyVar.n[i];
            if (!ly.n(str)) {
                lyVar.n[i] = us1.F(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ig5(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}

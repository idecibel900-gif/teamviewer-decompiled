package o;

/* JADX INFO: loaded from: classes2.dex */
public final class c58 {
    public static final c58 k = new c58(false, false, false, false, false, new c58(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final c58 f;
    public final boolean g;
    public final c58 h;
    public final c58 i;
    public final boolean j;

    public c58(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c58 c58Var, boolean z6, c58 c58Var2, c58 c58Var3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        c58Var = (i & 32) != 0 ? null : c58Var;
        z6 = (i & 64) != 0 ? true : z6;
        c58Var2 = (i & 128) != 0 ? c58Var : c58Var2;
        c58Var3 = (i & 256) != 0 ? c58Var : c58Var3;
        boolean z7 = (i & 512) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = c58Var;
        this.g = z6;
        this.h = c58Var2;
        this.i = c58Var3;
        this.j = z7;
    }
}

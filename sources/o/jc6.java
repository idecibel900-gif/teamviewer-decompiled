package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jc6 {
    public ab6 a;
    public yw5 b;
    public String d;
    public s43 e;
    public n57 h;
    public lc6 i;
    public lc6 j;
    public lc6 k;
    public long l;
    public long m;
    public io.sentry.z7 n;
    public int c = -1;
    public nc6 g = nc6.m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v08 f1148o = v08.j;
    public nm f = new nm((byte) 5);

    public static void b(String str, lc6 lc6Var) {
        if (lc6Var != null) {
            if (lc6Var.u != null) {
                gk0.h(str.concat(".networkResponse != null"));
            } else if (lc6Var.v != null) {
                gk0.h(str.concat(".cacheResponse != null"));
            } else {
                if (lc6Var.w == null) {
                    return;
                }
                gk0.h(str.concat(".priorResponse != null"));
            }
        }
    }

    public final lc6 a() {
        int i = this.c;
        if (i < 0) {
            an4.p(this.c, "code < 0: ");
            return null;
        }
        ab6 ab6Var = this.a;
        if (ab6Var == null) {
            hk0.l("request == null");
            return null;
        }
        yw5 yw5Var = this.b;
        if (yw5Var == null) {
            hk0.l("protocol == null");
            return null;
        }
        String str = this.d;
        if (str == null) {
            hk0.l("message == null");
            return null;
        }
        s43 s43Var = this.e;
        nm nmVar = this.f;
        nmVar.getClass();
        return new lc6(ab6Var, yw5Var, str, i, s43Var, i67.i(nmVar), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f1148o);
    }
}

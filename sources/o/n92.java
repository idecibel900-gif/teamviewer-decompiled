package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n92 {
    public byte a = 1;
    public final cr4 b;
    public cr4 c;
    public cr4 d;
    public int e;
    public int f;

    public n92(cr4 cr4Var) {
        this.b = cr4Var;
        this.c = cr4Var;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        ar4 ar4VarB = this.c.b.b();
        int iA = ar4VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) ar4VarB.p).get(iA + ar4VarB.m) == 0) || this.e == 65039;
    }
}

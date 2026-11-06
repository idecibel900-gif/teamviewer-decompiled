package io.sentry;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements j2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ r2 n;

    public /* synthetic */ g2(p2 p2Var, r2 r2Var) {
        this.m = (byte) 1;
        this.n = r2Var;
    }

    @Override // io.sentry.j2
    public final Object b() throws IOException {
        byte b = this.m;
        r2 r2Var = this.n;
        switch (b) {
            case 0:
                return r2Var.r();
            case 1:
                double dNextDouble = r2Var.nextDouble();
                int i = (int) dNextDouble;
                return ((double) i) == dNextDouble ? Integer.valueOf(i) : Double.valueOf(dNextDouble);
            default:
                boolean zF = r2Var.m.F();
                r2Var.j();
                return Boolean.valueOf(zF);
        }
    }

    public /* synthetic */ g2(r2 r2Var, byte b) {
        this.m = b;
        this.n = r2Var;
    }
}

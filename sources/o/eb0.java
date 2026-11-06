package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class eb0 {
    public final xx4 a;

    public eb0(byte b) {
        switch (b) {
            case 1:
                this.a = new xx4(new a34[16]);
                break;
            default:
                this.a = new xx4(new za1[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        xx4 xx4Var = this.a;
        int i = xx4Var.f2559o;
        fl0[] fl0VarArr = new fl0[i];
        for (int i2 = 0; i2 < i; i2++) {
            fl0VarArr[i2] = ((za1) xx4Var.m[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            fl0VarArr[i3].f(cancellationException);
        }
        if (xx4Var.f2559o == 0) {
            return;
        }
        ni3.c("uncancelled requests present");
    }

    public void b() {
        xx4 xx4Var = this.a;
        yk3 yk3VarB0 = ct1.b0(0, xx4Var.f2559o);
        int i = yk3VarB0.m;
        int i2 = yk3VarB0.n;
        if (i <= i2) {
            while (true) {
                ((za1) xx4Var.m[i]).b.resumeWith(f88.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xx4Var.g();
    }
}

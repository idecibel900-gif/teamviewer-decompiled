package o;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yk2 extends nj2 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, jc1 jc1Var) {
        xk2 xk2Var;
        FileOutputStream fileOutputStreamG;
        FileOutputStream fileOutputStream;
        Throwable th;
        if (jc1Var instanceof xk2) {
            xk2Var = (xk2) jc1Var;
            int i = xk2Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk2Var.q = i - Integer.MIN_VALUE;
            } else {
                xk2Var = new xk2(this, jc1Var);
            }
        } else {
            xk2Var = new xk2(this, jc1Var);
        }
        Object obj2 = xk2Var.f2525o;
        int i2 = xk2Var.q;
        f88 f88Var = f88.a;
        if (i2 == 0) {
            ct1.a0(obj2);
            if (this.b.get()) {
                hk0.l("This scope has already been closed.");
                return null;
            }
            File file = this.a;
            fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(file), file);
            try {
                q78 q78Var = new q78(fileOutputStreamG);
                xk2Var.m = fileOutputStreamG;
                xk2Var.n = fileOutputStreamG;
                xk2Var.q = 1;
                d82.A(obj, q78Var);
                ne1 ne1Var = ne1.m;
                if (f88Var == ne1Var) {
                    return ne1Var;
                }
                fileOutputStream = fileOutputStreamG;
            } catch (Throwable th2) {
                fileOutputStream = fileOutputStreamG;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStreamG = xk2Var.n;
            fileOutputStream = xk2Var.m;
            try {
                ct1.a0(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    kh.n(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStreamG.getFD().sync();
        kh.n(fileOutputStream, null);
        return f88Var;
    }
}

package o;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j28 {
    public static volatile ng1 e;
    public final du0 a;
    public final du0 b;
    public final uk1 c;
    public final fp1 d;

    public j28(du0 du0Var, du0 du0Var2, uk1 uk1Var, fp1 fp1Var, pn5 pn5Var) {
        this.a = du0Var;
        this.b = du0Var2;
        this.c = uk1Var;
        this.d = fp1Var;
        ((Executor) pn5Var.m).execute(new wu6(pn5Var, (byte) 7));
    }

    public static j28 a() {
        ng1 ng1Var = e;
        if (ng1Var != null) {
            return (j28) ng1Var.r.get();
        }
        hk0.l("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (j28.class) {
                try {
                    if (e == null) {
                        t60 t60Var = new t60();
                        context.getClass();
                        t60Var.a = context;
                        e = t60Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final i28 c(ci0 ci0Var) {
        Set setUnmodifiableSet = ci0Var instanceof ci0 ? Collections.unmodifiableSet(ci0.d) : Collections.singleton(new ta2("proto"));
        iu iuVarA = u00.a();
        ci0Var.getClass();
        iuVarA.f1103o = "cct";
        String str = ci0Var.a;
        String str2 = ci0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        iuVarA.p = to7.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new i28(setUnmodifiableSet, iuVarA.f(), this);
    }
}

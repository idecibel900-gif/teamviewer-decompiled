package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ds3 implements dd5 {
    public final xd4 a;
    public final qs4 b;
    public io.sentry.android.replay.screenshot.k c;
    public final h50 d;

    public ds3(xd4 xd4Var, f71 f71Var, qs4 qs4Var) {
        this.a = xd4Var;
        this.b = qs4Var;
        this.d = xd4Var.c(new t(this, (byte) 2));
    }

    @Override // o.dd5
    public final boolean a(ht2 ht2Var) {
        ht2Var.getClass();
        h50 h50Var = this.d;
        Object obj = ((ConcurrentHashMap) h50Var.f950o).get(ht2Var);
        return ((obj == null || obj == wd4.n) ? c(ht2Var) : (ad5) h50Var.invoke(ht2Var)) == null;
    }

    @Override // o.dd5
    public final void b(ht2 ht2Var, ArrayList arrayList) throws Throwable {
        ht2Var.getClass();
        Object objInvoke = this.d.invoke(ht2Var);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    public final eg0 c(ht2 ht2Var) throws IOException {
        InputStream inputStreamA;
        ht2Var.getClass();
        if (ht2Var.h(t87.k)) {
            yf0.m.getClass();
            inputStreamA = gg0.a(yf0.a(ht2Var));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return g68.m(ht2Var, this.a, this.b, inputStreamA);
        }
        return null;
    }

    @Override // o.dd5
    public final Collection f(ht2 ht2Var, Function1 function1) {
        ht2Var.getClass();
        return la2.m;
    }
}

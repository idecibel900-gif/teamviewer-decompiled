package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zw5 {
    public final m54 a;

    public zw5(Function0 function0) {
        this.a = new m54(function0);
    }

    public dx5 a(Object obj) {
        return new dx5(this, obj, obj == null, null, null, true);
    }

    public lb8 b() {
        return this.a;
    }

    public final dx5 c(Function1 function1) {
        return new dx5(this, null, false, null, function1, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 o.lb8) = (r4v6 o.lb8), (r4v7 o.lb8) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final lb8 d(dx5 dx5Var, lb8 lb8Var) {
        f11 f11Var;
        lb8 lb8Var2;
        ca7 ca7Var;
        i72 i72Var;
        lb8 lb8Var3 = null;
        lb8Var3 = null;
        lb8Var3 = null;
        lb8Var3 = null;
        lb8Var3 = null;
        lb8Var3 = null;
        if (lb8Var instanceof i72) {
            if (dx5Var.e) {
                i72Var = (i72) lb8Var;
                i72Var.a.setValue(dx5Var.a());
            }
        } else if (lb8Var instanceof ca7) {
            if ((dx5Var.b || dx5Var.f != null) && !dx5Var.e) {
                ca7Var = (ca7) lb8Var;
                if (im3.n(dx5Var.a(), ca7Var.a)) {
                    lb8Var2 = f11Var;
                    lb8Var2 = ca7Var;
                    lb8Var3 = lb8Var2;
                }
            }
        } else if (lb8Var instanceof f11) {
            f11Var = (f11) lb8Var;
            if (dx5Var.d == f11Var.a) {
                lb8Var2 = f11Var;
                lb8Var2 = ca7Var;
                lb8Var3 = lb8Var2;
            }
        }
        if (lb8Var3 != null) {
            lb8Var3 = i72Var;
            return lb8Var3;
        }
        if (!dx5Var.e) {
            Function1 function1 = dx5Var.d;
            if (function1 != null) {
                lb8Var3 = i72Var;
                return new f11(function1);
            }
            lb8Var3 = i72Var;
            return new ca7(dx5Var.a());
        }
        Object obj = dx5Var.f;
        c57 c57Var = dx5Var.c;
        if (c57Var == null) {
            lb8Var3 = i72Var;
            c57Var = yl7.X;
        }
        lb8Var3 = i72Var;
        return new i72(new bg5(obj, c57Var));
    }
}

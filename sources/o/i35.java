package o;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class i35 implements xl0 {
    public final h58 a;
    public Function0 b;
    public final i35 c;
    public final d58 d;
    public final u14 e;

    public i35(h58 h58Var, Function0 function0, i35 i35Var, d58 d58Var) {
        h58Var.getClass();
        this.a = h58Var;
        this.b = function0;
        this.c = i35Var;
        this.d = d58Var;
        this.e = ds1.X(l54.m, new a3(this, (byte) 28));
    }

    @Override // o.k48
    public final ys0 a() {
        return null;
    }

    @Override // o.k48
    public final Collection b() {
        List list = (List) this.e.getValue();
        return list == null ? ea2.m : list;
    }

    @Override // o.k48
    public final boolean c() {
        return false;
    }

    @Override // o.xl0
    public final h58 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i35.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        i35 i35Var = (i35) obj;
        i35 i35Var2 = this.c;
        if (i35Var2 != null) {
            this = i35Var2;
        }
        i35 i35Var3 = i35Var.c;
        if (i35Var3 != null) {
            obj = i35Var3;
        }
        return this == obj;
    }

    @Override // o.k48
    public final List getParameters() {
        return ea2.m;
    }

    @Override // o.k48
    public final wy3 h() {
        oz3 oz3VarB = this.a.b();
        oz3VarB.getClass();
        return n37.m(oz3VarB);
    }

    public final int hashCode() {
        i35 i35Var = this.c;
        return i35Var != null ? i35Var.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public /* synthetic */ i35(h58 h58Var, kp1 kp1Var, d58 d58Var, int i) {
        this(h58Var, (i & 2) != 0 ? null : kp1Var, (i35) null, (i & 8) != 0 ? null : d58Var);
    }
}

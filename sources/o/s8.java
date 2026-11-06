package o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends vp3 {
    public final /* synthetic */ v8 a;
    public final /* synthetic */ vp3 b;
    public final /* synthetic */ v8 c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ Type e;

    public s8(v8 v8Var, vp3 vp3Var, pt4 pt4Var, v8 v8Var2, Set set, Type type) {
        this.a = v8Var;
        this.b = vp3Var;
        this.c = v8Var2;
        this.d = set;
        this.e = type;
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws IOException {
        v8 v8Var = this.c;
        if (v8Var == null) {
            return this.b.a(nr3Var);
        }
        if (!v8Var.g && nr3Var.c0() == 9) {
            nr3Var.J();
            return null;
        }
        try {
            return v8Var.b(nr3Var);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cause);
            String strZ = nr3Var.z();
            sb.append(" at ");
            sb.append(strZ);
            throw new gq3(sb.toString(), cause);
        }
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) throws IOException {
        v8 v8Var = this.a;
        if (v8Var == null) {
            this.b.c(pr3Var, obj);
            return;
        }
        if (!v8Var.g && obj == null) {
            pr3Var.J();
            return;
        }
        try {
            v8Var.d(pr3Var, obj);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cause);
            String strF = pr3Var.F();
            sb.append(" at ");
            sb.append(strF);
            throw new gq3(sb.toString(), cause);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.d + "(" + this.e + ")";
    }
}

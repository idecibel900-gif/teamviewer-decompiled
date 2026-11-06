package o;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class nt4 extends vp3 {
    public final Type a;
    public final String b;
    public final Object c;
    public vp3 d;

    public nt4(Type type, String str, Object obj) {
        this.a = type;
        this.b = str;
        this.c = obj;
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) {
        vp3 vp3Var = this.d;
        if (vp3Var != null) {
            return vp3Var.a(nr3Var);
        }
        hk0.l("JsonAdapter isn't ready");
        return null;
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        vp3 vp3Var = this.d;
        if (vp3Var != null) {
            vp3Var.c(pr3Var, obj);
        } else {
            hk0.l("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        vp3 vp3Var = this.d;
        return vp3Var != null ? vp3Var.toString() : super.toString();
    }
}

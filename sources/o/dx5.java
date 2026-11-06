package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dx5 {
    public final zw5 a;
    public final boolean b;
    public final c57 c;
    public final Function1 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public dx5(zw5 zw5Var, Object obj, boolean z, c57 c57Var, Function1 function1, boolean z2) {
        this.a = zw5Var;
        this.b = z;
        this.c = c57Var;
        this.d = function1;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        i01.b("Unexpected form of a provided value");
        hk0.b();
        return null;
    }
}

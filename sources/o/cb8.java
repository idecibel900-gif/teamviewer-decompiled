package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cb8 extends l47 {
    public final Object a;
    public final tc8 b;
    public final z06 c;

    public cb8(Object obj, tc8 tc8Var, z06 z06Var) {
        this.a = obj;
        this.b = tc8Var;
        this.c = z06Var;
    }

    @Override // o.l47
    public final Object l() {
        return this.a;
    }

    @Override // o.l47
    public final l47 s(String str, Function1 function1) {
        Object obj = this.a;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new mh2(obj, str, this.c, this.b);
    }
}

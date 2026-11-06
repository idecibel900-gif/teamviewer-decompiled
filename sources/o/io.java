package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class io {
    public final yn1 a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final bg5 e;
    public qo f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final bg5 i = h57.p(Boolean.TRUE);

    public io(Object obj, yn1 yn1Var, qo qoVar, long j, Object obj2, long j2, Function0 function0) {
        this.a = yn1Var;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = h57.p(obj);
        this.f = mo8.j(qoVar);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.a();
    }
}

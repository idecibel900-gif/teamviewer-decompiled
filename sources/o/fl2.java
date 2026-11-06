package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class fl2 implements zp6 {
    public final zp6 a;
    public final boolean b;
    public final Function1 c;

    public fl2(zp6 zp6Var, boolean z, Function1 function1) {
        this.a = zp6Var;
        this.b = z;
        this.c = function1;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new el2(this);
    }
}

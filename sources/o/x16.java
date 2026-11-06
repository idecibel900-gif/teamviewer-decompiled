package o;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class x16 implements ld3 {
    public final byte a;
    public final nw4 b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final vd5 g;
    public final boolean h;
    public final oc3 i;
    public final Function0 j;

    /* JADX WARN: Multi-variable type inference failed */
    public x16(int i, nw4 nw4Var, nw4 nw4Var2, nw4 nw4Var3, vd5 vd5Var, Function0 function0, int i2) {
        Boolean bool = Boolean.TRUE;
        nw4 nw4Var4 = new nw4(bool);
        nw4 nw4Var5 = new nw4(bool);
        nw4Var3 = (i2 & 32) != 0 ? new nw4(Boolean.FALSE) : nw4Var3;
        vd5Var = (i2 & 64) != 0 ? new vd5(-16777216, -1) : vd5Var;
        boolean z = (i2 & 128) == 0;
        oc3 oc3Var = (i2 & 256) != 0 ? oc3.m : oc3.n;
        nw4Var3.getClass();
        this.a = i;
        this.b = nw4Var;
        this.c = nw4Var2;
        this.d = nw4Var4;
        this.e = nw4Var5;
        this.f = nw4Var3;
        this.g = vd5Var;
        this.h = z;
        this.i = oc3Var;
        this.j = function0;
    }

    @Override // o.ld3
    public final int getId() {
        return this.a;
    }
}

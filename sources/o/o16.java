package o;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o16 implements ld3 {
    public final byte a;
    public final nw4 b;
    public final nw4 c;
    public final LiveData d;
    public final LiveData e;
    public final mc3 f;
    public final int g;
    public final Function0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public o16(int i, nw4 nw4Var, nw4 nw4Var2, LiveData liveData, LiveData liveData2, Function0 function0, int i2) {
        liveData = (i2 & 8) != 0 ? new nw4(Boolean.TRUE) : liveData;
        liveData2 = (i2 & 16) != 0 ? new nw4(Boolean.TRUE) : liveData2;
        mc3 mc3Var = (i2 & 32) != 0 ? mc3.m : mc3.n;
        int i3 = (i2 & 64) != 0 ? 0 : 100;
        liveData.getClass();
        this.a = i;
        this.b = nw4Var;
        this.c = nw4Var2;
        this.d = liveData;
        this.e = liveData2;
        this.f = mc3Var;
        this.g = i3;
        this.h = function0;
    }

    @Override // o.ld3
    public final int getId() {
        return this.a;
    }
}

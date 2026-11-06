package o;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class f26 implements hc3 {
    public final byte a;
    public final nw4 b;
    public final nw4 c;
    public final LiveData d;
    public final LiveData e;
    public final Function0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public f26(int i, nw4 nw4Var, nw4 nw4Var2, LiveData liveData, LiveData liveData2, Function0 function0) {
        liveData.getClass();
        liveData2.getClass();
        this.a = i;
        this.b = nw4Var;
        this.c = nw4Var2;
        this.d = liveData;
        this.e = liveData2;
        this.f = function0;
    }

    @Override // o.hc3
    public final LiveData a() {
        return this.d;
    }

    @Override // o.hc3
    public final Function0 b() {
        return this.f;
    }

    @Override // o.hc3
    public final LiveData c() {
        return this.e;
    }

    @Override // o.hc3
    public final int getId() {
        return this.a;
    }

    public f26(int i, nw4 nw4Var, nw4 nw4Var2, LiveData liveData, Function0 function0) {
        this(i, nw4Var, nw4Var2, liveData, new nw4(Boolean.TRUE), function0);
    }
}

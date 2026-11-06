package o;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 extends jc1 {
    public FileOutputStream m;
    public FileOutputStream n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2525o;
    public final /* synthetic */ yk2 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk2(yk2 yk2Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = yk2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f2525o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}

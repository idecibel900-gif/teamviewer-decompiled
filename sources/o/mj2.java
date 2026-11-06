package o;

import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends jc1 {
    public Object m;
    public FileInputStream n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1474o;
    public final /* synthetic */ nj2 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj2(nj2 nj2Var, jc1 jc1Var) {
        super(jc1Var);
        this.p = nj2Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        this.f1474o = obj;
        this.q |= Integer.MIN_VALUE;
        return nj2.a(this.p, this);
    }
}

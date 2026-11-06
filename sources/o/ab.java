package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hb n;

    public /* synthetic */ ab(hb hbVar, byte b) {
        this.m = b;
        this.n = hbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        hb hbVar = this.n;
        switch (b) {
            case 0:
                hbVar.h.invoke(ea0.m);
                break;
            default:
                hbVar.h.invoke(ea0.n);
                break;
        }
        return f88Var;
    }
}

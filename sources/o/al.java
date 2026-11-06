package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ el n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fp7 f334o;

    public /* synthetic */ al(el elVar, fp7 fp7Var, byte b) {
        this.m = b;
        this.n = elVar;
        this.f334o = fp7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        byte b2 = 3;
        fp7 fp7Var = this.f334o;
        el elVar = this.n;
        switch (b) {
            case 0:
                zk zkVar = elVar.f;
                y yVar = new y(fp7Var, (byte) 8);
                k76 k76Var = new k76();
                elVar.e.f("dataBuilder", zkVar, new x8(k76Var, yVar, b2));
                Object obj = k76Var.m;
                if (obj != null) {
                    return (ep7) obj;
                }
                im3.e0("result");
                throw null;
            case 1:
                zk zkVar2 = elVar.g;
                al alVar = new al(elVar, fp7Var, (byte) 2);
                k76 k76Var2 = new k76();
                elVar.e.f("positioner", zkVar2, new x8(k76Var2, alVar, b2));
                Object obj2 = k76Var2.m;
                if (obj2 != null) {
                    return (v56) obj2;
                }
                im3.e0("result");
                throw null;
            default:
                Object objA = elVar.c.a();
                i04 i04Var = (i04) (((i04) objA).m() ? objA : null);
                return i04Var == null ? v56.e : fp7Var.X(i04Var).i(i04Var.P(0L));
        }
    }
}

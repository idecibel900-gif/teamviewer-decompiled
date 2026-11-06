package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yn extends yz3 implements iw2 {
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u18 f2625o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(Function1 function1, u18 u18Var) {
        super(3);
        this.n = function1;
        this.f2625o = u18Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j;
        fo4 fo4Var = (fo4) obj;
        jl5 jl5VarC = ((zn4) obj2).C(((r61) obj3).a);
        if (fo4Var.b0()) {
            if (((Boolean) this.n.invoke(this.f2625o.d.getValue())).booleanValue()) {
                j = (((long) jl5VarC.m) << 32) | (((long) jl5VarC.n) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) jl5VarC.m) << 32) | (((long) jl5VarC.n) & 4294967295L);
        }
        return fo4Var.u((int) (j >> 32), (int) (4294967295L & j), fa2.m, new xn(jl5VarC, (byte) 0));
    }
}

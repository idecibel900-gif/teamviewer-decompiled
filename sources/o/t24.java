package o;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class t24 extends kh {
    public final /* synthetic */ ns4 g0;
    public final /* synthetic */ Set h0;
    public final /* synthetic */ Function1 i0;

    public t24(ns4 ns4Var, Set set, Function1 function1) {
        this.g0 = ns4Var;
        this.h0 = set;
        this.i0 = function1;
    }

    @Override // o.kh
    public final boolean l(Object obj) {
        ns4 ns4Var = (ns4) obj;
        ns4Var.getClass();
        if (ns4Var == this.g0) {
            return true;
        }
        zo4 zo4VarP0 = ns4Var.p0();
        zo4VarP0.getClass();
        if (!(zo4VarP0 instanceof v24)) {
            return true;
        }
        this.h0.addAll((Collection) this.i0.invoke(zo4VarP0));
        return false;
    }
}

package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w74 implements Function0 {
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ j74 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r74 f2384o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;

    public w74(Function1 function1, j74 j74Var, r74 r74Var, Function1 function2, String str, Function1 function3, Function1 function4) {
        this.m = function1;
        this.n = j74Var;
        this.f2384o = r74Var;
        this.p = function2;
        this.q = str;
        this.r = function3;
        this.s = function4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int iOrdinal;
        j74 j74Var = this.n;
        String str = j74Var.a;
        Function1 function1 = this.m;
        if (!(function1 != null ? ((Boolean) function1.invoke(j74Var)).booleanValue() : false) && (iOrdinal = this.f2384o.ordinal()) != 0) {
            if (iOrdinal == 1) {
                if (im3.n(this.q, str)) {
                    str = null;
                }
                this.p.invoke(str);
            } else if (iOrdinal == 2) {
                Function1 function2 = this.r;
                if (function2 != null) {
                    function2.invoke(j74Var);
                }
            } else {
                if (iOrdinal != 3) {
                    gk0.s();
                    return null;
                }
                Function1 function3 = this.s;
                if (function3 != null) {
                    function3.invoke(j74Var);
                }
            }
        }
        return f88.a;
    }
}

package o;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up4 implements Function1 {
    public final /* synthetic */ byte m = 2;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2235o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ up4(Set set, Function0 function0, Function0 function1, Function1 function2, boolean z) {
        this.p = set;
        this.f2235o = function0;
        this.q = function1;
        this.r = function2;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue;
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f2235o;
        boolean z = this.n;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                bg5 bg5Var = ((wx4) obj4).f2457o;
                i97 i97Var = (i97) obj3;
                i97 i97Var2 = (i97) obj2;
                jd6 jd6Var = (jd6) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) bg5Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) i97Var.getValue()).floatValue();
                }
                jd6Var.k(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) i97Var.getValue()).floatValue();
                } else if (((Boolean) bg5Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                jd6Var.l(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) i97Var2.getValue()).floatValue();
                } else if (!((Boolean) bg5Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                jd6Var.b(fFloatValue3);
                jd6Var.z(((d18) function0.a()).a);
                return f88Var;
            case 1:
                Function1 function1 = (Function1) obj4;
                xs6 xs6Var = (xs6) obj3;
                Function1 function2 = (Function1) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!z) {
                    if (zBooleanValue) {
                        function1.invoke(xs6Var);
                        function2.invoke(null);
                    } else if (function0.a() == xs6Var) {
                        function2.invoke(xs6Var);
                    }
                }
                return f88Var;
            default:
                return new xy6((Set) obj4, this.f2235o, (Function0) obj3, (yy6) obj, (Function1) obj2, this.n);
        }
    }

    public /* synthetic */ up4(boolean z, Function1 function1, xs6 xs6Var, Function1 function2, Function0 function0) {
        this.n = z;
        this.p = function1;
        this.q = xs6Var;
        this.r = function2;
        this.f2235o = function0;
    }

    public /* synthetic */ up4(boolean z, wx4 wx4Var, Function0 function0, q18 q18Var, q18 q18Var2) {
        this.n = z;
        this.p = wx4Var;
        this.f2235o = function0;
        this.q = q18Var;
        this.r = q18Var2;
    }
}

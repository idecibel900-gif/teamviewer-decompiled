package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1910o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb2(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.n = b;
        this.f1910o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        float f = 1.0f;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.f1910o;
        switch (b) {
            case 0:
                int iOrdinal = ((mb2) obj).ordinal();
                if (iOrdinal == 0) {
                    ih2 ih2Var = ((bc2) obj4).a.a;
                    if (ih2Var != null) {
                        f = ih2Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    ih2 ih2Var2 = ((hf2) obj3).a.a;
                    f = ih2Var2 != null ? ih2Var2.a : ((dy6) obj2).f;
                }
                return Float.valueOf(f);
            case 1:
                int iOrdinal2 = ((mb2) obj).ordinal();
                if (iOrdinal2 == 0) {
                    pi6 pi6Var = ((bc2) obj4).a.d;
                    if (pi6Var != null) {
                        f = pi6Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        gk0.s();
                        return null;
                    }
                    pi6 pi6Var2 = ((hf2) obj3).a.d;
                    f = pi6Var2 != null ? pi6Var2.a : ((dy6) obj2).g;
                }
                return Float.valueOf(f);
            default:
                return new en((j57) obj4, obj3, (pn) obj2, (byte) 0);
        }
    }
}

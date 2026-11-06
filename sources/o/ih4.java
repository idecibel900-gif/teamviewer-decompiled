package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ih4 extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kh4 f1060o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih4(kh4 kh4Var, byte b) {
        super(0);
        this.n = b;
        this.f1060o = kh4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        kh4 kh4Var = this.f1060o;
        switch (b) {
            case 0:
                float f = 0.0f;
                if (((qh4) kh4Var.u.getValue()) != null) {
                    float fFloatValue = ((Number) kh4Var.r.getValue()).floatValue();
                    bg5 bg5Var = kh4Var.q;
                    if (fFloatValue < 0.0f) {
                        if (bg5Var.getValue() != null) {
                            io.sentry.h2.f();
                            return null;
                        }
                    } else {
                        if (bg5Var.getValue() != null) {
                            io.sentry.h2.f();
                            return null;
                        }
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                bg5 bg5Var2 = kh4Var.r;
                return Float.valueOf((((Boolean) kh4Var.p.getValue()).booleanValue() && kh4Var.a() % 2 == 0) ? -((Number) bg5Var2.getValue()).floatValue() : ((Number) bg5Var2.getValue()).floatValue());
            default:
                return Boolean.valueOf(kh4Var.a() == ((Number) kh4Var.f1266o.getValue()).intValue() && ((Number) kh4Var.w.getValue()).floatValue() == ((Number) kh4Var.y.getValue()).floatValue());
        }
    }
}

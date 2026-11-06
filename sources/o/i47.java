package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i47 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h76 f1036o;
    public final /* synthetic */ dk6 p;
    public final /* synthetic */ Function1 q;

    public /* synthetic */ i47(float f, h76 h76Var, dk6 dk6Var, Function1 function1, byte b) {
        this.m = b;
        this.n = f;
        this.f1036o = h76Var;
        this.p = dk6Var;
        this.q = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fA;
        byte b = this.m;
        f88 f88Var = f88.a;
        Function1 function1 = this.q;
        dk6 dk6Var = this.p;
        h76 h76Var = this.f1036o;
        float f = this.n;
        io ioVar = (io) obj;
        switch (b) {
            case 0:
                float fAbs = Math.abs(((Number) ioVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                bg5 bg5Var = ioVar.e;
                if (fAbs < fAbs2) {
                    l47.i(ioVar, dk6Var, function1, ((Number) bg5Var.getValue()).floatValue() - h76Var.m);
                    h76Var.m = ((Number) bg5Var.getValue()).floatValue();
                } else {
                    float fK = l47.k(((Number) bg5Var.getValue()).floatValue(), f);
                    l47.i(ioVar, dk6Var, function1, fK - h76Var.m);
                    ioVar.a();
                    h76Var.m = fK;
                }
                break;
            default:
                float fK2 = l47.k(((Number) ioVar.e.getValue()).floatValue(), f);
                float f2 = fK2 - h76Var.m;
                try {
                    fA = dk6Var.a(f2);
                } catch (CancellationException unused) {
                    ioVar.a();
                    fA = 0.0f;
                }
                function1.invoke(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fK2 != ((Number) ioVar.e.getValue()).floatValue()) {
                    ioVar.a();
                }
                h76Var.m += fA;
                break;
        }
        return f88Var;
    }
}

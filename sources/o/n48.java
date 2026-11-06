package o;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class n48 implements Function1 {
    public final /* synthetic */ byte m;
    public final q48 n;

    public /* synthetic */ n48(q48 q48Var, byte b) {
        this.m = b;
        this.n = q48Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        q48 q48Var = this.n;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                fp1 fp1Var = q48Var.a;
                js0 js0VarY = et1.y((ty4) fp1Var.b, iIntValue);
                boolean z = js0VarY.c;
                io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
                if (!z) {
                    return vs1.r((ps4) kVar.b, js0VarY);
                }
                es0 es0Var = (es0) kVar.t;
                Set set = es0.c;
                return es0Var.a(js0VarY, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                fp1 fp1Var2 = q48Var.a;
                js0 js0VarY2 = et1.y((ty4) fp1Var2.b, iIntValue2);
                if (js0VarY2.c) {
                    return null;
                }
                ps4 ps4Var = (ps4) ((io.sentry.android.replay.screenshot.k) fp1Var2.a).b;
                ps4Var.getClass();
                ys0 ys0VarR = vs1.r(ps4Var, js0VarY2);
                if (ys0VarR instanceof eq1) {
                    return (eq1) ys0VarR;
                }
                return null;
            default:
                aw5 aw5Var = (aw5) obj;
                aw5Var.getClass();
                d22 d22Var = (d22) q48Var.a.d;
                int i = aw5Var.f368o;
                if ((i & 256) == 256) {
                    return aw5Var.y;
                }
                if ((i & 512) == 512) {
                    return d22Var.a(aw5Var.z);
                }
                return null;
        }
    }
}

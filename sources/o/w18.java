package o;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w18 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2365o;

    public /* synthetic */ w18(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2365o = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.m;
        hc1 hc1Var = null;
        byte b2 = 2;
        f88 f88Var = f88.a;
        Object obj2 = this.f2365o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new l9((u18) obj3, (n18) obj2, (byte) 22);
            case 1:
                o98 o98Var = (o98) obj3;
                ((Long) obj).getClass();
                float f = o98Var.e;
                o98Var.e = 0.0f;
                ((Function1) obj2).invoke(Float.valueOf(f));
                return f88Var;
            case 2:
                vh3 vh3Var = (vh3) obj;
                vh3Var.getClass();
                im3.R((me1) obj3, null, null, new i9((th8) obj2, vh3Var, hc1Var, (byte) 28), 3);
                return f88Var;
            case 3:
                vh3 vh3Var2 = (vh3) obj;
                vh3Var2.getClass();
                im3.R((me1) obj3, null, null, new i9((vh8) obj2, vh3Var2, hc1Var, (byte) 29), 3);
                return f88Var;
            case 4:
                wk8 wk8Var = (wk8) obj3;
                View view = (View) obj2;
                wk8Var.a(view);
                return new l9(wk8Var, view, (byte) 27);
            case 5:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ((rm8) obj3).b.P(pg6Var, (qm8) obj2);
                return f88Var;
            case 6:
                lm8 lm8Var = (lm8) obj3;
                String str = (String) obj2;
                pg6 pg6Var2 = (pg6) obj;
                pg6Var2.getClass();
                ug6 ug6VarJ0 = pg6Var2.J0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    ug6VarJ0.k(1, f57.q(lm8Var));
                    ug6VarJ0.M(2, str);
                    ug6VarJ0.F0();
                    return Integer.valueOf(vs1.B(pg6Var2));
                } finally {
                    ug6VarJ0.close();
                }
            case 7:
                pg1 pg1Var = (pg1) obj3;
                String str2 = (String) obj2;
                pg6 pg6Var3 = (pg6) obj;
                pg6Var3.getClass();
                ug6 ug6VarJ1 = pg6Var3.J0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    pg1 pg1Var2 = pg1.b;
                    ug6VarJ1.l(qf0.V(pg1Var), 1);
                    ug6VarJ1.M(2, str2);
                    ug6VarJ1.F0();
                    return f88Var;
                } finally {
                    ug6VarJ1.close();
                }
            case 8:
                pg6 pg6Var4 = (pg6) obj;
                pg6Var4.getClass();
                ((an8) obj3).b.P(pg6Var4, (xm8) obj2);
                return f88Var;
            case ep1.b /* 9 */:
                pg6 pg6Var5 = (pg6) obj;
                pg6Var5.getClass();
                ((cn8) obj3).b.P(pg6Var5, (bn8) obj2);
                return f88Var;
            default:
                sn8 sn8Var = (sn8) obj3;
                yy0 yy0Var = (yy0) obj2;
                c01 c01Var = (c01) obj;
                if (!sn8Var.f2036o) {
                    LifecycleOwner lifecycleOwnerD = c01Var.d();
                    View view2 = c01Var.a;
                    x84 r = lifecycleOwnerD.getR();
                    sn8Var.q = yy0Var;
                    if (sn8Var.p == null) {
                        if (im3.n(Looper.myLooper(), view2.getHandler().getLooper())) {
                            sn8Var.p = r;
                            r.a(sn8Var);
                        } else {
                            view2.post(new be3(sn8Var, r, (byte) 18));
                        }
                    } else if (r.i.compareTo(m84.f1446o) >= 0) {
                        sn8Var.n.A(new yy0(-1723985096, true, new xl7(sn8Var, c01Var, yy0Var, b2)));
                    }
                }
                return f88Var;
        }
    }
}

package o;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class rl1 {
    public static final cp5 a = new cp5(30, true);

    public static final void a(rp7 rp7Var, ep7 ep7Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        Context context;
        ux2Var.Y(1904307118);
        int i2 = (ux2Var.f(rp7Var) ? 4 : 2) | i | (ux2Var.h(ep7Var) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ux2Var.W(-1009482584);
                context = (Context) ux2Var.j(lh.b);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1009433480);
                ux2Var.p(false);
                context = null;
            }
            boolean zH = ux2Var.h(ep7Var) | ((i2 & 14) == 4) | ux2Var.h(context);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new m5((Object) ep7Var, (Object) context, (Object) rp7Var, (byte) 11);
                ux2Var.g0(objK);
            }
            ux2Var2 = ux2Var;
            ec1.b(null, null, (Function1) objK, ux2Var2, 0, 3);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 17, i, (Object) rp7Var, (Object) ep7Var);
        }
    }

    public static final void b(final int i, final long j, ux2 ux2Var, final int i2) {
        final int i3;
        int i4;
        j56 j56VarR;
        hw2 hw2Var;
        ux2Var.Y(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (ux2Var.d(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.e(j) ? 32 : 16;
        }
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) ux2Var.j(lh.b);
            boolean zF = ((i4 & 14) == 4) | ux2Var.f(context);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                ux2Var.g0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                j56VarR = ux2Var.r();
                if (j56VarR == null) {
                    return;
                }
                final byte b = 1;
                hw2Var = new hw2() { // from class: o.pl1
                    @Override // o.hw2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = b;
                        f88 f88Var = f88.a;
                        int i5 = i2;
                        long j2 = j;
                        int i6 = i3;
                        ux2 ux2Var2 = (ux2) obj2;
                        ((Integer) obj3).getClass();
                        switch (b2) {
                            case 0:
                                rl1.b(i6, j2, ux2Var2, yo1.Y(i5 | 1));
                                break;
                            default:
                                rl1.b(i6, j2, ux2Var2, yo1.Y(i5 | 1));
                                break;
                        }
                        return f88Var;
                    }
                };
            } else {
                ud5 ud5VarT = lv1.T(iIntValue, ux2Var, 0);
                boolean z = (i4 & 112) == 32;
                Object objK2 = ux2Var.K();
                if (z || objK2 == obj) {
                    objK2 = j == 16 ? null : new t70(5, j);
                    ux2Var.g0(objK2);
                }
                ua0.a(androidx.compose.ui.draw.a.a(androidx.compose.foundation.layout.b.l(cs4.b, bc1.e), ud5VarT, null, rb1.b, 0.0f, (tv0) objK2, 22), ux2Var, 0);
            }
            j56VarR.d = hw2Var;
        }
        ux2Var.Q();
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final byte b2 = 0;
            hw2Var = new hw2() { // from class: o.pl1
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    f88 f88Var = f88.a;
                    int i5 = i2;
                    long j2 = j;
                    int i6 = i;
                    ux2 ux2Var2 = (ux2) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            rl1.b(i6, j2, ux2Var2, yo1.Y(i5 | 1));
                            break;
                        default:
                            rl1.b(i6, j2, ux2Var2, yo1.Y(i5 | 1));
                            break;
                    }
                    return f88Var;
                }
            };
            j56VarR.d = hw2Var;
        }
    }

    public static final void c(rp7 rp7Var, fp7 fp7Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(rp7Var) : ux2Var.h(rp7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ux2Var.f(fp7Var) : ux2Var.h(fp7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function0) ? 256 : 128;
        }
        boolean z = false;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && ux2Var.f(fp7Var));
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = new pk4(new xc0(new x8(fp7Var, function0, (byte) 29), (byte) 22));
                ux2Var.g0(objK);
            }
            pk4 pk4Var = (pk4) objK;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && ux2Var.h(rp7Var))) {
                z = true;
            }
            Object objK2 = ux2Var.K();
            if (z || objK2 == awVar) {
                objK2 = new zz0(rp7Var, (byte) 9);
                ux2Var.g0(objK2);
            }
            gk.a(pk4Var, (Function0) objK2, a, au8.O(1315155414, new c9(fp7Var, rp7Var, b), ux2Var), ux2Var, 3456, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci(rp7Var, fp7Var, function0, i);
        }
    }

    public static final void d(fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(1392105195);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            xk0.h(fs4Var, pp7.a, yy0Var, ux2Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fl(fs4Var, yy0Var, i, (byte) 2);
        }
    }
}

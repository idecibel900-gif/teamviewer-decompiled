package o;

import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p90 {
    public static final p90 a = new p90();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;
    public static final float e = 125.0f;

    public final void a(fs4 fs4Var, float f, float f2, pw6 pw6Var, long j, ux2 ux2Var, final int i) {
        final fs4 fs4Var2;
        final float f3;
        final float f4;
        final pw6 pw6Var2;
        final long j2;
        long jC;
        final float f5;
        final float f6;
        pw6 pw6Var3;
        fs4 fs4Var3;
        ux2Var.Y(-1364277227);
        int i2 = i | 9654;
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                float f7 = kh.a0;
                float f8 = kh.Z;
                qf6 qf6Var = ((rn4) ux2Var.j(un4.a)).c.e;
                jC = bw0.c(kh.Y, ux2Var);
                f5 = f7;
                f6 = f8;
                pw6Var3 = qf6Var;
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                f5 = f;
                f6 = f2;
                pw6Var3 = pw6Var;
                jC = j;
            }
            ux2Var.q();
            String strO = n37.o(R.string.m3c_bottom_sheet_drag_handle_description, ux2Var);
            fs4 fs4VarD = ka0.D(fs4Var3, 0.0f, uy6.a, 1);
            boolean zF = ux2Var.f(strO);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new fy(strO, (byte) 2);
                ux2Var.g0(objK);
            }
            long j3 = jC;
            ig7.a(cp6.a(fs4VarD, false, (Function1) objK), pw6Var3, j3, 0L, 0.0f, 0.0f, au8.O(-1039573072, new hw2() { // from class: o.n90
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var2 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ua0.a(androidx.compose.foundation.layout.b.m(cs4.b, f5, f6), ux2Var2, 0);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 12582912, 120);
            pw6Var2 = pw6Var3;
            j2 = j3;
            fs4Var2 = fs4Var3;
            f3 = f5;
            f4 = f6;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            f3 = f;
            f4 = f2;
            pw6Var2 = pw6Var;
            j2 = j;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(fs4Var2, f3, f4, pw6Var2, j2, i) { // from class: o.o90
                public final /* synthetic */ fs4 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ float f1642o;
                public final /* synthetic */ float p;
                public final /* synthetic */ pw6 q;
                public final /* synthetic */ long r;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(196609);
                    this.m.a(this.n, this.f1642o, this.p, this.q, this.r, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }
}

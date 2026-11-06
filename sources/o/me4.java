package o;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class me4 {
    public static final void a(iv6 iv6Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-916671151);
        if ((i & 6) == 0) {
            i2 = i | (ux2Var2.f(iv6Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (ux2Var2.N(i3 & 1, (i3 & 19) != 18)) {
            h72 h72Var = lh.b;
            Context context = (Context) ux2Var2.j(h72Var);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                List list = lu.b;
                objK = h57.p(Boolean.valueOf(xk0.w(context).exists()));
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Object[] objArr = new Object[0];
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new tg3((byte) 27);
                ux2Var2.g0(objK2);
            }
            px4 px4Var2 = (px4) zu1.L(objArr, (Function0) objK2, ux2Var2, 48);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fillElement);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) px4Var2.getValue()).booleanValue();
            List list2 = lu.b;
            String string = Uri.fromFile(xk0.w((Context) ux2Var2.j(h72Var))).toString();
            string.getClass();
            dm7 dm7Var = new dm7(5);
            Object objK3 = ux2Var2.K();
            if (objK3 == awVar) {
                objK3 = new tg3((byte) 28);
                ux2Var2.g0(objK3);
            }
            Function0 function0 = (Function0) objK3;
            boolean zF = ux2Var2.f(px4Var2);
            Object objK4 = ux2Var2.K();
            if (zF || objK4 == awVar) {
                objK4 = new j44(px4Var2, (byte) 1);
                ux2Var2.g0(objK4);
            }
            yo1.s(zBooleanValue, string, zBooleanValue2, function0, (Function0) objK4, null, dm7Var, ux2Var2, 1575936);
            long j = ((rn4) ux2Var2.j(un4.a)).a.a;
            y50 y50Var = xz2.w;
            ya0 ya0Var = ya0.a;
            fs4Var2 = cs4.b;
            fs4 fs4VarB = ka0.B(ya0Var.a(fs4Var2, y50Var), 16.0f);
            boolean zH = ux2Var2.h(context) | ((i3 & 14) == 4);
            Object objK5 = ux2Var2.K();
            if (zH || objK5 == awVar) {
                objK5 = new ql1(context, iv6Var, (byte) 19);
                ux2Var2.g0(objK5);
            }
            ct1.b((Function0) objK5, fs4VarB, null, j, 0L, null, ga0.f875o, ux2Var, 12582912, 116);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 10, i, (Object) iv6Var, (Object) fs4Var2);
        }
    }
}

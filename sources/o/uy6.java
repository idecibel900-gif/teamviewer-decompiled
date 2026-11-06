package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class uy6 {
    public static final float a;

    static {
        db8.I0(300, 2, q72.a);
        a = 22.0f;
    }

    public static final void a(fs4 fs4Var, hw2 hw2Var, ux2 ux2Var, int i) {
        ux2Var.Y(1361920385);
        byte b = 2;
        int i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i | (ux2Var.h(hw2Var) ? 32 : 16);
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            String strO = n37.o(R.string.m3c_bottom_sheet_drag_handle_description, ux2Var);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4.b, 1.0f);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            g08.c(b08.a(ux2Var), au8.O(1497042086, new t20(strO, b), ux2Var), g08.d(ux2Var), fs4Var, false, hw2Var, ux2Var, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new zh(fs4Var, hw2Var, i, b2);
        }
    }

    public static final xy6 b(final Set set, final Function1 function1, ux2 ux2Var, int i, int i2) {
        float f = p90.c;
        float f2 = p90.d;
        boolean z = false;
        boolean z2 = false;
        byte b = 1;
        final boolean z3 = (i2 & 32) != 0;
        in1 in1Var = (in1) ux2Var.j(b11.h);
        boolean zF = ux2Var.f(in1Var) | ((((i & 7168) ^ 3072) > 2048 && ux2Var.c(f)) || (i & 3072) == 2048);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        Object obj2 = objK;
        if (zF || objK == obj) {
            Object py6Var = new py6(in1Var, f, z2 ? 1 : 0);
            ux2Var.g0(py6Var);
            obj2 = py6Var;
        }
        final Function0 function0 = (Function0) obj2;
        boolean zF2 = ux2Var.f(in1Var) | ((((57344 & i) ^ 24576) > 16384 && ux2Var.c(f2)) || (i & 24576) == 16384);
        Object objK2 = ux2Var.K();
        Object obj3 = objK2;
        if (zF2 || objK2 == obj) {
            Object py6Var2 = new py6(in1Var, f2, b);
            ux2Var.g0(py6Var2);
            obj3 = py6Var2;
        }
        final Function0 function2 = (Function0) obj3;
        Object[] objArr = {set, function1, Boolean.valueOf(z3)};
        byte b2 = 20;
        a65 a65Var = new a65(b2, new jp6(b2), new up4(set, function0, function2, function1, z3), z);
        int i3 = (((((ux2Var.h(set) ? 1 : 0) | (ux2Var.f(function0) ? 1 : 0) ? 1 : 0) | (ux2Var.f(function2) ? 1 : 0) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !ux2Var.d(yy6.m.ordinal())) && (i & 384) != 256) ? (char) 0 : (char) 1)) == true ? 1 : 0) | (((((i & 112) ^ 48) <= 32 || !ux2Var.f(function1)) && (i & 48) != 32) ? (char) 0 : (char) 1);
        if ((((458752 & i) ^ 196608) <= 131072 || !ux2Var.g(z3)) && (i & 196608) != 131072) {
            b = 0;
        }
        int i4 = (i3 == true ? 1 : 0) | b;
        Object objK3 = ux2Var.K();
        if (i4 != 0 || objK3 == obj) {
            Object obj4 = new Function0() { // from class: o.qy6
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    return new xy6(set, function0, function2, yy6.m, function1, z3);
                }
            };
            ux2Var.g0(obj4);
            objK3 = obj4;
        }
        return (xy6) zu1.O(objArr, a65Var, (Function0) objK3, ux2Var, 0);
    }
}

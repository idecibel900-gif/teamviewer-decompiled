package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz0 implements nw2 {
    @Override // o.nw2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Integer num) {
        int i;
        fs4 fs4Var = (fs4) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        zb1 zb1Var = (zb1) obj4;
        iw2 iw2Var = (iw2) obj5;
        Function0 function0 = (Function0) obj6;
        ux2 ux2Var = (ux2) obj7;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i = (ux2Var.f(fs4Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ux2Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ux2Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ux2Var.f(zb1Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ux2Var.h(iw2Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ux2Var.h(function0) ? 131072 : 65536;
        }
        if (ux2Var.N(i & 1, (599187 & i) != 599186)) {
            ec1.c(str, zBooleanValue, zb1Var, fs4Var, iw2Var, function0, ux2Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}

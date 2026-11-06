package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yn3 {
    public static final List a;
    public static final List b;
    public static final Map c;
    public static final Map d;
    public static final LinkedHashMap e;

    static {
        lp lpVar = lp.TYPE_PARAMETER_BOUNDS;
        lp lpVar2 = lp.TYPE_USE;
        lp lpVar3 = lp.FIELD;
        lp lpVar4 = lp.METHOD_RETURN_TYPE;
        lp lpVar5 = lp.VALUE_PARAMETER;
        List listL = qf0.L(lpVar3, lpVar4, lpVar5, lpVar, lpVar2);
        a = listL;
        List listK = qf0.K(lpVar5);
        b = listK;
        ht2 ht2Var = ur3.a;
        b65 b65Var = b65.f402o;
        Map mapR = xm4.R(new vd5(ht2Var, new xn3(new c65(b65Var), listL, false)), new vd5(ur3.b, new xn3(new c65(b65Var), listL, false)), new vd5(ur3.c, new xn3(new c65(b65.m), listL)));
        c = mapR;
        Map mapR2 = xm4.R(new vd5(ur3.h, new xn3(new c65(b65Var), listK)), new vd5(ur3.i, new xn3(new c65(b65.n), listK)));
        d = mapR2;
        e = xm4.S(mapR, mapR2);
    }
}

package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm {
    public static final jr3 a = jr3.b("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final jr3 b = jr3.b("k");

    public static void a(mm mmVar, qh4 qh4Var) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = mmVar.b;
        if (list.isEmpty()) {
            list.add(new dy3(qh4Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(qh4Var.m)));
        } else if (((dy3) list.get(0)).b == null) {
            list.set(0, new dy3(qh4Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(qh4Var.m)));
        }
    }

    public static boolean b(mm mmVar) {
        if (mmVar != null) {
            return mmVar.f() && ((Float) ((dy3) mmVar.b.get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x011f  */
    public static rm c(or3 or3Var, qh4 qh4Var) {
        lm lmVar;
        boolean z = or3Var.q() == 3;
        if (z) {
            or3Var.u0();
        }
        nm nmVarA = null;
        tm tmVarB = null;
        mm mmVarS = null;
        lm lmVar2 = null;
        mm mmVarS2 = null;
        mm mmVarS3 = null;
        mm mmVarS4 = null;
        mm mmVarS5 = null;
        mm mmVarS6 = null;
        lm lmVarU = null;
        mm mmVarS7 = null;
        mm mmVarS8 = null;
        while (or3Var.hasNext()) {
            switch (or3Var.z(a)) {
                case 0:
                    or3Var.u0();
                    while (or3Var.hasNext()) {
                        if (or3Var.z(b) != 0) {
                            or3Var.F();
                            or3Var.v();
                        } else {
                            nmVarA = om.a(or3Var, qh4Var);
                        }
                    }
                    or3Var.Z();
                    break;
                case 1:
                    tmVarB = om.b(or3Var, qh4Var);
                    break;
                case 2:
                    lmVar2 = new lm(gy3.a(or3Var, qh4Var, 1.0f, d82.L, false), (byte) 4);
                    break;
                case 3:
                    mmVarS6 = e8.s(or3Var, qh4Var, false);
                    a(mmVarS6, qh4Var);
                    break;
                case 4:
                    mmVarS = e8.s(or3Var, qh4Var, false);
                    a(mmVarS, qh4Var);
                    break;
                case 5:
                    lmVarU = e8.u(or3Var, qh4Var);
                    break;
                case 6:
                    mmVarS7 = e8.s(or3Var, qh4Var, false);
                    break;
                case 7:
                    mmVarS8 = e8.s(or3Var, qh4Var, false);
                    break;
                case 8:
                    mmVarS2 = e8.s(or3Var, qh4Var, false);
                    break;
                case ep1.b /* 9 */:
                    mmVarS3 = e8.s(or3Var, qh4Var, false);
                    break;
                case ep1.c /* 10 */:
                    mmVarS4 = e8.s(or3Var, qh4Var, false);
                    a(mmVarS4, qh4Var);
                    break;
                case 11:
                    mmVarS5 = e8.s(or3Var, qh4Var, false);
                    a(mmVarS5, qh4Var);
                    break;
                default:
                    or3Var.F();
                    or3Var.v();
                    break;
            }
        }
        if (z) {
            or3Var.Z();
        }
        if (nmVarA == null || (nmVarA.f() && ((PointF) ((dy3) nmVarA.a.get(0)).b).equals(0.0f, 0.0f))) {
            nmVarA = null;
        }
        tm tmVar = (tmVarB == null || (!(tmVarB instanceof pm) && tmVarB.f() && ((PointF) ((dy3) tmVarB.e().get(0)).b).equals(0.0f, 0.0f))) ? null : tmVarB;
        mm mmVar = b(mmVarS) ? null : mmVarS;
        if (lmVar2 == null) {
            lmVar = null;
        } else {
            if (lmVar2.f()) {
                ri6 ri6Var = (ri6) ((dy3) lmVar2.b.get(0)).b;
                if (ri6Var.a == 1.0f && ri6Var.b == 1.0f) {
                    lmVar = null;
                }
            }
            lmVar = lmVar2;
        }
        return new rm(nmVarA, tmVar, lmVar, mmVar, lmVarU, mmVarS7, mmVarS8, (mmVarS2 == null || (mmVarS2.f() && ((Float) ((dy3) mmVarS2.b.get(0)).b).floatValue() == 0.0f)) ? null : mmVarS2, (mmVarS3 == null || (mmVarS3.f() && ((Float) ((dy3) mmVarS3.b.get(0)).b).floatValue() == 0.0f)) ? null : mmVarS3, b(mmVarS4) ? null : mmVarS4, b(mmVarS5) ? null : mmVarS5, b(mmVarS6) ? null : mmVarS6);
    }
}

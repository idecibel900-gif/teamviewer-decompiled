package o;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wp1 implements Function1 {
    public final /* synthetic */ byte m;
    public final zp1 n;

    public /* synthetic */ wp1(zp1 zp1Var, byte b) {
        this.m = b;
        this.n = zp1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cp1 cp1Var;
        aw5 aw5VarA;
        aw5 aw5VarA2;
        byte b = this.m;
        Collection<qv5> collectionL0 = ea2.m;
        zp1 zp1Var = this.n;
        switch (b) {
            case 0:
                sy4 sy4Var = (sy4) obj;
                sy4Var.getClass();
                LinkedHashMap linkedHashMap = zp1Var.a;
                ys3 ys3Var = iv5.H;
                ys3Var.getClass();
                aq1 aq1Var = zp1Var.i;
                byte[] bArr = (byte[]) linkedHashMap.get(sy4Var);
                if (bArr != null) {
                    collectionL0 = bq6.l0(bq6.i0(new yp1(ys3Var, new ByteArrayInputStream(bArr), aq1Var, (byte) 0)));
                }
                ArrayList arrayList = new ArrayList(collectionL0.size());
                for (iv5 iv5Var : collectionL0) {
                    vo4 vo4Var = (vo4) aq1Var.b.i;
                    iv5Var.getClass();
                    dq1 dq1VarE = vo4Var.e(iv5Var);
                    if (!aq1Var.r(dq1VarE)) {
                        dq1VarE = null;
                    }
                    if (dq1VarE != null) {
                        arrayList.add(dq1VarE);
                    }
                }
                aq1Var.j(arrayList, sy4Var);
                return ka0.s(arrayList);
            case 1:
                sy4 sy4Var2 = (sy4) obj;
                sy4Var2.getClass();
                LinkedHashMap linkedHashMap2 = zp1Var.b;
                ys3 ys3Var2 = qv5.H;
                ys3Var2.getClass();
                aq1 aq1Var2 = zp1Var.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(sy4Var2);
                if (bArr2 != null) {
                    collectionL0 = bq6.l0(bq6.i0(new yp1(ys3Var2, new ByteArrayInputStream(bArr2), aq1Var2, (byte) 0)));
                }
                ArrayList arrayList2 = new ArrayList(collectionL0.size());
                for (qv5 qv5Var : collectionL0) {
                    vo4 vo4Var2 = (vo4) aq1Var2.b.i;
                    qv5Var.getClass();
                    arrayList2.add(vo4Var2.f(qv5Var));
                }
                aq1Var2.k(arrayList2, sy4Var2);
                return ka0.s(arrayList2);
            default:
                sy4 sy4Var3 = (sy4) obj;
                sy4Var3.getClass();
                fp1 fp1Var = zp1Var.i.b;
                byte[] bArr3 = (byte[]) zp1Var.c.get(sy4Var3);
                if (bArr3 == null) {
                    return null;
                }
                cw5 cw5Var = (cw5) cw5.B.a(new ByteArrayInputStream(bArr3), (dg2) ((io.sentry.android.replay.screenshot.k) fp1Var.a).p);
                if (cw5Var == null) {
                    return null;
                }
                vo4 vo4Var3 = (vo4) fp1Var.i;
                fp1 fp1Var2 = vo4Var3.a;
                ty4 ty4Var = (ty4) fp1Var2.b;
                d22 d22Var = (d22) fp1Var2.d;
                List<qu5> list = cw5Var.w;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(mv0.Z(list, 10));
                for (qu5 qu5Var : list) {
                    cj3 cj3Var = vo4Var3.b;
                    qu5Var.getClass();
                    arrayList3.add(cj3Var.y(qu5Var, ty4Var));
                }
                up wpVar = arrayList3.isEmpty() ? yl7.p : new wp(arrayList3, (byte) 0);
                ow5 ow5Var = (ow5) im2.d.i(cw5Var.p);
                switch (ow5Var == null ? -1 : tw5.b[ow5Var.ordinal()]) {
                    case 1:
                        cp1Var = dp1.d;
                        cp1Var.getClass();
                        break;
                    case 2:
                        cp1Var = dp1.a;
                        cp1Var.getClass();
                        break;
                    case 3:
                        cp1Var = dp1.b;
                        cp1Var.getClass();
                        break;
                    case 4:
                        cp1Var = dp1.c;
                        cp1Var.getClass();
                        break;
                    case 5:
                        cp1Var = dp1.e;
                        cp1Var.getClass();
                        break;
                    case 6:
                        cp1Var = dp1.f;
                        cp1Var.getClass();
                        break;
                    default:
                        cp1Var = dp1.a;
                        cp1Var.getClass();
                        break;
                }
                eq1 eq1Var = new eq1((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var2.a).a, (fi1) fp1Var2.c, wpVar, et1.C(ty4Var, cw5Var.q), cp1Var, cw5Var, (ty4) fp1Var2.b, d22Var, (ed8) fp1Var2.e, (rp1) fp1Var2.g);
                List list2 = cw5Var.r;
                list2.getClass();
                q48 q48Var = (q48) fp1Var2.a(eq1Var, list2, (ty4) fp1Var2.b, (d22) fp1Var2.d, (ed8) fp1Var2.e, (h60) fp1Var2.f).h;
                List listB = q48Var.b();
                int i = cw5Var.f561o;
                if ((i & 4) == 4) {
                    aw5VarA = cw5Var.s;
                    aw5VarA.getClass();
                } else {
                    if ((i & 8) != 8) {
                        hk0.l("No underlyingType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    aw5VarA = d22Var.a(cw5Var.t);
                }
                g07 g07VarD = q48Var.d(aw5VarA, false);
                int i2 = cw5Var.f561o;
                if ((i2 & 16) == 16) {
                    aw5VarA2 = cw5Var.u;
                    aw5VarA2.getClass();
                } else {
                    if ((i2 & 32) != 32) {
                        hk0.l("No expandedType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    aw5VarA2 = d22Var.a(cw5Var.v);
                }
                eq1Var.G0(listB, g07VarD, q48Var.d(aw5VarA2, false));
                return eq1Var;
        }
    }
}

package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class e3 implements Function0 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f674o;

    public e3(s24 s24Var, g86 g86Var, k76 k76Var) {
        this.m = (byte) 17;
        this.f674o = s24Var;
        this.n = k76Var;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x022e  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws Throwable {
        tc2 tc2Var;
        Collection collectionQ;
        ArrayList arrayList;
        String strL;
        uw3 uw3Var;
        byte b = this.m;
        byte b2 = 2;
        List list = ea2.m;
        int i = 0;
        byte b3 = 1;
        f88 f88Var = f88.a;
        IOException iOException = null;
        iOException = null;
        Object obj = this.f674o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new f3((g3) obj2, (xd4) obj);
            case 1:
                g48.n.getClass();
                return bt1.Q(Collections.EMPTY_LIST, new d54(xd4.e, new a3(this, b2)), g48.f858o, ((g3) obj2).q(), false);
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                lv0.s0(((Map) obj2).entrySet(), sb, ", ", "(", ")", ek.f721o, 48);
                return sb.toString();
            case 3:
                yc4 yc4Var = (yc4) obj;
                up annotations = ((ps0) obj2).getAnnotations();
                yc4Var.getClass();
                annotations.getClass();
                return ((io3) yc4Var.m).j.b((vo3) ((u14) yc4Var.p).getValue(), annotations);
            case 4:
                yc4 yc4Var2 = (yc4) obj;
                up upVar = (up) obj2;
                yc4Var2.getClass();
                upVar.getClass();
                return ((io3) yc4Var2.m).j.b((vo3) ((u14) yc4Var2.p).getValue(), upVar);
            case 5:
                pp1 pp1Var = (pp1) obj;
                return lv0.P0(((ap) ((io.sentry.android.replay.screenshot.k) pp1Var.x.a).e).m(pp1Var.H, (dv5) obj2));
            case 6:
                u17 u17Var = new u17();
                Iterator it = ((zw2) obj2).j().iterator();
                while (it.hasNext()) {
                    u17Var.add(((xw2) it.next()).d((m58) obj));
                }
                return u17Var;
            case 7:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(g02.s);
                ((u23) obj).d.invoke(Long.valueOf(((ns1) obj2).a));
                return f88Var;
            case 8:
                i83 i83Var = (i83) obj2;
                l83 l83Var = (l83) obj;
                tc2 tc2Var2 = tc2.INTERNAL_ERROR;
                try {
                    if (!l83Var.e(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (l83Var.e(false, this)) {
                    }
                    tc2Var = tc2.NO_ERROR;
                    try {
                        try {
                            i83Var.e(tc2Var, tc2.CANCEL, null);
                        } catch (IOException e) {
                            iOException = e;
                            tc2 tc2Var3 = tc2.PROTOCOL_ERROR;
                            i83Var.e(tc2Var3, tc2Var3, iOException);
                        }
                        po8.b(l83Var);
                        return f88Var;
                    } catch (Throwable th) {
                        th = th;
                        i83Var.e(tc2Var, tc2Var2, iOException);
                        po8.b(l83Var);
                        throw th;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    tc2Var = tc2Var2;
                } catch (Throwable th2) {
                    th = th2;
                    tc2Var = tc2Var2;
                    i83Var.e(tc2Var, tc2Var2, iOException);
                    po8.b(l83Var);
                    throw th;
                }
                break;
            case ep1.b /* 9 */:
                g07 g07VarW = ((io3) ((yc4) obj).m).h.p.i(((pn3) obj2).a).W();
                g07VarW.getClass();
                return g07VarW;
            case ep1.c /* 10 */:
                vr3 vr3Var = (vr3) obj2;
                xd4 xd4Var = (xd4) obj;
                Function1 function1 = vr3Var.b;
                qs4 qs4Var = vr3Var.a;
                cs0 cs0Var = new cs0((fi1) function1.invoke(qs4Var), vr3.g, as4.q, ms0.n, qf0.K(qs4Var.p.e()), xd4Var);
                cs0Var.C0(new eu0(xd4Var, cs0Var), la2.m, null);
                return cs0Var;
            case 11:
                yr3 yr3Var = (yr3) obj2;
                qs4 qs4VarK = yr3Var.k();
                qs4VarK.getClass();
                return new bs3(qs4VarK, (xd4) obj, new a3(yr3Var, (byte) 19));
            case ep1.d /* 12 */:
                bs3 bs3Var = (bs3) obj2;
                qs4 qs4Var2 = bs3Var.f().a;
                vr3.d.getClass();
                return vs1.t(qs4Var2, vr3.h, new j93((xd4) obj, bs3Var.f().a)).W();
            case 13:
                b24 b24Var = (b24) obj;
                yc4 yc4Var3 = b24Var.v;
                io3 io3Var = (io3) yc4Var3.m;
                yc4 yc4Var4 = new yc4(new io3(io3Var.a, io3Var.b, io3Var.c, io3Var.d, io3Var.e, io3Var.f, io3Var.g, io3Var.h, io3Var.i, io3Var.j, io3Var.k, io3Var.l, io3Var.m, io3Var.n), (f58) yc4Var3.n, (u14) yc4Var3.f2598o);
                fi1 fi1VarI = b24Var.i();
                fi1VarI.getClass();
                return new b24(yc4Var4, fi1VarI, b24Var.t, (ns4) obj2);
            case 14:
                ru3 ru3Var = (ru3) obj;
                String str = (String) obj2;
                ou3 ou3Var = ru3Var.r;
                String str2 = ru3Var.s;
                ou3Var.getClass();
                str2.getClass();
                if (str.equals("<init>")) {
                    collectionQ = lv0.P0(ou3Var.n());
                    arrayList = new ArrayList();
                    for (Object obj3 : collectionQ) {
                        z61 z61Var = (z61) obj3;
                        if (z61Var.t()) {
                            zs0 zs0VarI = z61Var.i();
                            zs0VarI.getClass();
                            if (pi3.c(zs0VarI)) {
                                String strL2 = og6.c(z61Var).l();
                                if (!bc7.N(false, strL2, "constructor-impl") || !bc7.G(false, strL2, ")V")) {
                                    an4.l("Invalid signature of ", z61Var, ": ", strL2);
                                    return null;
                                }
                                String strJ0 = ub7.j0(strL2, "V");
                                zs0 zs0VarI2 = z61Var.i();
                                zs0VarI2.getClass();
                                js0 js0VarF = bp1.f(zs0VarI2);
                                js0VarF.getClass();
                                strL = strJ0.concat(os0.b(js0VarF.b()));
                            } else {
                                strL = og6.c(z61Var).l();
                            }
                        } else {
                            strL = og6.c(z61Var).l();
                        }
                        if (im3.n(strL, str2)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    collectionQ = ou3Var.q(sy4.e(str));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : collectionQ) {
                        if (im3.n(og6.c((xw2) obj4).l(), str2)) {
                            arrayList2.add(obj4);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.size() == 1) {
                    return (xw2) lv0.F0(arrayList);
                }
                String strT0 = lv0.t0(collectionQ, "\n", null, null, ek.Q, 30);
                StringBuilder sbO = e41.o("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbO.append(ou3Var);
                sbO.append(':');
                sbO.append(strT0.length() == 0 ? " no members found" : "\n".concat(strT0));
                throw new kz3(sbO.toString());
            case 15:
                qw3 qw3Var = (qw3) obj;
                Function0 function0 = (Function0) obj2;
                List listM0 = qw3Var.m.m0();
                if (listM0.isEmpty()) {
                    return list;
                }
                u14 u14VarX = ds1.X(l54.m, new pw3(qw3Var, b3));
                ArrayList arrayList3 = new ArrayList(mv0.Z(listM0, 10));
                for (Object obj5 : listM0) {
                    int i2 = i + 1;
                    if (i < 0) {
                        qf0.U();
                        throw null;
                    }
                    h58 h58Var = (h58) obj5;
                    if (h58Var.c()) {
                        uw3Var = uw3.c;
                    } else {
                        oz3 oz3VarB = h58Var.b();
                        oz3VarB.getClass();
                        qw3 qw3Var2 = new qw3(oz3VarB, function0 == null ? null : new so4(qw3Var, i, u14VarX));
                        int iOrdinal = h58Var.a().ordinal();
                        if (iOrdinal == 0) {
                            uw3Var = new uw3(vw3.m, qw3Var2);
                        } else if (iOrdinal == 1) {
                            uw3Var = new uw3(vw3.n, qw3Var2);
                        } else {
                            if (iOrdinal != 2) {
                                gk0.s();
                                return null;
                            }
                            uw3Var = new uw3(vw3.f2355o, qw3Var2);
                        }
                    }
                    arrayList3.add(uw3Var);
                    i = i2;
                }
                return arrayList3;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new i24(((j24) obj).a, (k86) obj2);
            case 17:
                Object obj6 = ((s24) obj).b.m;
                ((bu5) ((k76) obj2).m).getClass();
                return null;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                uz3 uz3Var = (uz3) obj2;
                List list2 = (List) ((i35) obj).e.getValue();
                if (list2 != null) {
                    list = list2;
                }
                ArrayList arrayList4 = new ArrayList(mv0.Z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((m98) it2.next()).q0(uz3Var));
                }
                return arrayList4;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Function1) obj).invoke(((wn5) obj2).a);
                return f88Var;
            case 20:
                ((Function1) obj).invoke((z31) obj2);
                return f88Var;
            case 21:
                d48 d48Var = (d48) obj;
                wr0 wr0Var = (wr0) obj2;
                xd4 xd4Var2 = d48Var.P;
                eq1 eq1Var = d48Var.Q;
                up annotations2 = wr0Var.getAnnotations();
                int iK = wr0Var.k();
                if (iK == 0) {
                    throw null;
                }
                eq1 eq1Var2 = d48Var.Q;
                s67 s67VarC = eq1Var2.c();
                s67VarC.getClass();
                d48 d48Var2 = new d48(xd4Var2, eq1Var, wr0Var, d48Var, annotations2, iK, s67VarC);
                d48.S.getClass();
                m58 m58VarD = eq1Var2.D0() == null ? null : m58.d(eq1Var2.E0());
                if (m58VarD == null) {
                    return null;
                }
                v14 v14Var = wr0Var.v;
                v14 v14VarD = v14Var != null ? v14Var.d(m58VarD) : null;
                List listX = wr0Var.X();
                listX.getClass();
                ArrayList arrayList5 = new ArrayList(mv0.Z(listX, 10));
                Iterator it3 = listX.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((v14) it3.next()).d(m58VarD));
                }
                List listK0 = eq1Var2.k0();
                List listJ = d48Var.J();
                oz3 oz3Var = d48Var.s;
                oz3Var.getClass();
                d48Var2.H0(null, v14VarD, arrayList5, listK0, listJ, oz3Var, as4.n, eq1Var2.r);
                return d48Var2;
            default:
                fp1 fp1Var = ((q48) obj).a;
                return ((ap) ((io.sentry.android.replay.screenshot.k) fp1Var.a).e).a((aw5) obj2, (ty4) fp1Var.b);
        }
    }

    public /* synthetic */ e3(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f674o = obj2;
    }

    public /* synthetic */ e3(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.f674o = obj;
        this.n = obj2;
    }
}

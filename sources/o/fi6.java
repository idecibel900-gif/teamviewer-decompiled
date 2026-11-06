package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi6 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ fi6(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        np npVar;
        Object objA;
        switch (this.m) {
            case 0:
                return Integer.valueOf(((qo7) obj2).a);
            case 1:
                return Integer.valueOf(((xp7) obj2).a);
            case 2:
                return Integer.valueOf(((k93) obj2).a);
            case 3:
                return Integer.valueOf(((ks2) obj2).a);
            case 4:
                return Integer.valueOf(((ls2) obj2).a);
            case 5:
                qt7 qt7Var = (qt7) obj2;
                return qt7Var != null ? qt7.a(qt7Var.a, qt7.c) : false ? Boolean.FALSE : qf0.p(Float.valueOf(qt7.c(qt7Var.a)), hi6.a(new rt7(qt7.b(qt7Var.a)), hi6.y, (jh6) obj));
            case 6:
                ea4 ea4Var = (ea4) obj2;
                return qf0.p(ea4Var.a, hi6.a(ea4Var.b, hi6.j, (jh6) obj));
            case 7:
                long j = ((rt7) obj2).a;
                if (rt7.a(j, 8589934592L)) {
                    return 0;
                }
                if (rt7.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 8:
                t65 t65Var = (t65) obj2;
                return t65Var != null ? t65.b(t65Var.a, 9205357640488583168L) : false ? Boolean.FALSE : qf0.p(Float.valueOf(Float.intBitsToFloat((int) (t65Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (t65Var.a & 4294967295L))));
            case ep1.b /* 9 */:
                jh6 jh6Var = (jh6) obj;
                wo woVar = (wo) obj2;
                Object obj3 = woVar.a;
                if (obj3 instanceof gf5) {
                    npVar = np.m;
                } else if (obj3 instanceof c77) {
                    npVar = np.n;
                } else if (obj3 instanceof sc8) {
                    npVar = np.f1588o;
                } else if (obj3 instanceof z98) {
                    npVar = np.p;
                } else if (obj3 instanceof fa4) {
                    npVar = np.q;
                } else if (obj3 instanceof ea4) {
                    npVar = np.r;
                } else {
                    if (!(obj3 instanceof db7)) {
                        gk0.u();
                        return null;
                    }
                    npVar = np.s;
                }
                switch (npVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = hi6.a((gf5) obj3, hi6.h, jh6Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = hi6.a((c77) obj3, hi6.i, jh6Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = hi6.a((sc8) obj3, hi6.d, jh6Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = hi6.a((z98) obj3, hi6.e, jh6Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = hi6.a((fa4) obj3, hi6.f, jh6Var);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = hi6.a((ea4) obj3, hi6.g, jh6Var);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((db7) obj3).a;
                        break;
                    default:
                        gk0.s();
                        return null;
                }
                return qf0.p(npVar, objA, Integer.valueOf(woVar.b), Integer.valueOf(woVar.c), woVar.d);
            case ep1.c /* 10 */:
                jh6 jh6Var2 = (jh6) obj;
                List list = ((kd4) obj2).m;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(hi6.a((jd4) list.get(i), hi6.B, jh6Var2));
                }
                return arrayList;
            case 11:
                return ((jd4) obj2).a.toLanguageTag();
            case ep1.d /* 12 */:
                jh6 jh6Var3 = (jh6) obj;
                p94 p94Var = (p94) obj2;
                return qf0.p(hi6.a(new m94(p94Var.a), hi6.D, jh6Var3), hi6.a(new o94(p94Var.b), hi6.E, jh6Var3), hi6.a(new n94(p94Var.c), hi6.F, jh6Var3));
            case 13:
                return Float.valueOf(((m94) obj2).a);
            case 14:
                return Integer.valueOf(((o94) obj2).a);
            case 15:
                return Integer.valueOf(((n94) obj2).a);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return ((sc8) obj2).a;
            case 17:
                jh6 jh6Var4 = (jh6) obj;
                gf5 gf5Var = (gf5) obj2;
                Object objA2 = hi6.a(new qo7(gf5Var.a), hi6.s, jh6Var4);
                Object objA3 = hi6.a(new xp7(gf5Var.b), hi6.t, jh6Var4);
                Object objA4 = hi6.a(new qt7(gf5Var.c), hi6.x, jh6Var4);
                es7 es7Var = gf5Var.d;
                es7 es7Var2 = es7.c;
                Object objA5 = hi6.a(es7Var, hi6.m, jh6Var4);
                Object objA6 = hi6.a(gf5Var.e, ck3.H, jh6Var4);
                p94 p94Var2 = gf5Var.f;
                p94 p94Var3 = p94.d;
                return qf0.p(objA2, objA3, objA4, objA5, objA6, hi6.a(p94Var2, hi6.C, jh6Var4), hi6.a(new k94(gf5Var.g), ck3.J, jh6Var4), hi6.a(new k93(gf5Var.h), hi6.u, jh6Var4), hi6.a(gf5Var.i, ck3.K, jh6Var4));
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((z98) obj2).a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                jh6 jh6Var5 = (jh6) obj;
                c77 c77Var = (c77) obj2;
                rv0 rv0Var = new rv0(c77Var.a.b());
                gi6 gi6Var = hi6.r;
                Object objA7 = hi6.a(rv0Var, gi6Var, jh6Var5);
                qt7 qt7Var2 = new qt7(c77Var.b);
                gi6 gi6Var2 = hi6.x;
                Object objA8 = hi6.a(qt7Var2, gi6Var2, jh6Var5);
                ms2 ms2Var = c77Var.c;
                ms2 ms2Var2 = ms2.n;
                Object objA9 = hi6.a(ms2Var, hi6.n, jh6Var5);
                Object objA10 = hi6.a(c77Var.d, hi6.v, jh6Var5);
                Object objA11 = hi6.a(c77Var.e, hi6.w, jh6Var5);
                String str = c77Var.g;
                Object objA12 = hi6.a(new qt7(c77Var.h), gi6Var2, jh6Var5);
                Object objA13 = hi6.a(c77Var.i, hi6.f976o, jh6Var5);
                Object objA14 = hi6.a(c77Var.j, hi6.l, jh6Var5);
                kd4 kd4Var = c77Var.k;
                kd4 kd4Var2 = kd4.f1251o;
                Object objA15 = hi6.a(kd4Var, hi6.A, jh6Var5);
                Object objA16 = hi6.a(new rv0(c77Var.l), gi6Var, jh6Var5);
                Object objA17 = hi6.a(c77Var.m, hi6.k, jh6Var5);
                lw6 lw6Var = c77Var.n;
                lw6 lw6Var2 = lw6.d;
                return qf0.p(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, hi6.a(lw6Var, hi6.q, jh6Var5));
            case 20:
                jh6 jh6Var6 = (jh6) obj;
                bt7 bt7Var = (bt7) obj2;
                c77 c77Var2 = bt7Var.a;
                a65 a65Var = hi6.i;
                return qf0.p(hi6.a(c77Var2, a65Var, jh6Var6), hi6.a(bt7Var.b, a65Var, jh6Var6), hi6.a(bt7Var.c, a65Var, jh6Var6), hi6.a(bt7Var.d, a65Var, jh6Var6));
            case 21:
                gm5 gm5Var = (gm5) obj2;
                Boolean boolValueOf = Boolean.valueOf(gm5Var.a);
                a65 a65Var2 = hi6.a;
                return qf0.p(boolValueOf, hi6.a(new o92(gm5Var.b), ck3.I, (jh6) obj));
            case 22:
                return Integer.valueOf(((o92) obj2).a);
            case 23:
                return Integer.valueOf(((k94) obj2).a);
            case 24:
                dt7 dt7Var = (dt7) obj2;
                return qf0.p(hi6.a(new ct7(dt7Var.a), ck3.L, (jh6) obj), Boolean.valueOf(dt7Var.b));
            case 25:
                return Integer.valueOf(((ct7) obj2).a);
            case 26:
                return Integer.valueOf(((hk6) obj2).a.z());
            case 27:
                Collection collection = (List) obj;
                List list2 = (List) obj2;
                if (collection == null) {
                    collection = ea2.m;
                }
                return lv0.A0(collection, list2);
            case 28:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            default:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
        }
    }
}

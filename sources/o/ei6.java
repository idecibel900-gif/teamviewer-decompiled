package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ei6 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ei6(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rv0 rv0Var;
        wo woVar;
        rv0 rv0Var2;
        rv0 rv0Var3;
        int i = 0;
        o92Var = null;
        o92 o92Var = null;
        lw6Var = null;
        lw6 lw6Var = null;
        dt7Var = null;
        dt7 dt7Var = null;
        ea4Var = null;
        ea4 ea4Var = null;
        fa4Var = null;
        fa4 fa4Var = null;
        z98Var = null;
        z98 z98Var = null;
        sc8Var = null;
        sc8 sc8Var = null;
        c77Var = null;
        c77 c77Var = null;
        gf5Var = null;
        gf5 gf5Var = null;
        switch (this.m) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i2 = rv0.i;
                Boolean bool = Boolean.FALSE;
                im3.n(obj2, bool);
                if (obj2 != null) {
                    rv0Var = im3.n(obj2, Boolean.FALSE) ? new rv0(rv0.h) : new rv0(j51.i(((Integer) obj2).intValue()));
                } else {
                    rv0Var = null;
                }
                rv0Var.getClass();
                long j = rv0Var.a;
                Object obj3 = list.get(1);
                gi6 gi6Var = hi6.z;
                im3.n(obj3, bool);
                t65 t65Var = obj3 != null ? (t65) gi6Var.n.invoke(obj3) : null;
                t65Var.getClass();
                long j2 = t65Var.a;
                Object obj4 = list.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new lw6(j, j2, f.floatValue());
            case 1:
                obj.getClass();
                return new qo7(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj5 = list2.get(0);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                Object obj6 = list2.get(1);
                return new fa4(str, (im3.n(obj6, Boolean.FALSE) || obj6 == null) ? null : (bt7) ((Function1) hi6.j.f302o).invoke(obj6), null);
            case 3:
                obj.getClass();
                return new xp7(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new k93(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                while (i < size) {
                    Object obj7 = list3.get(i);
                    wo woVar2 = (im3.n(obj7, Boolean.FALSE) || obj7 == null) ? null : (wo) ((Function1) hi6.c.f302o).invoke(obj7);
                    woVar2.getClass();
                    arrayList.add(woVar2);
                    i++;
                }
                return arrayList;
            case 6:
                obj.getClass();
                return new ks2(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                return new ls2(((Integer) obj).intValue());
            case 8:
                Boolean bool2 = Boolean.FALSE;
                if (im3.n(obj, bool2)) {
                    return new qt7(qt7.c);
                }
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                Float f2 = obj8 != null ? (Float) obj8 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj9 = list4.get(1);
                gi6 gi6Var2 = hi6.y;
                im3.n(obj9, bool2);
                rt7 rt7Var = obj9 != null ? (rt7) gi6Var2.n.invoke(obj9) : null;
                rt7Var.getClass();
                return new qt7(h67.n(fFloatValue, rt7Var.a));
            case ep1.b /* 9 */:
                if (im3.n(obj, 0)) {
                    return new rt7(8589934592L);
                }
                return im3.n(obj, 1) ? new rt7(4294967296L) : new rt7(0L);
            case ep1.c /* 10 */:
                if (im3.n(obj, Boolean.FALSE)) {
                    return new t65(9205357640488583168L);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f3 = obj10 != null ? (Float) obj10 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj11 = list5.get(1);
                Float f4 = obj11 != null ? (Float) obj11 : null;
                f4.getClass();
                return new t65((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L));
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list6.size());
                int size2 = list6.size();
                while (i < size2) {
                    Object obj12 = list6.get(i);
                    jd4 jd4Var = (im3.n(obj12, Boolean.FALSE) || obj12 == null) ? null : (jd4) ((Function1) hi6.B.f302o).invoke(obj12);
                    jd4Var.getClass();
                    arrayList2.add(jd4Var);
                    i++;
                }
                return new kd4(arrayList2);
            case ep1.d /* 12 */:
                obj.getClass();
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (im3.n(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new jd4(localeForLanguageTag);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                Object obj14 = list7.get(1);
                return new ea4(str3, (im3.n(obj14, Boolean.FALSE) || obj14 == null) ? null : (bt7) ((Function1) hi6.j.f302o).invoke(obj14), null);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                float f5 = m94.b;
                gi6 gi6Var3 = hi6.D;
                Boolean bool3 = Boolean.FALSE;
                im3.n(obj15, bool3);
                m94 m94Var = obj15 != null ? (m94) gi6Var3.n.invoke(obj15) : null;
                m94Var.getClass();
                float f6 = m94Var.a;
                Object obj16 = list8.get(1);
                gi6 gi6Var4 = hi6.E;
                im3.n(obj16, bool3);
                o94 o94Var = obj16 != null ? (o94) gi6Var4.n.invoke(obj16) : null;
                o94Var.getClass();
                int i3 = o94Var.a;
                Object obj17 = list8.get(2);
                gi6 gi6Var5 = hi6.F;
                im3.n(obj17, bool3);
                n94 n94Var = obj17 != null ? (n94) gi6Var5.n.invoke(obj17) : null;
                n94Var.getClass();
                return new p94(f6, i3, n94Var.a);
            case 15:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                m94.a(fFloatValue3);
                return new m94(fFloatValue3);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                obj.getClass();
                return new o94(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj18 = list9.get(0);
                np npVar = obj18 != null ? (np) obj18 : null;
                npVar.getClass();
                Object obj19 = list9.get(2);
                Integer num = obj19 != null ? (Integer) obj19 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj20 = list9.get(3);
                Integer num2 = obj20 != null ? (Integer) obj20 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj21 = list9.get(4);
                String str4 = obj21 != null ? (String) obj21 : null;
                str4.getClass();
                switch (npVar.ordinal()) {
                    case 0:
                        Object obj22 = list9.get(1);
                        a65 a65Var = hi6.h;
                        if (!im3.n(obj22, Boolean.FALSE) && obj22 != null) {
                            gf5Var = (gf5) ((Function1) a65Var.f302o).invoke(obj22);
                        }
                        gf5Var.getClass();
                        woVar = new wo(gf5Var, iIntValue, iIntValue2, str4);
                        break;
                    case 1:
                        Object obj23 = list9.get(1);
                        a65 a65Var2 = hi6.i;
                        if (!im3.n(obj23, Boolean.FALSE) && obj23 != null) {
                            c77Var = (c77) ((Function1) a65Var2.f302o).invoke(obj23);
                        }
                        c77Var.getClass();
                        woVar = new wo(c77Var, iIntValue, iIntValue2, str4);
                        break;
                    case 2:
                        Object obj24 = list9.get(1);
                        a65 a65Var3 = hi6.d;
                        if (!im3.n(obj24, Boolean.FALSE) && obj24 != null) {
                            sc8Var = (sc8) ((Function1) a65Var3.f302o).invoke(obj24);
                        }
                        sc8Var.getClass();
                        woVar = new wo(sc8Var, iIntValue, iIntValue2, str4);
                        break;
                    case 3:
                        Object obj25 = list9.get(1);
                        a65 a65Var4 = hi6.e;
                        if (!im3.n(obj25, Boolean.FALSE) && obj25 != null) {
                            z98Var = (z98) ((Function1) a65Var4.f302o).invoke(obj25);
                        }
                        z98Var.getClass();
                        woVar = new wo(z98Var, iIntValue, iIntValue2, str4);
                        break;
                    case 4:
                        Object obj26 = list9.get(1);
                        a65 a65Var5 = hi6.f;
                        if (!im3.n(obj26, Boolean.FALSE) && obj26 != null) {
                            fa4Var = (fa4) ((Function1) a65Var5.f302o).invoke(obj26);
                        }
                        fa4Var.getClass();
                        woVar = new wo(fa4Var, iIntValue, iIntValue2, str4);
                        break;
                    case 5:
                        Object obj27 = list9.get(1);
                        a65 a65Var6 = hi6.g;
                        if (!im3.n(obj27, Boolean.FALSE) && obj27 != null) {
                            ea4Var = (ea4) ((Function1) a65Var6.f302o).invoke(obj27);
                        }
                        ea4Var.getClass();
                        woVar = new wo(ea4Var, iIntValue, iIntValue2, str4);
                        break;
                    case 6:
                        Object obj28 = list9.get(1);
                        String str5 = obj28 != null ? (String) obj28 : null;
                        str5.getClass();
                        woVar = new wo(new db7(str5), iIntValue, iIntValue2, str4);
                        break;
                    default:
                        gk0.s();
                        return null;
                }
                return woVar;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                obj.getClass();
                return new n94(((Integer) obj).intValue());
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new sc8(str6);
            case 20:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new z98(str7);
            case 21:
                obj.getClass();
                List list10 = (List) obj;
                Object obj29 = list10.get(0);
                gi6 gi6Var6 = hi6.s;
                Boolean bool4 = Boolean.FALSE;
                im3.n(obj29, bool4);
                qo7 qo7Var = obj29 != null ? (qo7) gi6Var6.n.invoke(obj29) : null;
                qo7Var.getClass();
                int i4 = qo7Var.a;
                Object obj30 = list10.get(1);
                gi6 gi6Var7 = hi6.t;
                im3.n(obj30, bool4);
                xp7 xp7Var = obj30 != null ? (xp7) gi6Var7.n.invoke(obj30) : null;
                xp7Var.getClass();
                int i5 = xp7Var.a;
                Object obj31 = list10.get(2);
                rt7[] rt7VarArr = qt7.b;
                gi6 gi6Var8 = hi6.x;
                im3.n(obj31, bool4);
                qt7 qt7Var = obj31 != null ? (qt7) gi6Var8.n.invoke(obj31) : null;
                qt7Var.getClass();
                long j3 = qt7Var.a;
                Object obj32 = list10.get(3);
                es7 es7Var = es7.c;
                es7 es7Var2 = (im3.n(obj32, bool4) || obj32 == null) ? null : (es7) ((Function1) hi6.m.f302o).invoke(obj32);
                Object obj33 = list10.get(4);
                gm5 gm5Var = (im3.n(obj33, bool4) || obj33 == null) ? null : (gm5) ((Function1) ck3.H.f302o).invoke(obj33);
                Object obj34 = list10.get(5);
                p94 p94Var = p94.d;
                p94 p94Var2 = (im3.n(obj34, bool4) || obj34 == null) ? null : (p94) ((Function1) hi6.C.f302o).invoke(obj34);
                Object obj35 = list10.get(6);
                k94 k94Var = (im3.n(obj35, bool4) || obj35 == null) ? null : (k94) ((Function1) ck3.J.f302o).invoke(obj35);
                k94Var.getClass();
                int i6 = k94Var.a;
                Object obj36 = list10.get(7);
                gi6 gi6Var9 = hi6.u;
                im3.n(obj36, bool4);
                k93 k93Var = obj36 != null ? (k93) gi6Var9.n.invoke(obj36) : null;
                k93Var.getClass();
                int i7 = k93Var.a;
                Object obj37 = list10.get(8);
                a65 a65Var7 = ck3.K;
                if (!im3.n(obj37, bool4) && obj37 != null) {
                    dt7Var = (dt7) ((Function1) a65Var7.f302o).invoke(obj37);
                }
                return new gf5(i4, i5, j3, es7Var2, gm5Var, p94Var2, i6, i7, dt7Var);
            case 22:
                obj.getClass();
                List list11 = (List) obj;
                Object obj38 = list11.get(0);
                int i8 = rv0.i;
                Boolean bool5 = Boolean.FALSE;
                im3.n(obj38, bool5);
                if (obj38 != null) {
                    rv0Var2 = im3.n(obj38, Boolean.FALSE) ? new rv0(rv0.h) : new rv0(j51.i(((Integer) obj38).intValue()));
                } else {
                    rv0Var2 = null;
                }
                rv0Var2.getClass();
                long j4 = rv0Var2.a;
                Object obj39 = list11.get(1);
                rt7[] rt7VarArr2 = qt7.b;
                Function1 function1 = hi6.x.n;
                im3.n(obj39, bool5);
                qt7 qt7Var2 = obj39 != null ? (qt7) function1.invoke(obj39) : null;
                qt7Var2.getClass();
                long j5 = qt7Var2.a;
                Object obj40 = list11.get(2);
                ms2 ms2Var = ms2.n;
                ms2 ms2Var2 = (im3.n(obj40, bool5) || obj40 == null) ? null : (ms2) ((Function1) hi6.n.f302o).invoke(obj40);
                Object obj41 = list11.get(3);
                ks2 ks2Var = (im3.n(obj41, bool5) || obj41 == null) ? null : (ks2) ((Function1) hi6.v.f302o).invoke(obj41);
                Object obj42 = list11.get(4);
                ls2 ls2Var = (im3.n(obj42, bool5) || obj42 == null) ? null : (ls2) ((Function1) hi6.w.f302o).invoke(obj42);
                Object obj43 = list11.get(6);
                String str8 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list11.get(7);
                im3.n(obj44, bool5);
                qt7 qt7Var3 = obj44 != null ? (qt7) function1.invoke(obj44) : null;
                qt7Var3.getClass();
                long j6 = qt7Var3.a;
                Object obj45 = list11.get(8);
                h40 h40Var = (im3.n(obj45, bool5) || obj45 == null) ? null : (h40) ((Function1) hi6.f976o.f302o).invoke(obj45);
                Object obj46 = list11.get(9);
                cs7 cs7Var = (im3.n(obj46, bool5) || obj46 == null) ? null : (cs7) ((Function1) hi6.l.f302o).invoke(obj46);
                Object obj47 = list11.get(10);
                kd4 kd4Var = kd4.f1251o;
                kd4 kd4Var2 = (im3.n(obj47, bool5) || obj47 == null) ? null : (kd4) ((Function1) hi6.A.f302o).invoke(obj47);
                Object obj48 = list11.get(11);
                im3.n(obj48, bool5);
                if (obj48 != null) {
                    rv0Var3 = im3.n(obj48, Boolean.FALSE) ? new rv0(rv0.h) : new rv0(j51.i(((Integer) obj48).intValue()));
                } else {
                    rv0Var3 = null;
                }
                rv0Var3.getClass();
                long j7 = rv0Var3.a;
                Object obj49 = list11.get(12);
                vp7 vp7Var = (im3.n(obj49, bool5) || obj49 == null) ? null : (vp7) ((Function1) hi6.k.f302o).invoke(obj49);
                Object obj50 = list11.get(13);
                lw6 lw6Var2 = lw6.d;
                a65 a65Var8 = hi6.q;
                if (!im3.n(obj50, bool5) && obj50 != null) {
                    lw6Var = (lw6) ((Function1) a65Var8.f302o).invoke(obj50);
                }
                return new c77(j4, j5, ms2Var2, ks2Var, ls2Var, null, str8, j6, h40Var, cs7Var, kd4Var2, j7, vp7Var, lw6Var, 49184);
            case 23:
                obj.getClass();
                List list12 = (List) obj;
                Object obj51 = list12.get(0);
                Boolean bool6 = obj51 != null ? (Boolean) obj51 : null;
                bool6.getClass();
                boolean zBooleanValue = bool6.booleanValue();
                Object obj52 = list12.get(1);
                a65 a65Var9 = ck3.I;
                if (!im3.n(obj52, Boolean.FALSE) && obj52 != null) {
                    o92Var = (o92) ((Function1) a65Var9.f302o).invoke(obj52);
                }
                o92Var.getClass();
                return new gm5(o92Var.a, zBooleanValue);
            case 24:
                obj.getClass();
                return new o92(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new k94(((Integer) obj).intValue());
            case 26:
                obj.getClass();
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                ct7 ct7Var = (im3.n(obj53, Boolean.FALSE) || obj53 == null) ? null : (ct7) ((Function1) ck3.L.f302o).invoke(obj53);
                ct7Var.getClass();
                int i9 = ct7Var.a;
                Object obj54 = list13.get(1);
                Boolean bool7 = obj54 != null ? (Boolean) obj54 : null;
                bool7.getClass();
                return new dt7(i9, bool7.booleanValue());
            case 27:
                obj.getClass();
                return new ct7(((Integer) obj).intValue());
            case 28:
                return Integer.valueOf(((uj6) obj).b);
            default:
                return Integer.valueOf(((uj6) obj).c.c());
        }
    }
}

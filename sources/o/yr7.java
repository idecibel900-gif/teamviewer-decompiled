package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr7 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ yr7(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bt7 bt7VarB;
        c77 c77Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                a65 a65Var = hi6.a;
                Boolean bool = Boolean.FALSE;
                xo xoVar = (im3.n(obj2, bool) || obj2 == null) ? null : (xo) ((Function1) a65Var.f302o).invoke(obj2);
                xoVar.getClass();
                Object obj3 = list.get(1);
                int i = gt7.c;
                gt7 gt7Var = (im3.n(obj3, bool) || obj3 == null) ? null : (gt7) ((Function1) hi6.p.f302o).invoke(obj3);
                gt7Var.getClass();
                return new zr7(xoVar, gt7Var.a, (gt7) null);
            case 1:
                return f88Var;
            case 2:
                return f88Var;
            case 3:
                return f88Var;
            case 4:
                return f88Var;
            case 5:
                return f88Var;
            case 6:
                wo woVar = (wo) obj;
                Object obj4 = woVar.a;
                if (!(obj4 instanceof ga4) || (bt7VarB = ((ga4) obj4).b()) == null || (bt7VarB.a == null && bt7VarB.b == null && bt7VarB.c == null && bt7VarB.d == null)) {
                    return qf0.p(woVar);
                }
                Object obj5 = woVar.a;
                obj5.getClass();
                bt7 bt7VarB2 = ((ga4) obj5).b();
                if (bt7VarB2 == null || (c77Var = bt7VarB2.a) == null) {
                    c77Var = new c77(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return qf0.p(woVar, new wo(woVar.b, woVar.c, c77Var));
            case 7:
                ((op6) obj).d(kp6.B, f88Var);
                return f88Var;
            case 8:
                return Boolean.valueOf(((ce5) obj) instanceof ae5);
            case ep1.b /* 9 */:
                return Boolean.valueOf(((ce5) obj) instanceof zd5);
            case ep1.c /* 10 */:
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                obj6.getClass();
                return new qu7((yu7) obj6, list2.get(1));
            case 11:
                List list3 = (List) obj;
                list3.getClass();
                return list3;
            case ep1.d /* 12 */:
                ug6 ug6Var = (ug6) obj;
                ug6Var.getClass();
                return Boolean.valueOf(ug6Var.F0());
            case 13:
                rn6 rn6Var = (rn6) obj;
                long j = rn6Var.r;
                br5 br5Var = rn6Var.t;
                if (br5Var != null) {
                    br5Var.f(rn6Var, ck3.N, rn6Var.s);
                }
                long j2 = rn6Var.r;
                if (j != j2) {
                    mn6 mn6Var = rn6Var.A;
                    if (mn6Var != null) {
                        if (mn6Var.a > j2) {
                            rn6Var.C0();
                        } else {
                            mn6Var.g = j2;
                            if (mn6Var.b == null) {
                                mn6Var.h = vn4.t0((1.0d - ((double) mn6Var.e.a(0))) * rn6Var.r);
                            }
                        }
                    } else if (j2 != 0) {
                        rn6Var.F0();
                    }
                }
                return f88Var;
            case 14:
                ug6 ug6Var2 = (ug6) obj;
                ug6Var2.getClass();
                zu6 zu6Var = new zu6();
                while (ug6Var2.F0()) {
                    zu6Var.add(Integer.valueOf((int) ug6Var2.getLong(0)));
                }
                return lv1.E(zu6Var);
            case 15:
                aq3 aq3Var = (aq3) obj;
                aq3Var.getClass();
                aq3Var.a = true;
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                List list4 = (List) obj;
                return new b48((yu7) list4.get(0), (yu7) list4.get(1));
            case 17:
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new mo(((Float) obj).floatValue());
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new mo(((Integer) obj).intValue());
            case 20:
                return Integer.valueOf((int) ((mo) obj).a);
            case 21:
                return new mo(((w32) obj).m);
            case 22:
                return new w32(((mo) obj).a);
            case 23:
                z32 z32Var = (z32) obj;
                return new no(z32.a(z32Var.a), z32.b(z32Var.a));
            case 24:
                no noVar = (no) obj;
                return new z32((((long) Float.floatToRawIntBits(noVar.a)) << 32) | (((long) Float.floatToRawIntBits(noVar.b)) & 4294967295L));
            case 25:
                y07 y07Var = (y07) obj;
                return new no(Float.intBitsToFloat((int) (y07Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & y07Var.a)));
            case 26:
                no noVar2 = (no) obj;
                return new y07((((long) Float.floatToRawIntBits(noVar2.a)) << 32) | (((long) Float.floatToRawIntBits(noVar2.b)) & 4294967295L));
            case 27:
                t65 t65Var = (t65) obj;
                return new no(Float.intBitsToFloat((int) (t65Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & t65Var.a)));
            case 28:
                no noVar3 = (no) obj;
                return new t65((((long) Float.floatToRawIntBits(noVar3.a)) << 32) | (((long) Float.floatToRawIntBits(noVar3.b)) & 4294967295L));
            default:
                long j3 = ((vk3) obj).a;
                return new no((int) (j3 >> 32), (int) (j3 & 4294967295L));
        }
    }
}

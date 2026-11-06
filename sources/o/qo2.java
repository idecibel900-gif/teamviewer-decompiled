package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo2 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ qo2(byte b) {
        this.m = b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x019c A[LOOP:1: B:31:0x0155->B:44:0x019c, LOOP_END] */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        byte b2 = 2;
        f88 f88Var = f88.a;
        Object objValueOf = null;
        byte b3 = 1;
        switch (b) {
            case 0:
                return Boolean.valueOf(im3.n(obj, obj2));
            case 1:
                ((Integer) obj).intValue();
                ns1 ns1Var = (ns1) obj2;
                ns1Var.getClass();
                return Long.valueOf(ns1Var.a);
            case 2:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return f88Var;
            case 3:
                return f88Var;
            case 4:
                ((Integer) obj).intValue();
                l33 l33Var = (l33) obj2;
                l33Var.getClass();
                return l33Var.a;
            case 5:
                w44 w44Var = (w44) obj2;
                return qf0.L(Integer.valueOf(w44Var.h()), Integer.valueOf(w44Var.i()));
            case 6:
                Map mapE = ((c54) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case 7:
                ux2 ux2Var = (ux2) obj;
                ((Integer) obj2).getClass();
                ux2Var.W(-25408333);
                bm2 bm2Var = new bm2();
                ux2Var.p(false);
                return bm2Var;
            case 8:
                ((Integer) obj).intValue();
                j74 j74Var = (j74) obj2;
                j74Var.getClass();
                return j74Var.a;
            case ep1.b /* 9 */:
                ((zg4) obj2).m = new w04((LayoutNode) obj, b3);
                return f88Var;
            case ep1.c /* 10 */:
                ux2 ux2Var2 = (ux2) obj;
                ((Integer) obj2).getClass();
                ux2Var2.W(-511854661);
                p90 p90Var = p90.a;
                WeakHashMap weakHashMap = wk8.w;
                h94 h94Var = new h94(b77.g(ux2Var2).l, 48);
                ux2Var2.p(false);
                return h94Var;
            case 11:
                return Integer.valueOf(((zn4) obj).k(((Integer) obj2).intValue()));
            case ep1.d /* 12 */:
                return Integer.valueOf(((zn4) obj).o(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((zn4) obj).V(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((zn4) obj).a(((Integer) obj2).intValue()));
            case 15:
                ie5 ie5Var = (ie5) obj2;
                fe5 fe5VarA = ie5Var.a();
                iA = fe5VarA != null ? fe5VarA.a() : 0;
                Integer numValueOf = Integer.valueOf(ie5Var.a.z());
                Float fValueOf = Float.valueOf(ie5Var.b.z());
                Integer numValueOf2 = Integer.valueOf(ie5Var.c.z());
                Integer numValueOf3 = Integer.valueOf(iA);
                fe5 fe5VarA2 = ie5Var.a();
                if (fe5VarA2 instanceof ee5) {
                    objValueOf = Float.valueOf(((ee5) fe5VarA2).a);
                } else if (fe5VarA2 instanceof de5) {
                    objValueOf = Float.valueOf(((de5) fe5VarA2).a);
                }
                return qf0.L(numValueOf, fValueOf, numValueOf2, numValueOf3, objValueOf);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ke5 ke5Var = (ke5) obj2;
                boolean z = ke5Var instanceof b48;
                return qf0.L(Integer.valueOf(z ? 1 : 0), z ? ((hw2) vt1.B(new xt7(b2), new yr7((byte) 16)).n).invoke((jh6) obj, (b48) ke5Var) : null);
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                lh6 lh6Var = (lh6) obj2;
                Map map = lh6Var.m;
                jx4 jx4Var = lh6Var.n;
                Object[] objArr = jx4Var.b;
                Object[] objArr2 = jx4Var.c;
                long[] jArr = jx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapE2 = ((nh6) objArr2[i4]).e();
                                    if (mapE2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapE2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return obj2;
            case 20:
                xo xoVar = (xo) obj2;
                return qf0.p(xoVar.n, hi6.a(xoVar.m, hi6.b, (jh6) obj));
            case 21:
                return Integer.valueOf(((vp7) obj2).a);
            case 22:
                cs7 cs7Var = (cs7) obj2;
                return qf0.p(Float.valueOf(cs7Var.a), Float.valueOf(cs7Var.b));
            case 23:
                jh6 jh6Var = (jh6) obj;
                es7 es7Var = (es7) obj2;
                qt7 qt7Var = new qt7(es7Var.a);
                gi6 gi6Var = hi6.x;
                return qf0.p(hi6.a(qt7Var, gi6Var, jh6Var), hi6.a(new qt7(es7Var.b), gi6Var, jh6Var));
            case 24:
                return Integer.valueOf(((ms2) obj2).m);
            case 25:
                fa4 fa4Var = (fa4) obj2;
                return qf0.p(fa4Var.a, hi6.a(fa4Var.b, hi6.j, (jh6) obj));
            case 26:
                return Float.valueOf(((h40) obj2).a);
            case 27:
                jh6 jh6Var2 = (jh6) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int iA = 0; iA < size; iA++) {
                    arrayList.add(hi6.a((wo) list.get(iA), hi6.c, jh6Var2));
                }
                return arrayList;
            case 28:
                gt7 gt7Var = (gt7) obj2;
                return qf0.p(Integer.valueOf((int) (gt7Var.a >> 32)), Integer.valueOf((int) (gt7Var.a & 4294967295L)));
            default:
                jh6 jh6Var3 = (jh6) obj;
                lw6 lw6Var = (lw6) obj2;
                return qf0.p(hi6.a(new rv0(lw6Var.a), hi6.r, jh6Var3), hi6.a(new t65(lw6Var.b), hi6.z, jh6Var3), Float.valueOf(lw6Var.c));
        }
    }
}

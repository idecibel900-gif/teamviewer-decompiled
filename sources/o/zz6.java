package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zz6 {
    public final boolean a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zz6(so soVar, boolean z, yc4 yc4Var, lp lpVar, boolean z2) {
        yc4Var.getClass();
        this.c = soVar;
        this.a = z;
        this.d = yc4Var;
        this.e = lpVar;
        this.b = z2;
    }

    public static void a(Object obj, ArrayList arrayList, t tVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) tVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, tVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:64:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:3: B:26:0x0057->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static c65 b(d58 d58Var) {
        ?? arrayList;
        oz3 oz3VarJ;
        b65 b65Var;
        d58Var.getClass();
        if (!(d58Var instanceof w24)) {
            return null;
        }
        List<sz3> upperBounds = ((g3) d58Var).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!db8.P((sz3) it.next())) {
                if (upperBounds.isEmpty()) {
                    if (upperBounds.isEmpty()) {
                        return null;
                    }
                    for (sz3 sz3Var : upperBounds) {
                        sz3Var.getClass();
                        if (x37.j((oz3) sz3Var) != null) {
                            arrayList = new ArrayList();
                            for (sz3 sz3Var2 : upperBounds) {
                                sz3Var2.getClass();
                                oz3VarJ = x37.j((oz3) sz3Var2);
                                if (oz3VarJ != null) {
                                    arrayList.add(oz3VarJ);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = upperBounds.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (upperBounds.isEmpty()) {
                            return null;
                        }
                        while (r0.hasNext()) {
                            sz3Var.getClass();
                            if (x37.j((oz3) sz3Var) != null) {
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    sz3Var2.getClass();
                                    oz3VarJ = x37.j((oz3) sz3Var2);
                                    if (oz3VarJ != null) {
                                        arrayList.add(oz3VarJ);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (c((sz3) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                if (arrayList.isEmpty()) {
                    b65Var = b65.n;
                    break;
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        b65Var = b65.n;
                        break;
                    }
                    if (!db8.X((sz3) it3.next())) {
                        b65Var = b65.f402o;
                        break;
                    }
                }
                return new c65(b65Var, arrayList != upperBounds);
            }
        }
        return null;
    }

    public static b65 c(sz3 sz3Var) {
        g07 g07VarM;
        g07 g07VarM2;
        sz3Var.getClass();
        um2 um2VarL = db8.l(sz3Var);
        if (um2VarL == null || (g07VarM = db8.h0(um2VarL)) == null) {
            g07VarM = db8.m(sz3Var);
            g07VarM.getClass();
        }
        if (db8.V(g07VarM)) {
            return b65.n;
        }
        um2 um2VarL2 = db8.l(sz3Var);
        if (um2VarL2 == null || (g07VarM2 = db8.L0(um2VarL2)) == null) {
            g07VarM2 = db8.m(sz3Var);
            g07VarM2.getClass();
        }
        if (db8.V(g07VarM2)) {
            return null;
        }
        return b65.f402o;
    }

    public ArrayList d(sz3 sz3Var) {
        yc4 yc4Var = (yc4) this.d;
        vo3 vo3Var = (vo3) ((u14) yc4Var.p).getValue();
        op opVar = ((io3) yc4Var.m).j;
        sz3Var.getClass();
        z2 z2Var = new z2(sz3Var, opVar.b(vo3Var, ((oz3) sz3Var).getAnnotations()), null);
        t tVar = new t(this, (byte) 3);
        ArrayList arrayList = new ArrayList(1);
        a(z2Var, arrayList, tVar);
        return arrayList;
    }

    public zz6(Context context, String str, nd ndVar, boolean z, boolean z2) {
        ndVar.getClass();
        this.c = context;
        this.d = str;
        this.e = ndVar;
        this.a = z;
        this.b = z2;
    }
}

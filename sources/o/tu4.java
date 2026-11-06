package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tu4 extends a95 {
    public static final a95[] c = new a95[0];
    public static final f78[] d = new f78[0];
    public final /* synthetic */ byte a;
    public final a95[] b;

    public tu4(Map map, byte b) {
        Collection collection;
        this.a = b;
        v20 v20Var = v20.B;
        v20 v20Var2 = v20.s;
        v20 v20Var3 = v20.A;
        v20 v20Var4 = v20.t;
        pi1 pi1Var = pi1.POSSIBLE_FORMATS;
        switch (b) {
            case 1:
                collection = map != null ? (Collection) map.get(pi1Var) : null;
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(v20Var4)) {
                        arrayList.add(new l72((byte) 0));
                    } else if (collection.contains(v20Var3)) {
                        arrayList.add(new l72((byte) 3));
                    }
                    if (collection.contains(v20Var2)) {
                        arrayList.add(new l72((byte) 2));
                    }
                    if (collection.contains(v20Var)) {
                        arrayList.add(new l72((byte) 1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new l72((byte) 0));
                    arrayList.add(new l72((byte) 2));
                    arrayList.add(new l72((byte) 1));
                }
                this.b = (f78[]) arrayList.toArray(d);
                break;
            default:
                collection = map != null ? (Collection) map.get(pi1Var) : null;
                boolean z = (map == null || map.get(pi1.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection != null) {
                    if (collection.contains(v20Var4) || collection.contains(v20Var3) || collection.contains(v20Var2) || collection.contains(v20Var)) {
                        arrayList2.add(new tu4(map, (byte) 1));
                    }
                    if (collection.contains(v20.f2267o)) {
                        arrayList2.add(new pu0(z));
                    }
                    if (collection.contains(v20.p)) {
                        arrayList2.add(new qu0());
                    }
                    if (collection.contains(v20.q)) {
                        arrayList2.add(new ou0());
                    }
                    if (collection.contains(v20.u)) {
                        arrayList2.add(new ad3());
                    }
                    if (collection.contains(v20.n)) {
                        arrayList2.add(new nu0());
                    }
                    if (collection.contains(v20.y)) {
                        arrayList2.add(new h06());
                    }
                    if (collection.contains(v20.z)) {
                        arrayList2.add(new i06());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new tu4(map, (byte) 1));
                    arrayList2.add(new pu0(false));
                    arrayList2.add(new nu0());
                    arrayList2.add(new qu0());
                    arrayList2.add(new ou0());
                    arrayList2.add(new ad3());
                    arrayList2.add(new h06());
                    arrayList2.add(new i06());
                }
                this.b = (a95[]) arrayList2.toArray(c);
                break;
        }
    }

    @Override // o.a95
    public final uc6 b(int i, i70 i70Var, Map map) throws d55 {
        byte b = this.a;
        a95[] a95VarArr = this.b;
        switch (b) {
            case 0:
                for (int i2 = 0; i2 < a95VarArr.length; i2++) {
                    try {
                        return a95VarArr[i2].b(i, i70Var, map);
                    } catch (p36 unused) {
                    }
                }
                throw d55.a();
            default:
                int[] iArrM = f78.m(i70Var);
                for (f78 f78Var : (f78[]) a95VarArr) {
                    try {
                        uc6 uc6VarK = f78Var.k(i, i70Var, iArrM, map);
                        boolean z = uc6VarK.d == v20.t && uc6VarK.a.charAt(0) == '0';
                        Collection collection = map == null ? null : (Collection) map.get(pi1.POSSIBLE_FORMATS);
                        v20 v20Var = v20.A;
                        boolean z2 = collection == null || collection.contains(v20Var);
                        if (!z || !z2) {
                            return uc6VarK;
                        }
                        uc6 uc6Var = new uc6(uc6VarK.a.substring(1), uc6VarK.b, uc6VarK.c, v20Var);
                        uc6Var.a(uc6VarK.e);
                        return uc6Var;
                    } catch (p36 unused2) {
                    }
                }
                throw d55.a();
        }
    }

    @Override // o.a95, o.n36
    public final void reset() {
        byte b = this.a;
        int i = 0;
        a95[] a95VarArr = this.b;
        switch (b) {
            case 0:
                int length = a95VarArr.length;
                while (i < length) {
                    a95VarArr[i].reset();
                    i++;
                }
                break;
            default:
                f78[] f78VarArr = (f78[]) a95VarArr;
                int length2 = f78VarArr.length;
                while (i < length2) {
                    f78VarArr[i].getClass();
                    i++;
                }
                break;
        }
    }
}

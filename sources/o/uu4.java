package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uu4 implements n36 {
    public static final n36[] c = new n36[0];
    public Map a;
    public n36[] b;

    @Override // o.n36
    public final uc6 a(cj3 cj3Var, Map map) {
        c(map);
        return b(cj3Var);
    }

    public final uc6 b(cj3 cj3Var) throws d55 {
        n36[] n36VarArr = this.b;
        if (n36VarArr != null) {
            for (n36 n36Var : n36VarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw d55.a();
                }
                try {
                    return n36Var.a(cj3Var, this.a);
                } catch (p36 unused) {
                }
            }
            Map map = this.a;
            if (map != null && map.containsKey(pi1.ALSO_INVERTED)) {
                k70 k70VarD = cj3Var.D();
                int length = k70VarD.p.length;
                for (int i = 0; i < length; i++) {
                    int[] iArr = k70VarD.p;
                    iArr[i] = ~iArr[i];
                }
                for (n36 n36Var2 : this.b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw d55.a();
                    }
                    try {
                        return n36Var2.a(cj3Var, this.a);
                    } catch (p36 unused2) {
                    }
                }
            }
        }
        throw d55.a();
    }

    public final void c(Map map) {
        this.a = map;
        byte b = 0;
        byte b2 = 1;
        boolean z = map != null && map.containsKey(pi1.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(pi1.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(v20.A) || collection.contains(v20.B) || collection.contains(v20.t) || collection.contains(v20.s) || collection.contains(v20.n) || collection.contains(v20.f2267o) || collection.contains(v20.p) || collection.contains(v20.q) || collection.contains(v20.u) || collection.contains(v20.y) || collection.contains(v20.z);
            if (z2 && !z) {
                arrayList.add(new tu4(map, (byte) 0));
            }
            if (collection.contains(v20.x)) {
                arrayList.add(new tg1((byte) 2));
            }
            if (collection.contains(v20.r)) {
                arrayList.add(new tg1((byte) 0));
            }
            if (collection.contains(v20.m)) {
                arrayList.add(new sc5(b2));
            }
            if (collection.contains(v20.w)) {
                arrayList.add(new sc5(b));
            }
            if (collection.contains(v20.v)) {
                arrayList.add(new tg1((byte) 1));
            }
            if (z2 && z) {
                arrayList.add(new tu4(map, (byte) 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new tu4(map, (byte) 0));
            }
            arrayList.add(new tg1((byte) 2));
            arrayList.add(new tg1((byte) 0));
            arrayList.add(new sc5(b2));
            arrayList.add(new sc5(b));
            arrayList.add(new tg1((byte) 1));
            if (z) {
                arrayList.add(new tu4(map, (byte) 0));
            }
        }
        this.b = (n36[]) arrayList.toArray(c);
    }

    @Override // o.n36
    public final void reset() {
        n36[] n36VarArr = this.b;
        if (n36VarArr != null) {
            for (n36 n36Var : n36VarArr) {
                n36Var.reset();
            }
        }
    }
}

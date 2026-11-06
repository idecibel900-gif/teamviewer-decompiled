package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gk5 extends v2 implements ef3 {
    public final /* synthetic */ byte m;
    public final zj5 n;

    public /* synthetic */ gk5(zj5 zj5Var, byte b) {
        this.m = b;
        this.n = zj5Var;
    }

    @Override // o.r0
    public final int a() {
        byte b = this.m;
        zj5 zj5Var = this.n;
        switch (b) {
            case 0:
                break;
        }
        return zj5Var.n;
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.m;
        zj5 zj5Var = this.n;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = zj5Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && zj5Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return zj5Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.m;
        zj5 zj5Var = this.n;
        switch (b) {
            case 0:
                s28 s28Var = zj5Var.m;
                t28[] t28VarArr = new t28[8];
                for (int i = 0; i < 8; i++) {
                    t28VarArr[i] = new u28((byte) 0);
                }
                return new hk5(s28Var, t28VarArr);
            default:
                s28 s28Var2 = zj5Var.m;
                t28[] t28VarArr2 = new t28[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    t28VarArr2[i2] = new u28((byte) 1);
                }
                return new hk5(s28Var2, t28VarArr2);
        }
    }
}

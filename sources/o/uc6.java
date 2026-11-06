package o;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uc6 {
    public final String a;
    public final byte[] b;
    public wc6[] c;
    public final v20 d;
    public Map e;

    public uc6(String str, byte[] bArr, wc6[] wc6VarArr, v20 v20Var, int i) {
        this.a = str;
        this.b = bArr;
        this.c = wc6VarArr;
        this.d = v20Var;
        this.e = null;
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(vc6 vc6Var, Object obj) {
        Map enumMap = this.e;
        if (enumMap == null) {
            enumMap = new EnumMap(vc6.class);
            this.e = enumMap;
        }
        enumMap.put(vc6Var, obj);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uc6(String str, byte[] bArr, wc6[] wc6VarArr, v20 v20Var) {
        this(str, bArr, wc6VarArr, v20Var, 0);
        System.currentTimeMillis();
    }
}

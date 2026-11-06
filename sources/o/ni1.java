package o;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class ni1 {
    public static final Pattern a = Pattern.compile(",");
    public static final HashMap b;

    static {
        EnumSet enumSetOf = EnumSet.of(v20.x);
        EnumSet enumSetOf2 = EnumSet.of(v20.r);
        EnumSet enumSetOf3 = EnumSet.of(v20.m);
        EnumSet enumSetOf4 = EnumSet.of(v20.w);
        EnumSet enumSetOf5 = EnumSet.of(v20.A, v20.B, v20.t, v20.s, v20.y, v20.z);
        EnumSet enumSetOf6 = EnumSet.of(v20.f2267o, v20.p, v20.q, v20.u, v20.n);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        b = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}

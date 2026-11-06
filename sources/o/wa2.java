package o;

import java.util.Collections;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 {
    public static final wa2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wa2[] f2394o;
    public final nx3 m;

    static {
        bd bdVarQ = cd.q();
        bdVarQ.c();
        ((cd) bdVarQ.n).r();
        bdVarQ.c();
        ((cd) bdVarQ.n).s();
        bdVarQ.c();
        ((cd) bdVarQ.n).t();
        cd cdVar = (cd) bdVarQ.a();
        zc zcVarO = ad.o();
        zcVarO.c();
        ((ad) zcVarO.n).q();
        zcVarO.c();
        ((ad) zcVarO.n).r(cdVar);
        ad adVar = (ad) zcVarO.a();
        rc[] rcVarArr = {new rc((byte) 1)};
        HashMap map = new HashMap();
        rc rcVar = rcVarArr[0];
        rcVar.getClass();
        if (map.containsKey(ua7.class)) {
            io.sentry.h2.h(ua7.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map.put(ua7.class, rcVar);
        rcVarArr[0].getClass();
        Collections.unmodifiableMap(map);
        byte[] bArrC = adVar.c();
        px3 px3VarP = qx3.p();
        px3VarP.c();
        ((qx3) px3VarP.n).r();
        vh0 vh0VarC = yh0.c(bArrC, 0, bArrC.length);
        px3VarP.c();
        ((qx3) px3VarP.n).s(vh0VarC);
        px3VarP.c();
        ((qx3) px3VarP.n).q(dc5.RAW);
        wa2 wa2Var = new wa2(new nx3(px3VarP.a(), (byte) 2));
        n = wa2Var;
        f2394o = new wa2[]{wa2Var};
    }

    public wa2(nx3 nx3Var) {
        super("AES256_GCM_HKDF_4KB", 0);
        this.m = nx3Var;
    }

    public static wa2 valueOf(String str) {
        return (wa2) Enum.valueOf(wa2.class, str);
    }

    public static wa2[] values() {
        return (wa2[]) f2394o.clone();
    }
}

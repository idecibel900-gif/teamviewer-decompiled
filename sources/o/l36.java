package o;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l36 implements gz3 {
    public static final boolean u;
    public static final HashMap v;
    public int[] m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1325o;
    public String[] p;
    public String[] q;
    public String[] r;
    public xy3 s;
    public String[] t;

    static {
        try {
            u = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            u = false;
        }
        HashMap map = new HashMap();
        v = map;
        map.put(im3.h0(new ht2("kotlin.jvm.internal.KotlinClass")), xy3.CLASS);
        map.put(im3.h0(new ht2("kotlin.jvm.internal.KotlinFileFacade")), xy3.FILE_FACADE);
        map.put(im3.h0(new ht2("kotlin.jvm.internal.KotlinMultifileClass")), xy3.MULTIFILE_CLASS);
        map.put(im3.h0(new ht2("kotlin.jvm.internal.KotlinMultifileClassPart")), xy3.MULTIFILE_CLASS_PART);
        map.put(im3.h0(new ht2("kotlin.jvm.internal.KotlinSyntheticClass")), xy3.SYNTHETIC_CLASS);
    }

    @Override // o.gz3
    public final ez3 e(js0 js0Var, o76 o76Var) {
        xy3 xy3Var;
        ht2 ht2VarA = js0Var.a();
        if (ht2VarA.equals(tr3.a)) {
            return new j36(this, (byte) 0);
        }
        if (ht2VarA.equals(tr3.f2136o)) {
            return new j36(this, (byte) 1);
        }
        if (u || this.s != null || (xy3Var = (xy3) v.get(js0Var)) == null) {
            return null;
        }
        this.s = xy3Var;
        return new j36(this, (byte) 2);
    }
}

package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class iv3 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final lv3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jv3 f1106o;

    public iv3(jv3 jv3Var, lv3 lv3Var) {
        this.f1106o = jv3Var;
        this.n = lv3Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        String str;
        byte b = this.m;
        jv3 jv3Var = this.f1106o;
        lv3 lv3Var = this.n;
        switch (b) {
            case 0:
                u86 u86Var = jv3Var.c;
                fw3 fw3Var = jv3.g[0];
                r86 r86Var = (r86) u86Var.a();
                if (r86Var != null) {
                    yy3 yy3Var = r86Var.b;
                    str = yy3Var.f;
                    if (yy3Var.a != xy3.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader classLoader = lv3Var.n.getClassLoader();
                String strReplace = str.replace('/', '.');
                strReplace.getClass();
                return classLoader.loadClass(strReplace);
            default:
                u86 u86Var2 = jv3Var.d;
                fw3 fw3Var2 = jv3.g[1];
                Object objA = u86Var2.a();
                objA.getClass();
                return lv3Var.s((zo4) objA, mu3.m);
        }
    }

    public iv3(lv3 lv3Var, jv3 jv3Var) {
        this.n = lv3Var;
        this.f1106o = jv3Var;
    }
}

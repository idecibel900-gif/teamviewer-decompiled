package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class x00 implements Function0 {
    public static final x00 n = new x00((byte) 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x00 f2464o = new x00((byte) 1);
    public static final x00 p = new x00((byte) 2);
    public static final x00 q = new x00((byte) 3);
    public static final x00 r = new x00((byte) 4);
    public static final x00 s = new x00((byte) 5);
    public static final x00 t = new x00((byte) 6);
    public static final x00 u = new x00((byte) 7);
    public static final x00 v = new x00((byte) 8);
    public static final x00 w = new x00((byte) 9);
    public static final x00 x = new x00((byte) 10);
    public final /* synthetic */ byte m;

    public x00(gl3 gl3Var) {
        this.m = (byte) 11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        switch (this.m) {
            case 0:
                return new rv0(j51.i(1308617531));
            case 1:
                ag0 ag0Var = ag0.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(bg0.class, bg0.class.getClassLoader());
                serviceLoaderLoad.getClass();
                bg0 bg0Var = (bg0) lv0.n0(serviceLoaderLoad);
                if (bg0Var != null) {
                    return bg0Var;
                }
                hk0.l("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new rv0(rv0.b);
            case 3:
                oj1 oj1Var = new oj1(new xd4("DefaultBuiltIns"));
                oj1Var.c();
                return oj1Var;
            case 4:
                Set set = tp1.b;
                return ea2.m;
            case 5:
                yc2 yc2Var = yc2.m;
                return (oj1) oj1.f.getValue();
            case 6:
                return null;
            case 7:
                fw3[] fw3VarArr = zn3.g;
                Map mapSingletonMap = Collections.singletonMap(qn3.a, new qb7("Deprecated in Java"));
                mapSingletonMap.getClass();
                return mapSingletonMap;
            case 8:
                fw3[] fw3VarArr2 = au3.n;
                return Object.class;
            case ep1.b /* 9 */:
                return fa2.m;
            case ep1.c /* 10 */:
                return new LinkedHashMap();
            default:
                throw null;
        }
    }

    public /* synthetic */ x00(byte b) {
        this.m = b;
    }
}

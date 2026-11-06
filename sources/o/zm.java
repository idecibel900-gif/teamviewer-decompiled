package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.File;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zm extends yz3 implements Function1 {
    public static final zm A;
    public static final zm B;
    public static final zm C;
    public static final zm D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final zm f2717o;
    public static final zm p;
    public static final zm q;
    public static final zm r;
    public static final zm s;
    public static final zm t;
    public static final zm u;
    public static final zm v;
    public static final zm w;
    public static final zm x;
    public static final zm y;
    public static final zm z;
    public final /* synthetic */ byte n;

    static {
        int i = 1;
        f2717o = new zm(i, (byte) 0);
        p = new zm(i, (byte) 1);
        q = new zm(i, (byte) 2);
        r = new zm(i, (byte) 3);
        s = new zm(i, (byte) 4);
        t = new zm(i, (byte) 5);
        u = new zm(i, (byte) 6);
        v = new zm(i, (byte) 7);
        w = new zm(i, (byte) 8);
        x = new zm(i, (byte) 9);
        y = new zm(i, (byte) 10);
        z = new zm(i, (byte) 11);
        A = new zm(i, (byte) 12);
        B = new zm(i, (byte) 13);
        C = new zm(i, (byte) 14);
        D = new zm(i, (byte) 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return obj;
            case 1:
                return null;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jA = rv0.a(((rv0) obj).a, ew0.x);
                return new po(rv0.c(jA), rv0.g(jA), rv0.f(jA), rv0.d(jA));
            case 6:
                long j = ((d18) obj).a;
                return new no(d18.b(j), d18.c(j));
            case 7:
                no noVar = (no) obj;
                return new d18(u47.c(noVar.a, noVar.b));
            case 8:
                return db8.A0(0.0f, 0.0f, null, 7);
            case ep1.b /* 9 */:
                long j2 = ((dl3) obj).a;
                return new vk3(0L);
            case ep1.c /* 10 */:
                dl3 dl3Var = (dl3) obj;
                long j3 = dl3Var.a;
                return dl3Var;
            case 11:
                return wb2.d;
            case ep1.d /* 12 */:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new o07(absolutePath);
            case 13:
                return f88Var;
            case 14:
                u52.k0((u52) obj, rv0.g, 0L, 0.0f, 126);
                return f88Var;
            case 15:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return "  " + ((er5) entry.getKey()).a + " = " + (value instanceof byte[] ? cx.Y0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new dl3((((long) ((int) (((dl3) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 17:
                return new dl3((((long) ((int) (((dl3) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new dl3((((long) ((int) (((dl3) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new dl3((((long) ((int) (((dl3) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}

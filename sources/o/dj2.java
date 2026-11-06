package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dj2 {
    public static final /* synthetic */ int c = 0;
    public final n17 a = n17.f();
    public boolean b;

    static {
        new dj2(0);
    }

    public dj2(int i) {
        a();
        a();
    }

    public static void b(bv0 bv0Var, zl8 zl8Var, int i, Object obj) {
        if (zl8Var == zl8.p) {
            bv0Var.B(i, 3);
            ((u1) obj).b(bv0Var);
            bv0Var.B(i, 4);
        }
        bv0Var.B(i, zl8Var.n);
        switch (zl8Var.ordinal()) {
            case 0:
                bv0Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                bv0Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                bv0Var.F(((Long) obj).longValue());
                break;
            case 3:
                bv0Var.F(((Long) obj).longValue());
                break;
            case 4:
                bv0Var.w(((Integer) obj).intValue());
                break;
            case 5:
                bv0Var.u(((Long) obj).longValue());
                break;
            case 6:
                bv0Var.s(((Integer) obj).intValue());
                break;
            case 7:
                bv0Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof wh0)) {
                    bv0Var.A((String) obj);
                } else {
                    bv0Var.q((wh0) obj);
                }
                break;
            case ep1.b /* 9 */:
                ((u1) obj).b(bv0Var);
                break;
            case ep1.c /* 10 */:
                u1 u1Var = (u1) obj;
                bv0Var.D(((py2) u1Var).a(null));
                u1Var.b(bv0Var);
                break;
            case 11:
                if (!(obj instanceof wh0)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    bv0Var.D(length);
                    bv0Var.n(bArr, 0, length);
                } else {
                    bv0Var.q((wh0) obj);
                }
                break;
            case ep1.d /* 12 */:
                bv0Var.D(((Integer) obj).intValue());
                break;
            case 13:
                bv0Var.w(((Integer) obj).intValue());
                break;
            case 14:
                bv0Var.s(((Integer) obj).intValue());
                break;
            case 15:
                bv0Var.u(((Long) obj).longValue());
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                bv0Var.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                bv0Var.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        n17 n17Var = this.a;
        int size = n17Var.m.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = n17Var.c(i);
            if (entryC.getValue() instanceof py2) {
                py2 py2Var = (py2) entryC.getValue();
                py2Var.getClass();
                vw5 vw5Var = vw5.c;
                vw5Var.getClass();
                vw5Var.a(py2Var.getClass()).a(py2Var);
                py2Var.h();
            }
        }
        if (!n17Var.f1533o) {
            if (n17Var.m.size() > 0) {
                n17Var.c(0).getKey().getClass();
                io.sentry.h2.f();
                return;
            } else {
                Iterator it = n17Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    io.sentry.h2.f();
                    return;
                }
            }
        }
        if (!n17Var.f1533o) {
            n17Var.n = n17Var.n.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(n17Var.n);
            n17Var.q = n17Var.q.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(n17Var.q);
            n17Var.f1533o = true;
        }
        this.b = true;
    }

    public final Object clone() {
        dj2 dj2Var = new dj2();
        n17 n17Var = this.a;
        if (n17Var.m.size() > 0) {
            Map.Entry entryC = n17Var.c(0);
            if (entryC.getKey() != null) {
                io.sentry.h2.f();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = n17Var.d().iterator();
        if (!it.hasNext()) {
            return dj2Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            io.sentry.h2.f();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dj2) {
            return this.a.equals(((dj2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public dj2() {
    }
}

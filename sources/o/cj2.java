package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cj2 {
    public static final cj2 c = new cj2(0);
    public final m17 a = new m17(16);
    public boolean b;

    public cj2(int i) {
        f();
    }

    public static int c(yl8 yl8Var, Object obj) {
        switch (yl8Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return cv0.h(((Long) obj).longValue());
            case 3:
                return cv0.h(((Long) obj).longValue());
            case 4:
                return cv0.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return cv0.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    an4.n("UTF-8 not supported.", e);
                    return 0;
                }
            case ep1.b /* 9 */:
                return ((t1) obj).c();
            case ep1.c /* 10 */:
                return cv0.f((t1) obj);
            case 11:
                if (obj instanceof zh0) {
                    zh0 zh0Var = (zh0) obj;
                    return zh0Var.size() + cv0.g(zh0Var.size());
                }
                byte[] bArr = (byte[]) obj;
                return cv0.g(bArr.length) + bArr.length;
            case ep1.d /* 12 */:
                return cv0.g(((Integer) obj).intValue());
            case 13:
                return obj instanceof ol3 ? cv0.d(((ol3) obj).getNumber()) : cv0.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                return cv0.g((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return cv0.h((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(ly2 ly2Var, Object obj) {
        yl8 yl8Var = ly2Var.n;
        short s = ly2Var.m;
        if (!ly2Var.f1418o) {
            int i = cv0.i(s);
            if (yl8Var == yl8.q) {
                i *= 2;
            }
            return c(yl8Var, obj) + i;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int i2 = cv0.i(s);
            if (yl8Var == yl8.q) {
                i2 *= 2;
            }
            iC += c(yl8Var, obj2) + i2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        ly2 ly2Var = (ly2) entry.getKey();
        if (ly2Var.n.m != am8.v) {
            return true;
        }
        if (ly2Var.f1418o) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((t1) it.next()).a()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof t1)) {
            hk0.g("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((t1) value).a()) {
            return true;
        }
        return false;
    }

    public static Object h(vu0 vu0Var, yl8 yl8Var) {
        switch (yl8Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(vu0Var.i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(vu0Var.h()));
            case 2:
                return Long.valueOf(vu0Var.k());
            case 3:
                return Long.valueOf(vu0Var.k());
            case 4:
                return Integer.valueOf(vu0Var.j());
            case 5:
                return Long.valueOf(vu0Var.i());
            case 6:
                return Integer.valueOf(vu0Var.h());
            case 7:
                return Boolean.valueOf(vu0Var.k() != 0);
            case 8:
                int iJ = vu0Var.j();
                int i = vu0Var.b;
                int i2 = vu0Var.d;
                if (iJ > i - i2 || iJ <= 0) {
                    return iJ == 0 ? "" : new String(vu0Var.g(iJ), "UTF-8");
                }
                String str = new String(vu0Var.a, i2, iJ, "UTF-8");
                vu0Var.d += iJ;
                return str;
            case ep1.b /* 9 */:
                hk0.g("readPrimitiveField() cannot handle nested groups.");
                return null;
            case ep1.c /* 10 */:
                hk0.g("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return vu0Var.e();
            case ep1.d /* 12 */:
                return Integer.valueOf(vu0Var.j());
            case 13:
                hk0.g("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(vu0Var.h());
            case 15:
                return Long.valueOf(vu0Var.i());
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int iJ2 = vu0Var.j();
                return Integer.valueOf((-(iJ2 & 1)) ^ (iJ2 >>> 1));
            case 17:
                long jK = vu0Var.k();
                return Long.valueOf((-(jK & 1)) ^ (jK >>> 1));
            default:
                hk0.o("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(yl8 yl8Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (yl8Var.m) {
            case n:
                z2 = obj instanceof Integer;
                break;
            case f339o:
                z2 = obj instanceof Long;
                break;
            case p:
                z2 = obj instanceof Float;
                break;
            case q:
                z2 = obj instanceof Double;
                break;
            case r:
                z2 = obj instanceof Boolean;
                break;
            case s:
                z2 = obj instanceof String;
                break;
            case t:
                if (!(obj instanceof zh0) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case u:
                if (!(obj instanceof Integer) && !(obj instanceof ol3)) {
                    z = false;
                }
                z2 = z;
                break;
            case v:
                z2 = obj instanceof t1;
                break;
        }
        if (z2) {
            return;
        }
        hk0.g("Wrong object type used with protocol message reflection.");
    }

    public static void k(cv0 cv0Var, yl8 yl8Var, Object obj) {
        switch (yl8Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                cv0Var.getClass();
                cv0Var.F(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                cv0Var.getClass();
                cv0Var.E(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                cv0Var.H(((Long) obj).longValue());
                break;
            case 3:
                cv0Var.H(((Long) obj).longValue());
                break;
            case 4:
                cv0Var.y(((Integer) obj).intValue());
                break;
            case 5:
                cv0Var.F(((Long) obj).longValue());
                break;
            case 6:
                cv0Var.E(((Integer) obj).intValue());
                break;
            case 7:
                cv0Var.B(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                cv0Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                cv0Var.G(bytes.length);
                cv0Var.D(bytes);
                break;
            case ep1.b /* 9 */:
                cv0Var.getClass();
                ((t1) obj).f(cv0Var);
                break;
            case ep1.c /* 10 */:
                cv0Var.A((t1) obj);
                break;
            case 11:
                if (!(obj instanceof zh0)) {
                    byte[] bArr = (byte[]) obj;
                    cv0Var.getClass();
                    cv0Var.G(bArr.length);
                    cv0Var.D(bArr);
                } else {
                    zh0 zh0Var = (zh0) obj;
                    cv0Var.getClass();
                    cv0Var.G(zh0Var.size());
                    cv0Var.C(zh0Var);
                }
                break;
            case ep1.d /* 12 */:
                cv0Var.G(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ol3)) {
                    cv0Var.y(((Integer) obj).intValue());
                } else {
                    cv0Var.y(((ol3) obj).getNumber());
                }
                break;
            case 14:
                cv0Var.E(((Integer) obj).intValue());
                break;
            case 15:
                cv0Var.F(((Long) obj).longValue());
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                cv0Var.G((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                cv0Var.H((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(ly2 ly2Var, Object obj) {
        List arrayList;
        if (!ly2Var.f1418o) {
            hk0.g("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(ly2Var.n, obj);
        m17 m17Var = this.a;
        Object obj2 = m17Var.get(ly2Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            m17Var.put(ly2Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cj2 clone() {
        m17 m17Var;
        cj2 cj2Var = new cj2();
        int i = 0;
        while (true) {
            m17Var = this.a;
            if (i >= m17Var.n.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) m17Var.n.get(i);
            cj2Var.i((ly2) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : m17Var.c()) {
            cj2Var.i((ly2) entry2.getKey(), entry2.getValue());
        }
        return cj2Var;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        m17 m17Var = this.a;
        if (!m17Var.p) {
            for (int i = 0; i < m17Var.n.size(); i++) {
                Map.Entry entry = (Map.Entry) m17Var.n.get(i);
                if (((ly2) entry.getKey()).f1418o) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : m17Var.c()) {
                if (((ly2) entry2.getKey()).f1418o) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!m17Var.p) {
            m17Var.f1427o = m17Var.f1427o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(m17Var.f1427o);
            m17Var.p = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        ly2 ly2Var = (ly2) entry.getKey();
        Object value = entry.getValue();
        boolean z = ly2Var.f1418o;
        m17 m17Var = this.a;
        if (z) {
            Object arrayList = m17Var.get(ly2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            m17Var.put(ly2Var, arrayList);
            return;
        }
        if (ly2Var.n.m != am8.v) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            m17Var.put(ly2Var, value);
            return;
        }
        Object obj2 = m17Var.get(ly2Var);
        if (obj2 != null) {
            m17Var.put(ly2Var, ((t1) obj2).e().e((oy2) ((t1) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        m17Var.put(ly2Var, value);
    }

    public final void i(ly2 ly2Var, Object obj) {
        boolean z = ly2Var.f1418o;
        yl8 yl8Var = ly2Var.n;
        if (!z) {
            j(yl8Var, obj);
        } else {
            if (!(obj instanceof List)) {
                hk0.g("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(yl8Var, it.next());
            }
            obj = arrayList;
        }
        this.a.put(ly2Var, obj);
    }

    public cj2() {
    }
}

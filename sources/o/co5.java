package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class co5 extends vp3 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public co5(pt4 pt4Var) {
        this.b = pt4Var;
        Set set = ma8.a;
        this.c = pt4Var.a(List.class, set, null);
        this.d = pt4Var.a(Map.class, set, null);
        this.e = pt4Var.a(String.class, set, null);
        this.f = pt4Var.a(Double.class, set, null);
        this.g = pt4Var.a(Boolean.class, set, null);
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws IOException {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                nr3Var.getClass();
                nr3 nr3Var2 = new nr3(nr3Var);
                nr3Var2.r = false;
                try {
                    int iD = d(nr3Var2);
                    nr3Var2.close();
                    if (iD != -1) {
                        return ((vp3) ((ArrayList) obj).get(iD)).a(nr3Var);
                    }
                    throw null;
                } catch (Throwable th) {
                    nr3Var2.close();
                    throw th;
                }
            default:
                int iB = ua5.B(nr3Var.c0());
                if (iB == 0) {
                    return ((vp3) this.c).a(nr3Var);
                }
                if (iB == 2) {
                    return ((vp3) this.d).a(nr3Var);
                }
                if (iB == 5) {
                    return ((vp3) obj).a(nr3Var);
                }
                if (iB == 6) {
                    return ((vp3) this.f).a(nr3Var);
                }
                if (iB == 7) {
                    return ((vp3) this.g).a(nr3Var);
                }
                if (iB == 8) {
                    nr3Var.J();
                    return null;
                }
                an4.t("Expected a value but was ", e41.v(nr3Var.c0()), " at path ", nr3Var.z());
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r0
      0x0020: PHI (r0v15 java.lang.Class<?>) = (r0v12 java.lang.Class<?>), (r0v13 java.lang.Class<?>) binds: [B:8:0x001e, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Class<?> cls = obj.getClass();
                List list = (List) this.d;
                int iIndexOf = list.indexOf(cls);
                if (iIndexOf == -1) {
                    StringBuilder sb = new StringBuilder("Expected one of ");
                    sb.append(list);
                    sb.append(" but found ");
                    sb.append(obj);
                    Class<?> cls2 = obj.getClass();
                    sb.append(", a ");
                    sb.append(cls2);
                    sb.append(". Register this subtype.");
                    throw new IllegalArgumentException(sb.toString());
                }
                vp3 vp3Var = (vp3) ((ArrayList) this.e).get(iIndexOf);
                pr3Var.q();
                if (vp3Var != null) {
                    pr3Var.G((String) obj2);
                    pr3Var.l0((String) ((List) this.c).get(iIndexOf));
                }
                int iB0 = pr3Var.b0();
                if (iB0 != 5 && iB0 != 3 && iB0 != 2 && iB0 != 1) {
                    hk0.l("Nesting problem.");
                    return;
                }
                int i = pr3Var.r;
                pr3Var.r = pr3Var.m;
                vp3Var.c(pr3Var, obj);
                pr3Var.r = i;
                pr3Var.z();
                return;
            default:
                Class<?> cls3 = obj.getClass();
                if (cls3 == Object.class) {
                    pr3Var.q();
                    pr3Var.z();
                    return;
                }
                pt4 pt4Var = (pt4) obj2;
                Class<?> cls4 = Map.class;
                if (cls4.isAssignableFrom(cls3)) {
                    cls3 = cls4;
                } else {
                    cls4 = Collection.class;
                    if (cls4.isAssignableFrom(cls3)) {
                        cls3 = cls4;
                    }
                }
                pt4Var.a(cls3, ma8.a, null).c(pr3Var, obj);
                return;
        }
    }

    public int d(nr3 nr3Var) throws qq3, EOFException {
        String str = (String) this.b;
        nr3Var.u0();
        while (nr3Var.hasNext()) {
            if (nr3Var.o0((jr3) this.f) != -1) {
                int iX0 = nr3Var.x0((jr3) this.g);
                if (iX0 != -1) {
                    return iX0;
                }
                StringBuilder sb = new StringBuilder("Expected one of ");
                sb.append((List) this.c);
                String strR = nr3Var.r();
                sb.append(" for key '");
                sb.append(str);
                sb.append("' but found '");
                sb.append(strR);
                sb.append("'. Register a subtype for this label.");
                throw new gq3(sb.toString());
            }
            nr3Var.H0();
            nr3Var.v();
        }
        throw new gq3("Missing label for ".concat(str));
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return e41.l(new StringBuilder("PolymorphicJsonAdapter("), (String) this.b, ")");
            default:
                return "JsonAdapter(Object)";
        }
    }

    public co5(String str, List list, List list2, ArrayList arrayList) {
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = arrayList;
        this.f = jr3.a(str);
        this.g = jr3.a((String[]) list.toArray(new String[0]));
    }
}

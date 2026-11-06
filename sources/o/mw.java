package o;

import java.io.EOFException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mw extends vp3 {
    public static final lw d = new lw(0);
    public static final lw e = new lw(4);
    public final /* synthetic */ byte a = 0;
    public final vp3 b;
    public final Object c;

    public mw(pt4 pt4Var, Type type, Type type2) {
        Set set = ma8.a;
        this.b = pt4Var.a(type, set, null);
        this.c = pt4Var.a(type2, set, null);
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws qq3, EOFException {
        byte b = this.a;
        Object obj = this.c;
        vp3 vp3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                nr3Var.D0();
                while (nr3Var.hasNext()) {
                    arrayList.add(vp3Var.a(nr3Var));
                }
                nr3Var.A0();
                Object objNewInstance = Array.newInstance((Class<?>) obj, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            default:
                na4 na4Var = new na4();
                nr3Var.u0();
                while (nr3Var.hasNext()) {
                    if (nr3Var.hasNext()) {
                        nr3Var.x = nr3Var.U();
                        nr3Var.u = 11;
                    }
                    Object objA = vp3Var.a(nr3Var);
                    Object objA2 = ((vp3) obj).a(nr3Var);
                    Object objPut = na4Var.put(objA, objA2);
                    if (objPut != null) {
                        StringBuilder sb = new StringBuilder("Map key '");
                        sb.append(objA);
                        String strZ = nr3Var.z();
                        sb.append("' has multiple values at path ");
                        sb.append(strZ);
                        sb.append(": ");
                        sb.append(objPut);
                        sb.append(" and ");
                        sb.append(objA2);
                        throw new gq3(sb.toString());
                    }
                }
                nr3Var.Z();
                return na4Var;
        }
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        byte b = this.a;
        vp3 vp3Var = this.b;
        switch (b) {
            case 0:
                pr3Var.j();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    vp3Var.c(pr3Var, Array.get(obj, i));
                }
                pr3Var.u(']', 1, 2);
                return;
            default:
                pr3Var.q();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new gq3("Map key is null at ".concat(pr3Var.F()));
                    }
                    int iB0 = pr3Var.b0();
                    if (iB0 != 5 && iB0 != 3) {
                        hk0.l("Nesting problem.");
                        return;
                    } else {
                        pr3Var.q = true;
                        vp3Var.c(pr3Var, entry.getKey());
                        ((vp3) this.c).c(pr3Var, entry.getValue());
                    }
                }
                pr3Var.z();
                return;
        }
    }

    public final String toString() {
        byte b = this.a;
        vp3 vp3Var = this.b;
        switch (b) {
            case 0:
                return vp3Var + ".array()";
            default:
                return "JsonAdapter(" + vp3Var + "=" + ((vp3) this.c) + ")";
        }
    }

    public mw(Class cls, vp3 vp3Var) {
        this.c = cls;
        this.b = vp3Var;
    }
}

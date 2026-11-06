package o;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class pt4 {
    public static final ArrayList e;
    public final List a;
    public final int b;
    public final ThreadLocal c = new ThreadLocal();
    public final LinkedHashMap d = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(hm3.y);
        arrayList.add(jv0.c);
        arrayList.add(mw.e);
        arrayList.add(mw.d);
        arrayList.add(q56.a);
        arrayList.add(ls0.d);
    }

    public pt4(mt4 mt4Var) {
        ArrayList arrayList = mt4Var.a;
        int size = arrayList.size();
        ArrayList arrayList2 = e;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
        this.b = mt4Var.b;
    }

    public final vp3 a(Type type, Set set, String str) {
        vp3 vp3Var = null;
        if (type == null) {
            yq4.l("type == null");
            return null;
        }
        if (set == null) {
            yq4.l("annotations == null");
            return null;
        }
        Type typeG = ma8.g(ma8.a(type));
        Object objAsList = set.isEmpty() ? typeG : Arrays.asList(typeG, set);
        synchronized (this.d) {
            try {
                vp3 vp3Var2 = (vp3) this.d.get(objAsList);
                if (vp3Var2 != null) {
                    return vp3Var2;
                }
                ot4 ot4Var = (ot4) this.c.get();
                if (ot4Var == null) {
                    ot4Var = new ot4(this);
                    this.c.set(ot4Var);
                }
                ArrayDeque arrayDeque = ot4Var.b;
                ArrayList arrayList = ot4Var.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        nt4 nt4Var = new nt4(typeG, str, objAsList);
                        arrayList.add(nt4Var);
                        arrayDeque.add(nt4Var);
                        break;
                    }
                    nt4 nt4Var2 = (nt4) arrayList.get(i);
                    if (nt4Var2.c.equals(objAsList)) {
                        arrayDeque.add(nt4Var2);
                        vp3Var = nt4Var2.d;
                        if (vp3Var != null) {
                            break;
                        }
                        vp3Var = nt4Var2;
                        break;
                    }
                    i++;
                }
                try {
                    if (vp3Var != null) {
                        ot4Var.b(false);
                        return vp3Var;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            vp3 vp3VarA = ((up3) this.a.get(i2)).a(typeG, set, this);
                            if (vp3VarA != null) {
                                ((nt4) ot4Var.b.getLast()).d = vp3VarA;
                                ot4Var.b(true);
                                return vp3VarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + ma8.j(typeG, set));
                    } catch (IllegalArgumentException e2) {
                        throw ot4Var.a(e2);
                    }
                } catch (Throwable th) {
                    ot4Var.b(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final vp3 b(w8 w8Var, Type type, Set set) {
        if (set == null) {
            yq4.l("annotations == null");
            return null;
        }
        Type typeG = ma8.g(ma8.a(type));
        List list = this.a;
        int iIndexOf = list.indexOf(w8Var);
        if (iIndexOf == -1) {
            an4.i(w8Var, "Unable to skip past unknown factory ");
            return null;
        }
        int size = list.size();
        for (int i = iIndexOf + 1; i < size; i++) {
            vp3 vp3VarA = ((up3) list.get(i)).a(typeG, set, this);
            if (vp3VarA != null) {
                return vp3VarA;
            }
        }
        hk0.g("No next JsonAdapter for ".concat(ma8.j(typeG, set)));
        return null;
    }
}

package o;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class no1 {
    public static final vv c = new vv(11);
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final no1 m;
    public static final no1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final no1 f1583o;
    public static final no1 p;
    public static final no1 q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        mo1 mo1Var;
        int iU = vv.u();
        e = iU;
        int iU2 = vv.u();
        f = iU2;
        int iU3 = vv.u();
        g = iU3;
        int iU4 = vv.u();
        h = iU4;
        int iU5 = vv.u();
        i = iU5;
        int iU6 = vv.u();
        j = iU6;
        int iU7 = vv.u() - 1;
        k = iU7;
        int i2 = iU | iU2 | iU3;
        l = i2;
        m = new no1(iU7);
        n = new no1(iU5 | iU6);
        new no1(iU);
        new no1(iU2);
        new no1(iU3);
        f1583o = new no1(i2);
        new no1(iU4);
        p = new no1(iU5);
        q = new no1(iU6);
        new no1(iU2 | iU5 | iU6);
        Field[] fields = no1.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            mo1 mo1Var2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            no1 no1Var = obj instanceof no1 ? (no1) obj : null;
            if (no1Var != null) {
                int i3 = no1Var.b;
                String name = field2.getName();
                name.getClass();
                mo1Var2 = new mo1(i3, name);
            }
            if (mo1Var2 != null) {
                arrayList2.add(mo1Var2);
            }
        }
        r = arrayList2;
        Field[] fields2 = no1.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (im3.n(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                mo1Var = new mo1(iIntValue, name2);
            } else {
                mo1Var = null;
            }
            if (mo1Var != null) {
                arrayList5.add(mo1Var);
            }
        }
        s = arrayList5;
    }

    public no1(int i2, List list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((lo1) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!no1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        no1 no1Var = (no1) obj;
        return im3.n(this.a, no1Var.a) && this.b == no1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mo1) next).a != this.b);
        mo1 mo1Var = (mo1) next;
        String strT0 = mo1Var != null ? mo1Var.b : null;
        if (strT0 == null) {
            ArrayList arrayList = new ArrayList();
            for (mo1 mo1Var2 : s) {
                String str = a(mo1Var2.a) ? mo1Var2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strT0 = lv0.t0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbP = ua5.p("DescriptorKindFilter(", strT0, ", ");
        sbP.append(this.a);
        sbP.append(')');
        return sbP.toString();
    }

    public /* synthetic */ no1(int i2) {
        this(i2, ea2.m);
    }
}

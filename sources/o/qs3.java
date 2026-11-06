package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qs3 implements ty4 {
    public static final List p;
    public final String[] m;
    public final Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1859o;

    static {
        String strT0 = lv0.t0(qf0.L('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listL = qf0.L(strT0.concat("/Any"), strT0.concat("/Nothing"), strT0.concat("/Unit"), strT0.concat("/Throwable"), strT0.concat("/Number"), strT0.concat("/Byte"), strT0.concat("/Double"), strT0.concat("/Float"), strT0.concat("/Int"), strT0.concat("/Long"), strT0.concat("/Short"), strT0.concat("/Boolean"), strT0.concat("/Char"), strT0.concat("/CharSequence"), strT0.concat("/String"), strT0.concat("/Comparable"), strT0.concat("/Enum"), strT0.concat("/Array"), strT0.concat("/ByteArray"), strT0.concat("/DoubleArray"), strT0.concat("/FloatArray"), strT0.concat("/IntArray"), strT0.concat("/LongArray"), strT0.concat("/ShortArray"), strT0.concat("/BooleanArray"), strT0.concat("/CharArray"), strT0.concat("/Cloneable"), strT0.concat("/Annotation"), strT0.concat("/collections/Iterable"), strT0.concat("/collections/MutableIterable"), strT0.concat("/collections/Collection"), strT0.concat("/collections/MutableCollection"), strT0.concat("/collections/List"), strT0.concat("/collections/MutableList"), strT0.concat("/collections/Set"), strT0.concat("/collections/MutableSet"), strT0.concat("/collections/Map"), strT0.concat("/collections/MutableMap"), strT0.concat("/collections/Map.Entry"), strT0.concat("/collections/MutableMap.MutableEntry"), strT0.concat("/collections/Iterator"), strT0.concat("/collections/MutableIterator"), strT0.concat("/collections/ListIterator"), strT0.concat("/collections/MutableListIterator"));
        p = listL;
        ex exVarU0 = lv0.U0(listL);
        int iQ = xm4.Q(mv0.Z(exVarU0, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
        Iterator it = exVarU0.iterator();
        while (true) {
            p62 p62Var = (p62) it;
            if (!p62Var.n.hasNext()) {
                return;
            }
            sg3 sg3Var = (sg3) p62Var.next();
            linkedHashMap.put((String) sg3Var.b, Integer.valueOf(sg3Var.a));
        }
    }

    public qs3(it3 it3Var, String[] strArr) {
        strArr.getClass();
        List list = it3Var.f1099o;
        Set setT0 = list.isEmpty() ? la2.m : lv0.T0(list);
        List<ht3> list2 = it3Var.n;
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (ht3 ht3Var : list2) {
            int i = ht3Var.f1007o;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(ht3Var);
            }
        }
        arrayList.trimToSize();
        this.m = strArr;
        this.n = setT0;
        this.f1859o = arrayList;
    }

    @Override // o.ty4
    public final String a(int i) {
        return getString(i);
    }

    @Override // o.ty4
    public final boolean b(int i) {
        return this.n.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // o.ty4
    public final String getString(int i) {
        String strReplace;
        ht3 ht3Var = (ht3) this.f1859o.get(i);
        int i2 = ht3Var.n;
        if ((i2 & 4) == 4) {
            Object obj = ht3Var.q;
            if (obj instanceof String) {
                strReplace = (String) obj;
            } else {
                zh0 zh0Var = (zh0) obj;
                String strO = zh0Var.o();
                if (zh0Var.h()) {
                    ht3Var.q = strO;
                }
                strReplace = strO;
            }
        } else if ((i2 & 2) == 2) {
            List list = p;
            int size = list.size();
            int i3 = ht3Var.p;
            if (i3 < 0 || i3 >= size) {
                strReplace = this.m[i];
            } else {
                strReplace = (String) list.get(i3);
            }
        } else {
            strReplace = this.m[i];
        }
        if (ht3Var.s.size() >= 2) {
            List list2 = ht3Var.s;
            list2.getClass();
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (ht3Var.u.size() >= 2) {
            List list3 = ht3Var.u;
            list3.getClass();
            Integer num3 = (Integer) list3.get(0);
            Integer num4 = (Integer) list3.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        gt3 gt3Var = ht3Var.r;
        if (gt3Var == null) {
            gt3Var = gt3.NONE;
        }
        int iOrdinal = gt3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }
}

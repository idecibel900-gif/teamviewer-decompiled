package o;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class lv0 extends qv0 {
    public static ArrayList A0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            qv0.c0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList B0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final int C0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbK = fx3.k(i, "Element index ", " must be in range [");
        sbK.append(new yk3(0, list.size() - 1, 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public static final int D0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbK = fx3.k(i, "Position index ", " must be in range [");
        sbK.append(new yk3(0, list.size(), 1));
        sbK.append("].");
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public static Object E0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            an4.j("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        hk0.g("Collection has more than one element.");
        return null;
    }

    public static Object F0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            an4.j("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        hk0.g("List has more than one element.");
        return null;
    }

    public static Object G0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object H0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List I0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listR0 = R0(iterable);
            pv0.a0(listR0);
            return listR0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List J0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listR0 = R0(iterable);
            pv0.b0(listR0, comparator);
            return listR0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List K0(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ea2.m;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return P0(iterable);
            }
            if (i == 1) {
                return qf0.K(l0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return qf0.R(arrayList);
    }

    public static List L0(int i, List list) {
        list.getClass();
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ea2.m;
        }
        int size = list.size();
        if (i >= size) {
            return P0(list);
        }
        if (i == 1) {
            return qf0.K(v0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static void M0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] N0(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] O0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List P0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return qf0.R(R0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ea2.m;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return qf0.K(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList Q0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List R0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M0(iterable, arrayList);
        return arrayList;
    }

    public static Set S0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        M0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set T0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return lv1.V(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(xm4.Q(collection.size()));
                M0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            M0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : lv1.V(linkedHashSet2.iterator().next());
            }
        }
        return la2.m;
    }

    public static ex U0(List list) {
        list.getClass();
        return new ex(new y(list, (byte) 26), (byte) 1);
    }

    public static ArrayList V0(List list, Iterable iterable) {
        list.getClass();
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(mv0.Z(list, 10), mv0.Z(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new vd5(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static fx g0(Iterable iterable) {
        iterable.getClass();
        return new fx(iterable, (byte) 1);
    }

    public static boolean h0(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    qf0.U();
                    throw null;
                }
                if (im3.n(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List i0(Iterable iterable) {
        iterable.getClass();
        return P0(S0(iterable));
    }

    public static List j0(int i, List list) {
        if (i < 0) {
            gk0.h(fx3.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return P0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return ea2.m;
        }
        if (size == 1) {
            return qf0.K(u0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List k0(List list) {
        list.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return K0(list, size);
    }

    public static Object l0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        an4.j("Collection is empty.");
        return null;
    }

    public static Object m0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        an4.j("List is empty.");
        return null;
    }

    public static Object n0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object o0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object p0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static LinkedHashSet q0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionP0 = iterable2 instanceof Collection ? (Collection) iterable2 : P0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionP0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void r0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) throws IOException {
        iterable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            o77.e(appendable, obj, function1);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void s0(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) throws IOException {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        r0(iterable, appendable, str, str2, str3, "...", function1);
    }

    public static String t0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        r0(iterable, sb, charSequence2, str3, str4, "...", function1);
        return sb.toString();
    }

    public static Object u0(Iterable iterable) {
        if (iterable instanceof List) {
            return v0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            an4.j("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object v0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        an4.j("List is empty.");
        return null;
    }

    public static Object w0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList x0(Object obj, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && im3.n(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList y0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return A0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        qv0.c0(arrayList, iterable);
        qv0.c0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList z0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return B0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        qv0.c0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }
}

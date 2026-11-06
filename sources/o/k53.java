package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k53 implements Iterable, su3 {
    public static final k53 n = new k53(new String[0]);
    public final String[] m;

    public k53(String[] strArr) {
        strArr.getClass();
        this.m = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.m;
        strArr.getClass();
        int length = strArr.length - 2;
        int iE = bt1.E(length, 0, -2);
        if (iE > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iE) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final List b(String str) {
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(i67.j(this, i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i67.l(this, i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? ea2.m : listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k53) {
            return Arrays.equals(this.m, ((k53) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        vd5[] vd5VarArr = new vd5[size];
        for (int i = 0; i < size; i++) {
            vd5VarArr[i] = new vd5(i67.j(this, i), i67.l(this, i));
        }
        return new j1(vd5VarArr);
    }

    public final int size() {
        return this.m.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strJ = i67.j(this, i);
            String strL = i67.l(this, i);
            sb.append(strJ);
            sb.append(": ");
            if (po8.j(strJ)) {
                strL = "██";
            }
            sb.append(strL);
            sb.append("\n");
        }
        return sb.toString();
    }
}

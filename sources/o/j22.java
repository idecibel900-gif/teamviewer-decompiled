package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class j22 implements Comparable {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1122o;
    public final int p;

    public j22(String str) {
        List listK;
        Collection collectionK0;
        str.getClass();
        Pattern patternCompile = Pattern.compile("X");
        patternCompile.getClass();
        ub7.k0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listK = arrayList;
        } else {
            listK = qf0.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionK0 = ea2.m;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionK0 = lv0.K0(listK, listIterator.nextIndex() + 1);
                }
            }
            collectionK0 = ea2.m;
        }
        String[] strArr = (String[]) collectionK0.toArray(new String[0]);
        this.m = Integer.parseInt(strArr[0]);
        this.n = Integer.parseInt(strArr[1]);
        this.f1122o = Integer.parseInt(strArr[2]);
        this.p = Integer.parseInt(strArr[3]);
    }

    public String a() {
        return this.m + "x" + this.n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j22 j22Var = (j22) obj;
        j22Var.getClass();
        int iT = im3.t(j22Var.m, this.m);
        if (iT != 0) {
            return iT;
        }
        int iT2 = im3.t(j22Var.n, this.n);
        return iT2 != 0 ? iT2 : im3.t(j22Var.f1122o, this.f1122o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j22)) {
            return false;
        }
        j22 j22Var = (j22) obj;
        return j22Var.m == this.m && j22Var.n == this.n && j22Var.f1122o == this.f1122o;
    }

    public final int hashCode() {
        return ((((this.m + 31) * 31) + this.n) * 31) + this.f1122o;
    }

    public final String toString() {
        return a();
    }

    public j22(int i, int i2, int i3, int i4) {
        this.m = i;
        this.n = i2;
        this.f1122o = i3;
        this.p = i4;
    }

    public j22() {
        this.m = 0;
        this.n = 0;
        this.f1122o = 0;
        this.p = 0;
    }
}

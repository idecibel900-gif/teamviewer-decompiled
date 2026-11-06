package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xo implements CharSequence {
    public static final /* synthetic */ int q = 0;
    public final List m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f2540o;
    public final ArrayList p;

    static {
        a65 a65Var = hi6.a;
    }

    public xo(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.m = list;
        this.n = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                wo woVar = (wo) list.get(i);
                Object obj = woVar.a;
                if (obj instanceof c77) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(woVar);
                } else if (obj instanceof gf5) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(woVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f2540o = arrayList;
        this.p = arrayList2;
        List listJ0 = arrayList2 != null ? lv0.J0(arrayList2, new gj2((byte) 7)) : null;
        if (listJ0 == null || listJ0.isEmpty()) {
            return;
        }
        int i2 = ((wo) lv0.m0(listJ0)).c;
        jw4 jw4Var = sk3.a;
        jw4 jw4Var2 = new jw4(1);
        jw4Var2.a(i2);
        int size2 = listJ0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            wo woVar2 = (wo) listJ0.get(i3);
            while (jw4Var2.b != 0) {
                int iD = jw4Var2.d();
                if (woVar2.b < iD) {
                    int i4 = woVar2.c;
                    if (i4 > iD) {
                        li3.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                jw4Var2.e(jw4Var2.b - 1);
            }
            jw4Var2.a(woVar2.c);
        }
    }

    public final List a(int i) {
        List list = this.m;
        if (list == null) {
            return ea2.m;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            wo woVar = (wo) obj;
            if ((woVar.a instanceof ga4) && yo.b(0, i, woVar.b, woVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final xo b(Function1 function1) {
        vo voVar = new vo(this);
        ArrayList arrayList = voVar.f2333o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wo woVar = (wo) function1.invoke(((uo) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new uo(woVar.a, woVar.b, woVar.c, woVar.d));
        }
        return voVar.g();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xo subSequence(int i, int i2) {
        if (i > i2) {
            li3.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.n;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        xo xoVar = yo.a;
        if (i > i2) {
            li3.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.m;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                wo woVar = (wo) list.get(i3);
                int i4 = woVar.b;
                int i5 = woVar.c;
                if (yo.b(i, i2, i4, i5)) {
                    arrayList2.add(new wo(woVar.a, Math.max(i, woVar.b) - i, Math.min(i2, i5) - i, woVar.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new xo(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.n.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return im3.n(this.n, xoVar.n) && im3.n(this.m, xoVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.n.hashCode() * 31;
        List list = this.m;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.n.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.n;
    }

    public /* synthetic */ xo(String str) {
        this(str, ea2.m);
    }

    public xo(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}

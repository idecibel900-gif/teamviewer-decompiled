package o;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x35 implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List f2477o = Collections.EMPTY_LIST;
    public o82 m;
    public int n;

    public String A() {
        return x();
    }

    public final String B() {
        StringBuilder sbB = lb7.b();
        C(lq1.S(sbB));
        return lb7.k(sbB);
    }

    public void C(lq1 lq1Var) {
        lq1.P(ep3.A(this, lq1Var), this);
    }

    public abstract void D(lq1 lq1Var, h32 h32Var);

    public final i32 E() {
        while (this != null) {
            if (this instanceof i32) {
                return (i32) this;
            }
            this = this.m;
        }
        return null;
    }

    public o82 H() {
        return this.m;
    }

    public final x35 I() {
        if (this.m == null || N() <= 0) {
            return null;
        }
        return (x35) ((ArrayList) this.m.o()).get(this.n - 1);
    }

    public final void K() {
        o82 o82Var = this.m;
        if (o82Var != null) {
            o82Var.L(this);
        }
    }

    public void L(x35 x35Var) {
        db8.f0(x35Var.m == this);
        o82 o82Var = (o82) this;
        if (o82Var.q.m) {
            ((ArrayList) o()).remove(x35Var.n);
        } else {
            ((ArrayList) o()).remove(x35Var);
        }
        o82Var.q.m = false;
        x35Var.m = null;
    }

    public final void M(o82 o82Var) {
        o82 o82Var2 = this.m;
        if (o82Var2 == null) {
            o82Var2 = o82Var.m;
            this.m = o82Var2;
        }
        db8.o0(o82Var2);
        o82 o82Var3 = this.m;
        o82Var3.getClass();
        db8.f0(this.m == o82Var3);
        if (this == o82Var) {
            return;
        }
        o82Var3.P(o82Var);
        o82 o82Var4 = o82Var.m;
        if (o82Var4 != null) {
            o82Var4.L(o82Var);
        }
        o82Var.m = o82Var3;
        int iN = N();
        ((ArrayList) o82Var3.o()).set(iN, o82Var);
        o82Var.n = iN;
        this.m = null;
        o82Var3.q.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int N() {
        n82 n82Var;
        o82 o82Var = this.m;
        if (o82Var != null) {
            n82 n82Var2 = o82Var.q;
            if (!n82Var2.m) {
                int size = n82Var2.size();
                int i = 0;
                while (true) {
                    n82Var = o82Var.q;
                    if (i >= size) {
                        break;
                    }
                    ((x35) n82Var.get(i)).n = i;
                    i++;
                }
                n82Var.m = true;
            }
        }
        return this.n;
    }

    public s06 O() {
        if (s()) {
            return g().r();
        }
        return null;
    }

    public final void P(x35 x35Var) {
        if (x35Var == this) {
            throw new fb8("Cannot add a node here because it would create a cycle.");
        }
        if (x35Var.k() == 0) {
            return;
        }
        do {
            this = this.m;
            if (this == null) {
                return;
            }
        } while (this != x35Var);
        throw new fb8("Cannot add a node here because it would create a cycle.");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    public String a(String str) {
        db8.l0(str);
        String str2 = "";
        if (!s() || g().m(str) == -1) {
            return "";
        }
        String strH = h();
        String strI = g().i(str);
        Pattern pattern = lb7.d;
        String strReplaceAll = pattern.matcher(strH).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strI).replaceAll("");
        try {
            try {
                return lb7.l(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                URL url = new URL(strReplaceAll2);
                String protocol = url.getProtocol();
                if ((protocol.equalsIgnoreCase("http") || protocol.equalsIgnoreCase("https")) && url.getHost().isEmpty()) {
                    throw new MalformedURLException("Invalid URL: host is missing");
                }
                return url.toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            if (lb7.c.matcher(strReplaceAll2).find()) {
                int iIndexOf = strReplaceAll2.indexOf(58);
                if (iIndexOf > 0) {
                    String strSubstring = strReplaceAll2.substring(0, iIndexOf);
                    if (!strSubstring.equalsIgnoreCase("http") && !strSubstring.equalsIgnoreCase("https")) {
                        str2 = strReplaceAll2;
                    }
                } else {
                    str2 = strReplaceAll2;
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, x35... x35VarArr) {
        n82 n82Var;
        db8.o0(x35VarArr);
        if (x35VarArr.length == 0) {
            return;
        }
        for (x35 x35Var : x35VarArr) {
            if (x35Var == null) {
                throw new fb8("Array must not contain any null objects");
            }
            P(x35Var);
        }
        List listO = o();
        o82 o82Var = (o82) this;
        o82 o82VarH = x35VarArr[0].H();
        if (o82VarH != null && o82VarH.q.size() == x35VarArr.length) {
            List listO2 = o82VarH.o();
            int length = x35VarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    int size = o82VarH.q.size();
                    int i3 = 0;
                    while (true) {
                        n82Var = o82VarH.q;
                        if (i3 >= size) {
                            break;
                        }
                        ((x35) n82Var.get(i3)).m = null;
                        i3++;
                    }
                    n82Var.clear();
                    listO.addAll(i, Arrays.asList(x35VarArr));
                    int length2 = x35VarArr.length;
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 <= 0) {
                            o82Var.q.m = false;
                            return;
                        }
                        x35 x35Var2 = x35VarArr[i4];
                        o82 o82Var2 = x35Var2.m;
                        if (o82Var2 != null) {
                            o82Var2.L(x35Var2);
                        }
                        x35Var2.m = o82Var;
                        length2 = i4;
                    }
                } else if (x35VarArr[i2] != ((ArrayList) listO2).get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (x35 x35Var3 : x35VarArr) {
            o82 o82Var3 = x35Var3.m;
            if (o82Var3 != null) {
                o82Var3.L(x35Var3);
            }
            x35Var3.m = o82Var;
        }
        listO.addAll(i, Arrays.asList(x35VarArr));
        o82Var.q.m = false;
    }

    public String c(String str) {
        db8.o0(str);
        if (!s()) {
            return "";
        }
        String strI = g().i(str);
        if (strI.length() > 0) {
            return strI;
        }
        return str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public void d(String str, String str2) {
        i32 i32VarE = E();
        ig5 ig5Var = i32VarE != null ? i32VarE.w.f1262o : ig5.c;
        String strTrim = str.trim();
        if (!ig5Var.b) {
            strTrim = us1.F(strTrim);
        }
        ly lyVarG = g();
        int iM = lyVarG.m(strTrim);
        if (iM == -1) {
            lyVarG.a(str2, strTrim);
            return;
        }
        lyVarG.f1417o[iM] = str2;
        if (lyVarG.n[iM].equals(strTrim)) {
            return;
        }
        lyVarG.n[iM] = strTrim;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract ly g();

    public String h() {
        o82 o82Var = this.m;
        return o82Var != null ? o82Var.h() : "";
    }

    public final x35 i(int i) {
        return (x35) o().get(i);
    }

    public int k() {
        return 0;
    }

    public final List l() {
        if (k() == 0) {
            return f2477o;
        }
        List listO = o();
        ArrayList arrayList = new ArrayList(listO.size());
        arrayList.addAll(listO);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    public x35 m() {
        x35 x35VarN = n(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(x35VarN);
        while (!linkedList.isEmpty()) {
            x35 x35Var = (x35) linkedList.remove();
            int iK = x35Var.k();
            for (int i = 0; i < iK; i++) {
                List listO = x35Var.o();
                x35 x35VarN2 = ((x35) listO.get(i)).n(x35Var);
                listO.set(i, x35VarN2);
                linkedList.add(x35VarN2);
            }
        }
        return x35VarN;
    }

    public x35 n(x35 x35Var) {
        i32 i32VarE;
        try {
            x35 x35Var2 = (x35) super.clone();
            x35Var2.m = (o82) x35Var;
            x35Var2.n = x35Var == null ? 0 : N();
            if (x35Var == null && !(this instanceof i32) && (i32VarE = E()) != null) {
                i32 i32Var = new i32(i32VarE.p.m, i32VarE.h(), i32VarE.w);
                ly lyVar = i32VarE.r;
                if (lyVar != null) {
                    i32Var.r = lyVar.clone();
                }
                i32Var.v = i32VarE.v.clone();
                x35Var2.m = i32Var;
                ((ArrayList) i32Var.o()).add(x35Var2);
            }
            return x35Var2;
        } catch (CloneNotSupportedException e) {
            gk0.r(e);
            return null;
        }
    }

    public List o() {
        return f2477o;
    }

    public final x35 p() {
        if (k() == 0) {
            return null;
        }
        return (x35) o().get(0);
    }

    public final boolean r(String str) {
        db8.o0(str);
        if (!s()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (g().m(strSubstring) != -1 && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return g().m(str) != -1;
    }

    public abstract boolean s();

    public final boolean t(String str) {
        return A().equals(str);
    }

    public String toString() {
        return B();
    }

    public final o82 v() {
        do {
            this = this.w();
            if (this == null) {
                return null;
            }
        } while (!(this instanceof o82));
        return (o82) this;
    }

    public final x35 w() {
        o82 o82Var = this.m;
        if (o82Var == null) {
            return null;
        }
        List listO = o82Var.o();
        int iN = N() + 1;
        ArrayList arrayList = (ArrayList) listO;
        if (arrayList.size() > iN) {
            return (x35) arrayList.get(iN);
        }
        return null;
    }

    public String x() {
        return "#comment";
    }

    public abstract String y();
}

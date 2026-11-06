package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vo implements Appendable {
    public final StringBuilder m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f2333o;

    public vo(int i) {
        this.m = new StringBuilder(i);
        this.n = new ArrayList();
        this.f2333o = new ArrayList();
        new ArrayList();
    }

    public final void a(c77 c77Var, int i, int i2) {
        this.f2333o.add(new uo(i, i2, 8, c77Var, null));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof xo;
        StringBuilder sb = this.m;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        xo xoVar = (xo) charSequence;
        int length = sb.length();
        sb.append((CharSequence) xoVar.n, i, i2);
        List listA = yo.a(xoVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                wo woVar = (wo) listA.get(i3);
                this.f2333o.add(new uo(woVar.a, woVar.b + length, woVar.c + length, woVar.d));
            }
        }
        return this;
    }

    public final void b(String str) {
        this.m.append(str);
    }

    public final void c(xo xoVar) {
        StringBuilder sb = this.m;
        int length = sb.length();
        sb.append(xoVar.n);
        List list = xoVar.m;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                wo woVar = (wo) list.get(i);
                this.f2333o.add(new uo(woVar.a, woVar.b + length, woVar.c + length, woVar.d));
            }
        }
    }

    public final void d(int i) {
        ArrayList arrayList = this.n;
        if (i >= arrayList.size()) {
            li3.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                li3.b("Nothing to pop.");
            }
            ((uo) arrayList.remove(arrayList.size() - 1)).c = this.m.length();
        }
    }

    public final int e(ga4 ga4Var) {
        uo uoVar = new uo(this.m.length(), 0, 12, ga4Var, null);
        ArrayList arrayList = this.n;
        arrayList.add(uoVar);
        this.f2333o.add(uoVar);
        return arrayList.size() - 1;
    }

    public final int f(c77 c77Var) {
        uo uoVar = new uo(this.m.length(), 0, 12, c77Var, null);
        ArrayList arrayList = this.n;
        arrayList.add(uoVar);
        this.f2333o.add(uoVar);
        return arrayList.size() - 1;
    }

    public final xo g() {
        StringBuilder sb = this.m;
        String string = sb.toString();
        ArrayList arrayList = this.f2333o;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((uo) arrayList.get(i)).a(sb.length()));
        }
        return new xo(string, arrayList2);
    }

    public /* synthetic */ vo() {
        this(16);
    }

    public vo(xo xoVar) {
        this();
        c(xoVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof xo) {
            c((xo) charSequence);
            return this;
        }
        this.m.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.m.append(c);
        return this;
    }
}

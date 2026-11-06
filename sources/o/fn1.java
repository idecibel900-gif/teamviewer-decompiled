package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fn1 implements Iterator, su3 {
    public int m = -1;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f814o;
    public yk3 p;
    public int q;
    public final /* synthetic */ gn1 r;

    public fn1(gn1 gn1Var) {
        this.r = gn1Var;
        int iV = ct1.v(0, 0, gn1Var.a.length());
        this.n = iV;
        this.f814o = iV;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    public final void a() {
        vd5 vd5Var;
        gn1 gn1Var = this.r;
        CharSequence charSequence = gn1Var.a;
        int i = this.f814o;
        if (i < 0) {
            this.m = 0;
            this.p = null;
            return;
        }
        int i2 = gn1Var.b;
        if (i2 > 0) {
            int i3 = this.q + 1;
            this.q = i3;
            if (i3 >= i2) {
                int i4 = this.n;
                charSequence.getClass();
                this.p = new yk3(i4, charSequence.length() - 1, 1);
                this.f814o = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.n;
                charSequence.getClass();
                this.p = new yk3(i5, charSequence.length() - 1, 1);
                this.f814o = -1;
            } else {
                vd5Var = (vd5) gn1Var.c.invoke(charSequence, Integer.valueOf(this.f814o));
                if (vd5Var == null) {
                    int i6 = this.n;
                    charSequence.getClass();
                    this.p = new yk3(i6, charSequence.length() - 1, 1);
                    this.f814o = -1;
                } else {
                    int iIntValue = ((Number) vd5Var.m).intValue();
                    int iIntValue2 = ((Number) vd5Var.n).intValue();
                    this.p = ct1.b0(this.n, iIntValue);
                    int i7 = iIntValue + iIntValue2;
                    this.n = i7;
                    this.f814o = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.n;
            charSequence.getClass();
            this.p = new yk3(i8, charSequence.length() - 1, 1);
            this.f814o = -1;
        } else {
            vd5Var = (vd5) gn1Var.c.invoke(charSequence, Integer.valueOf(this.f814o));
            if (vd5Var == null) {
                int i9 = this.n;
                charSequence.getClass();
                this.p = new yk3(i9, charSequence.length() - 1, 1);
                this.f814o = -1;
            } else {
                int iIntValue3 = ((Number) vd5Var.m).intValue();
                int iIntValue4 = ((Number) vd5Var.n).intValue();
                this.p = ct1.b0(this.n, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.n = i10;
                this.f814o = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.m = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.m == -1) {
            a();
        }
        return this.m == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.m == -1) {
            a();
        }
        if (this.m == 0) {
            yq4.p();
            return null;
        }
        yk3 yk3Var = this.p;
        yk3Var.getClass();
        this.p = null;
        this.m = -1;
        return yk3Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

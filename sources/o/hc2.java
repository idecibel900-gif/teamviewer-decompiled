package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hc2 extends an5 {
    public final kq6 l;
    public final kh7 m;

    public hc2(String str, int i) {
        super(str, null, i);
        this.l = kq6.d;
        this.m = new kh7(new gc2(i, str, this));
    }

    @Override // o.an5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fq6)) {
            return false;
        }
        fq6 fq6Var = (fq6) obj;
        return fq6Var.k() == kq6.d && this.a.equals(fq6Var.a()) && im3.n(im3.q(this), im3.q(fq6Var));
    }

    @Override // o.an5, o.fq6
    public final fq6 h(int i) {
        return ((fq6[]) this.m.getValue())[i];
    }

    @Override // o.an5
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        j1 j1Var = new j1(this);
        int iHashCode2 = 1;
        while (j1Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) j1Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // o.an5, o.fq6
    public final it1 k() {
        return this.l;
    }

    @Override // o.an5
    public final String toString() {
        return lv0.t0(new ex(this, (byte) 3), ", ", this.a.concat("("), ")", null, 56);
    }
}

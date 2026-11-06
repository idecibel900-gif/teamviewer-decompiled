package o;

/* JADX INFO: loaded from: classes.dex */
public class vh0 extends yh0 {
    public final byte[] p;

    public vh0(byte[] bArr) {
        this.m = 0;
        bArr.getClass();
        this.p = bArr;
    }

    @Override // o.yh0
    public byte a(int i) {
        return this.p[i];
    }

    @Override // o.yh0
    public void d(byte[] bArr, int i) {
        System.arraycopy(this.p, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yh0) || size() != ((yh0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof vh0)) {
            return obj.equals(this);
        }
        vh0 vh0Var = (vh0) obj;
        int i = this.m;
        int i2 = vh0Var.m;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > vh0Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > vh0Var.size()) {
            StringBuilder sbK = fx3.k(size, "Ran off end of other: 0, ", ", ");
            sbK.append(vh0Var.size());
            throw new IllegalArgumentException(sbK.toString());
        }
        byte[] bArr = vh0Var.p;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = vh0Var.g();
        while (iG2 < iG) {
            if (this.p[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    @Override // o.yh0
    public byte f(int i) {
        return this.p[i];
    }

    public int g() {
        return 0;
    }

    @Override // o.yh0
    public int size() {
        return this.p.length;
    }
}

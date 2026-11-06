package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n77 implements Cloneable {
    public /* synthetic */ int[] m;
    public /* synthetic */ Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ int f1550o;

    public n77(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.m = new int[i5];
        this.n = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n77 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        n77 n77Var = (n77) objClone;
        n77Var.m = (int[]) this.m.clone();
        n77Var.n = (Object[]) this.n.clone();
        return n77Var;
    }

    public final int b(int i) {
        if (i >= this.f1550o || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.m[i];
    }

    public final void c(int i, Object obj) {
        int iS = j51.s(this.f1550o, i, this.m);
        if (iS >= 0) {
            this.n[iS] = obj;
            return;
        }
        int i2 = ~iS;
        int i3 = this.f1550o;
        if (i2 < i3) {
            Object[] objArr = this.n;
            if (objArr[i2] == ck3.M) {
                this.m[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.m.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.m = Arrays.copyOf(this.m, i7);
            this.n = Arrays.copyOf(this.n, i7);
        }
        int i8 = this.f1550o;
        if (i8 - i2 != 0) {
            int[] iArr = this.m;
            int i9 = i2 + 1;
            cx.F0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.n;
            cx.G0(i9, i2, this.f1550o, objArr2, objArr2);
        }
        this.m[i2] = i;
        this.n[i2] = obj;
        this.f1550o++;
    }

    public final Object d(int i) {
        if (i >= this.f1550o || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.n[i];
    }

    public final String toString() {
        int i = this.f1550o;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f1550o;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(b(i3));
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

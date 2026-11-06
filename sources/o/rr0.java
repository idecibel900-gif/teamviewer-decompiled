package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rr0 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public rr0(int i, int i2, int i3, vs7 vs7Var) {
        this.a = (byte) 5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = vs7Var;
    }

    public void a(ma4 ma4Var) {
        ma4Var.f1454o = null;
        ma4Var.m = null;
        ma4Var.n = null;
        ma4Var.u = 1;
        int i = this.b;
        if (i > 0) {
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                this.d = i2 + 1;
                i--;
                this.b = i;
                this.c++;
            }
        }
        ma4Var.m = (ma4) this.e;
        this.e = ma4Var;
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        if (i > 0 && (i4 & 1) == 0) {
            this.d = i3 + 2;
            this.b = i - 1;
            this.c++;
        }
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            if ((this.d & i6) != i6) {
                return;
            }
            int i7 = this.c;
            if (i7 == 0) {
                ma4 ma4Var2 = (ma4) this.e;
                ma4 ma4Var3 = ma4Var2.m;
                ma4 ma4Var4 = ma4Var3.m;
                ma4Var3.m = ma4Var4.m;
                this.e = ma4Var3;
                ma4Var3.n = ma4Var4;
                ma4Var3.f1454o = ma4Var2;
                ma4Var3.u = ma4Var2.u + 1;
                ma4Var4.m = ma4Var3;
                ma4Var2.m = ma4Var3;
            } else if (i7 == 1) {
                ma4 ma4Var5 = (ma4) this.e;
                ma4 ma4Var6 = ma4Var5.m;
                this.e = ma4Var6;
                ma4Var6.f1454o = ma4Var5;
                ma4Var6.u = ma4Var5.u + 1;
                ma4Var5.m = ma4Var6;
                this.c = 0;
            } else if (i7 == 2) {
                this.c = 0;
            }
            i5 *= 2;
        }
    }

    public void b(Object obj) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = obj;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                hk0.o("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            cx.G0(0, i3, length, objArr, objArr2);
            cx.G0(i4, 0, this.b, (Object[]) this.e, objArr2);
            this.e = objArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public void c(int i, int i2) {
        if (i < 0) {
            hk0.g("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            hk0.g("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.e;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public ho6 d(int i) {
        return new ho6(yo1.D((vs7) this.e, i), i, 1L);
    }

    public void e(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.a aVar = recyclerView.z;
        if (recyclerView.y == null || aVar == null || !aVar.u) {
            return;
        }
        if (z) {
            if (!recyclerView.q.w()) {
                aVar.t(recyclerView.y.a(), this);
            }
        } else if (!recyclerView.P()) {
            aVar.s(this.b, this.c, recyclerView.s0, this);
        }
        int i = this.d;
        if (i > aVar.v) {
            aVar.v = i;
            aVar.w = z;
            recyclerView.f23o.m();
        }
    }

    public int f() {
        return this.d - this.c;
    }

    public int g(int i) {
        return ((va5) this.e).q[this.c + i];
    }

    public Object h(int i) {
        return ((va5) this.e).s[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case 5:
                int i = this.b;
                vs7 vs7Var = (vs7) this.e;
                rb6 rb6VarD = yo1.D(vs7Var, i);
                int i2 = this.c;
                rb6 rb6VarD2 = yo1.D(vs7Var, i2);
                int i3 = this.d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(rb6VarD);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(rb6VarD2);
                sb.append("), prevOffset=");
                return to7.l(sb, i3, ")");
            default:
                return super.toString();
        }
    }

    public rr0(va5 va5Var) {
        this.a = (byte) 4;
        this.e = va5Var;
    }

    public /* synthetic */ rr0(byte b) {
        this.a = b;
    }
}

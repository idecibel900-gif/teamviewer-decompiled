package o;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s06 {
    public r94 a = t06.d;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int[] f = t06.e;

    public final s06 a() {
        s06 s06Var = new s06();
        s06Var.a = this.a;
        s06Var.b = this.b;
        s06Var.c = this.c;
        s06Var.d = this.d;
        s06Var.e = this.e;
        int[] iArr = this.f;
        s06Var.f = iArr.length == 0 ? t06.e : (int[]) iArr.clone();
        return s06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s06.class != obj.getClass()) {
            return false;
        }
        s06 s06Var = (s06) obj;
        return this.b == s06Var.b && this.c == s06Var.c && this.d == s06Var.d && this.e == s06Var.e && Arrays.equals(this.f, s06Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + (Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)) * 31);
    }
}

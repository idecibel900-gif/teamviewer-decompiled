package o;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 implements e82 {
    public final int a;
    public final int b;

    public dn1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        li3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        int i = h82Var.c;
        cv0 cv0Var = h82Var.a;
        int i2 = this.b;
        int iK = i + i2;
        if (((i ^ iK) & (i2 ^ iK)) < 0) {
            iK = cv0Var.k();
        }
        h82Var.a(h82Var.c, Math.min(iK, cv0Var.k()));
        int i3 = h82Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        h82Var.a(Math.max(0, i5), h82Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return this.a == dn1Var.a && this.b == dn1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}

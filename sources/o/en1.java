package o;

/* JADX INFO: loaded from: classes.dex */
public final class en1 implements e82 {
    public final int a;
    public final int b;

    public en1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        li3.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // o.e82
    public final void a(h82 h82Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = h82Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(h82Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(h82Var.b(h82Var.b - i3))) ? i + 2 : i3;
        }
        int iK = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iK + 1;
            int i7 = h82Var.c;
            cv0 cv0Var = h82Var.a;
            if (i7 + i6 >= cv0Var.k()) {
                iK = cv0Var.k() - h82Var.c;
                break;
            }
            iK = (Character.isHighSurrogate(h82Var.b((h82Var.c + i6) + (-1))) && Character.isLowSurrogate(h82Var.b(h82Var.c + i6))) ? iK + 2 : i6;
        }
        int i8 = h82Var.c;
        h82Var.a(i8, iK + i8);
        int i9 = h82Var.b;
        h82Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en1)) {
            return false;
        }
        en1 en1Var = (en1) obj;
        return this.a == en1Var.a && this.b == en1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}

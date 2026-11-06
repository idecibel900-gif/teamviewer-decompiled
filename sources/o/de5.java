package o;

/* JADX INFO: loaded from: classes.dex */
public final class de5 extends fe5 {
    public final float a;
    public final byte b;
    public final byte c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public de5(float f, int i, byte b) {
        this.d = b;
        this.a = f;
        this.b = i;
        this.c = i;
    }

    @Override // o.fe5
    public final int a() {
        return this.b;
    }

    @Override // o.fe5
    public final int b(int i, in1 in1Var) {
        byte b = this.d;
        float f = this.a;
        switch (b) {
            case 0:
                return i - in1Var.q0(f);
            default:
                return in1Var.q0(f);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de5)) {
            return false;
        }
        de5 de5Var = (de5) obj;
        return w32.b(this.a, de5Var.a) && this.c == de5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.g("PaneExpansionAnchor(Offset = ", w32.c(this.a), ")");
    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public final class od2 extends td2 {
    public final int a;
    public final /* synthetic */ byte b;

    public od2(int i, byte b) {
        this.b = b;
        this.a = i;
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        byte b = this.b;
        int i = this.a;
        switch (b) {
            case 0:
                return o82Var2.Z() == i;
            case 1:
                return o82Var2.Z() > i;
            default:
                return o82Var != o82Var2 && o82Var2.Z() < i;
        }
    }

    public final String toString() {
        byte b = this.b;
        int i = this.a;
        switch (b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}

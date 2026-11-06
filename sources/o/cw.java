package o;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements dw, gw {
    public final /* synthetic */ byte m;

    public /* synthetic */ cw(byte b) {
        this.m = b;
    }

    @Override // o.dw, o.gw
    public final float a() {
        switch (this.m) {
        }
        return 0.0f;
    }

    @Override // o.gw
    public final void b(in1 in1Var, int i, int[] iArr, int[] iArr2) {
        switch (this.m) {
            case 0:
                iq8.y(i, iArr, iArr2, false);
                break;
            case 1:
                iq8.z(i, iArr, iArr2, false);
                break;
            case 2:
                iq8.A(i, iArr, iArr2, false);
                break;
            default:
                iq8.B(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // o.dw
    public final void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        byte b = this.m;
        j04 j04Var2 = j04.m;
        switch (b) {
            case 0:
                if (j04Var != j04Var2) {
                    iq8.y(i, iArr, iArr2, true);
                } else {
                    iq8.y(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (j04Var != j04Var2) {
                    iq8.z(i, iArr, iArr2, true);
                } else {
                    iq8.z(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (j04Var != j04Var2) {
                    iq8.A(i, iArr, iArr2, true);
                } else {
                    iq8.A(i, iArr, iArr2, false);
                }
                break;
            default:
                if (j04Var != j04Var2) {
                    iq8.B(i, iArr, iArr2, true);
                } else {
                    iq8.B(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.m) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}

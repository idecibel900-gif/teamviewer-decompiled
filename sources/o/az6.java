package o;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public final class az6 extends g2 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az6(byte b) {
        super((byte) 5);
        this.n = b;
        switch (b) {
            case 1:
                super((byte) 5);
                break;
            default:
                ((bz6) this.m).p = true;
                break;
        }
    }

    @Override // o.g2
    public g2 n0(TypedArray typedArray) {
        switch (this.n) {
            case 1:
                bz6 bz6Var = (bz6) this.m;
                super.n0(typedArray);
                if (typedArray.hasValue(2)) {
                    bz6Var.e = (typedArray.getColor(2, bz6Var.e) & 16777215) | (bz6Var.e & (-16777216));
                }
                if (typedArray.hasValue(12)) {
                    bz6Var.d = typedArray.getColor(12, bz6Var.d);
                }
                return this;
            default:
                return super.n0(typedArray);
        }
    }

    @Override // o.g2
    public final g2 t0() {
        byte b = this.n;
        return this;
    }
}

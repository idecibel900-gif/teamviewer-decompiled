package o;

/* JADX INFO: loaded from: classes2.dex */
public final class gm2 extends hm2 {
    public final ol3[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public gm2(int i, ol3[] ol3VarArr) {
        if (ol3VarArr == null) {
            hk0.g("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = ol3VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            hk0.n(ol3VarArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2, (byte) 0);
        this.d = ol3VarArr;
    }

    public final Object i(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (ol3 ol3Var : this.d) {
            if (ol3Var.getNumber() == i4) {
                return ol3Var;
            }
        }
        return null;
    }
}

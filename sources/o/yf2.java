package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yf2 extends g2 {
    public final xi0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(xi0 xi0Var, oz3 oz3Var) {
        super(oz3Var);
        if (oz3Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.n = xi0Var;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.n + "}";
    }
}

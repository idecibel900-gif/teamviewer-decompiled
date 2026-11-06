package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg2 {
    public static final fg2 a = new fg2();
    public static final fg2 b;

    static {
        fg2 fg2Var = null;
        try {
            fg2Var = (fg2) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = fg2Var;
    }
}

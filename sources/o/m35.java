package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class m35 {
    public static final k35 a;
    public static final k35 b;

    static {
        k35 k35Var = null;
        try {
            k35Var = (k35) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = k35Var;
        b = new k35();
    }
}

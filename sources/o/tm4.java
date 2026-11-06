package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class tm4 {
    public static final rm4 a;
    public static final rm4 b;

    static {
        rm4 rm4Var = null;
        try {
            rm4Var = (rm4) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = rm4Var;
        b = new rm4();
    }
}

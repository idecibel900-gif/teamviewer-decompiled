package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig2 {
    public static final gg2 a = new gg2();
    public static final gg2 b;

    static {
        vw5 vw5Var = vw5.c;
        gg2 gg2Var = null;
        try {
            gg2Var = (gg2) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = gg2Var;
    }
}

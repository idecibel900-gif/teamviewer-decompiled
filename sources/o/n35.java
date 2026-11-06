package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class n35 {
    public static final l35 a;
    public static final l35 b;

    static {
        vw5 vw5Var = vw5.c;
        l35 l35Var = null;
        try {
            l35Var = (l35) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = l35Var;
        b = new l35();
    }
}

package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class um4 {
    public static final sm4 a;
    public static final sm4 b;

    static {
        vw5 vw5Var = vw5.c;
        sm4 sm4Var = null;
        try {
            sm4Var = (sm4) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sm4Var;
        b = new sm4();
    }
}

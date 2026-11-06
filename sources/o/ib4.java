package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ib4 {
    public static final hb4 a;
    public static final hb4 b;

    static {
        vw5 vw5Var = vw5.c;
        hb4 hb4Var = null;
        try {
            hb4Var = (hb4) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hb4Var;
        b = new hb4();
    }
}

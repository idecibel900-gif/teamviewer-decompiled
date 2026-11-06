package o;

/* JADX INFO: loaded from: classes.dex */
public enum fv8 {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(mu8.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class m;

    static {
        nu8 nu8Var = mu8.n;
    }

    fv8(Class cls) {
        this.m = cls;
    }
}

package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum no3 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(yh0.class, yh0.n),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class m;

    no3(Class cls, Serializable serializable) {
        this.m = cls;
    }
}

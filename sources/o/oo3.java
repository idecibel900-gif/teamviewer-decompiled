package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum oo3 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(wh0.class, wh0.f2412o),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class m;

    oo3(Class cls, Serializable serializable) {
        this.m = cls;
    }
}

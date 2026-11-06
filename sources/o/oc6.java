package o;

/* JADX INFO: loaded from: classes.dex */
public enum oc6 {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    /* JADX INFO: Fake field, exist only in values array */
    DELETE("DELETE");

    public final String m;

    oc6(String str) {
        this.m = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.m;
    }
}

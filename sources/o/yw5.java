package o;

/* JADX INFO: loaded from: classes2.dex */
public enum yw5 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final ol5 n = new ol5(2);
    public final String m;

    yw5(String str) {
        this.m = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.m;
    }
}

package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mr0 {
    public static final ir b = new ir(6);
    public static final gj2 c = new gj2(9);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final mr0 e;
    public static final mr0 f;
    public static final mr0 g;
    public static final mr0 h;
    public static final mr0 i;
    public static final mr0 j;
    public static final mr0 k;
    public static final mr0 l;
    public static final mr0 m;
    public static final mr0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mr0 f1499o;
    public static final mr0 p;
    public static final mr0 q;
    public static final mr0 r;
    public static final mr0 s;
    public static final mr0 t;
    public final String a;

    static {
        ir.q("SSL_RSA_WITH_NULL_MD5");
        ir.q("SSL_RSA_WITH_NULL_SHA");
        ir.q("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        ir.q("SSL_RSA_WITH_RC4_128_MD5");
        ir.q("SSL_RSA_WITH_RC4_128_SHA");
        ir.q("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        ir.q("SSL_RSA_WITH_DES_CBC_SHA");
        e = ir.q("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        ir.q("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        ir.q("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        ir.q("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        ir.q("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        ir.q("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        ir.q("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        ir.q("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        ir.q("SSL_DH_anon_WITH_RC4_128_MD5");
        ir.q("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        ir.q("SSL_DH_anon_WITH_DES_CBC_SHA");
        ir.q("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_KRB5_WITH_DES_CBC_SHA");
        ir.q("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_KRB5_WITH_RC4_128_SHA");
        ir.q("TLS_KRB5_WITH_DES_CBC_MD5");
        ir.q("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        ir.q("TLS_KRB5_WITH_RC4_128_MD5");
        ir.q("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        ir.q("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        ir.q("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        ir.q("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = ir.q("TLS_RSA_WITH_AES_128_CBC_SHA");
        ir.q("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        ir.q("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        ir.q("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = ir.q("TLS_RSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        ir.q("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        ir.q("TLS_RSA_WITH_NULL_SHA256");
        ir.q("TLS_RSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_RSA_WITH_AES_256_CBC_SHA256");
        ir.q("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        ir.q("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        ir.q("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        ir.q("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        ir.q("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        ir.q("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        ir.q("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        ir.q("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        ir.q("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        ir.q("TLS_PSK_WITH_RC4_128_SHA");
        ir.q("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_PSK_WITH_AES_128_CBC_SHA");
        ir.q("TLS_PSK_WITH_AES_256_CBC_SHA");
        ir.q("TLS_RSA_WITH_SEED_CBC_SHA");
        h = ir.q("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = ir.q("TLS_RSA_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        ir.q("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        ir.q("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ir.q("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        ir.q("TLS_FALLBACK_SCSV");
        ir.q("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        ir.q("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        ir.q("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_ECDH_RSA_WITH_NULL_SHA");
        ir.q("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        ir.q("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        ir.q("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_ECDHE_RSA_WITH_NULL_SHA");
        ir.q("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        ir.q("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = ir.q("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = ir.q("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        ir.q("TLS_ECDH_anon_WITH_NULL_SHA");
        ir.q("TLS_ECDH_anon_WITH_RC4_128_SHA");
        ir.q("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        ir.q("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        ir.q("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        ir.q("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        ir.q("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        ir.q("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        ir.q("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = ir.q("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = ir.q("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        ir.q("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = ir.q("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f1499o = ir.q("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        ir.q("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        ir.q("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        ir.q("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = ir.q("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = ir.q("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        ir.q("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        ir.q("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = ir.q("TLS_AES_128_GCM_SHA256");
        s = ir.q("TLS_AES_256_GCM_SHA384");
        t = ir.q("TLS_CHACHA20_POLY1305_SHA256");
        ir.q("TLS_AES_128_CCM_SHA256");
        ir.q("TLS_AES_128_CCM_8_SHA256");
    }

    public mr0(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}

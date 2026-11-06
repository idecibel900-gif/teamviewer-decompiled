package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class e84 {
    public static final d84 Companion = new d84();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ e84(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (35 != (i & 35)) {
            lq1.H(i, 35, c84.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e84.class == obj.getClass() && im3.n(this.f, ((e84) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sbO = e41.o("License(name=", this.a, ", url=", this.b, ", year=");
        e41.t(sbO, this.c, ", spdxId=", this.d, ", licenseContent=");
        return e41.m(sbO, this.e, ", hash=", this.f, ")");
    }

    public e84(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}

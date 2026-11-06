package o;

/* JADX INFO: loaded from: classes.dex */
@lq6
public final class hu {
    public static final gu Companion = new gu();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        return im3.n(this.a, huVar.a) && im3.n(this.b, huVar.b) && im3.n(this.c, huVar.c) && im3.n(this.d, huVar.d) && im3.n(this.e, huVar.e) && im3.n(this.f, huVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        StringBuilder sbO = e41.o("AppInfoData(icon=", str, ", mimeType=", str2, ", headlineText=");
        e41.t(sbO, str3, ", descriptionText=", str4, ", analyticsEventID=");
        return e41.m(sbO, str5, ", androidPackageName=", str6, ")");
    }
}

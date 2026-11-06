package o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k00 {
    public final String a;
    public final Integer b;
    public final sa2 c;
    public final long d;
    public final long e;
    public final Map f;

    public k00(String str, Integer num, sa2 sa2Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = sa2Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final d11 c() {
        d11 d11Var = new d11();
        String str = this.a;
        if (str == null) {
            yq4.l("Null transportName");
            return null;
        }
        d11Var.m = str;
        d11Var.n = this.b;
        sa2 sa2Var = this.c;
        if (sa2Var == null) {
            yq4.l("Null encodedPayload");
            return null;
        }
        d11Var.f578o = sa2Var;
        d11Var.p = Long.valueOf(this.d);
        d11Var.q = Long.valueOf(this.e);
        d11Var.r = new HashMap(this.f);
        return d11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k00) {
            k00 k00Var = (k00) obj;
            if (this.a.equals(k00Var.a)) {
                Integer num = k00Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(k00Var.c) && this.d == k00Var.d && this.e == k00Var.e && this.f.equals(k00Var.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}

package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n00 extends ne4 {
    public final long a;
    public final long b;
    public final g00 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public n00(long j, long j2, g00 g00Var, Integer num, String str, ArrayList arrayList) {
        vx5 vx5Var = vx5.m;
        this.a = j;
        this.b = j2;
        this.c = g00Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ne4)) {
            return false;
        }
        n00 n00Var = (n00) ((ne4) obj);
        if (this.a != n00Var.a || this.b != n00Var.b || !this.c.equals(n00Var.c)) {
            return false;
        }
        Integer num = n00Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = n00Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(n00Var.f)) {
            return false;
        }
        Object obj2 = vx5.m;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ vx5.m.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + vx5.m + "}";
    }
}

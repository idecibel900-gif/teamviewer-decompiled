package o;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q61 {
    public static final q61 j = new q61();
    public final g35 a;
    public final a35 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public q61(q61 q61Var) {
        q61Var.getClass();
        this.c = q61Var.c;
        this.d = q61Var.d;
        this.b = q61Var.b;
        this.a = q61Var.a;
        this.e = q61Var.e;
        this.f = q61Var.f;
        this.i = q61Var.i;
        this.g = q61Var.g;
        this.h = q61Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q61.class.equals(obj.getClass())) {
            return false;
        }
        q61 q61Var = (q61) obj;
        if (this.c == q61Var.c && this.d == q61Var.d && this.e == q61Var.e && this.f == q61Var.f && this.g == q61Var.g && this.h == q61Var.h && im3.n(a(), q61Var.a()) && this.a == q61Var.a) {
            return this.i.equals(q61Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestA = a();
        return iHashCode2 + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.a);
        sb.append(", requiresCharging=");
        sb.append(this.c);
        sb.append(", requiresDeviceIdle=");
        fx3.s(sb, this.d, ", requiresBatteryNotLow=", this.e, ", requiresStorageNotLow=");
        sb.append(this.f);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.g);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.h);
        sb.append(", contentUriTriggers=");
        sb.append(this.i);
        sb.append(", }");
        return sb.toString();
    }

    public q61(a35 a35Var, g35 g35Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, LinkedHashSet linkedHashSet) {
        this.b = a35Var;
        this.a = g35Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = linkedHashSet;
    }

    public q61() {
        this.b = new a35(null);
        this.a = g35.m;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = la2.m;
    }
}

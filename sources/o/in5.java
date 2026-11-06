package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class in5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1082o;
    public boolean p;
    public in5 q;

    public in5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.f1082o = z3;
        this.p = z3;
    }

    public final void a() {
        in5 in5Var = this.q;
        if (in5Var == null) {
            this.f1082o = true;
            this.p = true;
        } else if (in5Var != null) {
            in5Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? ea2.m : arrayList;
    }

    public final boolean c() {
        in5 in5Var = this.q;
        if (in5Var != null) {
            return in5Var.c();
        }
        return this.f1082o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + vs1.W(this.a) + ", uptimeMillis=" + this.b + ", position=" + t65.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + t65.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + sn5.a(this.i) + ", historical=" + b() + ", scrollDelta=" + t65.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + t65.g(this.l) + ")";
    }

    public in5(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}

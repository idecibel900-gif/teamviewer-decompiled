package o;

/* JADX INFO: loaded from: classes.dex */
public final class gl4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gl4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static gl4 b(gl4 gl4Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = gl4Var.a;
        }
        if ((i & 2) != 0) {
            z2 = gl4Var.b;
        }
        if ((i & 4) != 0) {
            z3 = gl4Var.c;
        }
        if ((i & 8) != 0) {
            z4 = gl4Var.d;
        }
        gl4Var.getClass();
        return new gl4(z, z2, z3, z4);
    }

    public final boolean a(k33 k33Var) {
        if (k33Var != null) {
            boolean z = k33Var instanceof j33;
            boolean z2 = this.b;
            if (z) {
                return z2;
            }
            if ((k33Var instanceof h33) && this.a && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return this.a && this.b && this.d;
    }

    public final boolean d(k33 k33Var) {
        if (k33Var == null) {
            return false;
        }
        if (k33Var instanceof j33) {
            return this.b;
        }
        if (k33Var instanceof h33) {
            return c();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        return this.a == gl4Var.a && this.b == gl4Var.b && this.c == gl4Var.c && this.d == gl4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + to7.f(to7.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ManagedDevicesCacheState(isDirectlyManagedDevicesLoaded=" + this.a + ", isGroupManagedDevicesLoaded=" + this.b + ", isManagedGroupsLoaded=" + this.c + ", areManagedGroupIdsAuthoritative=" + this.d + ")";
    }
}

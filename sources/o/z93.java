package o;

/* JADX INFO: loaded from: classes.dex */
public final class z93 {
    public final long a;
    public final t33 b;

    public z93(long j, t33 t33Var) {
        this.a = j;
        this.b = t33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z93)) {
            return false;
        }
        z93 z93Var = (z93) obj;
        return this.a == z93Var.a && this.b == z93Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GroupMember(groupMemberId=" + this.a + ", groupMemberType=" + this.b + ")";
    }
}

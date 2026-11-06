package o;

/* JADX INFO: loaded from: classes.dex */
public final class au1 implements du1 {
    public final long a;

    public au1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au1) && this.a == ((au1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return to7.j(this.a, "LegacyTeamViewerId(teamViewerId=", ")");
    }
}

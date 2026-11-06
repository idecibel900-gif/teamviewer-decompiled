package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 implements du1 {
    public final UUID a;

    public bu1(UUID uuid) {
        uuid.getClass();
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu1) && im3.n(this.a, ((bu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Managed(managementId=" + this.a + ")";
    }
}

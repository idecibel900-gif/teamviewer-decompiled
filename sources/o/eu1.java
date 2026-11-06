package o;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class eu1 {
    public final UUID a;
    public final String b;

    public eu1(UUID uuid, String str) {
        str.getClass();
        this.a = uuid;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu1)) {
            return false;
        }
        eu1 eu1Var = (eu1) obj;
        return im3.n(this.a, eu1Var.a) && im3.n(this.b, eu1Var.b);
    }

    public final int hashCode() {
        UUID uuid = this.a;
        return this.b.hashCode() + ((uuid == null ? 0 : uuid.hashCode()) * 31);
    }

    public final String toString() {
        return "InheritedPolicyDetails(policyId=" + this.a + ", groupName=" + this.b + ")";
    }
}

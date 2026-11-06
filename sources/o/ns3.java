package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ns3 extends vt1 {
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns3(String str, String str2) {
        super((byte) 10);
        str.getClass();
        str2.getClass();
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns3)) {
            return false;
        }
        ns3 ns3Var = (ns3) obj;
        return im3.n(this.e, ns3Var.e) && im3.n(this.f, ns3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }

    @Override // o.vt1
    public final String j() {
        return this.e + ':' + this.f;
    }
}

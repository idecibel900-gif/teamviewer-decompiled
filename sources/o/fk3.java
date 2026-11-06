package o;

/* JADX INFO: loaded from: classes2.dex */
public final class fk3 implements hk3 {
    public final /* synthetic */ byte a = 1;
    public String b;
    public String c;

    public fk3(tn0 tn0Var, String str, Object[] objArr) {
        tn0Var.getClass();
        this.b = tn0Var.M0();
        this.c = String.format(str, objArr);
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // o.hk3
    public bk3 toInstant() {
        throw new dk3(this.b + " when parsing an Instant from \"" + au8.V(64, this.c) + '\"');
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            case 2:
                return "<" + this.b + ">: " + this.c;
            default:
                return super.toString();
        }
    }

    public fk3(tn0 tn0Var, String str) {
        tn0Var.getClass();
        this.b = tn0Var.M0();
        this.c = str;
    }

    public /* synthetic */ fk3() {
    }

    public fk3(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}

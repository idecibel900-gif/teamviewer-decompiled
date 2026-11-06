package o;

/* JADX INFO: loaded from: classes.dex */
public final class dv {
    public final cv a;
    public final ak3 b;
    public final String c;
    public final boolean d;

    public dv(cv cvVar, ak3 ak3Var, String str, boolean z, int i) {
        str = (i & 4) != 0 ? "" : str;
        z = (i & 8) != 0 ? false : z;
        ak3Var.getClass();
        this.a = cvVar;
        this.b = ak3Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return this.a == dvVar.a && this.b == dvVar.b && this.c.equals(dvVar.c) && this.d == dvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + to7.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "AppUpdateStatisticsEvent(action=" + this.a + ", installationSource=" + this.b + ", errorReason=" + this.c + ", isStoreFlavorWithoutPlayStoreInstalled=" + this.d + ")";
    }
}

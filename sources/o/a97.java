package o;

/* JADX INFO: loaded from: classes.dex */
public final class a97 implements ec8 {
    public final ec8 m;
    public final long n;

    public a97(ec8 ec8Var, long j) {
        this.m = ec8Var;
        this.n = j;
    }

    @Override // o.ec8
    public final boolean a() {
        return this.m.a();
    }

    @Override // o.ec8
    public final long b(qo qoVar, qo qoVar2, qo qoVar3) {
        return this.m.b(qoVar, qoVar2, qoVar3) + this.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a97)) {
            return false;
        }
        a97 a97Var = (a97) obj;
        return a97Var.n == this.n && im3.n(a97Var.m, this.m);
    }

    @Override // o.ec8
    public final qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        long j2 = this.n;
        return j < j2 ? qoVar3 : this.m.h(j - j2, qoVar, qoVar2, qoVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + (this.m.hashCode() * 31);
    }

    @Override // o.ec8
    public final qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        long j2 = this.n;
        return j < j2 ? qoVar : this.m.u(j - j2, qoVar, qoVar2, qoVar3);
    }
}

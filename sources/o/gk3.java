package o;

/* JADX INFO: loaded from: classes2.dex */
public final class gk3 implements hk3 {
    public final long a;
    public final int b;

    public gk3(int i, long j) {
        this.a = j;
        this.b = i;
    }

    @Override // o.hk3
    public final bk3 toInstant() {
        bk3 bk3Var = bk3.f434o;
        bk3 bk3Var2 = bk3.f434o;
        long j = bk3Var2.m;
        long j2 = this.a;
        if (j2 >= j) {
            bk3 bk3Var3 = bk3.p;
            if (j2 <= bk3Var3.m) {
                long j3 = this.b;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? bk3Var3 : bk3Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new bk3((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
                    }
                }
            }
        }
        throw new dk3("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}

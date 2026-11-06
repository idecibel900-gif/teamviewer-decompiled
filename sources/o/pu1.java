package o;

/* JADX INFO: loaded from: classes.dex */
public final class pu1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ms1 f1776o;
    public final /* synthetic */ long p;
    public final /* synthetic */ oe8 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu1(ms1 ms1Var, oe8 oe8Var, long j, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1776o = ms1Var;
        this.q = oe8Var;
        this.p = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        oe8 oe8Var = this.q;
        switch (b) {
            case 0:
                return new pu1(this.f1776o, (ru1) oe8Var, this.p, hc1Var, (byte) 0);
            default:
                return new pu1(this.f1776o, (f33) oe8Var, this.p, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((pu1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r0 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
    
        if (r0 == r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        if (r0 == r7) goto L70;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

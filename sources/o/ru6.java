package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;

/* JADX INFO: loaded from: classes.dex */
public final class ru6 extends og7 implements hw2 {
    public Object m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ su6 f1954o;
    public final /* synthetic */ SupportSession p;
    public final /* synthetic */ it6 q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru6(su6 su6Var, SupportSession supportSession, it6 it6Var, int i, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1954o = su6Var;
        this.p = supportSession;
        this.q = it6Var;
        this.r = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new ru6(this.f1954o, this.p, this.q, this.r, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((ru6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:7:0x001f, B:12:0x002d, B:29:0x0092, B:31:0x0098, B:13:0x0033, B:19:0x006e, B:21:0x0072, B:16:0x0041), top: B:44:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r0 == r13) goto L36;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0098, please report this as an issue */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ru6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

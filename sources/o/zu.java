package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zu extends og7 implements hw2 {
    public av m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ av f2734o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ int u;
    public final /* synthetic */ ak3 v;
    public final /* synthetic */ xa w;
    public final /* synthetic */ l8 x;
    public final /* synthetic */ Function0 y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(av avVar, String str, String str2, String str3, String str4, String str5, int i, ak3 ak3Var, xa xaVar, l8 l8Var, Function0 function0, Function0 function1, hc1 hc1Var) {
        super(2, hc1Var);
        this.f2734o = avVar;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.u = i;
        this.v = ak3Var;
        this.w = xaVar;
        this.x = l8Var;
        this.y = function0;
        this.z = function1;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new zu(this.f2734o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((zu) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (o.im3.j0(r0, r1, r16) == r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if (o.im3.j0(r0, r1, r16) == r15) goto L53;
     */
    @Override // o.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.zu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

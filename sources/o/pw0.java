package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class pw0 extends og7 implements hw2 {
    public Object[] m;
    public wm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f1782o;
    public int p;
    public int q;
    public int r;
    public byte s;
    public /* synthetic */ Object t;
    public final /* synthetic */ go2[] u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ iw2 w;
    public final /* synthetic */ ho2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(Function0 function0, hc1 hc1Var, ho2 ho2Var, iw2 iw2Var, go2[] go2VarArr) {
        super(2, hc1Var);
        this.u = go2VarArr;
        this.v = function0;
        this.w = iw2Var;
        this.x = ho2Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        iw2 iw2Var = this.w;
        pw0 pw0Var = new pw0(this.v, hc1Var, this.x, iw2Var, this.u);
        pw0Var.t = obj;
        return pw0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((pw0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce A[LOOP:0: B:29:0x00ce->B:37:0x00ef, LOOP_START, PHI: r3 r14
      0x00ce: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v6 o.sg3) = (r14v5 o.sg3), (r14v10 o.sg3) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[EDGE_INSN: B:51:0x00f1->B:38:0x00f1 BREAK  A[LOOP:0: B:29:0x00ce->B:37:0x00ef], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0133 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0138 -> B:44:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pw0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

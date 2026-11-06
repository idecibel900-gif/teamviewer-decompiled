package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s96 extends og7 implements hw2 {
    public Throwable m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f1996o;
    public final /* synthetic */ m52 p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ yh4 r;
    public final /* synthetic */ px4 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s96(m52 m52Var, Context context, yh4 yh4Var, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.p = m52Var;
        this.q = context;
        this.r = yh4Var;
        this.s = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new s96(this.p, this.q, this.r, this.s, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((s96) create((me1) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[PHI: r0 r1
      0x006a: PHI (r0v22 int) = (r0v26 int), (r0v27 int) binds: [B:23:0x0068, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r1v4 java.lang.Throwable) = (r1v7 java.lang.Throwable), (r1v8 java.lang.Throwable) binds: [B:23:0x0068, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a1, B:35:0x0096, B:28:0x007a, B:31:0x0084), top: B:79:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a1, B:35:0x0096, B:28:0x007a, B:31:0x0084), top: B:79:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0096 A[Catch: all -> 0x00e3, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x006c, B:32:0x008b, B:39:0x00a1, B:35:0x0096, B:28:0x007a, B:31:0x0084), top: B:79:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf A[Catch: all -> 0x0019, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:7:0x0012, B:43:0x00b3, B:44:0x00bd, B:47:0x00cf, B:50:0x00db, B:54:0x00e2, B:45:0x00be, B:49:0x00d1), top: B:81:0x0012, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:45:0x00be, B:49:0x00d1), top: B:77:0x00be, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b2 -> B:43:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00e6 -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.s96.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

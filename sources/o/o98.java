package o;

/* JADX INFO: loaded from: classes.dex */
public final class o98 {
    public static final mo f = new mo(0.0f);
    public final ec8 a;
    public long b = Long.MIN_VALUE;
    public mo c = f;
    public boolean d;
    public float e;

    public o98(jo joVar) {
        this.a = joVar.a(vn4.j0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
      0x007d: PHI (r0v16 kotlin.jvm.functions.Function1) = (r0v9 kotlin.jvm.functions.Function1), (r0v17 kotlin.jvm.functions.Function1) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r2v5 kotlin.jvm.functions.Function0) = (r2v3 kotlin.jvm.functions.Function0), (r2v6 kotlin.jvm.functions.Function0) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r3v4 o.n98) = (r3v2 o.n98), (r3v5 o.n98) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r13v3 float) = (r13v0 float), (r13v4 float) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d3, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d3, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
      0x00a7: PHI (r0v17 kotlin.jvm.functions.Function1) = (r0v16 kotlin.jvm.functions.Function1), (r0v20 kotlin.jvm.functions.Function1) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r2v6 kotlin.jvm.functions.Function0) = (r2v5 kotlin.jvm.functions.Function0), (r2v8 kotlin.jvm.functions.Function0) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r3v5 o.n98) = (r3v4 o.n98), (r3v7 o.n98) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r13v4 float) = (r13v3 float), (r13v6 float) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d3, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[Catch: all -> 0x003a, PHI: r0 r2 r3
      0x00ae: PHI (r0v12 kotlin.jvm.functions.Function1) = (r0v16 kotlin.jvm.functions.Function1), (r0v17 kotlin.jvm.functions.Function1) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v4 kotlin.jvm.functions.Function0) = (r2v5 kotlin.jvm.functions.Function0), (r2v6 kotlin.jvm.functions.Function0) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r3v3 o.n98) = (r3v4 o.n98), (r3v5 o.n98) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d3, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d3, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:36:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(o.m5 r17, o.n5 r18, o.jc1 r19) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o98.a(o.m5, o.n5, o.jc1):java.lang.Object");
    }
}

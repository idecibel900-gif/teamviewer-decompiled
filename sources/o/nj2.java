package o;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class nj2 implements fu0 {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public nj2(File file) {
        this.a = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r9 == r5) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.nj2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o.nj2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.nj2] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(o.nj2 r8, o.jc1 r9) {
        /*
            boolean r0 = r9 instanceof o.mj2
            if (r0 == 0) goto L13
            r0 = r9
            o.mj2 r0 = (o.mj2) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.mj2 r0 = new o.mj2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f1474o
            int r1 = r0.q
            r2 = 2
            r3 = 1
            r4 = 0
            o.ne1 r5 = o.ne1.m
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r8 = r0.m
            java.io.Closeable r8 = (java.io.Closeable) r8
            o.ct1.a0(r9)     // Catch: java.lang.Throwable -> L30
            goto L9d
        L30:
            r9 = move-exception
            goto La1
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            return r4
        L39:
            java.io.FileInputStream r8 = r0.n
            java.lang.Object r1 = r0.m
            o.nj2 r1 = (o.nj2) r1
            o.ct1.a0(r9)     // Catch: java.lang.Throwable -> L43
            goto L6c
        L43:
            r9 = move-exception
            goto L77
        L45:
            o.ct1.a0(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.b
            boolean r9 = r9.get()
            if (r9 != 0) goto Lad
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7d
            java.io.File r1 = r8.a     // Catch: java.io.FileNotFoundException -> L7d
            r9.<init>(r1)     // Catch: java.io.FileNotFoundException -> L7d
            java.io.FileInputStream r9 = io.sentry.config.a.c(r1, r9)     // Catch: java.io.FileNotFoundException -> L7d
            r0.m = r8     // Catch: java.lang.Throwable -> L72
            r0.n = r9     // Catch: java.lang.Throwable -> L72
            r0.q = r3     // Catch: java.lang.Throwable -> L72
            o.fx4 r1 = o.d82.v(r9)     // Catch: java.lang.Throwable -> L72
            if (r1 != r5) goto L68
            goto L9c
        L68:
            r7 = r1
            r1 = r8
            r8 = r9
            r9 = r7
        L6c:
            o.kh.n(r8, r4)     // Catch: java.io.FileNotFoundException -> L70
            return r9
        L70:
            r8 = r1
            goto L7d
        L72:
            r1 = move-exception
            r7 = r1
            r1 = r8
            r8 = r9
            r9 = r7
        L77:
            throw r9     // Catch: java.lang.Throwable -> L78
        L78:
            r6 = move-exception
            o.kh.n(r8, r9)     // Catch: java.io.FileNotFoundException -> L70
            throw r6     // Catch: java.io.FileNotFoundException -> L70
        L7d:
            java.io.File r9 = r8.a
            boolean r9 = r9.exists()
            if (r9 == 0) goto La7
            java.io.FileInputStream r9 = new java.io.FileInputStream
            java.io.File r8 = r8.a
            r9.<init>(r8)
            java.io.FileInputStream r8 = io.sentry.config.a.c(r8, r9)
            r0.m = r8     // Catch: java.lang.Throwable -> L30
            r0.n = r4     // Catch: java.lang.Throwable -> L30
            r0.q = r2     // Catch: java.lang.Throwable -> L30
            o.fx4 r9 = o.d82.v(r8)     // Catch: java.lang.Throwable -> L30
            if (r9 != r5) goto L9d
        L9c:
            return r5
        L9d:
            o.kh.n(r8, r4)
            return r9
        La1:
            throw r9     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            o.kh.n(r8, r9)
            throw r0
        La7:
            o.fx4 r8 = new o.fx4
            r8.<init>(r3)
            return r8
        Lad:
            java.lang.String r8 = "This scope has already been closed."
            o.hk0.l(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nj2.a(o.nj2, o.jc1):java.lang.Object");
    }

    @Override // o.fu0
    public final void close() {
        this.b.set(true);
    }
}

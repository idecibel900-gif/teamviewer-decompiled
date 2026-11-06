package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class x15 {
    public b25 a;
    public b25 b;
    public Function0 c = new vm3((Object) this, (byte) 17);
    public me1 d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, o.jc1 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof o.v15
            if (r0 == 0) goto L14
            r0 = r12
            o.v15 r0 = (o.v15) r0
            int r1 = r0.f2264o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2264o = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            o.v15 r0 = new o.v15
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.m
            int r1 = r12.f2264o
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            o.ct1.a0(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            return r2
        L31:
            o.ct1.a0(r0)
            goto L55
        L35:
            o.ct1.a0(r0)
            o.b25 r0 = r7.a
            if (r0 == 0) goto L41
            o.b25 r0 = r0.V0()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            o.ne1 r1 = o.ne1.m
            if (r0 != 0) goto L5a
            o.b25 r7 = r7.b
            if (r7 == 0) goto L72
            r12.f2264o = r4
            java.lang.Object r0 = r7.e(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            o.nc8 r0 = (o.nc8) r0
            long r5 = r0.a
            goto L72
        L5a:
            o.b25 r7 = r7.a
            if (r7 == 0) goto L62
            o.b25 r2 = r7.V0()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.f2264o = r3
            java.lang.Object r0 = r7.e(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            o.nc8 r0 = (o.nc8) r0
            long r5 = r0.a
        L72:
            o.nc8 r7 = new o.nc8
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x15.a(long, long, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, jc1 jc1Var) {
        w15 w15Var;
        long j2;
        if (jc1Var instanceof w15) {
            w15Var = (w15) jc1Var;
            int i = w15Var.f2364o;
            if ((i & Integer.MIN_VALUE) != 0) {
                w15Var.f2364o = i - Integer.MIN_VALUE;
            } else {
                w15Var = new w15(this, jc1Var);
            }
        } else {
            w15Var = new w15(this, jc1Var);
        }
        Object objC = w15Var.m;
        int i2 = w15Var.f2364o;
        if (i2 == 0) {
            ct1.a0(objC);
            b25 b25Var = this.a;
            b25 b25VarV0 = b25Var != null ? b25Var.V0() : null;
            if (b25VarV0 != null) {
                w15Var.f2364o = 1;
                objC = b25VarV0.C(j, w15Var);
                ne1 ne1Var = ne1.m;
                if (objC == ne1Var) {
                    return ne1Var;
                }
            } else {
                j2 = 0;
            }
            return new nc8(j2);
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(objC);
        j2 = ((nc8) objC).a;
        return new nc8(j2);
    }

    public final me1 c() {
        me1 me1Var = (me1) this.c.a();
        if (me1Var != null) {
            return me1Var;
        }
        hk0.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}

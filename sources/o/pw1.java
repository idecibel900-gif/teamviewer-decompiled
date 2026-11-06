package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pw1 implements Function0 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ fx1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tx1 f1783o;
    public final /* synthetic */ z31 p;
    public final /* synthetic */ List q;
    public final /* synthetic */ Function1 r;

    public /* synthetic */ pw1(fx1 fx1Var, tx1 tx1Var, List list, Function1 function1, z31 z31Var) {
        this.n = fx1Var;
        this.f1783o = tx1Var;
        this.q = list;
        this.r = function1;
        this.p = z31Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 java.lang.Object, still in use, count: 2, list:
          (r3v6 java.lang.Object) from 0x0050: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v6 java.lang.Object) binds: [B:14:0x004f, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]
          (r3v6 java.lang.Object) from 0x003f: CHECK_CAST (o.l33) (r3v6 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object a() {
        /*
            r11 = this;
            byte r0 = r11.m
            o.f88 r1 = o.f88.a
            kotlin.jvm.functions.Function1 r2 = r11.r
            java.util.List r3 = r11.q
            o.z31 r4 = r11.p
            o.tx1 r5 = r11.f1783o
            o.fx1 r11 = r11.n
            switch(r0) {
                case 0: goto L2d;
                default: goto L11;
            }
        L11:
            o.qx1 r5 = (o.qx1) r5
            o.h71 r0 = r5.a
            o.l33 r3 = o.lq1.r(r4, r3)
            r11.V0()
            o.qx1 r4 = new o.qx1
            r4.<init>(r0)
            r11.f1(r4)
            r11.Y0(r0)
            if (r3 == 0) goto L2c
            r2.invoke(r3)
        L2c:
            return r1
        L2d:
            r11.f1(r5)
            java.util.Iterator r0 = r3.iterator()
        L34:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r0.next()
            r6 = r3
            o.l33 r6 = (o.l33) r6
            o.k33 r6 = r6.a
            r7 = r5
            o.rx1 r7 = (o.rx1) r7
            o.k33 r7 = r7.b
            boolean r6 = o.im3.n(r6, r7)
            if (r6 == 0) goto L34
            goto L50
        L4f:
            r3 = 0
        L50:
            o.l33 r3 = (o.l33) r3
            if (r3 == 0) goto L57
            r2.invoke(r3)
        L57:
            o.ns1 r7 = o.lq1.J(r4)
            if (r7 == 0) goto L82
            r11.V0()
            o.l97 r0 = r11.n
        L62:
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            o.gw1 r5 = (o.gw1) r5
            r9 = 0
            r10 = 13
            r6 = 0
            r8 = 0
            o.gw1 r3 = o.gw1.a(r5, r6, r7, r8, r9, r10)
            boolean r2 = r0.j(r2, r3)
            if (r2 == 0) goto L62
            o.hx1 r0 = new o.hx1
            long r2 = r7.a
            r0.<init>(r2)
            r11.W0(r0)
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.pw1.a():java.lang.Object");
    }

    public /* synthetic */ pw1(fx1 fx1Var, tx1 tx1Var, z31 z31Var, List list, Function1 function1) {
        this.n = fx1Var;
        this.f1783o = tx1Var;
        this.p = z31Var;
        this.q = list;
        this.r = function1;
    }
}

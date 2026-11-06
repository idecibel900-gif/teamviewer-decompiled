package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final enum n73 extends r73 {
    public n73() {
        super("InBody", 5);
    }

    /* JADX WARN: Code duplicated, block: B:727:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:762:0x0b6b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v28 o.o82, still in use, count: 2, list:
          (r10v28 o.o82) from 0x0227: IGET (r10v28 o.o82) A[WRAPPED] o.o82.p o.hn7
          (r10v28 o.o82) from 0x0233: PHI (r10 I:??) = (r10v24 o.o82), (r10v28 o.o82) binds: [B:150:0x0232, B:854:0x0233] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // o.r73
    public final boolean d(o.sj5 r34, o.t63 r35) {
        /*
            Method dump skipped, instruction units count: 3728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n73.d(o.sj5, o.t63):boolean");
    }

    public final boolean e(sj5 sj5Var, t63 t63Var) {
        sj5Var.getClass();
        String str = ((dw7) sj5Var).e;
        ArrayList arrayList = t63Var.e;
        if (t63Var.F(str) == null) {
            t63Var.C(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o82 o82Var = (o82) arrayList.get(size);
            if (o82Var.t(str)) {
                t63Var.D(str);
                if (!t63Var.d(str, "http://www.w3.org/1999/xhtml")) {
                    t63Var.C(this);
                }
                t63Var.T(str);
                return true;
            }
            if (o82Var.p.b(128)) {
                t63Var.C(this);
                return false;
            }
        }
        return true;
    }
}

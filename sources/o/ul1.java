package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ul1 {
    public final j57 a;
    public final bg5 b;
    public final bg5 c;
    public final bg5 d;
    public final eo1 e;
    public final vx4 f;

    public ul1(List list, ye5 ye5Var, pu7 pu7Var) {
        j57 j57Var = new j57();
        j57Var.addAll(list);
        this.a = j57Var;
        this.b = h57.p(ye5Var);
        this.c = h57.p(Boolean.TRUE);
        this.d = h57.p(pu7Var);
        this.e = d57.b(new zz0(this, (byte) 10));
        this.f = new vx4(g());
    }

    public static boolean c(ul1 ul1Var) {
        return ul1Var.e("PopUntilScaffoldValueChange") >= 0;
    }

    public final Object a(jc1 jc1Var) {
        Object objA = vx4.a(this.f, g(), jc1Var);
        return objA == ne1.m ? objA : f88.a;
    }

    public final cv7 b(int i) {
        bg5 bg5Var = this.d;
        if (i == -1) {
            return x67.e(f().a, (pu7) bg5Var.getValue(), qf0.M(null), f().c);
        }
        boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
        j57 j57Var = this.a;
        if (zBooleanValue) {
            return x67.e(f().a, (pu7) bg5Var.getValue(), j57Var.subList(0, i + 1), f().c);
        }
        return x67.e(f().a, (pu7) bg5Var.getValue(), qf0.M((qu7) j57Var.get(i)), f().c);
    }

    public final qu7 d() {
        return (qu7) lv0.w0(this.a);
    }

    public final int e(String str) {
        j57 j57Var = this.a;
        if (j57Var.size() <= 1) {
            return -1;
        }
        if (im3.n(str, "PopLatest")) {
            return qf0.D(j57Var) - 1;
        }
        if (im3.n(str, "PopUntilScaffoldValueChange")) {
            for (int iD = qf0.D(j57Var) - 1; -1 < iD; iD--) {
                if (!b(iD).equals(g())) {
                    return iD;
                }
            }
        } else if (im3.n(str, "PopUntilCurrentDestinationChange")) {
            for (int iD2 = qf0.D(j57Var) - 1; -1 < iD2; iD2--) {
                yu7 yu7Var = ((qu7) j57Var.get(iD2)).a;
                qu7 qu7VarD = d();
                if (yu7Var != (qu7VarD != null ? qu7VarD.a : null)) {
                    return iD2;
                }
            }
        } else if (im3.n(str, "PopUntilContentChange")) {
            for (int iD3 = qf0.D(j57Var) - 1; -1 < iD3; iD3--) {
                Object obj = ((qu7) j57Var.get(iD3)).b;
                qu7 qu7VarD2 = d();
                if (!im3.n(obj, qu7VarD2 != null ? qu7VarD2.b : null) || !b(iD3).equals(g())) {
                    return iD3;
                }
            }
        }
        return -1;
    }

    public final ye5 f() {
        return (ye5) this.b.getValue();
    }

    public final cv7 g() {
        return (cv7) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (a(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (a(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r5, o.jc1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.tl1
            if (r0 == 0) goto L13
            r0 = r6
            o.tl1 r0 = (o.tl1) r0
            int r1 = r0.f2121o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2121o = r1
            goto L18
        L13:
            o.tl1 r0 = new o.tl1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.m
            int r1 = r0.f2121o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L28
            o.ct1.a0(r6)
            goto L63
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r4)
            r4 = 0
            return r4
        L2f:
            o.ct1.a0(r6)
            goto L4c
        L33:
            o.ct1.a0(r6)
            int r5 = r4.e(r5)
            o.j57 r6 = r4.a
            o.ne1 r1 = o.ne1.m
            if (r5 >= 0) goto L4f
            r6.clear()
            r0.f2121o = r3
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L4c
            goto L62
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4f:
            int r5 = r5 + r3
        L50:
            int r3 = r6.size()
            if (r3 <= r5) goto L5a
            o.qv0.e0(r6)
            goto L50
        L5a:
            r0.f2121o = r2
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L63
        L62:
            return r1
        L63:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ul1.h(java.lang.String, o.jc1):java.lang.Object");
    }

    public final Object i(yu7 yu7Var, Object obj, jc1 jc1Var) {
        this.a.add(new qu7(yu7Var, obj));
        Object objA = a(jc1Var);
        return objA == ne1.m ? objA : f88.a;
    }
}

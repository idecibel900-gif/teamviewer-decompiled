package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u08 extends u45 {
    public final kf0 f;
    public n87 g;

    public u08(yk6 yk6Var, xy0 xy0Var, in1 in1Var) {
        super(yk6Var, xy0Var, in1Var);
        this.f = ka0.d(Integer.MAX_VALUE, 6, null);
    }

    public static s08 e(kf0 kf0Var) {
        s08 s08Var = null;
        aq6 aq6VarM = ct1.M(new v45(new iu4(kf0Var, (byte) 1), null));
        while (aq6VarM.hasNext()) {
            s08 s08VarA = (s08) aq6VarM.next();
            if (s08Var != null) {
                s08VarA = s08Var.a(s08VarA);
            }
            s08Var = s08VarA;
        }
        return s08Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
    
        if (r16.b.invoke(r0, r6) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(o.yk6 r17, o.s08 r18, o.jc1 r19) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u08.c(o.yk6, o.s08, o.jc1):java.lang.Object");
    }

    public final boolean d(bn5 bn5Var) {
        boolean z;
        boolean z2;
        boolean z3;
        kf0 kf0Var;
        yk6 yk6Var;
        in5 in5Var = (in5) lv0.o0(bn5Var.a);
        if (in5Var != null) {
            List listB = in5Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                kf0Var = this.f;
                yk6Var = this.a;
                if (i >= size) {
                    break;
                }
                t53 t53Var = (t53) listB.get(i);
                long j = t53Var.d ^ (-9223372034707292160L);
                if (!(yk6Var.j(yk6Var.f(j)) == 0.0f)) {
                    z3 = !(kf0Var.b(new s08(j, t53Var.a, false)) instanceof in0) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = in5Var.l ^ (-9223372034707292160L);
            boolean z4 = bn5Var.f == 12;
            if (!(yk6Var.j(yk6Var.f(j2)) == 0.0f) || z4) {
                if (!(kf0Var.b(new s08(j2, in5Var.b, z4)) instanceof in0) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}

package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class in implements do4 {
    public final pn a;
    public jl5[] b;
    public jl5[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final hn h = new hn(this, (byte) 1);
    public final hn i = new hn(this, (byte) 0);

    public in(pn pnVar) {
        this.a = pnVar;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).k(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).k(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).o(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).o(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        vd5 vd5Var;
        int size = list.size();
        jl5[] jl5VarArr = new jl5[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            zn4 zn4Var = (zn4) list.get(i);
            Object objE = zn4Var.E();
            ln lnVar = objE instanceof ln ? (ln) objE : null;
            if (lnVar != null && ((Boolean) lnVar.b.getValue()).booleanValue()) {
                jl5 jl5VarC = zn4Var.C(j);
                long j3 = (((long) jl5VarC.n) & 4294967295L) | (((long) jl5VarC.m) << 32);
                jl5VarArr[i] = jl5VarC;
                j2 = j3;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zn4 zn4Var2 = (zn4) list.get(i2);
            if (jl5VarArr[i2] == null) {
                jl5VarArr[i2] = zn4Var2.C(j);
            }
        }
        if (fo4Var.b0()) {
            vd5Var = new vd5(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                jl5 jl5Var = jl5VarArr[i5];
                if (jl5Var != null) {
                    Object objE2 = ((zn4) list.get(i5)).E();
                    ln lnVar2 = objE2 instanceof ln ? (ln) objE2 : null;
                    if (lnVar2 == null || !((Boolean) lnVar2.c.getValue()).booleanValue()) {
                        int i6 = jl5Var.m;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = jl5Var.n;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            vd5Var = new vd5(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) vd5Var.m).intValue();
        int iIntValue2 = ((Number) vd5Var.n).intValue();
        boolean zB0 = fo4Var.b0();
        fa2 fa2Var = fa2.m;
        if (zB0) {
            this.b = jl5VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return fo4Var.u(iIntValue, iIntValue2, fa2Var, this.h);
        }
        this.a.b.setValue(new dl3((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = jl5VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return fo4Var.u(iIntValue, iIntValue2, fa2Var, this.i);
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((zn4) list.get(0)).V(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((zn4) list.get(i2)).V(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}

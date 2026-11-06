package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qn implements do4 {
    public final co a;
    public boolean b;

    public qn(co coVar) {
        this.a = coVar;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iK = ((zn4) list.get(0)).k(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iK2 = ((zn4) list.get(i2)).k(i);
                if (iK2 > iK) {
                    iK = iK2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iK;
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = ((zn4) list.get(0)).o(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = ((zn4) list.get(i2)).o(i);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iO;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        bg5 bg5Var = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            jl5 jl5VarC = ((zn4) list.get(i)).C(j);
            iMax = Math.max(iMax, jl5VarC.m);
            iMax2 = Math.max(iMax2, jl5VarC.n);
            arrayList.add(jl5VarC);
        }
        if (fo4Var.b0()) {
            this.b = true;
            bg5Var.setValue(new dl3((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            bg5Var.setValue(new dl3((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return fo4Var.u(iMax, iMax2, fa2.m, new io.sentry.okhttp.b(arrayList, (byte) 4));
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((zn4) list.get(0)).a(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA2 = ((zn4) list.get(i2)).a(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((zn4) list.get(0)).V(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iV2 = ((zn4) list.get(i2)).V(i);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iV;
    }
}

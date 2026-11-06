package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ax2 extends c07 {
    public ax2(fi1 fi1Var, ax2 ax2Var, int i, boolean z) {
        super(fi1Var, ax2Var, yl7.p, xa5.g, i, s67.h);
        this.y = true;
        this.G = z;
        this.H = false;
    }

    @Override // o.zw2, o.xw2
    public final boolean D() {
        return false;
    }

    @Override // o.c07, o.zw2
    public final zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        fi1Var.getClass();
        if (i == 0) {
            throw null;
        }
        upVar.getClass();
        return new ax2(fi1Var, (ax2) xw2Var, i, this.G);
    }

    @Override // o.zw2
    public final zw2 F0(yw2 yw2Var) throws l58 {
        sy4 sy4Var;
        ax2 ax2Var = (ax2) super.F0(yw2Var);
        if (ax2Var == null) {
            return null;
        }
        List listJ = ax2Var.J();
        listJ.getClass();
        if (listJ.isEmpty()) {
            return ax2Var;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            oz3 type = ((qb8) it.next()).getType();
            type.getClass();
            if (wo1.D(type) != null) {
                List listJ2 = ax2Var.J();
                listJ2.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(listJ2, 10));
                Iterator it2 = listJ2.iterator();
                while (it2.hasNext()) {
                    oz3 type2 = ((qb8) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(wo1.D(type2));
                }
                int size = ax2Var.J().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listJ3 = ax2Var.J();
                    listJ3.getClass();
                    ArrayList<vd5> arrayListV0 = lv0.V0(arrayList, listJ3);
                    if (arrayListV0.isEmpty()) {
                        return ax2Var;
                    }
                    for (vd5 vd5Var : arrayListV0) {
                        if (!im3.n((sy4) vd5Var.m, ((qb8) vd5Var.n).getName())) {
                        }
                    }
                    return ax2Var;
                }
                List<qb8> listJ4 = ax2Var.J();
                listJ4.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(listJ4, 10));
                for (qb8 qb8Var : listJ4) {
                    sy4 name = qb8Var.getName();
                    name.getClass();
                    int i = qb8Var.r;
                    int i2 = i - size;
                    if (i2 >= 0 && (sy4Var = (sy4) arrayList.get(i2)) != null) {
                        name = sy4Var;
                    }
                    arrayList2.add(qb8Var.D0(ax2Var, name, i));
                }
                yw2 yw2VarI0 = ax2Var.I0(m58.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((sy4) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                yw2VarI0.H = Boolean.valueOf(z);
                yw2VarI0.s = arrayList2;
                yw2VarI0.q = ax2Var.C0();
                zw2 zw2VarF0 = super.F0(yw2VarI0);
                zw2VarF0.getClass();
                return zw2VarF0;
            }
        }
        return ax2Var;
    }

    @Override // o.zw2, o.xw2
    public final boolean m() {
        return false;
    }

    @Override // o.zw2, o.qo4
    public final boolean p() {
        return false;
    }
}

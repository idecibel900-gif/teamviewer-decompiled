package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class dk implements do4 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ dk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        ArrayList arrayList;
        vd5 vd5Var;
        byte b = this.a;
        fa2 fa2Var = fa2.m;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((yo5) obj).setParentLayoutDirection((j04) obj2);
                return fo4Var.u(0, 0, fa2Var, new t2((byte) 23));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (!(((zn4) obj3).E() instanceof ht7)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((Function0) obj2).a();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i2 = 0;
                    for (int size2 = list2.size(); i2 < size2; size2 = size2) {
                        v56 v56Var = (v56) list2.get(i2);
                        if (v56Var != null) {
                            float f = v56Var.b;
                            float f2 = v56Var.a;
                            vd5Var = new vd5(((zn4) arrayList2.get(i2)).C(t61.b(0, (int) Math.floor(v56Var.c - f2), 0, (int) Math.floor(v56Var.d - f), 5)), new vk3((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            vd5Var = null;
                        }
                        if (vd5Var != null) {
                            arrayList3.add(vd5Var);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj4 = list.get(i3);
                    if (((zn4) obj4).E() instanceof ht7) {
                        arrayList4.add(obj4);
                    }
                }
                return fo4Var.u(r61.i(j), r61.h(j), fa2Var, new py5((Object) arrayList, (Object) j51.L(arrayList4, (Function0) obj), (byte) 22));
        }
    }
}

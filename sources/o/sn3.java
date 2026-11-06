package o;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sn3 {
    public static final Map a = xm4.R(new vd5("PACKAGE", EnumSet.noneOf(nz3.class)), new vd5("TYPE", EnumSet.of(nz3.CLASS, nz3.FILE)), new vd5("ANNOTATION_TYPE", EnumSet.of(nz3.ANNOTATION_CLASS)), new vd5("TYPE_PARAMETER", EnumSet.of(nz3.TYPE_PARAMETER)), new vd5("FIELD", EnumSet.of(nz3.FIELD)), new vd5("LOCAL_VARIABLE", EnumSet.of(nz3.LOCAL_VARIABLE)), new vd5("PARAMETER", EnumSet.of(nz3.VALUE_PARAMETER)), new vd5("CONSTRUCTOR", EnumSet.of(nz3.CONSTRUCTOR)), new vd5("METHOD", EnumSet.of(nz3.FUNCTION, nz3.PROPERTY_GETTER, nz3.PROPERTY_SETTER)), new vd5("TYPE_USE", EnumSet.of(nz3.TYPE)));
    public static final Map b = xm4.R(new vd5("RUNTIME", mz3.m), new vd5("CLASS", mz3.n), new vd5("SOURCE", mz3.f1525o));

    public static bx a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof f86) {
                arrayList.add(obj);
            }
        }
        ArrayList<nz3> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(sy4.e(((f86) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = la2.m;
            }
            qv0.c0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, 10));
        for (nz3 nz3Var : arrayList2) {
            ht2 ht2Var = s87.u;
            ht2Var.getClass();
            ht2 ht2VarE = ht2Var.e();
            sy4 sy4VarF = ht2Var.f();
            sy4VarF.getClass();
            arrayList3.add(new oc2(new js0(ht2VarE, sy4VarF), sy4.e(nz3Var.name())));
        }
        return new bx(arrayList3, ek.L);
    }
}

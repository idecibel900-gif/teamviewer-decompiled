package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vt3 implements rt3, sw3 {
    public final u86 m = et1.F(null, new st3(this, 0));
    public final u86 n = et1.F(null, new st3(this, 1));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u86 f2343o = et1.F(null, new st3(this, 2));
    public final u86 p;
    public final u14 q;

    public vt3() {
        et1.F(null, new st3(this, (byte) 3));
        this.p = et1.F(null, new st3(this, (byte) 4));
        this.q = ds1.X(l54.m, new st3(this, (byte) 5));
    }

    public static Object s(qw3 qw3Var) {
        Class clsZ = et1.z(wo1.K(qw3Var));
        if (clsZ.isArray()) {
            Object objNewInstance = Array.newInstance(clsZ.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new kz3("Cannot instantiate the default empty array of type " + clsZ.getSimpleName() + ", because it is not an array type");
    }

    @Override // o.rt3
    public final Object call(Object... objArr) throws vd3 {
        objArr.getClass();
        try {
            return t().call(objArr);
        } catch (IllegalAccessException e) {
            throw new vd3(e);
        }
    }

    @Override // o.rt3
    public final Object callBy(Map map) throws vd3 {
        Object objS;
        map.getClass();
        boolean z = false;
        if (y()) {
            List<pv3> parameters = getParameters();
            ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
            for (pv3 pv3Var : parameters) {
                if (map.containsKey(pv3Var)) {
                    objS = map.get(pv3Var);
                    if (objS == null) {
                        yq4.g(41, pv3Var, "Annotation argument value cannot be null (");
                        return null;
                    }
                } else if (pv3Var.h()) {
                    objS = null;
                } else {
                    if (!pv3Var.i()) {
                        an4.i(pv3Var, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objS = s(pv3Var.d());
                }
                arrayList.add(objS);
            }
            mj0 mj0VarV = v();
            if (mj0VarV == null) {
                gk0.k(w(), "This callable does not support a default call: ");
                return null;
            }
            try {
                return mj0VarV.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new vd3(e);
            }
        }
        List<pv3> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return t().call(l() ? new hc1[]{null} : new hc1[0]);
            } catch (IllegalAccessException e2) {
                throw new vd3(e2);
            }
        }
        int size = (l() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.p.a()).clone();
        if (l()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.q.getValue()).booleanValue();
        int i = 0;
        for (pv3 pv3Var2 : parameters2) {
            int iX = zBooleanValue ? x(pv3Var2) : 1;
            if (map.containsKey(pv3Var2)) {
                objArr[pv3Var2.n] = map.get(pv3Var2);
            } else if (pv3Var2.h()) {
                if (zBooleanValue) {
                    int i2 = i + iX;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArr[i4];
                        obj.getClass();
                        objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = objArr[i5];
                    obj2.getClass();
                    objArr[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!pv3Var2.i()) {
                an4.i(pv3Var2, "No argument provided for a required parameter: ");
                return null;
            }
            if (pv3Var2.f1780o == mv3.f1514o) {
                i += iX;
            }
        }
        if (!z) {
            try {
                return t().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new vd3(e3);
            }
        }
        mj0 mj0VarV2 = v();
        if (mj0VarV2 == null) {
            gk0.k(w(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return mj0VarV2.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new vd3(e4);
        }
    }

    @Override // o.qt3
    public final List getAnnotations() {
        Object objA = this.m.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // o.rt3
    public final List getParameters() {
        Object objA = this.n.a();
        objA.getClass();
        return (List) objA;
    }

    @Override // o.rt3
    public final ow3 getReturnType() {
        Object objA = this.f2343o.a();
        objA.getClass();
        return (ow3) objA;
    }

    public abstract mj0 t();

    public abstract ou3 u();

    public mj0 v() {
        return null;
    }

    public abstract zi0 w();

    public final int x(pv3 pv3Var) {
        if (!((Boolean) this.q.getValue()).booleanValue()) {
            hk0.g("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        qw3 qw3VarD = pv3Var.d();
        ht2 ht2Var = pa8.a;
        oz3 oz3Var = qw3VarD.m;
        if (oz3Var == null || !pi3.f(oz3Var)) {
            return 1;
        }
        ArrayList arrayListO = n67.o(m77.o(pv3Var.d().m));
        arrayListO.getClass();
        return arrayListO.size();
    }

    public final boolean y() {
        return im3.n(getName(), "<init>") && u().a().isAnnotation();
    }

    public abstract boolean z();
}

package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class st3 implements Function0 {
    public final /* synthetic */ byte m;
    public final vt3 n;

    public /* synthetic */ st3(vt3 vt3Var, byte b) {
        this.m = b;
        this.n = vt3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int i;
        int iX;
        Type[] lowerBounds;
        byte b = this.m;
        mv3 mv3Var = mv3.f1514o;
        int i2 = 0;
        z = false;
        boolean z = false;
        vt3 vt3Var = this.n;
        switch (b) {
            case 0:
                return pa8.d(vt3Var.w());
            case 1:
                zi0 zi0VarW = vt3Var.w();
                ArrayList arrayList = new ArrayList();
                if (vt3Var.z()) {
                    i = 0;
                } else {
                    v14 v14VarG = pa8.g(zi0VarW);
                    if (v14VarG != null) {
                        arrayList.add(new pv3(vt3Var, 0, mv3.m, new tt3(v14VarG, (byte) 0)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    v14 v14VarS = zi0VarW.S();
                    if (v14VarS != null) {
                        arrayList.add(new pv3(vt3Var, i, mv3.n, new tt3(v14VarS, (byte) 1)));
                        i++;
                    }
                }
                int size = zi0VarW.J().size();
                while (i2 < size) {
                    arrayList.add(new pv3(vt3Var, i, mv3Var, new ut3(zi0VarW, i2)));
                    i2++;
                    i++;
                }
                if (vt3Var.y() && (zi0VarW instanceof tn3) && arrayList.size() > 1) {
                    pv0.b0(arrayList, new gj2((byte) 19));
                }
                arrayList.trimToSize();
                return arrayList;
            case 2:
                oz3 returnType = vt3Var.w().getReturnType();
                returnType.getClass();
                return new qw3(returnType, new st3(vt3Var, (byte) 6));
            case 3:
                List<d58> typeParameters = vt3Var.w().getTypeParameters();
                typeParameters.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(typeParameters, 10));
                for (d58 d58Var : typeParameters) {
                    d58Var.getClass();
                    arrayList2.add(new rw3(vt3Var, d58Var));
                }
                return arrayList2;
            case 4:
                List<pv3> parameters = vt3Var.getParameters();
                int size2 = (vt3Var.l() ? 1 : 0) + parameters.size();
                if (((Boolean) vt3Var.q.getValue()).booleanValue()) {
                    iX = 0;
                    for (pv3 pv3Var : parameters) {
                        iX += pv3Var.f1780o == mv3Var ? vt3Var.x(pv3Var) : 0;
                    }
                } else if (parameters.isEmpty()) {
                    iX = 0;
                } else {
                    Iterator it = parameters.iterator();
                    iX = 0;
                    while (it.hasNext()) {
                        if (((pv3) it.next()).f1780o == mv3Var && (iX = iX + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                int i3 = (iX + 31) / 32;
                Object[] objArr = new Object[size2 + i3 + 1];
                for (pv3 pv3Var2 : parameters) {
                    boolean zH = pv3Var2.h();
                    int i4 = pv3Var2.n;
                    if (zH) {
                        qw3 qw3VarD = pv3Var2.d();
                        ht2 ht2Var = pa8.a;
                        oz3 oz3Var = qw3VarD.m;
                        if (oz3Var != null) {
                            int i5 = pi3.a;
                            ys0 ys0VarA = oz3Var.o0().a();
                            if (ys0VarA != null ? pi3.b(ys0VarA) : false) {
                            }
                        }
                        objArr[i4] = pa8.e(bt1.z(pv3Var2.d()));
                    }
                    if (pv3Var2.i()) {
                        objArr[i4] = vt3.s(pv3Var2.d());
                    }
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    objArr[size2 + i6] = 0;
                }
                return objArr;
            case 5:
                List parameters2 = vt3Var.getParameters();
                if (!parameters2.isEmpty()) {
                    Iterator it2 = parameters2.iterator();
                    while (it2.hasNext()) {
                        qw3 qw3VarD2 = ((pv3) it2.next()).d();
                        ht2 ht2Var2 = pa8.a;
                        oz3 oz3Var2 = qw3VarD2.m;
                        if (oz3Var2 != null && pi3.f(oz3Var2)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Type type = null;
                if (vt3Var.l()) {
                    Object objW0 = lv0.w0(vt3Var.t().a());
                    ParameterizedType parameterizedType = objW0 instanceof ParameterizedType ? (ParameterizedType) objW0 : null;
                    if (im3.n(parameterizedType != null ? parameterizedType.getRawType() : null, hc1.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        actualTypeArguments.getClass();
                        Object objC1 = cx.c1(actualTypeArguments);
                        WildcardType wildcardType = objC1 instanceof WildcardType ? (WildcardType) objC1 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) cx.R0(lowerBounds);
                        }
                    }
                }
                return type == null ? vt3Var.t().getReturnType() : type;
        }
    }
}

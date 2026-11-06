package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pa8 {
    public static final ht2 a = new ht2("kotlin.jvm.JvmStatic");

    public static final vt3 a(Object obj) {
        vt3 vt3Var = obj instanceof vt3 ? (vt3) obj : null;
        if (vt3Var != null) {
            return vt3Var;
        }
        ru3 ru3VarB = b(obj);
        return ru3VarB != null ? ru3VarB : c(obj);
    }

    public static final ru3 b(Object obj) {
        ru3 ru3Var = obj instanceof ru3 ? (ru3) obj : null;
        if (ru3Var != null) {
            return ru3Var;
        }
        bx2 bx2Var = obj instanceof bx2 ? (bx2) obj : null;
        rt3 rt3VarCompute = bx2Var != null ? bx2Var.compute() : null;
        if (rt3VarCompute instanceof ru3) {
            return (ru3) rt3VarCompute;
        }
        return null;
    }

    public static final mw3 c(Object obj) {
        mw3 mw3Var = obj instanceof mw3 ? (mw3) obj : null;
        if (mw3Var != null) {
            return mw3Var;
        }
        iu5 iu5Var = obj instanceof iu5 ? (iu5) obj : null;
        rt3 rt3VarCompute = iu5Var != null ? iu5Var.compute() : null;
        if (rt3VarCompute instanceof mw3) {
            return (mw3) rt3VarCompute;
        }
        return null;
    }

    public static final ArrayList d(so soVar) throws IllegalAccessException, InvocationTargetException {
        List listK;
        soVar.getClass();
        up annotations = soVar.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            hp hpVar = (hp) it.next();
            s67 s67VarC = hpVar.c();
            if (s67VarC instanceof o76) {
                annotationI = ((o76) s67VarC).m;
            } else if (s67VarC instanceof ng6) {
                e86 e86Var = ((ng6) s67VarC).m;
                q76 q76Var = e86Var instanceof q76 ? (q76) e86Var : null;
                if (q76Var != null) {
                    annotationI = q76Var.a;
                }
            } else {
                annotationI = i(hpVar);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (et1.z(et1.x((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsZ = et1.z(et1.x(annotation));
                        if (!clsZ.getSimpleName().equals("Container") || clsZ.getAnnotation(ta6.class) == null) {
                            listK = qf0.K(annotation);
                        } else {
                            Object objInvoke = clsZ.getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listK = Arrays.asList((Annotation[]) objInvoke);
                            listK.getClass();
                        }
                        qv0.c0(arrayList2, listK);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    hk0.l("Parameter with void type is illegal");
                    return null;
                }
                an4.u(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final xi0 f(Class cls, ky2 ky2Var, ty4 ty4Var, d22 d22Var, h60 h60Var, hw2 hw2Var) {
        List list;
        ky2Var.getClass();
        ty4Var.getClass();
        h60Var.getClass();
        mg6 mg6VarA = os4.a(cls);
        if (ky2Var instanceof iv5) {
            list = ((iv5) ky2Var).u;
        } else {
            if (!(ky2Var instanceof qv5)) {
                hk0.f(ky2Var, "Unsupported message: ");
                return null;
            }
            list = ((qv5) ky2Var).u;
        }
        List list2 = list;
        io.sentry.android.replay.screenshot.k kVar = mg6VarA.a;
        ps4 ps4Var = (ps4) kVar.b;
        ed8 ed8Var = ed8.b;
        list2.getClass();
        return (xi0) hw2Var.invoke(new vo4(new fp1(kVar, ty4Var, ps4Var, d22Var, ed8Var, h60Var, (rp1) null, (q48) null, list2)), ky2Var);
    }

    public static final v14 g(xi0 xi0Var) {
        xi0Var.getClass();
        if (xi0Var.O() == null) {
            return null;
        }
        fi1 fi1VarI = xi0Var.i();
        fi1VarI.getClass();
        return ((ns4) fi1VarI).q0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, js0 js0Var, int i) {
        String str = mo3.a;
        it2 it2VarI = js0Var.a().i();
        it2VarI.getClass();
        js0 js0VarG = mo3.g(it2VarI);
        if (js0VarG != null) {
            js0Var = js0VarG;
        }
        String strB = js0Var.a.b();
        String strB2 = js0Var.b.b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat("."));
        }
        String strReplace = strB2.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Annotation i(hp hpVar) {
        ns4 ns4VarD = bp1.d(hpVar);
        Class clsJ = ns4VarD != null ? j(ns4VarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = hpVar.e().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            sy4 sy4Var = (sy4) entry.getKey();
            u51 u51Var = (u51) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            classLoader.getClass();
            Object objK = k(u51Var, classLoader);
            vd5 vd5Var = objK != null ? new vd5(sy4Var.b(), objK) : null;
            if (vd5Var != null) {
                arrayList.add(vd5Var);
            }
        }
        Map mapU = xm4.U(arrayList);
        Set setKeySet = mapU.keySet();
        ArrayList arrayList2 = new ArrayList(mv0.Z(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) au8.x(clsJ, mapU, arrayList2);
    }

    public static final Class j(ns4 ns4Var) {
        s67 s67VarC = ns4Var.c();
        s67VarC.getClass();
        if (s67VarC instanceof hz3) {
            return ((hz3) s67VarC).m.a;
        }
        if (s67VarC instanceof ng6) {
            return ((a86) ((ng6) s67VarC).m).a;
        }
        js0 js0VarF = bp1.f(ns4Var);
        if (js0VarF == null) {
            return null;
        }
        return h(p76.d(ns4Var.getClass()), js0VarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(u51 u51Var, ClassLoader classLoader) {
        Class clsH;
        if (u51Var instanceof sp) {
            return i((hp) ((sp) u51Var).a);
        }
        int i = 0;
        if (u51Var instanceof bx) {
            bx bxVar = (bx) u51Var;
            s58 s58Var = bxVar instanceof s58 ? (s58) bxVar : null;
            if (s58Var != null) {
                oz3 oz3Var = s58Var.c;
                Object obj = bxVar.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((u51) it.next(), classLoader));
                }
                sy4 sy4Var = wy3.e;
                ys0 ys0VarA = oz3Var.o0().a();
                ps5 ps5VarR = ys0VarA == null ? null : wy3.r(ys0VarA);
                switch (ps5VarR == null ? -1 : oa8.a[ps5VarR.ordinal()]) {
                    case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                        if (!wy3.y(oz3Var)) {
                            yq4.k(oz3Var, "Not an array type: ");
                            return null;
                        }
                        oz3 oz3VarB = ((h58) lv0.F0(oz3Var.m0())).b();
                        oz3VarB.getClass();
                        ys0 ys0VarA2 = oz3VarB.o0().a();
                        ns4 ns4Var = ys0VarA2 instanceof ns4 ? (ns4) ys0VarA2 : null;
                        if (ns4Var == null) {
                            hk0.f(oz3VarB, "Not a class type: ");
                            return null;
                        }
                        if (wy3.G(oz3VarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (wy3.b(ns4Var, s87.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                obj3.getClass();
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        js0 js0VarF = bp1.f(ns4Var);
                        if (js0VarF != null && (clsH = h(classLoader, js0VarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        gk0.s();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            obj11.getClass();
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (u51Var instanceof oc2) {
            vd5 vd5Var = (vd5) ((oc2) u51Var).a;
            js0 js0Var = (js0) vd5Var.m;
            sy4 sy4Var2 = (sy4) vd5Var.n;
            Class clsH2 = h(classLoader, js0Var, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, sy4Var2.b());
            }
        } else {
            if (!(u51Var instanceof iu3)) {
                if ((u51Var instanceof id2) || (u51Var instanceof x55)) {
                    return null;
                }
                return u51Var.b();
            }
            hu3 hu3Var = (hu3) ((iu3) u51Var).a;
            if (hu3Var instanceof gu3) {
                ns0 ns0Var = ((gu3) hu3Var).a;
                return h(classLoader, ns0Var.a, ns0Var.b);
            }
            if (!(hu3Var instanceof fu3)) {
                gk0.s();
                return null;
            }
            ys0 ys0VarA3 = ((fu3) hu3Var).a.o0().a();
            ns4 ns4Var2 = ys0VarA3 instanceof ns4 ? (ns4) ys0VarA3 : null;
            if (ns4Var2 != null) {
                return j(ns4Var2);
            }
        }
        return null;
    }
}

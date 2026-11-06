package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class og1 {
    public final LinkedHashMap a;

    public og1(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 3:
            default:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new LinkedHashMap();
                break;
            case 5:
                this.a = new LinkedHashMap();
                break;
            case 6:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(wt3 wt3Var, Function1 function1) {
        wt3Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(wt3Var)) {
            gk0.h(fx3.g("A `initializer` with the same `clazz` has already been added: ", wt3Var.c(), "."));
        } else {
            linkedHashMap.put(wt3Var, new qe8(wt3Var, function1));
        }
    }

    public void b(er4 er4Var) {
        er4Var.getClass();
        byte b = er4Var.a;
        byte b2 = er4Var.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            io.sentry.android.core.v0.j("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(b2)) + " with " + er4Var);
        }
        treeMap2.put(Integer.valueOf(b2), er4Var);
    }

    public fi3 c() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        qe8[] qe8VarArr = (qe8[]) collectionValues.toArray(new qe8[0]);
        return new fi3((qe8[]) Arrays.copyOf(qe8VarArr, qe8VarArr.length));
    }

    public void d(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                Class<?> cls = value.getClass();
                x86 x86Var = w86.a;
                wt3 wt3VarB = x86Var.b(cls);
                if (!wt3VarB.equals(x86Var.b(Boolean.TYPE)) && !wt3VarB.equals(x86Var.b(Byte.TYPE)) && !wt3VarB.equals(x86Var.b(Integer.TYPE)) && !wt3VarB.equals(x86Var.b(Long.TYPE)) && !wt3VarB.equals(x86Var.b(Float.TYPE)) && !wt3VarB.equals(x86Var.b(Double.TYPE)) && !wt3VarB.equals(x86Var.b(String.class)) && !wt3VarB.equals(x86Var.b(Boolean[].class)) && !wt3VarB.equals(x86Var.b(Byte[].class)) && !wt3VarB.equals(x86Var.b(Integer[].class)) && !wt3VarB.equals(x86Var.b(Long[].class)) && !wt3VarB.equals(x86Var.b(Float[].class)) && !wt3VarB.equals(x86Var.b(Double[].class)) && !wt3VarB.equals(x86Var.b(String[].class))) {
                    int i = 0;
                    if (wt3VarB.equals(x86Var.b(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = yh1.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (wt3VarB.equals(x86Var.b(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = yh1.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (wt3VarB.equals(x86Var.b(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = yh1.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (wt3VarB.equals(x86Var.b(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = yh1.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (wt3VarB.equals(x86Var.b(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = yh1.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!wt3VarB.equals(x86Var.b(double[].class))) {
                            yq4.s("Key ", str, " has invalid type ", wt3VarB);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = yh1.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.a.put(str, value);
        }
    }

    public List e(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (im3.n(((km8) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((km8) it.next());
        }
        return lv0.P0(linkedHashMap.values());
    }

    public b97 f(km8 km8Var) {
        km8Var.getClass();
        return (b97) this.a.remove(km8Var);
    }

    public void g(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.a.put(lowerCase, qf0.N(str));
    }

    public b97 h(km8 km8Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object b97Var = linkedHashMap.get(km8Var);
        if (b97Var == null) {
            b97Var = new b97(km8Var);
            linkedHashMap.put(km8Var, b97Var);
        }
        return (b97) b97Var;
    }

    public og1(w25 w25Var) {
        Map map = w25Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), lv0.Q0((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }
}

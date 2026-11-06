package io.sentry;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    public final int a;
    public Object b;

    public s2(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public HashMap a(Map map, g1 g1Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), b(g1Var, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public Object b(g1 g1Var, Object obj) {
        Object objF;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.f.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return io.sentry.util.f.b((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            HashSet hashSet = (HashSet) this.b;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.b = hashSet;
            }
            if (hashSet.contains(obj)) {
                g1Var.g(f6.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            hashSet.add(obj);
            try {
                if (hashSet.size() > this.a) {
                    hashSet.remove(obj);
                    g1Var.g(f6.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        Object[] objArr = (Object[]) obj;
                        objF = new ArrayList();
                        int length2 = objArr.length;
                        while (i < length2) {
                            objF.add(b(g1Var, objArr[i]));
                            i++;
                        }
                    } else if (obj instanceof Collection) {
                        objF = new ArrayList();
                        Iterator it = ((Collection) obj).iterator();
                        while (it.hasNext()) {
                            objF.add(b(g1Var, it.next()));
                        }
                    } else if (obj instanceof Map) {
                        objF = a((Map) obj, g1Var);
                    } else {
                        objF = f(g1Var, obj);
                        if (objF.isEmpty()) {
                            objF = obj.toString();
                        }
                    }
                    return objF;
                } catch (Exception e) {
                    g1Var.d(f6.INFO, "Not serializing object due to throwing sub-path.", e);
                    return null;
                }
            } finally {
                hashSet.remove(obj);
            }
        }
        return obj.toString();
    }

    public void c(io.sentry.internal.debugmeta.c cVar, g1 g1Var, Object obj) {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.n;
        if (obj == null) {
            cVar2.u();
            return;
        }
        if (obj instanceof Character) {
            cVar.A(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            cVar.A((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            cVar.B(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            cVar.z((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                cVar.A(io.sentry.vendor.a.f(((Date) obj).getTime()));
                return;
            } catch (Exception e) {
                g1Var.d(f6.ERROR, "Error when serializing Date", e);
                cVar2.u();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                cVar.A(((TimeZone) obj).getID());
                return;
            } catch (Exception e2) {
                g1Var.d(f6.ERROR, "Error when serializing TimeZone", e2);
                cVar2.u();
                return;
            }
        }
        if (obj instanceof t2) {
            ((t2) obj).serialize(cVar, g1Var);
            return;
        }
        if (obj instanceof Collection) {
            d(cVar, g1Var, (Collection) obj);
            return;
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList2.add(Byte.valueOf(bArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList3.add(Short.valueOf(sArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList4.add(Character.valueOf(cArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i < length5) {
                arrayList5.add(Integer.valueOf(iArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i < length6) {
                arrayList6.add(Long.valueOf(jArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i < length7) {
                arrayList7.add(Float.valueOf(fArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                arrayList8.add(Double.valueOf(dArr[i]));
                i++;
            }
            d(cVar, g1Var, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            d(cVar, g1Var, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            e(cVar, g1Var, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            cVar.A(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.f.a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            d(cVar, g1Var, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            cVar.B(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            cVar.A(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            cVar.A(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            cVar.A(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            cVar.A(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            e(cVar, g1Var, io.sentry.util.f.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            cVar.A(obj.toString());
            return;
        }
        try {
            s2 s2Var = (s2) this.b;
            if (s2Var == null) {
                s2Var = new s2(this.a);
                this.b = s2Var;
            }
            c(cVar, g1Var, s2Var.b(g1Var, obj));
        } catch (Exception e3) {
            g1Var.d(f6.ERROR, "Failed serializing unknown object.", e3);
            cVar.A("[OBJECT]");
        }
    }

    public void d(io.sentry.internal.debugmeta.c cVar, g1 g1Var, Collection collection) throws IOException {
        io.sentry.vendor.gson.stream.c cVar2 = (io.sentry.vendor.gson.stream.c) cVar.n;
        cVar2.G();
        cVar2.e();
        int i = cVar2.f273o;
        int[] iArrCopyOf = cVar2.n;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar2.n = iArrCopyOf;
        }
        int i2 = cVar2.f273o;
        cVar2.f273o = i2 + 1;
        iArrCopyOf[i2] = 1;
        cVar2.m.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(cVar, g1Var, it.next());
        }
        cVar2.j(']', 1, 2);
    }

    public void e(io.sentry.internal.debugmeta.c cVar, g1 g1Var, Map map) throws IOException {
        cVar.k();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                cVar.r((String) obj);
                c(cVar, g1Var, map.get(obj));
            }
        }
        cVar.m();
    }

    public HashMap f(g1 g1Var, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, b(g1Var, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    g1Var.g(f6.INFO, fx3.g("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public /* synthetic */ s2(int i) {
        this.a = i;
    }
}

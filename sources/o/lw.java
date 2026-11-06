package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class lw implements up3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ lw(byte b) {
        this.a = b;
    }

    public static void b(Type type, Class cls) {
        Class<?> clsJ = f57.j(type);
        if (cls.isAssignableFrom(clsJ)) {
            StringBuilder sb = new StringBuilder("No JsonAdapter for ");
            sb.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = clsJ.getSimpleName();
            sb.append(", you should probably use ");
            sb.append(simpleName);
            sb.append(" instead of ");
            sb.append(simpleName2);
            sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202  */
    /* JADX WARN: Code duplicated, block: B:130:0x0212 A[LOOP:1: B:128:0x020c->B:130:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0251  */
    /* JADX WARN: Code duplicated, block: B:143:0x0275  */
    /* JADX WARN: Code duplicated, block: B:146:0x0296  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x0302  */
    /* JADX WARN: Code duplicated, block: B:179:0x0304  */
    /* JADX WARN: Code duplicated, block: B:186:0x0319 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x031b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x036b  */
    /* JADX WARN: Code duplicated, block: B:205:0x037f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0392  */
    /* JADX WARN: Code duplicated, block: B:210:0x039a  */
    /* JADX WARN: Code duplicated, block: B:213:0x03af  */
    /* JADX WARN: Code duplicated, block: B:216:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:218:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:221:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:225:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:227:0x0402  */
    /* JADX WARN: Code duplicated, block: B:228:0x040b  */
    /* JADX WARN: Code duplicated, block: B:230:0x040f  */
    /* JADX WARN: Code duplicated, block: B:233:0x043c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0445  */
    /* JADX WARN: Code duplicated, block: B:241:0x046c  */
    /* JADX WARN: Code duplicated, block: B:251:0x04a7 A[LOOP:8: B:249:0x04a1->B:251:0x04a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f8 A[LOOP:10: B:259:0x04f2->B:261:0x04f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:332:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:334:0x0700  */
    /* JADX WARN: Code duplicated, block: B:336:0x070c  */
    /* JADX WARN: Code duplicated, block: B:348:0x0731  */
    /* JADX WARN: Code duplicated, block: B:410:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0452 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:? A[RETURN, SYNTHETIC] */
    @Override // o.up3
    public final vp3 a(Type type, Set set, pt4 pt4Var) {
        hm3 gs0Var;
        hm3 is0Var;
        Field[] declaredFields;
        int length;
        int i;
        int modifiers;
        sp3 sp3Var;
        Object next;
        pu3 pu3Var;
        int iQ;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<xv3> arrayList;
        ArrayList arrayList2;
        Iterator it;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it2;
        bz3 bz3Var;
        pv3 pv3Var;
        Iterator it3;
        Object next2;
        sp3 sp3Var2;
        ArrayList arrayListQ0;
        Field fieldX;
        int modifiers2;
        String name;
        String str;
        ju3 ju3VarH;
        Type typeZ;
        int i3;
        wt3 wt3Var;
        ArrayList arrayList5;
        Iterator it4;
        Type[] typeArr;
        ow3 ow3Var;
        Type typeZ2;
        Iterator it5;
        Object next3;
        vt3 vt3Var;
        pu3 pu3Var2;
        Class clsJ;
        Type[] actualTypeArguments;
        Type typeH = type;
        byte b = this.a;
        Class cls = Integer.TYPE;
        boolean z = true;
        byte b2 = 0;
        Object obj = null;
        switch (b) {
            case 0:
                Type genericComponentType = typeH instanceof GenericArrayType ? ((GenericArrayType) typeH).getGenericComponentType() : typeH instanceof Class ? ((Class) typeH).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new mw(f57.j(genericComponentType), pt4Var.a(genericComponentType, ma8.a, null)).b();
                }
                return null;
            case 1:
                if ((typeH instanceof Class) || (typeH instanceof ParameterizedType)) {
                    Class clsJ2 = f57.j(typeH);
                    if (!clsJ2.isInterface() && !clsJ2.isEnum() && set.isEmpty()) {
                        if (ma8.e(clsJ2)) {
                            b(typeH, List.class);
                            b(typeH, Set.class);
                            b(typeH, Map.class);
                            b(typeH, Collection.class);
                            String str2 = "Platform " + clsJ2;
                            if (typeH instanceof ParameterizedType) {
                                str2 = str2 + " in " + typeH;
                            }
                            hk0.g(str2.concat(" requires explicit JsonAdapter to be registered"));
                        } else if (clsJ2.isAnonymousClass()) {
                            hk0.g("Cannot serialize anonymous class ".concat(clsJ2.getName()));
                        } else if (clsJ2.isLocalClass()) {
                            hk0.g("Cannot serialize local class ".concat(clsJ2.getName()));
                        } else if (clsJ2.getEnclosingClass() == null || Modifier.isStatic(clsJ2.getModifiers())) {
                            if (!Modifier.isAbstract(clsJ2.getModifiers())) {
                                Class<? extends Annotation> cls2 = ma8.c;
                                if (cls2 != null && clsJ2.isAnnotationPresent(cls2)) {
                                    throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsJ2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                Constructor declaredConstructor = clsJ2.getDeclaredConstructor(null);
                                                declaredConstructor.setAccessible(true);
                                                gs0Var = new gs0(declaredConstructor, clsJ2, b2);
                                            } catch (Exception unused) {
                                                hk0.g("cannot construct instances of ".concat(clsJ2.getName()));
                                            }
                                        } catch (NoSuchMethodException unused2) {
                                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                                            declaredField.setAccessible(true);
                                            is0Var = new hs0(cls3.getMethod("allocateInstance", Class.class), declaredField.get(null), clsJ2);
                                            gs0Var = is0Var;
                                            TreeMap treeMap = new TreeMap();
                                            while (typeH != Object.class) {
                                                Class clsJ3 = f57.j(typeH);
                                                boolean zE = ma8.e(clsJ3);
                                                declaredFields = clsJ3.getDeclaredFields();
                                                length = declaredFields.length;
                                                for (i = b2; i < length; i++) {
                                                    Field field = declaredFields[i];
                                                    modifiers = field.getModifiers();
                                                    if (Modifier.isStatic(modifiers)) {
                                                    }
                                                }
                                                Class clsJ4 = f57.j(typeH);
                                                typeH = ma8.h(typeH, clsJ4, clsJ4.getGenericSuperclass(), new LinkedHashSet());
                                                b2 = 0;
                                            }
                                            return new ls0(gs0Var, treeMap).b();
                                        }
                                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                        declaredMethod.setAccessible(true);
                                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls);
                                        declaredMethod2.setAccessible(true);
                                        is0Var = new is0(declaredMethod2, clsJ2, iIntValue);
                                        gs0Var = is0Var;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (typeH != Object.class) {
                                            Class clsJ5 = f57.j(typeH);
                                            boolean zE2 = ma8.e(clsJ5);
                                            declaredFields = clsJ5.getDeclaredFields();
                                            length = declaredFields.length;
                                            while (i < length) {
                                                Field field2 = declaredFields[i];
                                                modifiers = field2.getModifiers();
                                                if (Modifier.isStatic(modifiers)) {
                                                }
                                            }
                                            Class clsJ6 = f57.j(typeH);
                                            typeH = ma8.h(typeH, clsJ6, clsJ6.getGenericSuperclass(), new LinkedHashSet());
                                            b2 = 0;
                                        }
                                        return new ls0(gs0Var, treeMap2).b();
                                    } catch (IllegalAccessException unused4) {
                                        throw new AssertionError();
                                    }
                                    break;
                                } catch (IllegalAccessException unused5) {
                                    throw new AssertionError();
                                } catch (NoSuchMethodException unused6) {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                    declaredMethod3.setAccessible(true);
                                    gs0Var = new gs0(declaredMethod3, clsJ2, (byte) 1);
                                    break;
                                } catch (InvocationTargetException e) {
                                    ma8.i(e);
                                    throw null;
                                }
                                TreeMap treeMap3 = new TreeMap();
                                while (typeH != Object.class) {
                                    Class clsJ7 = f57.j(typeH);
                                    boolean zE3 = ma8.e(clsJ7);
                                    declaredFields = clsJ7.getDeclaredFields();
                                    length = declaredFields.length;
                                    while (i < length) {
                                        Field field3 = declaredFields[i];
                                        modifiers = field3.getModifiers();
                                        if (Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && ((Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zE3) && ((sp3Var = (sp3) field3.getAnnotation(sp3.class)) == null || !sp3Var.ignore()))) {
                                            Type typeH2 = ma8.h(typeH, clsJ7, field3.getGenericType(), new LinkedHashSet());
                                            Set setF = ma8.f(field3.getAnnotations());
                                            String name2 = field3.getName();
                                            vp3 vp3VarA = pt4Var.a(typeH2, setF, name2);
                                            field3.setAccessible(true);
                                            if (sp3Var != null) {
                                                String strName = sp3Var.name();
                                                if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                                                    name2 = strName;
                                                }
                                            }
                                            ks0 ks0Var = (ks0) treeMap3.put(name2, new ks0(name2, field3, vp3VarA));
                                            if (ks0Var != null) {
                                                io.sentry.h2.j("Conflicting fields:\n    ", ks0Var.b, "\n    ", field3);
                                            }
                                        }
                                    }
                                    Class clsJ8 = f57.j(typeH);
                                    typeH = ma8.h(typeH, clsJ8, clsJ8.getGenericSuperclass(), new LinkedHashSet());
                                    b2 = 0;
                                }
                                return new ls0(gs0Var, treeMap3).b();
                            }
                            hk0.g("Cannot serialize abstract class ".concat(clsJ2.getName()));
                        } else {
                            hk0.g("Cannot serialize non-static nested class ".concat(clsJ2.getName()));
                        }
                    }
                }
                return null;
            case 2:
                Class clsJ9 = f57.j(typeH);
                if (set.isEmpty()) {
                    if (clsJ9 == List.class || clsJ9 == Collection.class) {
                        return new jv0(pt4Var.a(f57.g(typeH), ma8.a, null), (byte) 0).b();
                    }
                    if (clsJ9 == Set.class) {
                        return new jv0(pt4Var.a(f57.g(typeH), ma8.a, null), (byte) 1).b();
                    }
                }
                return null;
            case 3:
                typeH.getClass();
                set.getClass();
                if (!set.isEmpty()) {
                    return null;
                }
                Class clsJ10 = f57.j(typeH);
                clsJ10.getClass();
                if (clsJ10.isInterface() || clsJ10.isEnum() || !clsJ10.isAnnotationPresent(Metadata.class) || ma8.e(clsJ10)) {
                    return null;
                }
                try {
                    w55 w55VarC = ma8.c(pt4Var, typeH, clsJ10);
                    if (w55VarC != null) {
                        return w55VarC;
                    }
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof ClassNotFoundException)) {
                        throw e2;
                    }
                }
                if (clsJ10.isLocalClass()) {
                    gk0.h("Cannot serialize local class or object expression ".concat(clsJ10.getName()));
                } else {
                    wt3 wt3VarB = w86.a.b(clsJ10);
                    if (wt3VarB.p()) {
                        gk0.h("Cannot serialize abstract class ".concat(clsJ10.getName()));
                    } else if (wt3VarB.g()) {
                        gk0.h("Cannot serialize inner class ".concat(clsJ10.getName()));
                    } else if (wt3VarB.j() != null) {
                        gk0.h("Cannot serialize object declaration ".concat(clsJ10.getName()));
                    } else {
                        if (!wt3VarB.m()) {
                            u14 u14Var = ((eu3) wt3VarB).f743o;
                            u86 u86Var = ((au3) u14Var.getValue()).f;
                            fw3 fw3Var = au3.n[4];
                            Object objA = u86Var.a();
                            objA.getClass();
                            Iterator it6 = ((Collection) objA).iterator();
                            do {
                                if (it6.hasNext()) {
                                    next = it6.next();
                                    pu3Var2 = (pu3) next;
                                    pu3Var2.getClass();
                                } else {
                                    next = null;
                                }
                                pu3Var = (pu3) next;
                                if (pu3Var == null) {
                                    return null;
                                }
                                List parameters = pu3Var.getParameters();
                                iQ = xm4.Q(mv0.Z(parameters, 10));
                                if (iQ < 16) {
                                    iQ = 16;
                                }
                                linkedHashMap = new LinkedHashMap(iQ);
                                for (Object obj2 : parameters) {
                                    linkedHashMap.put(((pv3) obj2).getName(), obj2);
                                }
                                nv1.J(pu3Var);
                                linkedHashMap2 = new LinkedHashMap();
                                u86 u86Var2 = ((au3) u14Var.getValue()).l;
                                fw3 fw3Var2 = au3.n[13];
                                Object objA2 = u86Var2.a();
                                objA2.getClass();
                                arrayList = new ArrayList();
                                for (Object obj3 : (Collection) objA2) {
                                    vt3Var = (vt3) obj3;
                                    if (vt3Var.w().S() == null && (vt3Var instanceof xv3)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                for (xv3 xv3Var : arrayList) {
                                    pv3Var = (pv3) linkedHashMap.get(xv3Var.getName());
                                    nv1.J(xv3Var);
                                    it3 = xv3Var.getAnnotations().iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                        } else {
                                            next2 = obj;
                                        }
                                        sp3Var2 = (sp3) next2;
                                        arrayListQ0 = lv0.Q0(xv3Var.getAnnotations());
                                        if (pv3Var != null) {
                                            qv0.c0(arrayListQ0, pv3Var.getAnnotations());
                                            if (sp3Var2 == null) {
                                                it5 = pv3Var.getAnnotations().iterator();
                                                do {
                                                    if (it5.hasNext()) {
                                                        next3 = it5.next();
                                                    } else {
                                                        next3 = null;
                                                    }
                                                    sp3Var2 = (sp3) next3;
                                                } while (!(((Annotation) next3) instanceof sp3));
                                                sp3Var2 = (sp3) next3;
                                            }
                                        }
                                        fieldX = bt1.x(xv3Var);
                                        if (fieldX != null) {
                                            modifiers2 = fieldX.getModifiers();
                                        } else {
                                            modifiers2 = 0;
                                        }
                                        if (Modifier.isTransient(modifiers2)) {
                                            if (pv3Var != null && !pv3Var.h()) {
                                                yq4.q(pv3Var, "No default value for transient constructor ");
                                            }
                                        } else if (sp3Var2 != null || sp3Var2.ignore() != z) {
                                            if (pv3Var == null && !pv3Var.d().equals(xv3Var.getReturnType())) {
                                                StringBuilder sb = new StringBuilder("'");
                                                sb.append(xv3Var.getName());
                                                sb.append("' has a constructor parameter of type ");
                                                sb.append(pv3Var.d());
                                                ow3 returnType = xv3Var.getReturnType();
                                                sb.append(" but a property of type ");
                                                sb.append(returnType);
                                                sb.append('.');
                                                throw new IllegalArgumentException(sb.toString().toString());
                                            }
                                            if (!(xv3Var instanceof zu3) || pv3Var != null) {
                                                if (sp3Var2 != null || (name = sp3Var2.name()) == null) {
                                                    name = xv3Var.getName();
                                                } else {
                                                    if (name.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                                                        name = null;
                                                    }
                                                    if (name == null) {
                                                        name = xv3Var.getName();
                                                    }
                                                }
                                                str = name;
                                                ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                                if (ju3VarH instanceof wt3) {
                                                    wt3Var = (wt3) ju3VarH;
                                                    if (wt3Var.e()) {
                                                        typeZ = et1.z(wt3Var);
                                                        if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                            List listD = ((qw3) xv3Var.getReturnType()).d();
                                                            arrayList5 = new ArrayList();
                                                            it4 = listD.iterator();
                                                            while (it4.hasNext()) {
                                                                ow3Var = ((uw3) it4.next()).b;
                                                                if (ow3Var != null) {
                                                                    typeZ2 = bt1.z(ow3Var);
                                                                } else {
                                                                    typeZ2 = null;
                                                                }
                                                                if (typeZ2 != null) {
                                                                    arrayList5.add(typeZ2);
                                                                }
                                                            }
                                                            Type[] typeArr2 = (Type[]) arrayList5.toArray(new Type[0]);
                                                            typeArr = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                                                            if (typeArr.length != 0) {
                                                                typeZ = new ka8(null, typeZ, typeArr);
                                                            } else {
                                                                an4.i(typeZ, "Missing type arguments for ");
                                                            }
                                                        }
                                                    } else {
                                                        typeZ = bt1.z(xv3Var.getReturnType());
                                                    }
                                                    vp3 vp3VarA2 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                                    String name3 = xv3Var.getName();
                                                    if (pv3Var != null) {
                                                        i3 = pv3Var.n;
                                                    } else {
                                                        i3 = -1;
                                                    }
                                                    linkedHashMap2.put(name3, new bz3(str, vp3VarA2, xv3Var, pv3Var, i3));
                                                    z = true;
                                                } else if (ju3VarH instanceof rw3) {
                                                    typeZ = bt1.z(xv3Var.getReturnType());
                                                    vp3 vp3VarA3 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                                    String name4 = xv3Var.getName();
                                                    if (pv3Var != null) {
                                                        i3 = pv3Var.n;
                                                    } else {
                                                        i3 = -1;
                                                    }
                                                    linkedHashMap2.put(name4, new bz3(str, vp3VarA3, xv3Var, pv3Var, i3));
                                                    z = true;
                                                } else {
                                                    hk0.l("Not possible!");
                                                }
                                            }
                                        } else if (pv3Var != null && !pv3Var.h()) {
                                            yq4.q(pv3Var, "No default value for ignored constructor ");
                                        }
                                        obj = null;
                                    } while (!(((Annotation) next2) instanceof sp3));
                                    sp3Var2 = (sp3) next2;
                                    arrayListQ0 = lv0.Q0(xv3Var.getAnnotations());
                                    if (pv3Var != null) {
                                        qv0.c0(arrayListQ0, pv3Var.getAnnotations());
                                        if (sp3Var2 == null) {
                                            it5 = pv3Var.getAnnotations().iterator();
                                            do {
                                                if (it5.hasNext()) {
                                                    next3 = it5.next();
                                                } else {
                                                    next3 = null;
                                                }
                                                sp3Var2 = (sp3) next3;
                                            } while (!(((Annotation) next3) instanceof sp3));
                                            sp3Var2 = (sp3) next3;
                                        }
                                    }
                                    fieldX = bt1.x(xv3Var);
                                    if (fieldX != null) {
                                        modifiers2 = fieldX.getModifiers();
                                    } else {
                                        modifiers2 = 0;
                                    }
                                    if (Modifier.isTransient(modifiers2)) {
                                        if (pv3Var != null) {
                                            yq4.q(pv3Var, "No default value for transient constructor ");
                                        }
                                    } else if (sp3Var2 != null) {
                                        if (pv3Var == null) {
                                        }
                                        if (!(xv3Var instanceof zu3)) {
                                        }
                                        if (sp3Var2 != null) {
                                            name = xv3Var.getName();
                                        } else {
                                            name = xv3Var.getName();
                                        }
                                        str = name;
                                        ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                        if (ju3VarH instanceof wt3) {
                                            wt3Var = (wt3) ju3VarH;
                                            if (wt3Var.e()) {
                                                typeZ = et1.z(wt3Var);
                                                if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                    List listD2 = ((qw3) xv3Var.getReturnType()).d();
                                                    arrayList5 = new ArrayList();
                                                    it4 = listD2.iterator();
                                                    while (it4.hasNext()) {
                                                        ow3Var = ((uw3) it4.next()).b;
                                                        if (ow3Var != null) {
                                                            typeZ2 = bt1.z(ow3Var);
                                                        } else {
                                                            typeZ2 = null;
                                                        }
                                                        if (typeZ2 != null) {
                                                            arrayList5.add(typeZ2);
                                                        }
                                                    }
                                                    Type[] typeArr3 = (Type[]) arrayList5.toArray(new Type[0]);
                                                    typeArr = (Type[]) Arrays.copyOf(typeArr3, typeArr3.length);
                                                    if (typeArr.length != 0) {
                                                        typeZ = new ka8(null, typeZ, typeArr);
                                                    } else {
                                                        an4.i(typeZ, "Missing type arguments for ");
                                                    }
                                                }
                                            } else {
                                                typeZ = bt1.z(xv3Var.getReturnType());
                                            }
                                            vp3 vp3VarA4 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name5 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name5, new bz3(str, vp3VarA4, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else if (ju3VarH instanceof rw3) {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                            vp3 vp3VarA5 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name6 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name6, new bz3(str, vp3VarA5, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else {
                                            hk0.l("Not possible!");
                                        }
                                    } else {
                                        if (pv3Var == null) {
                                        }
                                        if (!(xv3Var instanceof zu3)) {
                                        }
                                        if (sp3Var2 != null) {
                                            name = xv3Var.getName();
                                        } else {
                                            name = xv3Var.getName();
                                        }
                                        str = name;
                                        ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                        if (ju3VarH instanceof wt3) {
                                            wt3Var = (wt3) ju3VarH;
                                            if (wt3Var.e()) {
                                                typeZ = et1.z(wt3Var);
                                                if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                    List listD3 = ((qw3) xv3Var.getReturnType()).d();
                                                    arrayList5 = new ArrayList();
                                                    it4 = listD3.iterator();
                                                    while (it4.hasNext()) {
                                                        ow3Var = ((uw3) it4.next()).b;
                                                        if (ow3Var != null) {
                                                            typeZ2 = bt1.z(ow3Var);
                                                        } else {
                                                            typeZ2 = null;
                                                        }
                                                        if (typeZ2 != null) {
                                                            arrayList5.add(typeZ2);
                                                        }
                                                    }
                                                    Type[] typeArr4 = (Type[]) arrayList5.toArray(new Type[0]);
                                                    typeArr = (Type[]) Arrays.copyOf(typeArr4, typeArr4.length);
                                                    if (typeArr.length != 0) {
                                                        typeZ = new ka8(null, typeZ, typeArr);
                                                    } else {
                                                        an4.i(typeZ, "Missing type arguments for ");
                                                    }
                                                }
                                            } else {
                                                typeZ = bt1.z(xv3Var.getReturnType());
                                            }
                                            vp3 vp3VarA6 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name7 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name7, new bz3(str, vp3VarA6, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else if (ju3VarH instanceof rw3) {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                            vp3 vp3VarA7 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name8 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name8, new bz3(str, vp3VarA7, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else {
                                            hk0.l("Not possible!");
                                        }
                                    }
                                    obj = null;
                                }
                                arrayList2 = new ArrayList();
                                for (pv3 pv3Var2 : pu3Var.getParameters()) {
                                    bz3Var = (bz3) e8.g(linkedHashMap2).remove(pv3Var2.getName());
                                    if (bz3Var == null || pv3Var2.h()) {
                                        arrayList2.add(bz3Var);
                                    } else {
                                        yq4.q(pv3Var2, "No property for required constructor ");
                                    }
                                }
                                int size = arrayList2.size();
                                it = linkedHashMap2.entrySet().iterator();
                                i2 = size;
                                while (it.hasNext()) {
                                    bz3 bz3Var2 = (bz3) ((Map.Entry) it.next()).getValue();
                                    String str3 = bz3Var2.a;
                                    vp3 vp3Var = bz3Var2.b;
                                    xv3 xv3Var2 = bz3Var2.c;
                                    pv3 pv3Var3 = bz3Var2.d;
                                    str3.getClass();
                                    arrayList2.add(new bz3(str3, vp3Var, xv3Var2, pv3Var3, i2));
                                    i2++;
                                }
                                arrayList3 = new ArrayList();
                                for (Object obj4 : arrayList2) {
                                    if (obj4 != null) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((bz3) it2.next()).a);
                                }
                                String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                                return new dz3(pu3Var, arrayList2, arrayList3, jr3.a((String[]) Arrays.copyOf(strArr, strArr.length))).b();
                            } while (!((z61) ((ru3) pu3Var2).w()).t());
                            pu3Var = (pu3) next;
                            if (pu3Var == null) {
                                return null;
                            }
                            List parameters2 = pu3Var.getParameters();
                            iQ = xm4.Q(mv0.Z(parameters2, 10));
                            if (iQ < 16) {
                                iQ = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iQ);
                            while (r4.hasNext()) {
                                linkedHashMap.put(((pv3) obj2).getName(), obj2);
                            }
                            nv1.J(pu3Var);
                            linkedHashMap2 = new LinkedHashMap();
                            u86 u86Var3 = ((au3) u14Var.getValue()).l;
                            fw3 fw3Var3 = au3.n[13];
                            Object objA3 = u86Var3.a();
                            objA3.getClass();
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                vt3Var = (vt3) obj3;
                                if (vt3Var.w().S() == null) {
                                    arrayList.add(obj3);
                                }
                            }
                            while (r0.hasNext()) {
                                pv3Var = (pv3) linkedHashMap.get(xv3Var.getName());
                                nv1.J(xv3Var);
                                it3 = xv3Var.getAnnotations().iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                    } else {
                                        next2 = obj;
                                    }
                                    sp3Var2 = (sp3) next2;
                                    arrayListQ0 = lv0.Q0(xv3Var.getAnnotations());
                                    if (pv3Var != null) {
                                        qv0.c0(arrayListQ0, pv3Var.getAnnotations());
                                        if (sp3Var2 == null) {
                                            it5 = pv3Var.getAnnotations().iterator();
                                            do {
                                                if (it5.hasNext()) {
                                                    next3 = it5.next();
                                                } else {
                                                    next3 = null;
                                                }
                                                sp3Var2 = (sp3) next3;
                                            } while (!(((Annotation) next3) instanceof sp3));
                                            sp3Var2 = (sp3) next3;
                                        }
                                    }
                                    fieldX = bt1.x(xv3Var);
                                    if (fieldX != null) {
                                        modifiers2 = fieldX.getModifiers();
                                    } else {
                                        modifiers2 = 0;
                                    }
                                    if (Modifier.isTransient(modifiers2)) {
                                        if (pv3Var != null) {
                                            yq4.q(pv3Var, "No default value for transient constructor ");
                                        }
                                    } else if (sp3Var2 != null) {
                                        if (pv3Var == null) {
                                        }
                                        if (!(xv3Var instanceof zu3)) {
                                        }
                                        if (sp3Var2 != null) {
                                            name = xv3Var.getName();
                                        } else {
                                            name = xv3Var.getName();
                                        }
                                        str = name;
                                        ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                        if (ju3VarH instanceof wt3) {
                                            wt3Var = (wt3) ju3VarH;
                                            if (wt3Var.e()) {
                                                typeZ = et1.z(wt3Var);
                                                if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                    List listD4 = ((qw3) xv3Var.getReturnType()).d();
                                                    arrayList5 = new ArrayList();
                                                    it4 = listD4.iterator();
                                                    while (it4.hasNext()) {
                                                        ow3Var = ((uw3) it4.next()).b;
                                                        if (ow3Var != null) {
                                                            typeZ2 = bt1.z(ow3Var);
                                                        } else {
                                                            typeZ2 = null;
                                                        }
                                                        if (typeZ2 != null) {
                                                            arrayList5.add(typeZ2);
                                                        }
                                                    }
                                                    Type[] typeArr5 = (Type[]) arrayList5.toArray(new Type[0]);
                                                    typeArr = (Type[]) Arrays.copyOf(typeArr5, typeArr5.length);
                                                    if (typeArr.length != 0) {
                                                        typeZ = new ka8(null, typeZ, typeArr);
                                                    } else {
                                                        an4.i(typeZ, "Missing type arguments for ");
                                                    }
                                                }
                                            } else {
                                                typeZ = bt1.z(xv3Var.getReturnType());
                                            }
                                            vp3 vp3VarA8 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name9 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name9, new bz3(str, vp3VarA8, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else if (ju3VarH instanceof rw3) {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                            vp3 vp3VarA9 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name10 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name10, new bz3(str, vp3VarA9, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else {
                                            hk0.l("Not possible!");
                                        }
                                    } else {
                                        if (pv3Var == null) {
                                        }
                                        if (!(xv3Var instanceof zu3)) {
                                        }
                                        if (sp3Var2 != null) {
                                            name = xv3Var.getName();
                                        } else {
                                            name = xv3Var.getName();
                                        }
                                        str = name;
                                        ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                        if (ju3VarH instanceof wt3) {
                                            wt3Var = (wt3) ju3VarH;
                                            if (wt3Var.e()) {
                                                typeZ = et1.z(wt3Var);
                                                if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                    List listD5 = ((qw3) xv3Var.getReturnType()).d();
                                                    arrayList5 = new ArrayList();
                                                    it4 = listD5.iterator();
                                                    while (it4.hasNext()) {
                                                        ow3Var = ((uw3) it4.next()).b;
                                                        if (ow3Var != null) {
                                                            typeZ2 = bt1.z(ow3Var);
                                                        } else {
                                                            typeZ2 = null;
                                                        }
                                                        if (typeZ2 != null) {
                                                            arrayList5.add(typeZ2);
                                                        }
                                                    }
                                                    Type[] typeArr6 = (Type[]) arrayList5.toArray(new Type[0]);
                                                    typeArr = (Type[]) Arrays.copyOf(typeArr6, typeArr6.length);
                                                    if (typeArr.length != 0) {
                                                        typeZ = new ka8(null, typeZ, typeArr);
                                                    } else {
                                                        an4.i(typeZ, "Missing type arguments for ");
                                                    }
                                                }
                                            } else {
                                                typeZ = bt1.z(xv3Var.getReturnType());
                                            }
                                            vp3 vp3VarA10 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name11 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name11, new bz3(str, vp3VarA10, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else if (ju3VarH instanceof rw3) {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                            vp3 vp3VarA11 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                            String name12 = xv3Var.getName();
                                            if (pv3Var != null) {
                                                i3 = pv3Var.n;
                                            } else {
                                                i3 = -1;
                                            }
                                            linkedHashMap2.put(name12, new bz3(str, vp3VarA11, xv3Var, pv3Var, i3));
                                            z = true;
                                        } else {
                                            hk0.l("Not possible!");
                                        }
                                    }
                                    obj = null;
                                } while (!(((Annotation) next2) instanceof sp3));
                                sp3Var2 = (sp3) next2;
                                arrayListQ0 = lv0.Q0(xv3Var.getAnnotations());
                                if (pv3Var != null) {
                                    qv0.c0(arrayListQ0, pv3Var.getAnnotations());
                                    if (sp3Var2 == null) {
                                        it5 = pv3Var.getAnnotations().iterator();
                                        do {
                                            if (it5.hasNext()) {
                                                next3 = it5.next();
                                            } else {
                                                next3 = null;
                                            }
                                            sp3Var2 = (sp3) next3;
                                        } while (!(((Annotation) next3) instanceof sp3));
                                        sp3Var2 = (sp3) next3;
                                    }
                                }
                                fieldX = bt1.x(xv3Var);
                                if (fieldX != null) {
                                    modifiers2 = fieldX.getModifiers();
                                } else {
                                    modifiers2 = 0;
                                }
                                if (Modifier.isTransient(modifiers2)) {
                                    if (pv3Var != null) {
                                        yq4.q(pv3Var, "No default value for transient constructor ");
                                    }
                                } else if (sp3Var2 != null) {
                                    if (pv3Var == null) {
                                    }
                                    if (!(xv3Var instanceof zu3)) {
                                    }
                                    if (sp3Var2 != null) {
                                        name = xv3Var.getName();
                                    } else {
                                        name = xv3Var.getName();
                                    }
                                    str = name;
                                    ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                    if (ju3VarH instanceof wt3) {
                                        wt3Var = (wt3) ju3VarH;
                                        if (wt3Var.e()) {
                                            typeZ = et1.z(wt3Var);
                                            if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                List listD6 = ((qw3) xv3Var.getReturnType()).d();
                                                arrayList5 = new ArrayList();
                                                it4 = listD6.iterator();
                                                while (it4.hasNext()) {
                                                    ow3Var = ((uw3) it4.next()).b;
                                                    if (ow3Var != null) {
                                                        typeZ2 = bt1.z(ow3Var);
                                                    } else {
                                                        typeZ2 = null;
                                                    }
                                                    if (typeZ2 != null) {
                                                        arrayList5.add(typeZ2);
                                                    }
                                                }
                                                Type[] typeArr7 = (Type[]) arrayList5.toArray(new Type[0]);
                                                typeArr = (Type[]) Arrays.copyOf(typeArr7, typeArr7.length);
                                                if (typeArr.length != 0) {
                                                    typeZ = new ka8(null, typeZ, typeArr);
                                                } else {
                                                    an4.i(typeZ, "Missing type arguments for ");
                                                }
                                            }
                                        } else {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                        }
                                        vp3 vp3VarA12 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                        String name13 = xv3Var.getName();
                                        if (pv3Var != null) {
                                            i3 = pv3Var.n;
                                        } else {
                                            i3 = -1;
                                        }
                                        linkedHashMap2.put(name13, new bz3(str, vp3VarA12, xv3Var, pv3Var, i3));
                                        z = true;
                                    } else if (ju3VarH instanceof rw3) {
                                        typeZ = bt1.z(xv3Var.getReturnType());
                                        vp3 vp3VarA13 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                        String name14 = xv3Var.getName();
                                        if (pv3Var != null) {
                                            i3 = pv3Var.n;
                                        } else {
                                            i3 = -1;
                                        }
                                        linkedHashMap2.put(name14, new bz3(str, vp3VarA13, xv3Var, pv3Var, i3));
                                        z = true;
                                    } else {
                                        hk0.l("Not possible!");
                                    }
                                } else {
                                    if (pv3Var == null) {
                                    }
                                    if (!(xv3Var instanceof zu3)) {
                                    }
                                    if (sp3Var2 != null) {
                                        name = xv3Var.getName();
                                    } else {
                                        name = xv3Var.getName();
                                    }
                                    str = name;
                                    ju3VarH = ((qw3) xv3Var.getReturnType()).h();
                                    if (ju3VarH instanceof wt3) {
                                        wt3Var = (wt3) ju3VarH;
                                        if (wt3Var.e()) {
                                            typeZ = et1.z(wt3Var);
                                            if (!((qw3) xv3Var.getReturnType()).d().isEmpty()) {
                                                List listD7 = ((qw3) xv3Var.getReturnType()).d();
                                                arrayList5 = new ArrayList();
                                                it4 = listD7.iterator();
                                                while (it4.hasNext()) {
                                                    ow3Var = ((uw3) it4.next()).b;
                                                    if (ow3Var != null) {
                                                        typeZ2 = bt1.z(ow3Var);
                                                    } else {
                                                        typeZ2 = null;
                                                    }
                                                    if (typeZ2 != null) {
                                                        arrayList5.add(typeZ2);
                                                    }
                                                }
                                                Type[] typeArr8 = (Type[]) arrayList5.toArray(new Type[0]);
                                                typeArr = (Type[]) Arrays.copyOf(typeArr8, typeArr8.length);
                                                if (typeArr.length != 0) {
                                                    typeZ = new ka8(null, typeZ, typeArr);
                                                } else {
                                                    an4.i(typeZ, "Missing type arguments for ");
                                                }
                                            }
                                        } else {
                                            typeZ = bt1.z(xv3Var.getReturnType());
                                        }
                                        vp3 vp3VarA14 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                        String name15 = xv3Var.getName();
                                        if (pv3Var != null) {
                                            i3 = pv3Var.n;
                                        } else {
                                            i3 = -1;
                                        }
                                        linkedHashMap2.put(name15, new bz3(str, vp3VarA14, xv3Var, pv3Var, i3));
                                        z = true;
                                    } else if (ju3VarH instanceof rw3) {
                                        typeZ = bt1.z(xv3Var.getReturnType());
                                        vp3 vp3VarA15 = pt4Var.a(ma8.h(typeH, clsJ10, typeZ, new LinkedHashSet()), ma8.f((Annotation[]) arrayListQ0.toArray(new Annotation[0])), xv3Var.getName());
                                        String name16 = xv3Var.getName();
                                        if (pv3Var != null) {
                                            i3 = pv3Var.n;
                                        } else {
                                            i3 = -1;
                                        }
                                        linkedHashMap2.put(name16, new bz3(str, vp3VarA15, xv3Var, pv3Var, i3));
                                        z = true;
                                    } else {
                                        hk0.l("Not possible!");
                                    }
                                }
                                obj = null;
                            }
                            arrayList2 = new ArrayList();
                            while (r1.hasNext()) {
                                bz3Var = (bz3) e8.g(linkedHashMap2).remove(pv3Var2.getName());
                                if (bz3Var == null) {
                                }
                                arrayList2.add(bz3Var);
                            }
                            int size2 = arrayList2.size();
                            it = linkedHashMap2.entrySet().iterator();
                            i2 = size2;
                            while (it.hasNext()) {
                                bz3 bz3Var3 = (bz3) ((Map.Entry) it.next()).getValue();
                                String str4 = bz3Var3.a;
                                vp3 vp3Var2 = bz3Var3.b;
                                xv3 xv3Var3 = bz3Var3.c;
                                pv3 pv3Var4 = bz3Var3.d;
                                str4.getClass();
                                arrayList2.add(new bz3(str4, vp3Var2, xv3Var3, pv3Var4, i2));
                                i2++;
                            }
                            arrayList3 = new ArrayList();
                            while (r2.hasNext()) {
                                if (obj4 != null) {
                                    arrayList3.add(obj4);
                                }
                            }
                            arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
                            it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((bz3) it2.next()).a);
                            }
                            String[] strArr2 = (String[]) arrayList4.toArray(new String[0]);
                            return new dz3(pu3Var, arrayList2, arrayList3, jr3.a((String[]) Arrays.copyOf(strArr2, strArr2.length))).b();
                        }
                        an4.q(clsJ10.getName(), ". Please register an adapter.", "Cannot reflectively serialize sealed class ");
                    }
                }
                return null;
            case 4:
                if (!set.isEmpty() || (clsJ = f57.j(typeH)) != Map.class) {
                    return null;
                }
                if (typeH == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(clsJ)) {
                        yq4.f();
                        return null;
                    }
                    Type typeH3 = ma8.h(typeH, clsJ, ma8.d(typeH, clsJ, Map.class), new LinkedHashSet());
                    actualTypeArguments = typeH3 instanceof ParameterizedType ? ((ParameterizedType) typeH3).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                return new mw(pt4Var, actualTypeArguments[0], actualTypeArguments[1]).b();
            case 5:
                return null;
            default:
                q87 q87Var = hm3.G;
                q87 q87Var2 = hm3.F;
                q87 q87Var3 = hm3.E;
                q87 q87Var4 = hm3.D;
                q87 q87Var5 = hm3.C;
                q87 q87Var6 = hm3.B;
                q87 q87Var7 = hm3.A;
                q87 q87Var8 = hm3.z;
                if (!set.isEmpty()) {
                    return null;
                }
                if (typeH == Boolean.TYPE) {
                    return q87Var8;
                }
                if (typeH == Byte.TYPE) {
                    return q87Var7;
                }
                if (typeH == Character.TYPE) {
                    return q87Var6;
                }
                if (typeH == Double.TYPE) {
                    return q87Var5;
                }
                if (typeH == Float.TYPE) {
                    return q87Var4;
                }
                if (typeH == cls) {
                    return q87Var3;
                }
                if (typeH == Long.TYPE) {
                    return q87Var2;
                }
                if (typeH == Short.TYPE) {
                    return q87Var;
                }
                if (typeH == Boolean.class) {
                    return q87Var8.b();
                }
                if (typeH == Byte.class) {
                    return q87Var7.b();
                }
                if (typeH == Character.class) {
                    return q87Var6.b();
                }
                if (typeH == Double.class) {
                    return q87Var5.b();
                }
                if (typeH == Float.class) {
                    return q87Var4.b();
                }
                if (typeH == Integer.class) {
                    return q87Var3.b();
                }
                if (typeH == Long.class) {
                    return q87Var2.b();
                }
                if (typeH == Short.class) {
                    return q87Var.b();
                }
                if (typeH == String.class) {
                    return hm3.H.b();
                }
                if (typeH == Object.class) {
                    return new co5(pt4Var).b();
                }
                Class clsJ11 = f57.j(typeH);
                w55 w55VarC2 = ma8.c(pt4Var, typeH, clsJ11);
                if (w55VarC2 != null) {
                    return w55VarC2;
                }
                if (clsJ11.isEnum()) {
                    return new dz3(clsJ11).b();
                }
                return null;
        }
    }
}

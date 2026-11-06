package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mt4 {
    public final ArrayList a = new ArrayList();
    public int b = 0;

    /* JADX WARN: Code duplicated, block: B:102:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void a(Object obj) {
        ?? r3;
        Class<?> cls;
        ?? r21;
        Object obj2;
        String str;
        Class cls2;
        ?? r2;
        int i;
        int i2;
        Class cls3;
        v8 u8Var;
        v8 v8VarB;
        ?? r13;
        ?? r4;
        ?? r22;
        String str2;
        ?? r23;
        v8 u8Var2;
        boolean z;
        v8 v8VarB2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Class<?> superclass = obj.getClass();
        while (superclass != Object.class) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            int length = declaredMethods.length;
            int i3 = 0;
            while (i3 < length) {
                ?? r11 = r3[i3];
                boolean zIsAnnotationPresent = r11.isAnnotationPresent(tv7.class);
                Class<vp3> cls4 = vp3.class;
                String str3 = "\n    ";
                Class cls5 = Void.TYPE;
                if (zIsAnnotationPresent) {
                    r11.setAccessible(true);
                    Type genericReturnType = r11.getGenericReturnType();
                    Type[] genericParameterTypes = r11.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations = r11.getParameterAnnotations();
                    i = 0;
                    if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == pr3.class && genericReturnType == cls5) {
                        int length2 = genericParameterTypes.length;
                        int i4 = 2;
                        ?? r5 = r3;
                        while (true) {
                            if (i4 < length2) {
                                cls = superclass;
                                Type type = genericParameterTypes[i4];
                                r22 = r5;
                                if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == cls4) {
                                    i4++;
                                    superclass = cls;
                                    r5 = r22;
                                }
                            } else {
                                cls = superclass;
                                r23 = r5;
                                obj2 = "Nullable";
                                str2 = "Unexpected signature for ";
                                z = true;
                                u8Var2 = new t8(genericParameterTypes[1], ma8.f(parameterAnnotations[1]), obj, r11, genericParameterTypes.length, 2, true, (byte) 0);
                                cls2 = cls5;
                            }
                            v8VarB2 = w8.b(arrayList, u8Var2.a, u8Var2.b);
                            if (v8VarB2 == null) {
                                StringBuilder sb = new StringBuilder("Conflicting @ToJson methods:\n    ");
                                sb.append(v8VarB2.d);
                                an4.o(sb, "\n    ", u8Var2.d);
                                return;
                            } else {
                                arrayList.add(u8Var2);
                                str = str2;
                                r2 = z;
                                r21 = r23;
                            }
                        }
                    } else {
                        r3 = declaredMethods;
                        r3 = declaredMethods;
                        cls = superclass;
                        r22 = r3;
                    }
                    obj2 = "Nullable";
                    str2 = "Unexpected signature for ";
                    z = true;
                    if (genericParameterTypes.length != 1 || genericReturnType == cls5) {
                        io.sentry.h2.g(r11, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n", str2);
                        return;
                    }
                    Set set = ma8.a;
                    Set setF = ma8.f(r11.getAnnotations());
                    Set setF2 = ma8.f(parameterAnnotations[0]);
                    Annotation[] annotationArr = parameterAnnotations[0];
                    int length3 = annotationArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                            z2 = false;
                            break;
                        } else {
                            if (annotationArr[i5].annotationType().getSimpleName().equals(obj2)) {
                                z2 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    cls2 = cls5;
                    u8Var2 = new u8(genericParameterTypes[0], setF2, obj, r11, genericParameterTypes.length, z2, genericParameterTypes, genericReturnType, setF2, setF, (byte) 0);
                    r23 = r22;
                    v8VarB2 = w8.b(arrayList, u8Var2.a, u8Var2.b);
                    if (v8VarB2 == null) {
                        StringBuilder sb2 = new StringBuilder("Conflicting @ToJson methods:\n    ");
                        sb2.append(v8VarB2.d);
                        an4.o(sb2, "\n    ", u8Var2.d);
                        return;
                    } else {
                        arrayList.add(u8Var2);
                        str = str2;
                        r2 = z;
                        r21 = r23;
                    }
                } else {
                    r3 = declaredMethods;
                    cls = superclass;
                    r21 = r3;
                    obj2 = "Nullable";
                    cls4 = cls4;
                    str = "Unexpected signature for ";
                    cls2 = cls5;
                    r2 = 1;
                    i = 0;
                }
                if (r11.isAnnotationPresent(sv2.class)) {
                    r11.setAccessible(r2);
                    String str4 = str;
                    Type genericReturnType2 = r11.getGenericReturnType();
                    Set set2 = ma8.a;
                    Set setF3 = ma8.f(r11.getAnnotations());
                    Type[] genericParameterTypes2 = r11.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations2 = r11.getParameterAnnotations();
                    if (genericParameterTypes2.length < r2 || genericParameterTypes2[i] != nr3.class) {
                        i2 = length;
                        cls3 = cls2;
                    } else {
                        cls3 = cls2;
                        if (genericReturnType2 != cls3) {
                            int length4 = genericParameterTypes2.length;
                            while (true) {
                                if (r4 < length4) {
                                    ?? r16 = r4;
                                    Type type2 = genericParameterTypes2[r16 == true ? 1 : 0];
                                    i2 = length;
                                    if ((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == cls4) {
                                        r4 = r2;
                                        length = i2;
                                        r4 = (r16 == true ? 1 : 0) + 1;
                                    } else {
                                        r4 = r2;
                                    }
                                } else {
                                    r4 = r2;
                                    i2 = length;
                                    str3 = "\n    ";
                                    u8Var = new t8(genericReturnType2, setF3, obj, r11, genericParameterTypes2.length, 1, true, (byte) 1);
                                }
                                v8VarB = w8.b(arrayList2, u8Var.a, u8Var.b);
                                if (v8VarB == null) {
                                    StringBuilder sb3 = new StringBuilder("Conflicting @FromJson methods:\n    ");
                                    sb3.append(v8VarB.d);
                                    an4.o(sb3, str3, u8Var.d);
                                    return;
                                }
                                arrayList2.add(u8Var);
                            }
                        } else {
                            i2 = length;
                        }
                    }
                    if (genericParameterTypes2.length != 1 || genericReturnType2 == cls3) {
                        io.sentry.h2.g(r11, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n", str4);
                        return;
                    }
                    Set setF4 = ma8.f(parameterAnnotations2[i]);
                    Annotation[] annotationArr2 = parameterAnnotations2[i];
                    int length5 = annotationArr2.length;
                    int i6 = i;
                    while (true) {
                        if (i6 >= length5) {
                            r13 = i;
                            break;
                        } else {
                            if (annotationArr2[i6].annotationType().getSimpleName().equals(obj2)) {
                                r13 = 1;
                                break;
                            }
                            i6++;
                        }
                    }
                    u8Var = new u8(genericReturnType2, setF3, obj, r11, genericParameterTypes2.length, r13, genericParameterTypes2, genericReturnType2, setF4, setF3, (byte) 1);
                    v8VarB = w8.b(arrayList2, u8Var.a, u8Var.b);
                    if (v8VarB == null) {
                        StringBuilder sb4 = new StringBuilder("Conflicting @FromJson methods:\n    ");
                        sb4.append(v8VarB.d);
                        an4.o(sb4, str3, u8Var.d);
                        return;
                    }
                    arrayList2.add(u8Var);
                } else {
                    i2 = length;
                }
                i3++;
                superclass = cls;
                r3 = r21;
                length = i2;
            }
            r3 = declaredMethods;
            superclass = superclass.getSuperclass();
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            hk0.g("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
        } else {
            b(new w8(arrayList, arrayList2));
        }
    }

    public final void b(up3 up3Var) {
        if (up3Var == null) {
            hk0.g("factory == null");
            return;
        }
        int i = this.b;
        this.b = i + 1;
        this.a.add(i, up3Var);
    }
}

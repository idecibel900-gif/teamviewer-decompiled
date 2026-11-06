package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e93 {
    public final kb6 a;
    public final pi0 b;
    public final vc1 c;

    public e93(kb6 kb6Var, pi0 pi0Var, vc1 vc1Var) {
        this.a = kb6Var;
        this.b = pi0Var;
        this.c = vc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:386:0x08ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:589:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static e93 b(d11 d11Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        xo1 xo1Var;
        int i;
        int i2;
        xo1[] xo1VarArr;
        int i3;
        int i4;
        xo1 sf5Var;
        xo1 of5Var;
        jf5 jf5Var;
        jf5 jf5Var2;
        jb6 jb6Var = new jb6(d11Var, cls, method);
        Annotation[] annotationArr = jb6Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            xo1 xo1Var2 = null;
            if (i6 >= length) {
                if (jb6Var.f1146o == null) {
                    throw im3.S(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!jb6Var.p) {
                    if (jb6Var.r) {
                        throw im3.S(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (jb6Var.q) {
                        throw im3.S(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = jb6Var.e;
                int length2 = annotationArr2.length;
                jb6Var.w = new xo1[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    xo1[] xo1VarArr2 = jb6Var.w;
                    Type type = jb6Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        xo1Var = xo1Var2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof y98) {
                                jb6Var.c(i8, type);
                                if (jb6Var.n) {
                                    throw im3.U(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (jb6Var.j) {
                                    throw im3.U(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (jb6Var.k) {
                                    throw im3.U(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (jb6Var.l) {
                                    throw im3.U(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (jb6Var.m) {
                                    throw im3.U(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (jb6Var.s != null) {
                                    throw im3.U(method, i8, "@Url cannot be used with @%s URL", jb6Var.f1146o);
                                }
                                jb6Var.n = true;
                                if (type != h93.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw im3.U(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                sf5Var = new nf5(method, i8, (byte) 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof xg5;
                                d11 d11Var2 = jb6Var.a;
                                if (z5) {
                                    jb6Var.c(i8, type);
                                    if (jb6Var.k) {
                                        throw im3.U(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (jb6Var.l) {
                                        throw im3.U(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (jb6Var.m) {
                                        throw im3.U(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (jb6Var.n) {
                                        throw im3.U(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (jb6Var.s == null) {
                                        throw im3.U(method, i8, "@Path can only be used with relative url on @%s", jb6Var.f1146o);
                                    }
                                    jb6Var.j = true;
                                    xg5 xg5Var = (xg5) annotation;
                                    String strValue = xg5Var.value();
                                    if (!jb6.z.matcher(strValue).matches()) {
                                        throw im3.U(method, i8, "@Path parameter name must match %s. Found: %s", jb6.y.pattern(), strValue);
                                    }
                                    if (!jb6Var.v.contains(strValue)) {
                                        throw im3.U(method, i8, "URL \"%s\" does not contain \"{%s}\".", jb6Var.s, strValue);
                                    }
                                    d11Var2.T(type, annotationArr3);
                                    sf5Var = new pf5(jb6Var.c, i8, strValue, xg5Var.encoded());
                                } else {
                                    i2 = i10;
                                    xo1VarArr = xo1VarArr2;
                                    if (annotation instanceof sy5) {
                                        jb6Var.c(i8, type);
                                        sy5 sy5Var = (sy5) annotation;
                                        String strValue2 = sy5Var.value();
                                        boolean zEncoded = sy5Var.encoded();
                                        i3 = i9;
                                        Class clsL = im3.L(type);
                                        i4 = length3;
                                        jb6Var.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsL)) {
                                            if (clsL.isArray()) {
                                                d11Var2.T(jb6.a(clsL.getComponentType()), annotationArr3);
                                                jf5Var2 = new jf5(new lf5(strValue2, zEncoded, (byte) 2), (byte) 1);
                                            } else {
                                                d11Var2.T(type, annotationArr3);
                                                sf5Var = new lf5(strValue2, zEncoded, (byte) 2);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw im3.U(method, i8, clsL.getSimpleName() + " must include generic type (e.g., " + clsL.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            d11Var2.T(im3.I(0, (ParameterizedType) type), annotationArr3);
                                            jf5Var2 = new jf5(new lf5(strValue2, zEncoded, (byte) 2), (byte) 0);
                                        }
                                        sf5Var = jf5Var2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof uy5) {
                                            jb6Var.c(i8, type);
                                            boolean zEncoded2 = ((uy5) annotation).encoded();
                                            Class clsL2 = im3.L(type);
                                            jb6Var.l = true;
                                            if (Iterable.class.isAssignableFrom(clsL2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw im3.U(method, i8, clsL2.getSimpleName() + " must include generic type (e.g., " + clsL2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                d11Var2.T(im3.I(0, (ParameterizedType) type), annotationArr3);
                                                jf5Var2 = new jf5(new qf5(zEncoded2), (byte) 0);
                                            } else if (clsL2.isArray()) {
                                                d11Var2.T(jb6.a(clsL2.getComponentType()), annotationArr3);
                                                jf5Var2 = new jf5(new qf5(zEncoded2), (byte) 1);
                                            } else {
                                                d11Var2.T(type, annotationArr3);
                                                sf5Var = new qf5(zEncoded2);
                                            }
                                            sf5Var = jf5Var2;
                                        } else if (annotation instanceof ty5) {
                                            jb6Var.c(i8, type);
                                            Class clsL3 = im3.L(type);
                                            jb6Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsL3)) {
                                                throw im3.U(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeM = im3.M(type, clsL3);
                                            if (!(typeM instanceof ParameterizedType)) {
                                                throw im3.U(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeM;
                                            Type typeI = im3.I(0, parameterizedType);
                                            if (String.class != typeI) {
                                                throw im3.U(method, i8, "@QueryMap keys must be of type String: " + typeI, new Object[0]);
                                            }
                                            d11Var2.T(im3.I(1, parameterizedType), annotationArr3);
                                            sf5Var = new mf5((byte) 2, i8, method, ((ty5) annotation).encoded());
                                        } else {
                                            str = str;
                                            if (annotation instanceof c53) {
                                                jb6Var.c(i8, type);
                                                c53 c53Var = (c53) annotation;
                                                String strValue3 = c53Var.value();
                                                Class clsL4 = im3.L(type);
                                                if (Iterable.class.isAssignableFrom(clsL4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw im3.U(method, i8, clsL4.getSimpleName() + " must include generic type (e.g., " + clsL4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    d11Var2.T(im3.I(0, (ParameterizedType) type), annotationArr3);
                                                    of5Var = new jf5(new lf5(strValue3, c53Var.allowUnsafeNonAsciiValues(), (byte) 1), (byte) 0);
                                                } else if (clsL4.isArray()) {
                                                    d11Var2.T(jb6.a(clsL4.getComponentType()), annotationArr3);
                                                    of5Var = new jf5(new lf5(strValue3, c53Var.allowUnsafeNonAsciiValues(), (byte) 1), (byte) 1);
                                                } else {
                                                    d11Var2.T(type, annotationArr3);
                                                    sf5Var = new lf5(strValue3, c53Var.allowUnsafeNonAsciiValues(), (byte) 1);
                                                }
                                                sf5Var = of5Var;
                                            } else if (annotation instanceof h53) {
                                                if (type == k53.class) {
                                                    sf5Var = new nf5(method, i8, (byte) 0);
                                                } else {
                                                    jb6Var.c(i8, type);
                                                    Class clsL5 = im3.L(type);
                                                    if (!Map.class.isAssignableFrom(clsL5)) {
                                                        throw im3.U(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM2 = im3.M(type, clsL5);
                                                    if (!(typeM2 instanceof ParameterizedType)) {
                                                        throw im3.U(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM2;
                                                    Type typeI2 = im3.I(0, parameterizedType2);
                                                    if (String.class != typeI2) {
                                                        throw im3.U(method, i8, "@HeaderMap keys must be of type String: " + typeI2, new Object[0]);
                                                    }
                                                    d11Var2.T(im3.I(1, parameterizedType2), annotationArr3);
                                                    sf5Var = new mf5((byte) 1, i8, method, ((h53) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof wi2) {
                                                jb6Var.c(i8, type);
                                                if (!jb6Var.q) {
                                                    throw im3.U(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                wi2 wi2Var = (wi2) annotation;
                                                String strValue4 = wi2Var.value();
                                                boolean zEncoded3 = wi2Var.encoded();
                                                jb6Var.g = true;
                                                Class clsL6 = im3.L(type);
                                                if (Iterable.class.isAssignableFrom(clsL6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw im3.U(method, i8, clsL6.getSimpleName() + " must include generic type (e.g., " + clsL6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    d11Var2.T(im3.I(0, (ParameterizedType) type), annotationArr3);
                                                    of5Var = new jf5(new lf5(strValue4, zEncoded3, (byte) 0), (byte) 0);
                                                } else if (clsL6.isArray()) {
                                                    d11Var2.T(jb6.a(clsL6.getComponentType()), annotationArr3);
                                                    of5Var = new jf5(new lf5(strValue4, zEncoded3, (byte) 0), (byte) 1);
                                                } else {
                                                    d11Var2.T(type, annotationArr3);
                                                    sf5Var = new lf5(strValue4, zEncoded3, (byte) 0);
                                                }
                                                sf5Var = of5Var;
                                            } else if (annotation instanceof yi2) {
                                                jb6Var.c(i8, type);
                                                if (!jb6Var.q) {
                                                    throw im3.U(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsL7 = im3.L(type);
                                                if (!Map.class.isAssignableFrom(clsL7)) {
                                                    throw im3.U(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM3 = im3.M(type, clsL7);
                                                if (!(typeM3 instanceof ParameterizedType)) {
                                                    throw im3.U(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM3;
                                                byte b = 0;
                                                Type typeI3 = im3.I(0, parameterizedType3);
                                                if (String.class != typeI3) {
                                                    throw im3.U(method, i8, "@FieldMap keys must be of type String: " + typeI3, new Object[0]);
                                                }
                                                d11Var2.T(im3.I(1, parameterizedType3), annotationArr3);
                                                jb6Var.g = true;
                                                sf5Var = new mf5(b, i8, method, ((yi2) annotation).encoded());
                                            } else if (annotation instanceof mg5) {
                                                jb6Var.c(i8, type);
                                                if (!jb6Var.r) {
                                                    throw im3.U(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                mg5 mg5Var = (mg5) annotation;
                                                jb6Var.h = true;
                                                String strValue5 = mg5Var.value();
                                                Class clsL8 = im3.L(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsL8);
                                                    rf5 rf5Var = rf5.f;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw im3.U(method, i8, clsL8.getSimpleName() + " must include generic type (e.g., " + clsL8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!aw4.class.isAssignableFrom(im3.L(im3.I(0, (ParameterizedType) type)))) {
                                                            throw im3.U(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        sf5Var = new jf5(rf5Var, (byte) 0);
                                                    } else if (clsL8.isArray()) {
                                                        if (!aw4.class.isAssignableFrom(clsL8.getComponentType())) {
                                                            throw im3.U(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        sf5Var = new jf5(rf5Var, (byte) 1);
                                                    } else {
                                                        if (!aw4.class.isAssignableFrom(clsL8)) {
                                                            throw im3.U(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        sf5Var = rf5Var;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", fx3.g("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", mg5Var.encoding()};
                                                    k53 k53Var = k53.n;
                                                    k53 k53VarK = us1.K(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsL8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw im3.U(method, i8, clsL8.getSimpleName() + " must include generic type (e.g., " + clsL8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeI4 = im3.I(0, (ParameterizedType) type);
                                                        if (aw4.class.isAssignableFrom(im3.L(typeI4))) {
                                                            throw im3.U(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        jf5Var = new jf5(new of5(method, i8, k53VarK, d11Var2.P(typeI4, annotationArr3, annotationArr)), (byte) 0);
                                                    } else if (clsL8.isArray()) {
                                                        Class clsA = jb6.a(clsL8.getComponentType());
                                                        if (aw4.class.isAssignableFrom(clsA)) {
                                                            throw im3.U(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        jf5Var = new jf5(new of5(method, i8, k53VarK, d11Var2.P(clsA, annotationArr3, annotationArr)), (byte) 1);
                                                    } else {
                                                        if (aw4.class.isAssignableFrom(clsL8)) {
                                                            throw im3.U(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        of5Var = new of5(method, i8, k53VarK, d11Var2.P(type, annotationArr3, annotationArr));
                                                        sf5Var = of5Var;
                                                    }
                                                    sf5Var = jf5Var;
                                                }
                                            } else if (annotation instanceof ng5) {
                                                jb6Var.c(i8, type);
                                                if (!jb6Var.r) {
                                                    throw im3.U(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                jb6Var.h = true;
                                                Class clsL9 = im3.L(type);
                                                if (!Map.class.isAssignableFrom(clsL9)) {
                                                    throw im3.U(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM4 = im3.M(type, clsL9);
                                                if (!(typeM4 instanceof ParameterizedType)) {
                                                    throw im3.U(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM4;
                                                Type typeI5 = im3.I(0, parameterizedType4);
                                                if (String.class != typeI5) {
                                                    throw im3.U(method, i8, "@PartMap keys must be of type String: " + typeI5, new Object[0]);
                                                }
                                                Type typeI6 = im3.I(1, parameterizedType4);
                                                if (aw4.class.isAssignableFrom(im3.L(typeI6))) {
                                                    throw im3.U(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                sf5Var = new of5(method, i8, d11Var2.P(typeI6, annotationArr3, annotationArr), ((ng5) annotation).encoding());
                                            } else if (annotation instanceof j80) {
                                                jb6Var.c(i8, type);
                                                if (jb6Var.q || jb6Var.r) {
                                                    throw im3.U(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (jb6Var.i) {
                                                    throw im3.U(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    vc1 vc1VarP = d11Var2.P(type, annotationArr3, annotationArr);
                                                    jb6Var.i = true;
                                                    sf5Var = new kf5(method, i8, vc1VarP);
                                                } catch (RuntimeException e) {
                                                    throw im3.V(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof gn7) {
                                                jb6Var.c(i8, type);
                                                Class clsA2 = jb6.a(im3.L(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    xo1 xo1Var3 = jb6Var.w[i12];
                                                    if ((xo1Var3 instanceof sf5) && ((sf5) xo1Var3).f.equals(clsA2)) {
                                                        throw im3.U(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + pl5.b.f(method, i12) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                sf5Var = new sf5(clsA2);
                                            } else {
                                                sf5Var = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (sf5Var != null) {
                                    if (xo1Var == null) {
                                        throw im3.U(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    xo1Var = sf5Var;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                str = str;
                                xo1VarArr2 = xo1VarArr;
                                length3 = i4;
                            }
                            i2 = i10;
                            xo1VarArr = xo1VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (sf5Var != null) {
                                if (xo1Var == null) {
                                    throw im3.U(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                xo1Var = sf5Var;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str = str;
                            xo1VarArr2 = xo1VarArr;
                            length3 = i4;
                        }
                    } else {
                        xo1Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    xo1[] xo1VarArr3 = xo1VarArr2;
                    int i15 = i9;
                    if (xo1Var == null) {
                        if (i15 != 0) {
                            try {
                                if (im3.L(type) == hc1.class) {
                                    jb6Var.x = true;
                                    xo1Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw im3.U(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    xo1VarArr3[i8] = xo1Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    xo1Var2 = null;
                }
                String str3 = str;
                if (jb6Var.s == null && !jb6Var.n) {
                    throw im3.S(method, null, "Missing either @%s URL or @Url parameter.", jb6Var.f1146o);
                }
                boolean z6 = jb6Var.q;
                if (!z6 && !jb6Var.r && !jb6Var.p && jb6Var.i) {
                    throw im3.S(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !jb6Var.g) {
                    throw im3.S(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (jb6Var.r && !jb6Var.h) {
                    throw im3.S(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                kb6 kb6Var = new kb6(jb6Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (im3.N(genericReturnType2)) {
                    throw im3.S(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw im3.S(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = kb6Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeI7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeI7 instanceof WildcardType) {
                        typeI7 = ((WildcardType) typeI7).getLowerBounds()[0];
                    }
                    if (im3.L(typeI7) == kc6.class && (typeI7 instanceof ParameterizedType)) {
                        typeI7 = im3.I(0, (ParameterizedType) typeI7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (im3.L(typeI7) == qi0.class) {
                            throw im3.S(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", im3.I(0, (ParameterizedType) typeI7));
                        }
                        z3 = im3.D && typeI7 == f88.class;
                        z2 = false;
                    }
                    genericReturnType = new ra8(null, qi0.class, typeI7);
                    if (!im3.P(annotations, c17.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = d17.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    si0 si0VarL = d11Var.l(genericReturnType, annotations);
                    Type typeF = si0VarL.f();
                    if (typeF == lc6.class) {
                        throw im3.S(method, null, "'" + im3.L(typeF).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeF == kc6.class) {
                        throw im3.S(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (kb6Var.d.equals(str3) && !Void.class.equals(typeF) && (!im3.D || typeF != f88.class)) {
                        throw im3.S(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        vc1 vc1VarQ = d11Var.Q(typeF, method.getAnnotations());
                        pi0 pi0Var = (pi0) d11Var.n;
                        if (z7) {
                            return z2 ? new c93(kb6Var, pi0Var, vc1VarQ, si0VarL, (byte) 1) : new d93(kb6Var, pi0Var, vc1VarQ, si0VarL, z);
                        }
                        return new c93(kb6Var, pi0Var, vc1VarQ, si0VarL, (byte) 0);
                    } catch (RuntimeException e2) {
                        throw im3.S(method, e2, "Unable to create converter for %s", typeF);
                    }
                } catch (RuntimeException e3) {
                    throw im3.S(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof jg1) {
                jb6Var.b(false, "DELETE", ((jg1) annotation2).value());
            } else if (annotation2 instanceof ox2) {
                jb6Var.b(false, "GET", ((ox2) annotation2).value());
            } else if (annotation2 instanceof j43) {
                jb6Var.b(false, "HEAD", ((j43) annotation2).value());
            } else if (annotation2 instanceof qc5) {
                jb6Var.b(true, "PATCH", ((qc5) annotation2).value());
            } else if (annotation2 instanceof yc5) {
                jb6Var.b(true, "POST", ((yc5) annotation2).value());
            } else if (annotation2 instanceof zc5) {
                jb6Var.b(true, "PUT", ((zc5) annotation2).value());
            } else if (annotation2 instanceof g65) {
                jb6Var.b(false, "OPTIONS", ((g65) annotation2).value());
            } else if (annotation2 instanceof k43) {
                k43 k43Var = (k43) annotation2;
                jb6Var.b(k43Var.hasBody(), k43Var.method(), k43Var.path());
            } else if (annotation2 instanceof j53) {
                j53 j53Var = (j53) annotation2;
                String[] strArrValue = j53Var.value();
                if (strArrValue.length == 0) {
                    throw im3.S(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = j53Var.allowUnsafeNonAsciiValues();
                nm nmVar = new nm((byte) 5);
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw im3.S(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            e96 e96Var = jo4.e;
                            jb6Var.u = vt1.t(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw im3.S(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        i67.t(strSubstring);
                        i67.h(nmVar, strSubstring, strTrim);
                    } else {
                        nmVar.h(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                jb6Var.t = i67.i(nmVar);
            } else if (annotation2 instanceof yv4) {
                if (jb6Var.q) {
                    throw im3.S(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                jb6Var.r = true;
            } else if (!(annotation2 instanceof zs2)) {
                continue;
            } else {
                if (jb6Var.r) {
                    throw im3.S(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                jb6Var.q = true;
            }
            i6++;
        }
    }

    public abstract Object a(a75 a75Var, Object[] objArr);
}

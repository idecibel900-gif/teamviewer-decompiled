package o;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class q24 implements Function1 {
    public final /* synthetic */ byte m;
    public final s24 n;

    public /* synthetic */ q24(s24 s24Var, byte b) {
        this.m = b;
        this.n = s24Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0240  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        n86 u76Var;
        n86 l86Var;
        byte b = this.m;
        byte b2 = 2;
        s24 s24Var = this.n;
        sy4 sy4Var = (sy4) obj;
        switch (b) {
            case 0:
                sy4Var.getClass();
                s24 s24Var2 = s24Var.c;
                if (s24Var2 != null) {
                    return (Collection) s24Var2.f.invoke(sy4Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((mi1) s24Var.e.a()).c(sy4Var).iterator();
                while (it.hasNext()) {
                    eo3 eo3VarT = s24Var.t((j86) it.next());
                    if (s24Var.r(eo3VarT)) {
                        Object obj2 = s24Var.b.m;
                        arrayList.add(eo3VarT);
                    }
                }
                s24Var.j(arrayList, sy4Var);
                return arrayList;
            case 1:
                sy4Var.getClass();
                s24 s24Var3 = s24Var.c;
                if (s24Var3 != null) {
                    return (bu5) s24Var3.g.invoke(sy4Var);
                }
                g86 g86VarB = ((mi1) s24Var.e.a()).b(sy4Var);
                if (g86VarB != null) {
                    Field field = g86VarB.a;
                    if (!field.isEnumConstant()) {
                        k76 k76Var = new k76();
                        boolean z = !Modifier.isFinal(((Field) g86VarB.b()).getModifiers());
                        yc4 yc4Var = s24Var.b;
                        ho3 ho3VarL0 = ho3.L0(s24Var.q(), ep1.D(yc4Var, g86VarB), h57.y(g86VarB.e()), z, g86VarB.c(), d82.z(g86VarB), Modifier.isFinal(((Field) g86VarB.b()).getModifiers()) && Modifier.isStatic(((Field) g86VarB.b()).getModifiers()));
                        k76Var.m = ho3VarL0;
                        ho3VarL0.H0(null, null, null, null);
                        iu iuVar = (iu) yc4Var.q;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                l86Var = new l86(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    u76Var = new u76(genericType);
                                } else {
                                    u76Var = genericType instanceof WildcardType ? new q86((WildcardType) genericType) : new c86(genericType);
                                }
                                l86Var = u76Var;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                u76Var = new u76(genericType);
                            } else {
                                u76Var = new u76(genericType);
                            }
                            l86Var = u76Var;
                        }
                        oz3 oz3VarV = iuVar.V(l86Var, lq1.I(n58.n, false, null, 7));
                        if ((wy3.F(oz3VarV) || wy3.G(oz3VarV)) && Modifier.isFinal(((Field) g86VarB.b()).getModifiers())) {
                            Modifier.isStatic(((Field) g86VarB.b()).getModifiers());
                        }
                        du5 du5Var = (du5) k76Var.m;
                        v14 v14VarP = s24Var.p();
                        ea2 ea2Var = ea2.m;
                        du5Var.K0(oz3VarV, ea2Var, v14VarP, null, ea2Var);
                        fi1 fi1VarQ = s24Var.q();
                        if ((fi1VarQ instanceof ns4 ? (ns4) fi1VarQ : null) != null) {
                            du5 du5Var2 = (du5) k76Var.m;
                            du5Var2.getClass();
                            k76Var.m = du5Var2;
                        }
                        Object obj3 = k76Var.m;
                        sb8 sb8Var = (sb8) obj3;
                        oz3 type = ((du5) obj3).getType();
                        if (sb8Var == null) {
                            zo1.a(66);
                            throw null;
                        }
                        if (type == null) {
                            zo1.a(67);
                            throw null;
                        }
                        int i = zo1.a;
                        if (!sb8Var.R() && !ct1.K(type)) {
                            if (p58.b(type)) {
                                ((du5) k76Var.m).I0(null, new yp1(s24Var, g86VarB, k76Var, b2));
                            } else {
                                wy3 wy3VarE = bp1.e(sb8Var);
                                if (wy3.F(type)) {
                                    ((du5) k76Var.m).I0(null, new yp1(s24Var, g86VarB, k76Var, b2));
                                } else {
                                    q35 q35Var = qz3.a;
                                    if (q35Var.a(wy3VarE.u(), type) || q35Var.a(wy3VarE.j("Number").W(), type) || q35Var.a(wy3VarE.e(), type) || h98.a(type)) {
                                        ((du5) k76Var.m).I0(null, new yp1(s24Var, g86VarB, k76Var, b2));
                                    }
                                }
                            }
                        }
                        Object obj4 = k76Var.m;
                        if (((bu5) obj4) != null) {
                            return (bu5) obj4;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                sy4Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) s24Var.f.invoke(sy4Var));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : linkedHashSet) {
                    String strE = io1.E((c07) obj5, 2);
                    Object arrayList2 = linkedHashMap.get(strE);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strE, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionT = ct1.T(list, e24.f672o);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionT);
                    }
                }
                s24Var.m(linkedHashSet, sy4Var);
                yc4 yc4Var2 = s24Var.b;
                return lv0.P0(((io3) yc4Var2.m).k.k(yc4Var2, linkedHashSet));
            default:
                sy4Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Object objInvoke = s24Var.g.invoke(sy4Var);
                if (objInvoke != null) {
                    arrayList3.add(objInvoke);
                }
                s24Var.n(arrayList3, sy4Var);
                fi1 fi1VarQ2 = s24Var.q();
                int i2 = zo1.a;
                if (zo1.n(fi1VarQ2, ms0.q)) {
                    return lv0.P0(arrayList3);
                }
                yc4 yc4Var3 = s24Var.b;
                return lv0.P0(((io3) yc4Var3.m).k.k(yc4Var3, arrayList3));
        }
    }
}

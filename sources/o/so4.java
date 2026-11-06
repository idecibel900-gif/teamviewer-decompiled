package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class so4 implements Function0 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2040o;
    public final int p;

    public so4(qw3 qw3Var, int i, u14 u14Var) {
        this.m = (byte) 2;
        this.n = qw3Var;
        this.p = i;
        this.f2040o = u14Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        List listP0;
        byte b = this.m;
        ea2 ea2Var = ea2.m;
        Object obj = this.f2040o;
        int i = this.p;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                vo4 vo4Var = (vo4) obj2;
                t1 t1Var = (t1) obj;
                fp1 fp1Var = vo4Var.a;
                sx3 sx3VarA = vo4Var.a((fi1) fp1Var.c);
                listP0 = sx3VarA != null ? lv0.P0(((ap) ((io.sentry.android.replay.screenshot.k) fp1Var.a).e).e(sx3VarA, t1Var, i)) : null;
                return listP0 == null ? ea2Var : listP0;
            case 1:
                vo4 vo4Var2 = (vo4) obj2;
                t1 t1Var2 = (t1) obj;
                fp1 fp1Var2 = vo4Var2.a;
                sx3 sx3VarA2 = vo4Var2.a((fi1) fp1Var2.c);
                listP0 = sx3VarA2 != null ? ((ap) ((io.sentry.android.replay.screenshot.k) fp1Var2.a).e).i(sx3VarA2, t1Var2, i) : null;
                return listP0 == null ? ea2Var : listP0;
            default:
                qw3 qw3Var = (qw3) obj2;
                u14 u14Var = (u14) obj;
                u86 u86Var = qw3Var.n;
                Type type = u86Var != null ? (Type) u86Var.a() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i != 0) {
                        hk0.q(qw3Var, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    hk0.q(qw3Var, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) u14Var.getValue()).get(i);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) cx.S0(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) cx.R0(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
        }
    }

    public /* synthetic */ so4(vo4 vo4Var, t1 t1Var, int i, byte b) {
        this.m = b;
        this.n = vo4Var;
        this.f2040o = t1Var;
        this.p = i;
    }
}

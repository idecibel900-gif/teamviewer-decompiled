package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c86 extends n86 {
    public final Type a;
    public final vn3 b;

    public c86(Type type) {
        vn3 a86Var;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            a86Var = new a86((Class) type);
        } else if (type instanceof TypeVariable) {
            a86Var = new o86((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                an4.t("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            a86Var = new a86((Class) rawType);
        }
        this.b = a86Var;
    }

    @Override // o.n86, o.rn3
    public final q76 a(ht2 ht2Var) {
        ht2Var.getClass();
        return null;
    }

    @Override // o.n86
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    public final ArrayList c() {
        bo3 u76Var;
        bo3 l86Var;
        List<Type> listC = p76.c(this.a);
        ArrayList arrayList = new ArrayList(mv0.Z(listC, 10));
        for (Type type : listC) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    l86Var = new l86(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        u76Var = new u76(type);
                    } else {
                        u76Var = type instanceof WildcardType ? new q86((WildcardType) type) : new c86(type);
                    }
                    l86Var = u76Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    u76Var = new u76(type);
                } else {
                    u76Var = new u76(type);
                }
                l86Var = u76Var;
            }
            arrayList.add(l86Var);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        return ea2.m;
    }
}

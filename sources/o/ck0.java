package o;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ck0 implements mj0 {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public ck0(Member member, Type type, Class cls, Type[] typeArr) {
        List listG1;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            nm nmVar = new nm(2);
            nmVar.g(cls);
            nmVar.i(typeArr);
            ArrayList arrayList = nmVar.a;
            listG1 = qf0.L(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listG1 = cx.g1(typeArr);
        }
        this.d = listG1;
    }

    @Override // o.mj0
    public final List a() {
        return this.d;
    }

    @Override // o.mj0
    public final Member b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        di1.o(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            hk0.g("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // o.mj0
    public final Type getReturnType() {
        return this.b;
    }
}

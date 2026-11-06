package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nj0 extends ck0 implements ia0 {
    public final /* synthetic */ byte e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public nj0(Constructor constructor, Object obj, byte b) {
        this.e = b;
        switch (b) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : cx.L0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override // o.mj0
    public final Object call(Object[] objArr) {
        byte b = this.e;
        Object obj = this.f;
        Member member = this.a;
        objArr.getClass();
        switch (b) {
            case 0:
                di1.o(this, objArr);
                nm nmVar = new nm(3);
                nmVar.g(obj);
                nmVar.i(objArr);
                nmVar.g(null);
                ArrayList arrayList = nmVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                di1.o(this, objArr);
                nm nmVar2 = new nm(2);
                nmVar2.g(obj);
                nmVar2.i(objArr);
                ArrayList arrayList2 = nmVar2.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}

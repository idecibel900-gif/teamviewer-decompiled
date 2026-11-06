package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oj0 extends ck0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj0(Member member, Type type, Class cls, Type[] typeArr, byte b) {
        super(member, type, cls, typeArr);
        this.e = b;
    }

    @Override // o.mj0
    public final Object call(Object[] objArr) {
        byte b = this.e;
        Member member = this.a;
        objArr.getClass();
        switch (b) {
            case 0:
                di1.o(this, objArr);
                nm nmVar = new nm(2);
                nmVar.i(objArr);
                nmVar.g(null);
                ArrayList arrayList = nmVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                di1.o(this, objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}

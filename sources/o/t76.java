package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t76 extends r76 {
    public final Object[] b;

    public t76(sy4 sy4Var, Object[] objArr) {
        super(sy4Var);
        this.b = objArr;
    }

    public final ArrayList a() {
        r76 b86Var;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = p76.a;
            if (Enum.class.isAssignableFrom(cls)) {
                b86Var = new f86(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                b86Var = new s76(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                b86Var = new t76(null, (Object[]) obj);
            } else {
                b86Var = obj instanceof Class ? new b86(null, (Class) obj) : new h86(null, obj);
            }
            arrayList.add(b86Var);
        }
        return arrayList;
    }
}

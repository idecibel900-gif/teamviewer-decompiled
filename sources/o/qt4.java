package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qt4 extends uc1 {
    public final pt4 a;

    public qt4(pt4 pt4Var) {
        this.a = pt4Var;
    }

    public static Set c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(ir3.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // o.uc1
    public final vc1 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, d11 d11Var) {
        return new st4(this.a.a(type, c(annotationArr), null));
    }

    @Override // o.uc1
    public final vc1 b(Type type, Annotation[] annotationArr, d11 d11Var) {
        return new tt4(this.a.a(type, c(annotationArr), null));
    }
}

package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class do5 implements up3 {
    public final Class a;
    public final String b;
    public final List c;
    public final List d;

    public do5(Class cls, String str, List list, List list2) {
        this.a = cls;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    @Override // o.up3
    public final vp3 a(Type type, Set set, pt4 pt4Var) {
        if (f57.j(type) != this.a || !set.isEmpty()) {
            return null;
        }
        List list = this.d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(pt4Var.a((Type) list.get(i), ma8.a, null));
        }
        return new co5(this.b, this.c, list, arrayList).b();
    }

    public final do5 b(Class cls, String str) {
        if (str == null) {
            yq4.l("label == null");
            return null;
        }
        List list = this.c;
        if (list.contains(str)) {
            hk0.g("Labels must be unique.");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.d);
        arrayList2.add(cls);
        return new do5(this.a, this.b, arrayList, arrayList2);
    }
}

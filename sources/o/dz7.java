package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dz7 {
    public final int a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;

    public dz7(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = str;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = Collections.unmodifiableList(arrayList3);
        this.f = Collections.unmodifiableList(arrayList4);
        this.g = Collections.unmodifiableList(arrayList5);
    }
}

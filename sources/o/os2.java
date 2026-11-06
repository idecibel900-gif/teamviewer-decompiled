package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class os2 {
    public final List a;
    public final boolean b;

    public os2() {
        this.b = true;
        this.a = Collections.singletonList(null);
    }

    public os2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public os2(ArrayList arrayList) {
        this.b = false;
        this.a = arrayList;
    }
}

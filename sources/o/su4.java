package o;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class su4 extends jb8 {
    public final ArrayList a;
    public final Map b;

    public su4(ArrayList arrayList) {
        this.a = arrayList;
        Map mapU = xm4.U(arrayList);
        if (mapU.size() == arrayList.size()) {
            this.b = mapU;
        } else {
            hk0.g("Some properties have the same names");
            throw null;
        }
    }

    @Override // o.jb8
    public final boolean a(sy4 sy4Var) {
        return this.b.containsKey(sy4Var);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}

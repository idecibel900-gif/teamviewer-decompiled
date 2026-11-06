package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vp7 {
    public static final vp7 b = new vp7(0);
    public static final vp7 c = new vp7(1);
    public static final vp7 d = new vp7(2);
    public final int a;

    public vp7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vp7) {
            return this.a == ((vp7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return fx3.g("TextDecoration[", gc4.a(arrayList, ", ", null, 62), "]");
        }
        return "TextDecoration." + arrayList.get(0);
    }
}

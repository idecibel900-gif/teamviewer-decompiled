package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gm0 {
    public final HashMap a = new HashMap();

    public gm0(String str) {
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (((String) this.a.put(str, str2)) != null) {
            ye4.a("Category", "addProperty: property already exists and will be overridden");
        }
    }
}

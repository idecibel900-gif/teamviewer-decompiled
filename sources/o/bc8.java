package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bc8 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = rv0.i;
    }

    public static final List a(String str) {
        if (str != null) {
            i52 i52Var = new i52((byte) 1);
            ArrayList arrayList = i52Var.a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                i52Var.a = arrayList;
            } else {
                arrayList.clear();
            }
            i52Var.b(str, arrayList);
            ArrayList arrayList2 = i52Var.a;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return ea2.m;
    }
}

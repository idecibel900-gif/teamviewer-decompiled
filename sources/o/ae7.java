package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae7 {
    public static final List a = qf0.K("inr");

    public static final boolean a(zd7 zd7Var) {
        jt5 jt5Var;
        it5 it5Var;
        ArrayList arrayList = zd7Var.a.h;
        String str = (arrayList == null || (jt5Var = (jt5) arrayList.get(0)) == null || (it5Var = (it5) jt5Var.c.a.get(0)) == null) ? null : it5Var.b;
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return a.contains(lowerCase);
    }
}

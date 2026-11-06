package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class is3 extends it1 {
    public final List d;

    public is3(Class cls) {
        super((byte) 10);
        Object[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        gj2 gj2Var = new gj2((byte) 18);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, gj2Var);
            }
        }
        List listAsList = Arrays.asList(declaredMethods);
        listAsList.getClass();
        this.d = listAsList;
    }

    @Override // o.it1
    public final String l() {
        return lv0.t0(this.d, "", "<init>(", ")V", ek.N, 24);
    }
}

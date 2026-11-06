package o;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum ro1 {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f1937o;
    public final boolean m;

    static {
        ro1[] ro1VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (ro1 ro1Var : ro1VarArrValues) {
            if (ro1Var.m) {
                arrayList.add(ro1Var);
            }
        }
        n = lv0.T0(arrayList);
        f1937o = cx.h1(values());
    }

    ro1(boolean z) {
        this.m = z;
    }
}

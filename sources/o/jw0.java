package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jw0 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1205o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ jw0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, i76 i76Var, int i) {
        this.f1205o = arrayList;
        this.p = arrayList2;
        this.q = arrayList3;
        this.r = i76Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = 0;
        Object obj2 = this.r;
        int i2 = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.f1205o;
        switch (b) {
            case 0:
                jl5[] jl5VarArr = (jl5[]) obj5;
                kw0 kw0Var = (kw0) obj4;
                fo4 fo4Var = (fo4) obj3;
                int[] iArr = (int[]) obj2;
                il5 il5Var = (il5) obj;
                int length = jl5VarArr.length;
                int i3 = 0;
                while (i < length) {
                    jl5 jl5Var = jl5VarArr[i];
                    int i4 = i3 + 1;
                    jl5Var.getClass();
                    Object objE = jl5Var.E();
                    bg6 bg6Var = objE instanceof bg6 ? (bg6) objE : null;
                    j04 layoutDirection = fo4Var.getLayoutDirection();
                    cf1 cf1Var = bg6Var != null ? bg6Var.c : null;
                    il5Var.g(jl5Var, cf1Var != null ? cf1Var.s0.a(jl5Var.m, i2, layoutDirection) : kw0Var.b.a(jl5Var.m, i2, layoutDirection), iArr[i3], 0.0f);
                    i++;
                    i3 = i4;
                }
                return f88Var;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                i76 i76Var = (i76) obj2;
                il5 il5Var2 = (il5) obj;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    il5.k(il5Var2, (jl5) arrayList.get(i5), i76Var.m * i5, 0);
                }
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    jl5 jl5Var2 = (jl5) arrayList2.get(i6);
                    il5.k(il5Var2, jl5Var2, 0, i2 - jl5Var2.n);
                }
                int size3 = arrayList3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    jl5 jl5Var3 = (jl5) arrayList3.get(i7);
                    il5.k(il5Var2, jl5Var3, 0, i2 - jl5Var3.n);
                }
                return f88Var;
            default:
                br2 br2Var = (br2) obj4;
                v56 v56Var = (v56) obj3;
                m5 m5Var = (m5) obj2;
                s50 s50Var = (s50) obj;
                if (((br2) obj5) != ((lq2) vn4.q0(br2Var).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zD = y57.D(i2, m5Var, br2Var, v56Var);
                Boolean boolValueOf = Boolean.valueOf(zD);
                if (zD || !s50Var.a()) {
                    return boolValueOf;
                }
                return null;
        }
    }

    public /* synthetic */ jw0(br2 br2Var, br2 br2Var2, v56 v56Var, int i, m5 m5Var) {
        this.f1205o = br2Var;
        this.p = br2Var2;
        this.q = v56Var;
        this.n = i;
        this.r = m5Var;
    }

    public /* synthetic */ jw0(jl5[] jl5VarArr, kw0 kw0Var, int i, fo4 fo4Var, int[] iArr) {
        this.f1205o = jl5VarArr;
        this.p = kw0Var;
        this.n = i;
        this.q = fo4Var;
        this.r = iArr;
    }
}

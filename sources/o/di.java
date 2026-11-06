package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ArrayList n;

    public /* synthetic */ di(ArrayList arrayList, byte b) {
        this.m = b;
        this.n = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ArrayList arrayList = this.n;
        switch (b) {
            case 0:
                il5 il5Var = (il5) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    il5.k(il5Var, (jl5) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                il5 il5Var2 = (il5) obj;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    il5.k(il5Var2, (jl5) arrayList.get(i2), 0, 0);
                }
                break;
            case 2:
                il5 il5Var3 = (il5) obj;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    il5.l(il5Var3, (jl5) arrayList.get(i3), 0, 0, null, 12);
                }
                break;
            default:
                il5 il5Var4 = (il5) obj;
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    il5Var4.g((jl5) arrayList.get(i4), 0, 0, 0.0f);
                }
                break;
        }
        return f88Var;
    }
}

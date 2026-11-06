package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fk implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ArrayList n;

    public /* synthetic */ fk(ArrayList arrayList, byte b) {
        this.m = b;
        this.n = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        ArrayList arrayList = this.n;
        switch (b) {
            case 0:
                il5 il5Var = (il5) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        il5.k(il5Var, (jl5) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return f88.a;
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}

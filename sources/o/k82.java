package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k82 implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ k82(byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                x35 x35Var = (x35) obj;
                if (x35Var instanceof et7) {
                    return ((et7) x35Var).Q();
                }
                return x35Var.t("br") ? "\n" : "";
            case 1:
                return Collections.unmodifiableList((List) obj);
            case 2:
                return ((x35) obj).B();
            case 3:
                kb7 kb7Var = (kb7) obj;
                String strK = lb7.k(kb7Var.a);
                kb7Var.a = null;
                return strK;
            case 4:
                return new WeakHashMap();
            case 5:
                return new HashMap();
            default:
                return new ArrayList();
        }
    }
}

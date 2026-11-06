package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f42 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ g76 n;

    public /* synthetic */ f42(xk1 xk1Var, g42 g42Var, g76 g76Var) {
        this.m = (byte) 0;
        this.n = g76Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        k28 k28Var = k28.m;
        g76 g76Var = this.n;
        switch (b) {
            case 0:
                g42 g42Var = (g42) obj;
                if (!g42Var.z) {
                    return k28.n;
                }
                if (g42Var.B != null) {
                    ki3.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                g42Var.B = null;
                g76Var.m = g76Var.m;
                return k28Var;
            case 1:
                ((Throwable) obj).getClass();
                g76Var.m = true;
                return f88Var;
            case 2:
                ((Throwable) obj).getClass();
                g76Var.m = true;
                return f88Var;
            default:
                if (!((i63) obj).C) {
                    return k28Var;
                }
                g76Var.m = false;
                return k28.f1225o;
        }
    }

    public /* synthetic */ f42(g76 g76Var, byte b) {
        this.m = b;
        this.n = g76Var;
    }
}

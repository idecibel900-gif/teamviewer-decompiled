package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts6 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    public /* synthetic */ ts6(px4 px4Var, byte b) {
        this.m = b;
        this.n = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.n;
        switch (b) {
            case 0:
                px4Var.setValue((xs6) obj);
                break;
            case 1:
                px4Var.setValue((xs6) obj);
                break;
            case 2:
                px4Var.setValue((xs6) obj);
                break;
            case 3:
                px4Var.setValue((xs6) obj);
                break;
            case 4:
                px4Var.setValue((j74) obj);
                break;
            case 5:
                px4Var.setValue((j74) obj);
                break;
            case 6:
                ((Function1) px4Var.getValue()).invoke((t65) obj);
                break;
            case 7:
                px4Var.setValue((i04) obj);
                break;
            default:
                px4Var.setValue(new t65(((i04) obj).A(0L)));
                break;
        }
        return f88Var;
    }
}

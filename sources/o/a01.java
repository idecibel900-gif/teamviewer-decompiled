package o;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a01 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ c01 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f275o;
    public final /* synthetic */ yy0 p;

    public /* synthetic */ a01(AndroidComposeView androidComposeView, c01 c01Var, yy0 yy0Var) {
        this.f275o = androidComposeView;
        this.n = c01Var;
        this.p = yy0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yy0 yy0Var = this.p;
        AndroidComposeView androidComposeView = this.f275o;
        c01 c01Var = this.n;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ux2Var.W(866651995);
                    b11.a(androidComposeView, c01Var.l, yy0Var, ux2Var, 0);
                    ux2Var.p(false);
                }
                break;
            default:
                num.getClass();
                c01Var.a(androidComposeView, yy0Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ a01(c01 c01Var, AndroidComposeView androidComposeView, yy0 yy0Var, int i) {
        this.n = c01Var;
        this.f275o = androidComposeView;
        this.p = yy0Var;
    }
}

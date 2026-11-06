package o;

import com.teamviewer.remotecontrolviewlib.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vj4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pb3 f2318o;

    public /* synthetic */ vj4(MainActivity mainActivity, pb3 pb3Var, int i) {
        this.m = (byte) 2;
        this.n = mainActivity;
        this.f2318o = pb3Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        pb3 pb3Var = this.f2318o;
        MainActivity mainActivity = this.n;
        byte b2 = 1;
        ux2 ux2Var = (ux2) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                int i = MainActivity.w0;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ut7.a(au8.O(1493951001, new vj4(mainActivity, pb3Var, b2), ux2Var), ux2Var, 48);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                int i2 = MainActivity.w0;
                if (!ux2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    mainActivity.S(pb3Var, ux2Var, 0);
                }
                break;
            default:
                num.getClass();
                int i3 = MainActivity.w0;
                mainActivity.S(pb3Var, ux2Var, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ vj4(MainActivity mainActivity, pb3 pb3Var, byte b) {
        this.m = b;
        this.n = mainActivity;
        this.f2318o = pb3Var;
    }
}

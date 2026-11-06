package o;

import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge4 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ LockScreenActivity n;

    public /* synthetic */ ge4(LockScreenActivity lockScreenActivity, byte b) {
        this.m = b;
        this.n = lockScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        LockScreenActivity lockScreenActivity = this.n;
        switch (b) {
            case 0:
                int i = LockScreenActivity.O;
                lockScreenActivity.finish();
                return f88Var;
            case 1:
                int i2 = LockScreenActivity.O;
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                dl5 dl5Var = new dl5(new q26(c36Var, (byte) 2), (byte) 2);
                ve8 ve8VarO = lockScreenActivity.o();
                bf1 bf1VarK = h57.k(lockScreenActivity);
                pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
                wt3 wt3VarB = w86.a.b(he4.class);
                String strC = wt3VarB.c();
                if (strC != null) {
                    return (he4) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                }
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            case 2:
                int i3 = LockScreenActivity.O;
                lockScreenActivity.finish();
                return f88Var;
            default:
                int i4 = LockScreenActivity.O;
                lockScreenActivity.finish();
                return f88Var;
        }
    }
}

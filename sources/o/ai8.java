package o;

import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModelSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai8 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hi8 n;

    public /* synthetic */ ai8(hi8 hi8Var, byte b) {
        this.m = b;
        this.n = hi8Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[LOOP:0: B:15:0x0066->B:22:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int length;
        uc3 uc3Var;
        uc3 uc3Var2;
        byte b = this.m;
        int i = 0;
        Object[] objArr = 0;
        f88 f88Var = f88.a;
        byte b2 = 3;
        hi8 hi8Var = this.n;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, objArr == true ? 1 : 0), 3);
                return f88Var;
            case 1:
                IRemoteControlLoginViewModel iRemoteControlLoginViewModel = hi8Var.n;
                int iIRemoteControlLoginViewModel_GetCurrentView = IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_GetCurrentView(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel);
                uc3 uc3Var3 = uc3.LoginInProgressView;
                uc3[] uc3VarArr = (uc3[]) uc3.class.getEnumConstants();
                if (iIRemoteControlLoginViewModel_GetCurrentView >= uc3VarArr.length || iIRemoteControlLoginViewModel_GetCurrentView < 0) {
                    length = uc3VarArr.length;
                    while (true) {
                        if (i < length) {
                            hk0.g(ua5.k(iIRemoteControlLoginViewModel_GetCurrentView, uc3.class, "No enum ", " with value "));
                            return null;
                        }
                        uc3Var = uc3VarArr[i];
                        if (uc3Var.m == iIRemoteControlLoginViewModel_GetCurrentView) {
                            uc3Var2 = uc3Var;
                        } else {
                            i++;
                        }
                    }
                } else {
                    uc3Var2 = uc3VarArr[iIRemoteControlLoginViewModel_GetCurrentView];
                    if (uc3Var2.m != iIRemoteControlLoginViewModel_GetCurrentView) {
                        length = uc3VarArr.length;
                        while (true) {
                            if (i < length) {
                                hk0.g(ua5.k(iIRemoteControlLoginViewModel_GetCurrentView, uc3.class, "No enum ", " with value "));
                                return null;
                            }
                            uc3Var = uc3VarArr[i];
                            if (uc3Var.m == iIRemoteControlLoginViewModel_GetCurrentView) {
                                uc3Var2 = uc3Var;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (fi8.a[uc3Var2.ordinal()] != 1) {
                    return f88Var;
                }
                ye4.a("WebLoginViewModel", "updateView connecting");
                l97 l97Var = hi8Var.u;
                Boolean bool = Boolean.TRUE;
                l97Var.getClass();
                l97Var.l(null, bool);
                return f88Var;
            case 2:
                ye4.a("WebLoginViewModel", "OnAccountDeviceLimitExceeded");
                l97 l97Var2 = hi8Var.u;
                Boolean bool2 = Boolean.FALSE;
                l97Var2.getClass();
                l97Var2.l(null, bool2);
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, b2), 3);
                return f88Var;
            default:
                ye4.a("WebLoginViewModel", "OnWrongEmailOrPasswordError");
                l97 l97Var3 = hi8Var.u;
                Boolean bool3 = Boolean.FALSE;
                l97Var3.getClass();
                l97Var3.l(null, bool3);
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, (byte) 5), 3);
                return f88Var;
        }
    }
}

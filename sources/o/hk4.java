package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LoginState;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ nk4 n;

    public /* synthetic */ hk4(nk4 nk4Var, byte b) {
        this.m = b;
        this.n = nk4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hc1 hc1Var;
        Object next;
        byte b = this.m;
        f88 f88Var = f88.a;
        nk4 nk4Var = this.n;
        byte b2 = 0;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    hc1Var = null;
                    if (it.hasNext()) {
                        next = it.next();
                        lx5 lx5Var = (lx5) next;
                        if (lx5Var == null || lx5Var.a() != 1) {
                        }
                    } else {
                        next = null;
                    }
                }
                lx5 lx5Var2 = (lx5) next;
                yt2 yt2Var = nk4Var.C;
                SharedPreferences sharedPreferences = nk4Var.p;
                String strF = yt2Var.F();
                boolean z = sharedPreferences.getBoolean("SHOW_PENDING_PURCHASE_ACTIVATION", false);
                if (lx5Var2 != null && z) {
                    JSONObject jSONObject = lx5Var2.c;
                    String strOptString = jSONObject.optString("obfuscatedAccountId");
                    hr2 hr2Var = (strOptString == null && jSONObject.optString("obfuscatedProfileId") == null) ? null : new hr2(strOptString, (byte) 4);
                    if (im3.n(hr2Var != null ? hr2Var.n : null, strF)) {
                        im3.R(e8.n(nk4Var), null, null, new lk4(nk4Var, hc1Var, b2), 3);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.remove("SHOW_PENDING_PURCHASE_ACTIVATION");
                        editorEdit.apply();
                    }
                }
                break;
            default:
                LoginState loginState = (LoginState) obj;
                loginState.getClass();
                nk4Var.b1();
                LoginState loginState2 = LoginState.LoggedIn;
                if (loginState2 == loginState) {
                    nk4Var.G = true;
                    nk4Var.V0();
                } else if (LoginState.ReadyForLogin == loginState) {
                    nk4Var.G = false;
                }
                if (loginState == loginState2) {
                    IInAppPurchaseViewModel iInAppPurchaseViewModel = nk4Var.B;
                    if (IInAppPurchaseViewModelSWIGJNI.IInAppPurchaseViewModel_DoesAccountNeedALicense(iInAppPurchaseViewModel.a, iInAppPurchaseViewModel)) {
                        nk4Var.C.E(e8.n(nk4Var), new ti4((byte) 3), new hk4(nk4Var, b2));
                    }
                }
                break;
        }
        return f88Var;
    }
}

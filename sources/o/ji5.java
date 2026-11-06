package o;

import android.content.Context;
import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public final class ji5 extends uf4 {
    public final /* synthetic */ li5 a;
    public final /* synthetic */ Context b;

    public ji5(li5 li5Var, Context context) {
        this.a = li5Var;
        this.b = context;
    }

    @Override // o.uf4
    public final void a(LoginState loginState) {
        if (LoginState.LoggedIn == loginState) {
            this.a.d(this.b);
        }
    }
}

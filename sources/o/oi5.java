package o;

import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public final class oi5 extends uf4 {
    public final /* synthetic */ li5 a;

    public oi5(li5 li5Var) {
        this.a = li5Var;
    }

    @Override // o.uf4
    public final void a(LoginState loginState) {
        if (LoginState.LoggedIn == loginState) {
            this.a.c();
        }
    }
}

package o;

import com.teamviewer.remotecontrollib.manager.LockManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ee4 extends g68 {
    public final /* synthetic */ fj3 B;
    public final /* synthetic */ LockManager C;
    public final /* synthetic */ Function0 D;

    public ee4(fj3 fj3Var, LockManager lockManager, Function0 function0) {
        this.B = fj3Var;
        this.C = lockManager;
        this.D = function0;
    }

    @Override // o.g68
    public final void w(CharSequence charSequence) {
        charSequence.getClass();
        this.B.invoke(charSequence.toString());
    }

    @Override // o.g68
    public final void x() {
        this.B.invoke("biometric authentication failed");
    }

    @Override // o.g68
    public final void y(u60 u60Var) {
        this.C.c = Long.MAX_VALUE;
        this.D.a();
    }
}

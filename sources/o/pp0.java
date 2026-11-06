package o;

import android.os.Bundle;
import com.teamviewer.remotecontrollib.swig.AccountViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/pp0;", "Lo/tf4;", "Lo/w05;", "Lo/ca3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pp0 extends tf4<w05> implements ca3 {
    public String A0;

    @Override // o.bb5
    public final void E0() {
        if (B0() != null) {
            this.A0 = null;
        }
    }

    @Override // o.tf4
    public final if4 K0(we8 we8Var) {
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        long jAccountViewModelFactory_GetChatFragmentContainerLoginViewModel = AccountViewModelFactorySWIGJNI.AccountViewModelFactory_GetChatFragmentContainerLoginViewModel();
        ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = jAccountViewModelFactory_GetChatFragmentContainerLoginViewModel != 0 ? new ILoginStateAwareContainerViewModel(jAccountViewModelFactory_GetChatFragmentContainerLoginViewModel) : null;
        iLoginStateAwareContainerViewModel.getClass();
        dl5 dl5Var = new dl5(new vm3(iLoginStateAwareContainerViewModel, (byte) 28), (byte) 2);
        ve8 ve8VarO = we8Var.getG0();
        bf1 bf1VarK = h57.k(we8Var);
        ve8VarO.getClass();
        bf1VarK.getClass();
        return (if4) new pn5(ve8VarO, dl5Var, bf1VarK).j("Chat", w86.a.b(if4.class));
    }

    @Override // o.tf4
    public final oq0 L0() {
        return new yo0();
    }

    @Override // o.tf4
    public final th8 M0() {
        th8 th8Var = new th8();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOGIN_SOURCE_KEY", sf4.n);
        th8Var.u0(bundle);
        return th8Var;
    }

    @Override // o.tf4
    public final void N0(boolean z, boolean z2) {
        oq0 oq0VarB0 = B0();
        String str = this.A0;
        if (str == null) {
            return;
        }
        if (z2 && (oq0VarB0 instanceof op0)) {
            ((op0) oq0VarB0).i(str);
        }
        this.A0 = null;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Chat;
    }

    @Override // o.ca3
    public final void i(String str) {
        str.getClass();
        ye4.a.g("ChatFragmentContainer", "setChatRoomId");
        this.A0 = str;
    }
}

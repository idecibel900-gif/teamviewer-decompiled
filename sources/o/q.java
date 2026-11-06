package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/q;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class q extends ut2 {
    public n93 p0;

    public abstract n93 A0();

    public abstract int B0();

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nw4 nw4Var;
        nw4 nw4Var2;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_account_picture, viewGroup, false);
        this.p0 = A0();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.computer_status);
        o oVar = new o((RoundAccountPictureImageView) viewInflate.findViewById(R.id.avatar_image_container), this, (byte) 0);
        p pVar = new p(appCompatImageView, this);
        n93 n93Var = this.p0;
        if (n93Var != null && (nw4Var2 = ((r33) n93Var).p) != null) {
            nw4Var2.observe(L(), oVar);
        }
        n93 n93Var2 = this.p0;
        if (n93Var2 != null && (nw4Var = ((r33) n93Var2).f1888o) != null) {
            nw4Var.observe(L(), pVar);
        }
        return viewInflate;
    }
}

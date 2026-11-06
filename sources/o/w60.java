package o;

import android.widget.CompoundButton;
import com.teamviewer.remotecontrolviewlib.preferences.TVRemoteCursorPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVRemoveWallpaperPreference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w60 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ we8 b;

    public /* synthetic */ w60(we8 we8Var, byte b) {
        this.a = b;
        this.b = we8Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        byte b = this.a;
        we8 we8Var = this.b;
        switch (b) {
            case 0:
                compoundButton.getClass();
                ((x60) we8Var).A0(z);
                break;
            case 1:
                compoundButton.getClass();
                ed3 ed3Var = ((TVRemoteCursorPreference) we8Var).h0;
                if (ed3Var != null) {
                    ed3Var.U(z);
                }
                break;
            default:
                compoundButton.getClass();
                ((TVRemoveWallpaperPreference) we8Var).h0.C0(z);
                break;
        }
    }
}

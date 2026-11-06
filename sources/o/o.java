package o;

import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.google.android.material.button.MaterialButton;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Observer {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1616o;

    public /* synthetic */ o(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1616o = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void a(Object obj) {
        byte b = this.m;
        Object obj2 = this.f1616o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                RoundAccountPictureImageView roundAccountPictureImageView = (RoundAccountPictureImageView) obj3;
                q qVar = (q) obj2;
                String str = (String) obj;
                str.getClass();
                if (roundAccountPictureImageView != null) {
                    roundAccountPictureImageView.setPlaceHolder(qVar.B0());
                }
                if (str.length() <= 0 || roundAccountPictureImageView == null) {
                    return;
                }
                roundAccountPictureImageView.a(str, false);
                return;
            default:
                mr1 mr1Var = (mr1) obj3;
                MaterialButton materialButton = (MaterialButton) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    if (materialButton != null) {
                        materialButton.setVisibility(8);
                    }
                    if (materialButton != null) {
                        materialButton.setOnClickListener(null);
                        return;
                    }
                    return;
                }
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                long j = mr1Var.q0;
                tu1 tu1Var = new tu1();
                Bundle bundle = new Bundle();
                bundle.putLong("BuddyId", j);
                tu1Var.u0(bundle);
                if (materialButton != null) {
                    materialButton.setVisibility(0);
                }
                if (materialButton != null) {
                    materialButton.setOnClickListener(new y6(mr1Var, tu1Var, (byte) 5));
                    return;
                }
                return;
        }
    }
}

package o;

import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.remotecontrolviewlib.view.partnerlist.DeviceOptionsActionButton;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ du2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fv1 f458o;

    public /* synthetic */ bv1(fv1 fv1Var, du2 du2Var) {
        this.m = (byte) 2;
        this.f458o = fv1Var;
        this.n = du2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        fv1 fv1Var = this.f458o;
        du2 du2Var = this.n;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton = du2Var.s;
                bool.getClass();
                deviceOptionsActionButton.setVisibility(ka0.v(bool.booleanValue()));
                fv1Var.H0();
                return f88Var;
            case 1:
                Boolean bool2 = (Boolean) obj;
                int i2 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton2 = du2Var.k;
                bool2.getClass();
                deviceOptionsActionButton2.setVisibility(ka0.v(bool2.booleanValue()));
                fv1Var.H0();
                return f88Var;
            case 2:
                RoundAccountPictureImageView roundAccountPictureImageView = du2Var.c;
                String str = (String) obj;
                t33 t33Var = fv1Var.v0;
                if (t33Var == null) {
                    im3.e0("type");
                    throw null;
                }
                if (dv1.a[t33Var.ordinal()] == 1) {
                    roundAccountPictureImageView.setPlaceHolder(R.drawable.device_icon);
                } else {
                    roundAccountPictureImageView.setPlaceHolder(R.drawable.user_placeholder_image);
                    roundAccountPictureImageView.a(str, false);
                }
                return f88Var;
            case 3:
                Boolean bool3 = (Boolean) obj;
                int i3 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton3 = du2Var.f;
                bool3.getClass();
                deviceOptionsActionButton3.setVisibility(ka0.v(bool3.booleanValue()));
                du2Var.g.setVisibility(ka0.v(bool3.booleanValue()));
                fv1Var.H0();
                return f88Var;
            case 4:
                Boolean bool4 = (Boolean) obj;
                int i4 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton4 = du2Var.h;
                bool4.getClass();
                deviceOptionsActionButton4.setVisibility(ka0.v(bool4.booleanValue()));
                du2Var.i.setVisibility(ka0.v(bool4.booleanValue()));
                fv1Var.H0();
                return f88Var;
            case 5:
                Boolean bool5 = (Boolean) obj;
                int i5 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton5 = du2Var.j;
                bool5.getClass();
                deviceOptionsActionButton5.setVisibility(ka0.v(bool5.booleanValue()));
                fv1Var.H0();
                return f88Var;
            case 6:
                Boolean bool6 = (Boolean) obj;
                int i6 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton6 = du2Var.f655o;
                bool6.getClass();
                deviceOptionsActionButton6.setVisibility(ka0.v(bool6.booleanValue()));
                fv1Var.H0();
                return f88Var;
            default:
                Boolean bool7 = (Boolean) obj;
                int i7 = fv1.O0;
                DeviceOptionsActionButton deviceOptionsActionButton7 = du2Var.d;
                bool7.getClass();
                deviceOptionsActionButton7.setVisibility(ka0.v(bool7.booleanValue()));
                fv1Var.H0();
                return f88Var;
        }
    }

    public /* synthetic */ bv1(du2 du2Var, fv1 fv1Var, byte b) {
        this.m = b;
        this.n = du2Var;
        this.f458o = fv1Var;
    }
}

package o;

import android.os.CountDownTimer;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class fk7 extends CountDownTimer {
    public final /* synthetic */ gk7 a;
    public final /* synthetic */ n02 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk7(gk7 gk7Var, n02 n02Var, String str, long j) {
        super(j, 1000L);
        this.a = gk7Var;
        this.b = n02Var;
        this.c = str;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ye4.a("TVDialogFragment", "Dialog timed out...");
        p02 p02Var = p02.Negative;
        gk7 gk7Var = this.a;
        gk7Var.G0(p02Var);
        gk7Var.A0();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        gk7 gk7Var = this.a;
        gk7Var.b1--;
        od odVar = this.b.b;
        Button buttonK = odVar != null ? odVar.k(-2) : null;
        if (buttonK != null) {
            buttonK.setText(gk7Var.F0(this.c));
        }
    }
}

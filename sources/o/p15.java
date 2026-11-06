package o;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes.dex */
public final class p15 extends CountDownTimer {
    public final /* synthetic */ q15 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p15(long j, q15 q15Var) {
        super(j, 1000L);
        this.a = q15Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        q15 q15Var = this.a;
        if (im3.n(q15Var.u.getValue(), Boolean.TRUE)) {
            q15Var.u.setValue(Boolean.FALSE);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}

package o;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes.dex */
public final class jp0 extends CountDownTimer {
    public final long a;
    public final /* synthetic */ kp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(kp0 kp0Var, long j, long j2) {
        super(j, j);
        this.b = kp0Var;
        this.a = j2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.b.s(this.a);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}

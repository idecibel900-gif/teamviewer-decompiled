package o;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class wq0 extends i67 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void K(int i) {
    }

    @Override // o.i67
    public final void v(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                bq7 bq7Var = (bq7) this.b;
                bq7Var.d = true;
                aq7 aq7Var = (aq7) bq7Var.e.get();
                if (aq7Var != null) {
                    aq7Var.a();
                }
                break;
        }
    }

    @Override // o.i67
    public final void w(Typeface typeface, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                ar0 ar0Var = chip.q;
                chip.setText(ar0Var.O0 ? ar0Var.Q : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    bq7 bq7Var = (bq7) obj;
                    bq7Var.d = true;
                    aq7 aq7Var = (aq7) bq7Var.e.get();
                    if (aq7Var != null) {
                        aq7Var.a();
                    }
                    break;
                }
                break;
        }
    }
}

package o;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class gs7 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ TextInputLayout n;

    public /* synthetic */ gs7(TextInputLayout textInputLayout, byte b) {
        this.m = b;
        this.n = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        TextInputLayout textInputLayout = this.n;
        switch (b) {
            case 0:
                CheckableImageButton checkableImageButton = textInputLayout.t0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.q.requestLayout();
                break;
        }
    }
}

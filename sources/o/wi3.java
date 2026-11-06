package o;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;

/* JADX INFO: loaded from: classes.dex */
public final class wi3 extends InputConnectionWrapper {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi3(KeyboardInputView keyboardInputView, h92 h92Var) {
        super(h92Var, true);
        this.b = keyboardInputView;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        db1 xc0Var;
        switch (this.a) {
            case 0:
                ar arVar = (ar) this.b;
                xk1 xk1Var = inputContentInfo == null ? null : new xk1((Object) new xk1((Object) inputContentInfo, (byte) 26), (byte) 27);
                ws wsVar = (ws) arVar.n;
                if ((i & 1) != 0) {
                    try {
                        ((InputContentInfo) ((xk1) xk1Var.n).n).requestPermission();
                        InputContentInfo inputContentInfo2 = (InputContentInfo) ((xk1) xk1Var.n).n;
                        bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
                    } catch (Exception e) {
                        io.sentry.android.core.v0.l("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                    }
                } else {
                    bundle2 = bundle;
                }
                InputContentInfo inputContentInfo3 = (InputContentInfo) ((xk1) xk1Var.n).n;
                ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
                if (Build.VERSION.SDK_INT >= 31) {
                    xc0Var = new xc0(clipData, 2);
                } else {
                    eb1 eb1Var = new eb1();
                    eb1Var.n = clipData;
                    eb1Var.f699o = (byte) 2;
                    xc0Var = eb1Var;
                }
                xc0Var.o(inputContentInfo3.getLinkUri());
                xc0Var.setExtras(bundle2);
                if (be8.i(wsVar, xc0Var.build()) == null) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            default:
                return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        switch (this.a) {
            case 1:
                KeyboardInputView keyboardInputView = (KeyboardInputView) this.b;
                dd3 dd3Var = keyboardInputView.t;
                if (dd3Var == null) {
                    ye4.c("KeyboardInputView", "Session keyboard is not available");
                    return super.deleteSurroundingText(i, i2);
                }
                Editable text = keyboardInputView.getText();
                if (text != null && text.length() != 0) {
                    return super.deleteSurroundingText(i, i2);
                }
                KeyboardInputView.c(dd3Var, i - i2);
                return true;
            default:
                return super.deleteSurroundingText(i, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi3(InputConnection inputConnection, ar arVar) {
        super(inputConnection, false);
        this.b = arVar;
    }
}

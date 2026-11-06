package com.teamviewer.remotecontrollib.gui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import o.dd3;
import o.dg8;
import o.gb3;
import o.h92;
import o.hc0;
import o.im3;
import o.nt6;
import o.oh3;
import o.wi3;
import o.ws;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class KeyboardInputView extends ws {
    public dd3 t;
    public nt6 u;
    public gb3 v;
    public CharSequence w;
    public boolean x;
    public final hc0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.w = "";
        hc0 hc0Var = new hc0(this, (byte) 5);
        this.y = hc0Var;
        removeTextChangedListener(hc0Var);
        setText("");
        this.w = "";
        addTextChangedListener(hc0Var);
    }

    public static void c(dd3 dd3Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            oh3 oh3Var = (oh3) dd3Var;
            dg8 dg8Var = dg8.VK_BACK;
            oh3Var.g(dg8Var, false, 0);
            oh3Var.g(dg8Var, true, 0);
        }
    }

    @Override // o.ws, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        return new wi3(this, (h92) super.onCreateInputConnection(editorInfo));
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        nt6 nt6Var = this.u;
        if (nt6Var == null) {
            ye4.c("KeyboardInputView", "client or keylistener is null");
            return false;
        }
        if (i == 4 || i == 82) {
            return super.onKeyDown(i, keyEvent);
        }
        this.x = i == 66 || i == 160;
        if (nt6Var.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        nt6 nt6Var;
        nt6 nt6Var2;
        Boolean bool;
        keyEvent.getClass();
        if (this.u == null) {
            ye4.c("KeyboardInputView", "keylistener is null");
            return false;
        }
        if (i != 4 || keyEvent.getAction() != 0) {
            if (!keyEvent.isAltPressed() || keyEvent.isCtrlPressed() || keyEvent.isMetaPressed()) {
                if (keyEvent.getAction() == 0) {
                    nt6Var2 = this.u;
                    if (nt6Var2 != null || !nt6Var2.onKeyDown(i, keyEvent)) {
                        return false;
                    }
                } else if (keyEvent.getAction() == 1) {
                    this.x = true;
                    nt6Var = this.u;
                    if (nt6Var != null || !nt6Var.onKeyUp(i, keyEvent)) {
                        return false;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
        gb3 gb3Var = this.v;
        if (gb3Var != null) {
            ((M2MClientActivity) gb3Var).J();
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (!im3.n(bool, Boolean.TRUE)) {
            if (!keyEvent.isAltPressed()) {
            }
            if (keyEvent.getAction() == 0) {
                nt6Var2 = this.u;
                if (nt6Var2 != null) {
                }
                return false;
            }
            if (keyEvent.getAction() == 1) {
                this.x = true;
                nt6Var = this.u;
                if (nt6Var != null) {
                }
                return false;
            }
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        nt6 nt6Var = this.u;
        if (nt6Var == null) {
            ye4.c("KeyboardInputView", "client or keylistener is null");
            return false;
        }
        if (i == 4 || i == 82) {
            return super.onKeyUp(i, keyEvent);
        }
        if (nt6Var.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void setKeyboardStateChangeListener(gb3 gb3Var) {
        this.v = gb3Var;
    }

    public final void setTVKeyListener(nt6 nt6Var) {
        this.u = nt6Var;
    }

    public final void setTVKeyboard(dd3 dd3Var) {
        this.t = dd3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardInputView(Context context) {
        super(context);
        context.getClass();
        this.w = "";
        hc0 hc0Var = new hc0(this, (byte) 5);
        this.y = hc0Var;
        removeTextChangedListener(hc0Var);
        setText("");
        this.w = "";
        addTextChangedListener(hc0Var);
    }
}

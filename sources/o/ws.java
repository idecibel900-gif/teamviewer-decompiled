package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class ws extends EditText {
    public final r8 m;
    public final ut n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cj3 f2440o;
    public final tt7 p;
    public final cj3 q;
    public vs r;
    public tt s;

    public ws(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        wt7.a(this, getContext());
        r8 r8Var = new r8(this);
        this.m = r8Var;
        r8Var.x(attributeSet, R.attr.editTextStyle);
        ut utVar = new ut(this);
        this.n = utVar;
        utVar.g(attributeSet, R.attr.editTextStyle);
        utVar.b();
        cj3 cj3Var = new cj3((byte) 20, false);
        cj3Var.n = this;
        this.f2440o = cj3Var;
        this.p = new tt7();
        cj3 cj3Var2 = new cj3((EditText) this);
        this.q = cj3Var2;
        cj3Var2.K(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerH = cj3Var2.H(keyListener);
        if (keyListenerH == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerH);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private vs getSuperCaller() {
        vs vsVar = this.r;
        if (vsVar != null) {
            return vsVar;
        }
        vs vsVar2 = new vs(this);
        this.r = vsVar2;
        return vsVar2;
    }

    public final gb1 b(gb1 gb1Var) {
        this.p.getClass();
        return tt7.a(this, gb1Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.b();
        }
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i67.D(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public tt getFontVariationSettingsManager() {
        tt ttVar = this.s;
        if (ttVar != null) {
            return ttVar;
        }
        tt ttVar2 = new tt(this, new zr(this, (byte) 1));
        this.s = ttVar2;
        return ttVar2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.u();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r8 r8Var = this.m;
        if (r8Var != null) {
            return r8Var.v();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.e();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.f();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        cj3 cj3Var;
        if (Build.VERSION.SDK_INT >= 28 || (cj3Var = this.f2440o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) cj3Var.f531o;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) cj3Var.n).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.n.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            vt1.L(editorInfo, getText());
        }
        qf0.P(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrG = be8.g(this)) != null) {
            editorInfo.contentMimeTypes = strArrG;
            inputConnectionOnCreateInputConnection = new wi3(inputConnectionOnCreateInputConnection, new ar(this, (byte) 13));
        }
        return this.q.L(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        db1 xc0Var;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && be8.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        xc0Var = new xc0(clipData, 3);
                    } else {
                        eb1 eb1Var = new eb1();
                        eb1Var.n = clipData;
                        eb1Var.f699o = (byte) 3;
                        xc0Var = eb1Var;
                    }
                    be8.i(this, xc0Var.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        eb1 eb1Var;
        db1 db1Var;
        int i2;
        xc0 xc0Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || be8.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                xc0Var = new xc0(primaryClip, 1);
            } else {
                eb1Var = new eb1();
                eb1Var.n = primaryClip;
                eb1Var.f699o = (byte) 1;
            }
            if (i == 16908322) {
                db1Var = eb1Var;
                db1Var = xc0Var;
                i2 = 0;
            } else {
                db1Var = eb1Var;
                db1Var = xc0Var;
                i2 = 1;
            }
            db1Var.q(i2);
            be8.i(this, db1Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.z();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.A(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i67.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.q.W(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.q.H(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.K(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r8 r8Var = this.m;
        if (r8Var != null) {
            r8Var.L(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ut utVar = this.n;
        utVar.l(colorStateList);
        utVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ut utVar = this.n;
        utVar.m(mode);
        utVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ut utVar = this.n;
        if (utVar != null) {
            utVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        cj3 cj3Var;
        if (Build.VERSION.SDK_INT >= 28 || (cj3Var = this.f2440o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            cj3Var.f531o = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        tt fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }

    public ws(Context context) {
        this(context, null, 0);
    }
}

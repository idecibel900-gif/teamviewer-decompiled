package com.teamviewer.remotecontrolviewlib.fragment.session;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.a65;
import o.c61;
import o.hc0;
import o.o61;
import o.r47;
import o.sg5;
import o.sk5;
import o.v6;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class PilotMarkerTextInputFieldView extends ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public Function1 C;
    public Function1 D;
    public Function0 E;
    public sk5 F;
    public final a65 G;

    /* JADX WARN: Illegal instructions before constructor call */
    public PilotMarkerTextInputFieldView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.m = new SparseArray();
        this.n = new ArrayList(4);
        this.f15o = new o61();
        this.p = 0;
        this.q = 0;
        this.r = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        byte b = 1;
        this.t = true;
        this.u = 257;
        this.v = null;
        this.w = null;
        this.x = -1;
        this.y = new HashMap();
        this.z = new SparseArray();
        this.A = new c61(this, this);
        i(attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pilot_marker_edit_text_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.pilotMarkerTextInput;
        EditText editText = (EditText) r47.s(viewInflate, R.id.pilotMarkerTextInput);
        if (editText != null) {
            i2 = R.id.sendButton;
            ImageView imageView = (ImageView) r47.s(viewInflate, R.id.sendButton);
            if (imageView != null) {
                i2 = R.id.textInputFieldBackground;
                View viewS = r47.s(viewInflate, R.id.textInputFieldBackground);
                if (viewS != null) {
                    this.G = new a65(editText, imageView, viewS);
                    byte b2 = 6;
                    editText.addTextChangedListener(new hc0(this, b2));
                    imageView.setOnClickListener(new p2(this, (byte) 14));
                    editText.setOnFocusChangeListener(new v6(this, b2));
                    editText.setOnEditorActionListener(new sg5(this, b));
                    return;
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final Function1 getOnMarkerTextChanged() {
        return this.C;
    }

    public final Function1 getOnMarkerTextConfirmed() {
        return this.D;
    }

    public final Function0 getOnSoftKeyboardOpened() {
        return this.E;
    }

    public final void setMaximumTextLength(int i) {
        a65 a65Var = this.G;
        if (a65Var != null) {
            ((EditText) a65Var.n).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public final void setOnMarkerTextChanged(Function1 function1) {
        this.C = function1;
    }

    public final void setOnMarkerTextConfirmed(Function1 function1) {
        this.D = function1;
    }

    public final void setOnSoftKeyboardOpened(Function0 function0) {
        this.E = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PilotMarkerTextInputFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PilotMarkerTextInputFieldView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

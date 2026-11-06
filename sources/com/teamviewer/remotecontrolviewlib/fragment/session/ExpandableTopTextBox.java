package com.teamviewer.remotecontrolviewlib.fragment.session;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import o.gk0;
import o.j93;
import o.kf2;
import o.lf2;
import o.r47;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandableTopTextBox extends FrameLayout {
    public final j93 m;
    public lf2 n;

    public ExpandableTopTextBox(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.expandable_top_text_box, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.content_text_view;
        TextView textView = (TextView) r47.s(viewInflate, R.id.content_text_view);
        if (textView != null) {
            i2 = R.id.digit_text_view;
            TextView textView2 = (TextView) r47.s(viewInflate, R.id.digit_text_view);
            if (textView2 != null) {
                i2 = R.id.expand_collapse_icon;
                ImageView imageView = (ImageView) r47.s(viewInflate, R.id.expand_collapse_icon);
                if (imageView != null) {
                    i2 = R.id.expandableTopTextBoxConstraintLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) r47.s(viewInflate, R.id.expandableTopTextBoxConstraintLayout);
                    if (constraintLayout != null) {
                        this.m = new j93(textView, textView2, imageView, constraintLayout, (byte) 17);
                        this.n = lf2.n;
                        setVisibility(8);
                        constraintLayout.getLayoutTransition().enableTransitionType(4);
                        setLayoutTransition(new LayoutTransition());
                        getLayoutTransition().enableTransitionType(4);
                        setOnClickListener(new p2(this, (byte) 10));
                        return;
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static final void a(ExpandableTopTextBox expandableTopTextBox) {
        lf2 lf2Var;
        int iOrdinal = expandableTopTextBox.n.ordinal();
        if (iOrdinal == 0) {
            lf2Var = lf2.n;
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            lf2Var = lf2.m;
        }
        expandableTopTextBox.setViewState(lf2Var);
    }

    private final void setViewState(lf2 lf2Var) {
        int i;
        int i2;
        this.n = lf2Var;
        j93 j93Var = this.m;
        TextView textView = (TextView) j93Var.n;
        int iOrdinal = lf2Var.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            i = Integer.MAX_VALUE;
        }
        textView.setMaxLines(i);
        ImageView imageView = (ImageView) j93Var.p;
        int iOrdinal2 = lf2Var.ordinal();
        if (iOrdinal2 == 0) {
            i2 = R.drawable.expandable_list_down_icon;
        } else {
            if (iOrdinal2 != 1) {
                gk0.s();
                return;
            }
            i2 = R.drawable.expandable_list_up_icon;
        }
        imageView.setImageResource(i2);
    }

    public final void setInfoText(kf2 kf2Var) {
        String str;
        kf2Var.getClass();
        String str2 = kf2Var.a;
        Long l = kf2Var.b;
        if (l == null || l.longValue() == 0) {
            str = null;
        } else {
            str = l + ". ";
        }
        j93 j93Var = this.m;
        ((TextView) j93Var.f1141o).setText(str);
        Integer num = kf2Var.c;
        ((TextView) j93Var.f1141o).setTextColor(num != null ? num.intValue() : getContext().getColor(R.color.expandable_top_text_box_text));
        ((TextView) j93Var.n).setText(str2);
        setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
        setViewState(lf2.n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTopTextBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTopTextBox(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}

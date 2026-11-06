package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class od extends ss implements DialogInterface {
    public final md s;

    public od(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, l(contextThemeWrapper, i));
        this.s = new md(getContext(), this, getWindow());
    }

    public static int l(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button k(int i) {
        md mdVar = this.s;
        if (i == -3) {
            return mdVar.f1461o;
        }
        if (i == -2) {
            return mdVar.l;
        }
        if (i == -1) {
            return mdVar.i;
        }
        mdVar.getClass();
        return null;
    }

    @Override // o.ss, o.py0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        md mdVar = this.s;
        mdVar.b.setContentView(mdVar.z);
        Context context = mdVar.a;
        Window window = mdVar.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = mdVar.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !md.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (mdVar.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (mdVar.f != null) {
                ((LinearLayout.LayoutParams) ((u94) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = md.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = md.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = md.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        mdVar.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        mdVar.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        mdVar.v = textView;
        if (textView != null) {
            CharSequence charSequence = mdVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                mdVar.r.removeView(mdVar.v);
                if (mdVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) mdVar.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(mdVar.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(mdVar.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        mdVar.i = button;
        o6 o6Var = mdVar.G;
        button.setOnClickListener(o6Var);
        boolean zIsEmpty = TextUtils.isEmpty(mdVar.j);
        Button button2 = mdVar.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(mdVar.j);
            mdVar.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        mdVar.l = button3;
        button3.setOnClickListener(o6Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(mdVar.m);
        Button button4 = mdVar.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(mdVar.m);
            mdVar.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        mdVar.f1461o = button5;
        button5.setOnClickListener(o6Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(mdVar.p);
        Button button6 = mdVar.f1461o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(mdVar.p);
            mdVar.f1461o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = mdVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = mdVar.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = mdVar.f1461o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (mdVar.w != null) {
            viewGroupB.addView(mdVar.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            mdVar.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(mdVar.d) || !mdVar.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                mdVar.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                mdVar.u = textView2;
                textView2.setText(mdVar.d);
                Drawable drawable = mdVar.s;
                if (drawable != null) {
                    mdVar.t.setImageDrawable(drawable);
                } else {
                    mdVar.u.setPadding(mdVar.t.getPaddingLeft(), mdVar.t.getPaddingTop(), mdVar.t.getPaddingRight(), mdVar.t.getPaddingBottom());
                    mdVar.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = mdVar.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (mdVar.e == null && mdVar.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = mdVar.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.m, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.n);
        }
        if (!z2) {
            View view2 = mdVar.f;
            if (view2 == null) {
                view2 = mdVar.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = be8.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = mdVar.f;
        if (alertController$RecycleListView2 == null || (listAdapter = mdVar.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = mdVar.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.s.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.s.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // o.ss, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        md mdVar = this.s;
        mdVar.d = charSequence;
        TextView textView = mdVar.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
        mdVar.c.setTitle(charSequence);
    }
}

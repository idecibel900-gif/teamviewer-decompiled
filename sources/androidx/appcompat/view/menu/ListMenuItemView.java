package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ep3;
import o.iq4;
import o.jp4;
import o.pp4;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements iq4, AbsListView.SelectionBoundsAdjuster {
    public final boolean A;
    public LayoutInflater B;
    public boolean C;
    public pp4 m;
    public ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RadioButton f0o;
    public TextView p;
    public CheckBox q;
    public TextView r;
    public ImageView s;
    public ImageView t;
    public LinearLayout u;
    public final Drawable v;
    public final int w;
    public final Context x;
    public boolean y;
    public final Drawable z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ep3 ep3VarX = ep3.x(getContext(), attributeSet, zz5.r, R.attr.listMenuViewStyle);
        this.v = ep3VarX.l(5);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        this.w = typedArray.getResourceId(1, -1);
        this.y = typedArray.getBoolean(7, false);
        this.x = context;
        this.z = ep3VarX.l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.A = typedArrayObtainStyledAttributes.hasValue(0);
        ep3VarX.B();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.B;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.B = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // o.iq4
    public final void a(pp4 pp4Var) {
        boolean z;
        int i;
        String string;
        this.m = pp4Var;
        boolean zIsVisible = pp4Var.isVisible();
        jp4 jp4Var = pp4Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(pp4Var.e);
        setCheckable(pp4Var.isCheckable());
        if (jp4Var.q()) {
            if ((jp4Var.p() ? pp4Var.j : pp4Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        jp4Var.p();
        if (z) {
            pp4 pp4Var2 = this.m;
            jp4 jp4Var2 = pp4Var2.n;
            if (jp4Var2.q()) {
                i = (jp4Var2.p() ? pp4Var2.j : pp4Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.r;
            pp4 pp4Var3 = this.m;
            jp4 jp4Var3 = pp4Var3.n;
            Context context = jp4Var3.a;
            char c = jp4Var3.p() ? pp4Var3.j : pp4Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = jp4Var3.p() ? pp4Var3.k : pp4Var3.i;
                pp4.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                pp4.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                pp4.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                pp4.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                pp4.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                pp4.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.r.getVisibility() != i) {
            this.r.setVisibility(i);
        }
        setIcon(pp4Var.getIcon());
        setEnabled(pp4Var.isEnabled());
        setSubMenuArrowVisible(pp4Var.hasSubMenu());
        setContentDescription(pp4Var.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.t;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.t.getLayoutParams();
        rect.top = this.t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.iq4
    public pp4 getItemData() {
        return this.m;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.v);
        TextView textView = (TextView) findViewById(R.id.title);
        this.p = textView;
        int i = this.w;
        if (i != -1) {
            textView.setTextAppearance(this.x, i);
        }
        this.r = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.z);
        }
        this.t = (ImageView) findViewById(R.id.group_divider);
        this.u = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.n != null && this.y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.n.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.f0o == null && this.q == null) {
            return;
        }
        if ((this.m.x & 4) != 0) {
            if (this.f0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f0o = radioButton;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f0o;
            compoundButton2 = this.q;
            compoundButton3 = compoundButton2;
        } else {
            if (this.q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.q = checkBox;
                LinearLayout linearLayout2 = this.u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.q;
            compoundButton2 = this.f0o;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.f0o;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.m.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.m.x & 4) != 0) {
            if (this.f0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f0o = radioButton;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f0o;
        } else {
            if (this.q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.q = checkBox;
                LinearLayout linearLayout2 = this.u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.q;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.C = z;
        this.y = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility((this.A || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        jp4 jp4Var = this.m.n;
        boolean z = this.C;
        if (z || this.y) {
            ImageView imageView = this.n;
            if (imageView == null && drawable == null && !this.y) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.n = imageView2;
                LinearLayout linearLayout = this.u;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.y) {
                this.n.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.n;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.n.getVisibility() != 0) {
                this.n.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.p;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.p.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.p.getVisibility() != 0) {
                this.p.setVisibility(0);
            }
        }
    }
}

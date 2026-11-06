package o;

import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class n02 {
    public final Context a;
    public od b;
    public int c;
    public CharSequence d;
    public CharSequence e;
    public boolean f;
    public View g;
    public Integer h;
    public boolean i;
    public String j;
    public String k;
    public lh7 l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m02 f1529o;
    public String p;
    public String q;
    public m02 r;
    public boolean s;
    public final int t;
    public final int u;

    public n02(Context context) {
        context.getClass();
        this.a = context;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.material_dialog_padding_top);
        this.i = true;
        this.s = true;
        this.t = context.getResources().getDimensionPixelSize(R.dimen.material_dialog_padding_between_content);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
        this.u = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [o.l02] */
    public final od a() {
        Context context = this.a;
        nd ndVar = new nd(context);
        jd jdVar = (jd) ndVar.f1562o;
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            jdVar.d = charSequence;
        }
        View view = this.g;
        View view2 = view;
        if (view == null) {
            Integer num = this.h;
            if (num != null) {
                View viewInflate = View.inflate(context, num.intValue(), null);
                this.g = viewInflate;
                view2 = viewInflate;
            } else {
                view2 = null;
            }
        }
        CharSequence charSequence2 = this.e;
        final byte b = 0;
        final byte b2 = 1;
        View view3 = view2;
        if (charSequence2 != null) {
            boolean z = this.f;
            int i = this.t;
            if (z) {
                TextView textView = new TextView(context);
                textView.setText(charSequence2);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setLinksClickable(true);
                if (view2 != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, 0, 0, i);
                    textView.setLayoutParams(layoutParams);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.addView(textView);
                    linearLayout.addView(view2);
                    view3 = linearLayout;
                } else {
                    view3 = textView;
                }
            } else {
                jdVar.f = charSequence2;
                this.c = i;
            }
        }
        if (view3 != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(view3);
            if (this.i) {
                view3 = view2;
                int i2 = this.u;
                frameLayout.setPadding(i2, this.c, i2, i2);
            }
            view3 = view2;
            jdVar.r = frameLayout;
        }
        view3 = view2;
        String str = this.k;
        if (str != null) {
            final byte b3 = 2;
            ?? r3 = new DialogInterface.OnClickListener(this) { // from class: o.l02
                public final /* synthetic */ n02 n;

                {
                    this.n = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    byte b4 = b3;
                    n02 n02Var = this.n;
                    switch (b4) {
                        case 0:
                            m02 m02Var = n02Var.f1529o;
                            if (m02Var != null) {
                                m02Var.l();
                            }
                            break;
                        case 1:
                            m02 m02Var2 = n02Var.r;
                            if (m02Var2 != null) {
                                m02Var2.l();
                            }
                            break;
                        default:
                            lh7 lh7Var = n02Var.l;
                            if (lh7Var != null) {
                                lh7Var.l();
                            }
                            break;
                    }
                }
            };
            jdVar.k = str;
            jdVar.l = r3;
        }
        String str2 = this.n;
        if (str2 != null) {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: o.l02
                public final /* synthetic */ n02 n;

                {
                    this.n = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    byte b4 = b;
                    n02 n02Var = this.n;
                    switch (b4) {
                        case 0:
                            m02 m02Var = n02Var.f1529o;
                            if (m02Var != null) {
                                m02Var.l();
                            }
                            break;
                        case 1:
                            m02 m02Var2 = n02Var.r;
                            if (m02Var2 != null) {
                                m02Var2.l();
                            }
                            break;
                        default:
                            lh7 lh7Var = n02Var.l;
                            if (lh7Var != null) {
                                lh7Var.l();
                            }
                            break;
                    }
                }
            };
            jdVar.i = str2;
            jdVar.j = onClickListener;
        }
        String str3 = this.q;
        if (str3 != null) {
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: o.l02
                public final /* synthetic */ n02 n;

                {
                    this.n = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    byte b4 = b2;
                    n02 n02Var = this.n;
                    switch (b4) {
                        case 0:
                            m02 m02Var = n02Var.f1529o;
                            if (m02Var != null) {
                                m02Var.l();
                            }
                            break;
                        case 1:
                            m02 m02Var2 = n02Var.r;
                            if (m02Var2 != null) {
                                m02Var2.l();
                            }
                            break;
                        default:
                            lh7 lh7Var = n02Var.l;
                            if (lh7Var != null) {
                                lh7Var.l();
                            }
                            break;
                    }
                }
            };
            jdVar.g = str3;
            jdVar.h = onClickListener2;
        }
        jdVar.m = this.s;
        od odVarE = ndVar.e();
        this.b = odVarE;
        Button buttonK = odVarE.k(-3);
        if (buttonK != null) {
            buttonK.setContentDescription(this.j);
        }
        od odVar = this.b;
        Button buttonK2 = odVar != null ? odVar.k(-2) : null;
        if (buttonK2 != null) {
            buttonK2.setContentDescription(this.m);
        }
        od odVar2 = this.b;
        Button buttonK3 = odVar2 != null ? odVar2.k(-1) : null;
        if (buttonK3 != null) {
            buttonK3.setContentDescription(this.p);
        }
        od odVar3 = this.b;
        odVar3.getClass();
        return odVar3;
    }
}

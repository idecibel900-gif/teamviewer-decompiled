package com.teamviewer.remotecontrolviewlib.inapppurchase;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.p2;
import java.util.WeakHashMap;
import o.bb5;
import o.be8;
import o.bt1;
import o.cd1;
import o.ck3;
import o.gk6;
import o.h57;
import o.hk0;
import o.id3;
import o.im3;
import o.ir;
import o.j16;
import o.j20;
import o.j93;
import o.r10;
import o.sd8;
import o.sr;
import o.w05;
import o.ye4;
import o.zf3;

/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseActivity extends j20 implements id3 {
    public static final /* synthetic */ int S = 0;
    public View Q;
    public View R;

    @Override // o.j20
    public final bb5 M(Enum r5) {
        ((w05) r5).getClass();
        zf3 zf3Var = new zf3();
        Uri uri = (Uri) bt1.C(getIntent(), "BUNDLE_KEY_LOGIN_URI", Uri.class);
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        int i = sharedPreferences.getInt("CURRENT_TAB", 1);
        Bundle bundle = new Bundle();
        bundle.putParcelable("BUNDLE_KEY_LOGIN_URI", uri);
        w05.f2361o.getClass();
        bundle.putSerializable("current_navigation_category", ir.i(i));
        zf3Var.u0(bundle);
        return zf3Var;
    }

    @Override // o.j20
    public final j16 N() {
        return new j16();
    }

    @Override // o.id3
    public final void a() {
        TextView textView = (TextView) findViewById(R.id.arrow_back_label);
        if (textView != null) {
            textView.setTextSize(22.0f);
        }
        TextView textView2 = (TextView) findViewById(R.id.central_label);
        if (textView2 != null) {
            textView2.setTextSize(22.0f);
        }
    }

    @Override // o.id3
    public final void f(Integer num, boolean z, Integer num2, boolean z2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.toolbar_layout);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.arrow_back_icon);
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
            imageView.setOnClickListener(new p2(this, (byte) 11));
        }
        TextView textView = (TextView) findViewById(R.id.arrow_back_label);
        if (textView != null) {
            if (num != null) {
                textView.setText(getString(num.intValue()));
            }
            textView.setVisibility(num != null ? 0 : 8);
        }
        TextView textView2 = (TextView) findViewById(R.id.central_label);
        if (textView2 != null) {
            if (num2 != null) {
                textView2.setText(getString(num2.intValue()));
            }
            textView2.setVisibility(num2 == null ? 8 : 0);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.tv_logo);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.AppTheme);
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(R.id.activity_main);
        hk0 hk0Var = new hk0((byte) 23);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewFindViewById, hk0Var);
        I((Toolbar) findViewById(R.id.toolbar));
        ck3 ck3VarH = H();
        if (ck3VarH == null && !new j93(this).W()) {
            ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
            ck3VarH = null;
        }
        boolean z = false;
        if (ck3VarH != null) {
            ck3VarH.n0(false);
        }
        P(bundle);
        this.Q = findViewById(R.id.navigation_container);
        this.R = findViewById(R.id.navigation_container_shadow);
        View view = this.Q;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.R;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (c().b) {
            return;
        }
        c().b(new r10((byte) 1, this, z));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        c().d();
        return true;
    }

    @Override // o.xc3
    public final void q(gk6 gk6Var, boolean z) {
        View viewFindViewById = findViewById(R.id.app_bar_layout);
        viewFindViewById.getClass();
        ViewGroup.LayoutParams layoutParams = ((AppBarLayout) viewFindViewById).getLayoutParams();
        layoutParams.getClass();
        cd1 cd1Var = (cd1) layoutParams;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        ViewGroup.LayoutParams layoutParams2 = collapsingToolbarLayout != null ? collapsingToolbarLayout.getLayoutParams() : null;
        layoutParams2.getClass();
        ((ViewGroup.MarginLayoutParams) cd1Var).height = -2;
        ((sr) layoutParams2).a = 0;
    }
}

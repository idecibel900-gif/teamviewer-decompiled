package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;
import com.teamviewer.libs.materialtoolbar.fab.ToolbarItemViewFab;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/yk5;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yk5 extends ut2 {
    public cl5 p0;
    public xk1 q0;
    public int r0;
    public nd3 s0;
    public final xk5 t0 = new xk5(this);
    public final xk5 u0 = new xk5(this);

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            this.r0 = bundle2.getInt("PilotSessionContainerFragment_sessionId");
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        LayoutInflater layoutInflaterD0 = this.Z;
        if (layoutInflaterD0 == null) {
            layoutInflaterD0 = d0(null);
            this.Z = layoutInflaterD0;
        }
        View viewInflate = layoutInflaterD0.inflate(R.layout.fragment_pilot_session_container, viewGroup, false);
        int i = R.id.session_container;
        if (((FrameLayout) r47.s(viewInflate, R.id.session_container)) != null) {
            i = R.id.sessionToolbar;
            ToolbarViewMovable toolbarViewMovable = (ToolbarViewMovable) r47.s(viewInflate, R.id.sessionToolbar);
            if (toolbarViewMovable != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.q0 = new xk1(constraintLayout, toolbarViewMovable, (byte) 21);
                constraintLayout.getClass();
                return constraintLayout;
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.ut2
    public final void b0() {
        this.S = true;
        this.q0 = null;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        ut2 ut2VarE = D().E(R.id.session_container);
        final byte b = 1;
        Object obj = ut2VarE;
        if (ut2VarE == null) {
            int i = this.r0;
            Bundle bundle2 = new Bundle(3);
            bundle2.putInt("sessionId", i);
            bundle2.putString("audioPermissionSnackbarKey", "KEY_SHOW_AUDIO_PERMISSION_SNACKBAR");
            bundle2.putBoolean("removeMarkersOfAllParticipants", true);
            bundle2.putBoolean("requestMicrophonePermission", true);
            zf8 zf8Var = new zf8();
            zf8Var.u0(bundle2);
            su2 su2VarD = D();
            su2VarD.getClass();
            w10 w10Var = new w10(su2VarD);
            w10Var.k(R.id.session_container, zf8Var, null);
            w10Var.f();
            obj = zf8Var;
        }
        if (obj instanceof nd3) {
            nd3 nd3Var = (nd3) obj;
            this.s0 = nd3Var;
            xk5 xk5Var = this.u0;
            xk5Var.getClass();
            ((zf8) nd3Var).A0 = xk5Var;
        }
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return;
        }
        Resources resources = r0().getResources();
        resources.getClass();
        byte b2 = 2;
        dl5 dl5Var = new dl5(new e83(b, this.r0, resources), (byte) 2);
        ve8 ve8VarO = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(cl5.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        cl5 cl5Var = (cl5) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.p0 = cl5Var;
        xk1 xk1Var = this.q0;
        if (xk1Var != null) {
            ToolbarViewMovable toolbarViewMovable = (ToolbarViewMovable) xk1Var.n;
            LayoutInflater layoutInflaterD0 = this.Z;
            if (layoutInflaterD0 == null) {
                layoutInflaterD0 = d0(null);
                this.Z = layoutInflaterD0;
            }
            final tz7 tz7Var = toolbarViewMovable.n;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            tz7Var.setLayoutParams(layoutParams);
            nw4 nw4Var = cl5Var.f2259o;
            final byte b3 = 0;
            View viewInflate = layoutInflaterD0.inflate(R.layout.toolbar_fab_main, (ViewGroup) tz7Var, false);
            viewInflate.getClass();
            tz7Var.n = viewInflate;
            viewInflate.setOnClickListener(new io.sentry.android.core.p2(cl5Var, (byte) 18));
            xp5 xp5Var = cl5Var.r;
            ArrayList arrayList = cl5Var.p;
            ArrayList<oz7> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                xp5Var.invoke(obj2);
                if (Boolean.TRUE.booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            for (oz7 oz7Var : arrayList2) {
                boolean zX0 = cl5Var.X0();
                oz7Var.getClass();
                View viewInflate2 = layoutInflaterD0.inflate(R.layout.toolbar_fab_mini, (ViewGroup) tz7Var, false);
                viewInflate2.getClass();
                final ToolbarItemViewFab toolbarItemViewFab = (ToolbarItemViewFab) viewInflate2;
                toolbarItemViewFab.C = oz7Var;
                toolbarItemViewFab.D = !zX0;
                oz7Var.c.observe(this, new rz7(new Function1() { // from class: o.pz7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        ToolbarItemViewFab toolbarItemViewFab2 = toolbarItemViewFab;
                        switch (b4) {
                            case 0:
                                toolbarItemViewFab2.getImageView().setImageDrawable((Drawable) obj3);
                                break;
                            default:
                                Boolean bool = (Boolean) obj3;
                                ImageView imageView = toolbarItemViewFab2.getImageView();
                                bool.getClass();
                                imageView.setEnabled(bool.booleanValue());
                                break;
                        }
                        return f88Var;
                    }
                }, b3));
                oz7Var.d.observe(this, new rz7(new py5((Object) nw4Var, (Object) toolbarItemViewFab, (byte) 23), b3));
                oz7Var.e.observe(this, new rz7(new Function1() { // from class: o.pz7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b4 = b;
                        f88 f88Var = f88.a;
                        ToolbarItemViewFab toolbarItemViewFab2 = toolbarItemViewFab;
                        switch (b4) {
                            case 0:
                                toolbarItemViewFab2.getImageView().setImageDrawable((Drawable) obj3);
                                break;
                            default:
                                Boolean bool = (Boolean) obj3;
                                ImageView imageView = toolbarItemViewFab2.getImageView();
                                bool.getClass();
                                imageView.setEnabled(bool.booleanValue());
                                break;
                        }
                        return f88Var;
                    }
                }, b3));
                toolbarItemViewFab.getImageView().setOnClickListener(new io.sentry.android.core.p2(oz7Var, (byte) 19));
                tz7Var.addView(toolbarItemViewFab.getView());
                tz7Var.m.add(toolbarItemViewFab);
            }
            View view2 = tz7Var.n;
            if (view2 != null) {
                tz7Var.addView(view2);
            }
            cl5Var.q = true;
            nw4Var.observe(this, new rz7(new Function1() { // from class: o.qz7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    sz7 sz7Var = tz7Var;
                    Boolean bool = (Boolean) obj3;
                    switch (b4) {
                        case 0:
                            if (!bool.booleanValue()) {
                                tz7 tz7Var2 = (tz7) sz7Var;
                                View toolbarMainItemView = tz7Var2.getToolbarMainItemView();
                                toolbarMainItemView.getClass();
                                ((ImageView) toolbarMainItemView).setImageResource(R.drawable.ic_materialtoolbar_arrow_up);
                                Iterator<T> it = tz7Var2.getToolbarItemViews().iterator();
                                while (it.hasNext()) {
                                    ((kd3) it.next()).a();
                                }
                            } else {
                                tz7 tz7Var3 = (tz7) sz7Var;
                                View toolbarMainItemView2 = tz7Var3.getToolbarMainItemView();
                                toolbarMainItemView2.getClass();
                                ((ImageView) toolbarMainItemView2).setImageResource(R.drawable.ic_materialtoolbar_arrow_down);
                                Iterator<T> it2 = tz7Var3.getToolbarItemViews().iterator();
                                while (it2.hasNext()) {
                                    ((kd3) it2.next()).b();
                                }
                            }
                            break;
                        default:
                            sz7Var.setVisibility(bool.booleanValue() ? 0 : 4);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            cl5Var.n.observe(this, new rz7(new Function1() { // from class: o.qz7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    byte b4 = b;
                    f88 f88Var = f88.a;
                    sz7 sz7Var = tz7Var;
                    Boolean bool = (Boolean) obj3;
                    switch (b4) {
                        case 0:
                            if (!bool.booleanValue()) {
                                tz7 tz7Var2 = (tz7) sz7Var;
                                View toolbarMainItemView = tz7Var2.getToolbarMainItemView();
                                toolbarMainItemView.getClass();
                                ((ImageView) toolbarMainItemView).setImageResource(R.drawable.ic_materialtoolbar_arrow_up);
                                Iterator<T> it = tz7Var2.getToolbarItemViews().iterator();
                                while (it.hasNext()) {
                                    ((kd3) it.next()).a();
                                }
                            } else {
                                tz7 tz7Var3 = (tz7) sz7Var;
                                View toolbarMainItemView2 = tz7Var3.getToolbarMainItemView();
                                toolbarMainItemView2.getClass();
                                ((ImageView) toolbarMainItemView2).setImageResource(R.drawable.ic_materialtoolbar_arrow_down);
                                Iterator<T> it2 = tz7Var3.getToolbarItemViews().iterator();
                                while (it2.hasNext()) {
                                    ((kd3) it2.next()).b();
                                }
                            }
                            break;
                        default:
                            sz7Var.setVisibility(bool.booleanValue() ? 0 : 4);
                            break;
                    }
                    return f88Var;
                }
            }, b3));
            toolbarViewMovable.addView(tz7Var);
            Context context = toolbarViewMovable.getContext();
            context.getClass();
            tz7Var.setDragPointOnTouchListener(new wz7(toolbarViewMovable, context));
            tz7Var.addOnLayoutChangeListener(new io.sentry.android.replay.g0(toolbarViewMovable, b2));
            toolbarViewMovable.getViewTreeObserver().addOnGlobalLayoutListener(new ri4(toolbarViewMovable, b2));
        }
        cl5 cl5Var2 = this.p0;
        if (cl5Var2 == null) {
            im3.e0("toolbarViewModel");
            throw null;
        }
        xk5 xk5Var2 = this.t0;
        xk5Var2.getClass();
        cl5Var2.x = xk5Var2;
        xk1 xk1Var2 = this.q0;
        if (xk1Var2 != null) {
            ((ToolbarViewMovable) xk1Var2.n).setMoveListener(new xk5(this));
        }
        View viewS0 = s0();
        ar arVar = new ar(this, (byte) 20);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewS0, arVar);
    }
}

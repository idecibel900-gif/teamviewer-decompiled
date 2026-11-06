package o;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo/ik2;", "Lo/fv2;", "Lo/db3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ik2 extends fv2 implements db3 {
    public static final /* synthetic */ int W0 = 0;
    public lk2 A0;
    public ArrayList B0;
    public Runnable C0;
    public String D0;
    public Parcelable E0;
    public wk2 F0;
    public nk7 G0;
    public final yj2 H0;
    public final yj2 I0;
    public final yj2 J0;
    public final yj2 O0;
    public final yj2 Q0;
    public final yj2 S0;
    public k62 r0;
    public TextView s0;
    public View t0;
    public gk7 u0;
    public ListView v0;
    public View w0;
    public View x0;
    public View y0;
    public pk2 z0;
    public final fk2 K0 = new fk2(this, 0);
    public final gk2 L0 = new AdapterView.OnItemLongClickListener() { // from class: o.gk2
        @Override // android.widget.AdapterView.OnItemLongClickListener
        public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
            this.a.V0 = i;
            return adapterView.showContextMenu();
        }
    };
    public final ek2 M0 = new ek2(this);
    public final xk1 N0 = new xk1((Object) this, (byte) 17);
    public final c6 P0 = new c6(8);
    public final c6 R0 = new c6(9);
    public final c6 T0 = new c6(10);
    public final ek2 U0 = new ek2(this);
    public int V0 = -1;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.yj2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.yj2] */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.yj2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.yj2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.gk2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.yj2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.yj2] */
    public ik2() {
        final byte b = 0;
        this.H0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b2 = b;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b2) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string.getClass();
                                    fx3.r(string, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX0 = wk2Var2.X0();
                                            e8.f(arrayListX0);
                                            arrayListX0.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX1 = wk2Var2.X0();
                                    e8.f(arrayListX1);
                                    arrayListX1.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string2 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string2.getClass();
                                        fx3.r(string2, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string3 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string3.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string3));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string4 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string4.getClass();
                                    fx3.r(string4, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
        final byte b2 = 3;
        this.I0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b3 = b2;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b3) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string2 = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string2.getClass();
                                    fx3.r(string2, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX1 = wk2Var2.X0();
                                            e8.f(arrayListX1);
                                            arrayListX1.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX2 = wk2Var2.X0();
                                    e8.f(arrayListX2);
                                    arrayListX2.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string3 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string3.getClass();
                                        fx3.r(string3, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string4 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string4.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string4));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string5 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string5.getClass();
                                    fx3.r(string5, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
        final byte b3 = 4;
        this.J0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b4 = b3;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b4) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string3 = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string3.getClass();
                                    fx3.r(string3, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX2 = wk2Var2.X0();
                                            e8.f(arrayListX2);
                                            arrayListX2.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX3 = wk2Var2.X0();
                                    e8.f(arrayListX3);
                                    arrayListX3.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string4 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string4.getClass();
                                        fx3.r(string4, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string5 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string5.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string5));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string6 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string6.getClass();
                                    fx3.r(string6, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
        final byte b4 = 5;
        this.O0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b5 = b4;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b5) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string4 = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string4.getClass();
                                    fx3.r(string4, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX3 = wk2Var2.X0();
                                            e8.f(arrayListX3);
                                            arrayListX3.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX4 = wk2Var2.X0();
                                    e8.f(arrayListX4);
                                    arrayListX4.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string5 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string5.getClass();
                                        fx3.r(string5, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string6 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string6.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string6));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string7 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string7.getClass();
                                    fx3.r(string7, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
        final byte b5 = 1;
        this.Q0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b6 = b5;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b6) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string5 = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string5.getClass();
                                    fx3.r(string5, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX4 = wk2Var2.X0();
                                            e8.f(arrayListX4);
                                            arrayListX4.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX5 = wk2Var2.X0();
                                    e8.f(arrayListX5);
                                    arrayListX5.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string6 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string6.getClass();
                                        fx3.r(string6, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string7 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string7.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string7));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string8 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string8.getClass();
                                    fx3.r(string8, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
        final byte b6 = 2;
        this.S0 = new hk7(this) { // from class: o.yj2
            public final /* synthetic */ ik2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0104  */
            /* JADX WARN: Code duplicated, block: B:70:0x0108  */
            /* JADX WARN: Code duplicated, block: B:71:0x0118  */
            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                Context context;
                byte b7 = b6;
                Object obj = null;
                Boolean boolValueOf = null;
                ik2 ik2Var = this.b;
                switch (b7) {
                    case 0:
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.f1();
                        }
                        gk7Var.A0();
                        break;
                    case 1:
                        String str = ik2Var.D0;
                        if (str != null) {
                            wk2 wk2Var2 = ik2Var.F0;
                            if (wk2Var2 == null) {
                                context = d82.M;
                                if (context != null) {
                                    String string6 = context.getString(R.string.tv_filetransfer_delete_cant);
                                    string6.getClass();
                                    fx3.r(string6, 1, context, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            } else {
                                boolean zC = wk2Var2.f2421o.c(str);
                                if (zC) {
                                    for (nk7 nk7Var : wk2Var2.X0()) {
                                        if (im3.n(nk7Var.f1575o, str)) {
                                            obj = nk7Var;
                                            ArrayList arrayListX5 = wk2Var2.X0();
                                            e8.f(arrayListX5);
                                            arrayListX5.remove(obj);
                                        }
                                    }
                                    ArrayList arrayListX6 = wk2Var2.X0();
                                    e8.f(arrayListX6);
                                    arrayListX6.remove(obj);
                                }
                                if (!zC) {
                                    context = d82.M;
                                    if (context != null) {
                                        String string7 = context.getString(R.string.tv_filetransfer_delete_cant);
                                        string7.getClass();
                                        fx3.r(string7, 1, context, bu7.MAIN);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            }
                        }
                        wk2 wk2Var3 = ik2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.m1();
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        gk7Var.A0();
                        break;
                    case 2:
                        int i = ik2.W0;
                        Dialog dialog = gk7Var.A0;
                        View viewFindViewById = dialog != null ? dialog.findViewById(R.id.tv_new_folder_name) : null;
                        if (viewFindViewById instanceof EditText) {
                            EditText editText = (EditText) viewFindViewById;
                            String string8 = editText.getText().toString();
                            xt2 xt2VarC = ik2Var.C();
                            if (xt2VarC != null) {
                                Object systemService = xt2VarC.getSystemService("input_method");
                                systemService.getClass();
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            }
                            wk2 wk2Var4 = ik2Var.F0;
                            String str2 = wk2Var4 != null ? wk2Var4.t : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (wk2Var4 != null) {
                                string8.getClass();
                                boolValueOf = Boolean.valueOf(wk2Var4.f2421o.b(str2, string8));
                            }
                            if (!im3.n(boolValueOf, Boolean.TRUE)) {
                                Context context2 = d82.M;
                                if (context2 != null) {
                                    String string9 = context2.getString(R.string.tv_filetransfer_createfolder_cant);
                                    string9.getClass();
                                    fx3.r(string9, 1, context2, bu7.MAIN);
                                } else {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                }
                            }
                            wk2 wk2Var5 = ik2Var.F0;
                            if (wk2Var5 != null) {
                                wk2Var5.m1();
                            }
                            ik2Var.L0();
                        }
                        gk7Var.A0();
                        break;
                    case 3:
                        wk2 wk2Var6 = ik2Var.F0;
                        if (wk2Var6 != null) {
                            wk2Var6.e1();
                        }
                        gk7Var.A0();
                        break;
                    case 4:
                        wk2 wk2Var7 = ik2Var.F0;
                        if (wk2Var7 != null) {
                            wk2Var7.d1();
                        }
                        gk7Var.A0();
                        break;
                    default:
                        int i2 = ik2.W0;
                        gk7Var.A0();
                        wk2 wk2Var8 = ik2Var.F0;
                        if (wk2Var8 != null) {
                            mo7 mo7Var = ((zt6) wk2Var8.q).f;
                            et6 et6Var = mo7Var instanceof et6 ? (et6) mo7Var : null;
                            if (et6Var != null) {
                                et6Var.i();
                            } else {
                                ye4.c("FileTransferVM", "logout(): session is null");
                            }
                            wk2Var8.f2421o.a();
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.fv2
    public hk7 C0(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 31052885:
                if (str.equals("really_quit_positive")) {
                    return this.O0;
                }
                return null;
            case 204359313:
                if (str.equals("really_quit_negative")) {
                    return this.P0;
                }
                return null;
            case 923044363:
                if (str.equals("new_folder_positive")) {
                    return this.S0;
                }
                return null;
            case 1096350791:
                if (str.equals("new_folder_negative")) {
                    return this.T0;
                }
                return null;
            case 1853215176:
                if (str.equals("delete_file_positive")) {
                    return this.Q0;
                }
                return null;
            case 2026521604:
                if (str.equals("delete_file_negative")) {
                    return this.R0;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract boolean F0(MenuItem menuItem);

    public abstract void G0(ContextMenu contextMenu);

    public abstract wk2 H0(xt2 xt2Var);

    public abstract int I0();

    public abstract String J0();

    public abstract void K0();

    public final void L0() {
        ListView listView = this.v0;
        ListAdapter adapter = listView != null ? listView.getAdapter() : null;
        if (!(adapter instanceof lk2)) {
            ye4.c("FileTransferFragment", "restoreSelectedFiles: adapter has wrong type");
            return;
        }
        lk2 lk2Var = (lk2) adapter;
        List<nk7> list = lk2Var.f1370o;
        wk2 wk2Var = this.F0;
        List listX0 = wk2Var != null ? wk2Var.X0() : null;
        if (listX0 == null) {
            listX0 = ea2.m;
        }
        for (nk7 nk7Var : list) {
            Iterator it = listX0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (im3.n(nk7Var, (nk7) it.next())) {
                        nk7Var.q = true;
                        break;
                    }
                } else {
                    nk7Var.q = false;
                    break;
                }
            }
            lk2Var.notifyDataSetChanged();
            ListView listView2 = this.v0;
            if (listView2 != null) {
                listView2.invalidate();
            }
        }
    }

    public abstract void M0();

    public abstract void N0();

    public final void O0() {
        xt2 xt2VarC = C();
        if (xt2VarC == null) {
            ye4.c("FileTransferFragment", "setTitle: activity is NULL");
        } else {
            wk2 wk2Var = this.F0;
            xt2VarC.setTitle(wk2Var != null ? wk2Var.Z0() : null);
        }
    }

    public final void P0() {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.F0 = R.string.tv_closeConnection_Text;
        gk7Var.H0 = R.string.tv_filetransfer_dialog_close_session_text;
        gk7Var.K0 = R.string.tv_clientDialogQuit;
        gk7Var.O0 = R.string.tv_clientDialogAbort;
        D0("really_quit_positive", new r02(gk7Var, p02.Positive));
        D0("really_quit_negative", new r02(gk7Var, p02.Negative));
        gk7.O0(gk7Var, C());
    }

    public final void Q0() {
        List listK;
        String string;
        List listK2;
        List listK0;
        wk2 wk2Var = this.F0;
        if (wk2Var == null) {
            return;
        }
        View view = this.t0;
        List listK1 = ea2.m;
        if (view != null) {
            String strW0 = wk2Var.W0();
            Pattern patternCompile = Pattern.compile("/");
            patternCompile.getClass();
            ub7.k0(0);
            Matcher matcher = patternCompile.matcher(strW0);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(strW0.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(strW0.subSequence(iEnd, strW0.length()).toString());
                listK2 = arrayList;
            } else {
                listK2 = qf0.K(strW0.toString());
            }
            if (!listK2.isEmpty()) {
                ListIterator listIterator = listK2.listIterator(listK2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listK0 = listK1;
                        break;
                    } else if (((String) listIterator.previous()).length() != 0) {
                        listK0 = lv0.K0(listK2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listK0 = listK1;
                break;
            }
            view.setVisibility((listK0.isEmpty() || (listK0.size() == 1 && ((CharSequence) listK0.get(0)).length() == 0)) ? 4 : 0);
        }
        TextView textView = this.s0;
        if (textView != null) {
            String strW1 = wk2Var.W0();
            Pattern patternCompile2 = Pattern.compile("/");
            patternCompile2.getClass();
            ub7.k0(0);
            Matcher matcher2 = patternCompile2.matcher(strW1);
            if (matcher2.find()) {
                ArrayList arrayList2 = new ArrayList(10);
                int iEnd2 = 0;
                do {
                    arrayList2.add(strW1.subSequence(iEnd2, matcher2.start()).toString());
                    iEnd2 = matcher2.end();
                } while (matcher2.find());
                arrayList2.add(strW1.subSequence(iEnd2, strW1.length()).toString());
                listK = arrayList2;
            } else {
                listK = qf0.K(strW1.toString());
            }
            if (!listK.isEmpty()) {
                ListIterator listIterator2 = listK.listIterator(listK.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listK1 = lv0.K0(listK, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            List list = listK1;
            if (list.isEmpty() || (list.size() == 1 && ((CharSequence) list.get(0)).length() == 0)) {
                string = wk2Var.n.getString(R.string.tv_filetransfer_files_of_android);
                string.getClass();
            } else {
                string = lv0.t0(list, " > ", null, null, null, 62);
            }
            textView.setText(string);
        }
    }

    public final void R0(boolean z) {
        View view;
        View view2;
        View view3;
        pk2 pk2Var;
        final byte b = 0;
        int iY0 = this.F0 != null ? wk2.Y0() : 0;
        wk2 wk2Var = this.F0;
        final byte b2 = 1;
        if (wk2Var != null && wk2Var.a1() && (pk2Var = this.z0) != null) {
            pk2Var.d.r.remove(this.r0);
        }
        final View viewFindViewById = null;
        if (iY0 <= 0 || this.z0 == null) {
            pk2 pk2Var2 = this.z0;
            if (pk2Var2 == null) {
                ye4.c("FileTransferFragment", "updateSelectionClip: clip is null");
                return;
            }
            pk2Var2.a();
            pk2 pk2Var3 = this.z0;
            if (pk2Var3 != null && (view = pk2Var3.c) != null) {
                viewFindViewById = view.findViewById(R.id.filetransfer_bubble_clip);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            }
            return;
        }
        if (z) {
            if (C() != null) {
                wk2 wk2Var2 = this.F0;
                if (wk2Var2 != null && wk2Var2.p.getInt("FILETRANSFER_LOAD_COUNT", 0) <= 5) {
                    pk2 pk2Var4 = this.z0;
                    final View viewFindViewById2 = (pk2Var4 == null || (view3 = pk2Var4.c) == null) ? null : view3.findViewById(R.id.filetransfer_bubble_clip);
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setVisibility(0);
                    }
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.startAnimation(AnimationUtils.loadAnimation(C(), R.anim.fade_in_slow));
                    }
                    View view4 = this.y0;
                    if (view4 != null) {
                        view4.removeCallbacks(this.C0);
                    }
                    Runnable runnable = new Runnable(this) { // from class: o.zj2
                        public final /* synthetic */ ik2 n;

                        {
                            this.n = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            View view5 = viewFindViewById2;
                            ik2 ik2Var = this.n;
                            switch (b3) {
                                case 0:
                                    if (ik2Var.z0 != null) {
                                        view5.clearAnimation();
                                    }
                                    break;
                                default:
                                    int i = ik2.W0;
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(ik2Var.C(), R.anim.fade_out_slow);
                                    animationLoadAnimation.setAnimationListener(new hk2(view5, (byte) 1));
                                    if (view5 != null) {
                                        view5.startAnimation(animationLoadAnimation);
                                    }
                                    break;
                            }
                        }
                    };
                    this.C0 = runnable;
                    View view5 = this.y0;
                    if (view5 != null) {
                        view5.postDelayed(runnable, 5000L);
                    }
                }
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(C(), R.anim.shaking);
                pk2 pk2Var5 = this.z0;
                if (pk2Var5 != null && (view2 = pk2Var5.c) != null) {
                    viewFindViewById = view2.findViewById(R.id.filetransfer_clip);
                }
                if (viewFindViewById != null) {
                    viewFindViewById.startAnimation(animationLoadAnimation);
                    viewFindViewById.postDelayed(new Runnable(this) { // from class: o.zj2
                        public final /* synthetic */ ik2 n;

                        {
                            this.n = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b;
                            View view6 = viewFindViewById;
                            ik2 ik2Var = this.n;
                            switch (b3) {
                                case 0:
                                    if (ik2Var.z0 != null) {
                                        view6.clearAnimation();
                                    }
                                    break;
                                default:
                                    int i = ik2.W0;
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(ik2Var.C(), R.anim.fade_out_slow);
                                    animationLoadAnimation2.setAnimationListener(new hk2(view6, (byte) 1));
                                    if (view6 != null) {
                                        view6.startAnimation(animationLoadAnimation2);
                                    }
                                    break;
                            }
                        }
                    }, 1800L);
                } else {
                    ye4.c("FileTransferFragment", "updateSelectionClip(): clipview is null");
                }
            } else {
                ye4.c("FileTransferFragment", "updateSelectionClip: activity is NULL");
            }
        }
        pk2 pk2Var6 = this.z0;
        if (pk2Var6 != null) {
            pk2Var6.g = iY0;
        }
        N0();
        pk2 pk2Var7 = this.z0;
        if (pk2Var7 != null) {
            TextView textView = (TextView) pk2Var7.c.findViewById(R.id.clip_selectioncount);
            FileTransferActivity fileTransferActivity = pk2Var7.a;
            fileTransferActivity.runOnUiThread(new io.sentry.u4((Object) textView, (Object) pk2Var7, (byte) 25));
            PopupWindow popupWindow = pk2Var7.b;
            popupWindow.setAnimationStyle(R.style.Clip_Animation_FadeMedium);
            if (popupWindow.isShowing()) {
                return;
            }
            fileTransferActivity.runOnUiThread(new pc0((Object) pk2Var7, (byte) 11));
        }
    }

    @Override // o.ut2
    public final boolean W(MenuItem menuItem) {
        return F0(menuItem);
    }

    @Override // o.ut2
    public final void Y(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(I0(), menu);
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wk2 wk2Var;
        layoutInflater.getClass();
        final byte b = 0;
        this.y0 = layoutInflater.inflate(R.layout.fragment_filetransfer, viewGroup, false);
        this.F0 = H0(p0());
        View view = this.y0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            final int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            final int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            final int i3 = marginLayoutParams != null ? marginLayoutParams.rightMargin : 0;
            final int i4 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            f75 f75Var = new f75() { // from class: o.ck2
                @Override // o.f75
                public final sk8 t(View view2, sk8 sk8Var) {
                    int i5 = ik2.W0;
                    view2.getClass();
                    nj3 nj3VarI = sk8Var.a.i(519);
                    nj3VarI.getClass();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.leftMargin = i + nj3VarI.a;
                        marginLayoutParams2.topMargin = i2;
                        marginLayoutParams2.rightMargin = i3 + nj3VarI.c;
                        marginLayoutParams2.bottomMargin = i4 + nj3VarI.d;
                        view2.setLayoutParams(marginLayoutParams2);
                    }
                    return sk8Var;
                }
            };
            WeakHashMap weakHashMap = be8.a;
            sd8.c(view, f75Var);
            view.requestApplyInsets();
        }
        if (bundle != null) {
            this.E0 = (Parcelable) pm8.u(bundle, "liststate", Parcelable.class);
            this.D0 = bundle.getString("deletion_url");
            boolean z = bundle.getBoolean("checkable");
            wk2 wk2Var2 = this.F0;
            if (wk2Var2 != null) {
                wk2Var2.i1(z);
            }
            this.G0 = (nk7) pm8.u(bundle, "rename_file", nk7.class);
            String string = bundle.getString("directory");
            wk2 wk2Var3 = this.F0;
            if (wk2Var3 != null) {
                wk2Var3.t = string != null ? string : "";
            }
            if (System.currentTimeMillis() - bundle.getLong("timestamp") < 20000) {
                this.B0 = pm8.v(bundle, "listitems", nk7.class);
            }
            ArrayList arrayListV = pm8.v(bundle, "selecteditems", nk7.class);
            if (arrayListV != null && (wk2Var = this.F0) != null) {
                wk2Var.k1(arrayListV);
            }
        } else {
            Bundle bundle2 = this.r;
            if (bundle2 != null) {
                boolean z2 = bundle2.getBoolean("checkable");
                wk2 wk2Var4 = this.F0;
                if (wk2Var4 != null) {
                    wk2Var4.i1(z2);
                }
                String string2 = bundle2.getString("directory");
                wk2 wk2Var5 = this.F0;
                if (wk2Var5 != null) {
                    wk2Var5.t = string2 != null ? string2 : "";
                }
            }
        }
        xt2 xt2VarC = C();
        FileTransferActivity fileTransferActivity = xt2VarC instanceof FileTransferActivity ? (FileTransferActivity) xt2VarC : null;
        if (fileTransferActivity != null) {
            fileTransferActivity.K(false);
            fileTransferActivity.setTitle(R.string.tv_filetransfer_title);
        }
        K0();
        View view2 = this.y0;
        this.s0 = view2 != null ? (TextView) view2.findViewById(R.id.ft_breadcrumbs) : null;
        View view3 = this.y0;
        View viewFindViewById = view3 != null ? view3.findViewById(R.id.ft_up_btn) : null;
        this.t0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: o.bk2
                public final /* synthetic */ ik2 n;

                {
                    this.n = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    Window window;
                    byte b2 = b;
                    ik2 ik2Var = this.n;
                    switch (b2) {
                        case 0:
                            wk2 wk2Var6 = ik2Var.F0;
                            if (wk2Var6 != null) {
                                wk2Var6.c1();
                            }
                            break;
                        default:
                            pk2 pk2Var = ik2Var.z0;
                            if (pk2Var == null) {
                                ye4.c("FileTransferFragment", "onResume(): clip is null");
                            } else {
                                j62 j62Var = pk2Var.d;
                                View currentFocus = pk2Var.a.getCurrentFocus();
                                View viewFindViewById2 = pk2Var.c.findViewById(R.id.filetransfer_clip);
                                viewFindViewById2.getClass();
                                j62Var.getClass();
                                View view5 = j62Var.q;
                                view5.measure(-1, -2);
                                PopupWindow popupWindow = j62Var.f1134o;
                                popupWindow.setHeight(-2);
                                int iMin = (int) Math.min(j62Var.p, view5.getMeasuredWidth());
                                view5.setLayoutParams(new ViewGroup.LayoutParams(iMin, -2));
                                popupWindow.setWidth(iMin);
                                int[] iArr = new int[2];
                                viewFindViewById2.getLocationOnScreen(iArr);
                                int i5 = iArr[0];
                                Rect rect = new Rect(i5, iArr[1], viewFindViewById2.getWidth() + i5, viewFindViewById2.getHeight() + iArr[1]);
                                int measuredHeight = view5.getMeasuredHeight();
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                Object systemService = j62Var.m.getSystemService("window");
                                systemService.getClass();
                                ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                                int i6 = displayMetrics.heightPixels;
                                int i7 = rect.left;
                                int i8 = rect.bottom;
                                int paddingLeft = viewFindViewById2.getPaddingLeft() + i7;
                                if (viewFindViewById2.getBottom() + measuredHeight > (i6 * 4) / 5) {
                                    i8 = rect.top - measuredHeight;
                                }
                                popupWindow.setAnimationStyle(R.style.DropDownList_Animations_SlideDown);
                                if (currentFocus == null) {
                                    s7 s7Var = u7.g;
                                    my0 my0Var = vn4.g0().b;
                                    currentFocus = (my0Var == null || (window = my0Var.getWindow()) == null) ? null : window.getDecorView();
                                }
                                popupWindow.showAtLocation(currentFocus, 0, paddingLeft, i8);
                            }
                            break;
                    }
                }
            });
        }
        View view4 = this.w0;
        if (view4 != null) {
            view4.setOnClickListener(new y6(this, fileTransferActivity, (byte) 6));
        }
        wk2 wk2Var6 = this.F0;
        if (wk2Var6 != null && wk2Var6.t.length() == 0) {
            wk2Var6.t = wk2Var6.f2421o.g();
        }
        View view5 = this.y0;
        ListView listView = view5 != null ? (ListView) view5.findViewById(R.id.fileList) : null;
        this.v0 = listView;
        if (listView != null) {
            listView.setOnCreateContextMenuListener(this);
        }
        ListView listView2 = this.v0;
        if (listView2 != null) {
            listView2.setOnItemClickListener(this.K0);
        }
        ListView listView3 = this.v0;
        if (listView3 != null) {
            listView3.setOnItemLongClickListener(this.L0);
        }
        final byte b2 = 1;
        v0(true);
        M0();
        if (fileTransferActivity != null) {
            this.z0 = new pk2(fileTransferActivity);
        }
        pk2 pk2Var = this.z0;
        if (pk2Var != null) {
            pk2Var.b.getContentView().findViewById(R.id.filetransfer_clip).setOnClickListener(new View.OnClickListener(this) { // from class: o.bk2
                public final /* synthetic */ ik2 n;

                {
                    this.n = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    Window window;
                    byte b3 = b2;
                    ik2 ik2Var = this.n;
                    switch (b3) {
                        case 0:
                            wk2 wk2Var7 = ik2Var.F0;
                            if (wk2Var7 != null) {
                                wk2Var7.c1();
                            }
                            break;
                        default:
                            pk2 pk2Var2 = ik2Var.z0;
                            if (pk2Var2 == null) {
                                ye4.c("FileTransferFragment", "onResume(): clip is null");
                            } else {
                                j62 j62Var = pk2Var2.d;
                                View currentFocus = pk2Var2.a.getCurrentFocus();
                                View viewFindViewById2 = pk2Var2.c.findViewById(R.id.filetransfer_clip);
                                viewFindViewById2.getClass();
                                j62Var.getClass();
                                View view7 = j62Var.q;
                                view7.measure(-1, -2);
                                PopupWindow popupWindow = j62Var.f1134o;
                                popupWindow.setHeight(-2);
                                int iMin = (int) Math.min(j62Var.p, view7.getMeasuredWidth());
                                view7.setLayoutParams(new ViewGroup.LayoutParams(iMin, -2));
                                popupWindow.setWidth(iMin);
                                int[] iArr = new int[2];
                                viewFindViewById2.getLocationOnScreen(iArr);
                                int i5 = iArr[0];
                                Rect rect = new Rect(i5, iArr[1], viewFindViewById2.getWidth() + i5, viewFindViewById2.getHeight() + iArr[1]);
                                int measuredHeight = view7.getMeasuredHeight();
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                Object systemService = j62Var.m.getSystemService("window");
                                systemService.getClass();
                                ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
                                int i6 = displayMetrics.heightPixels;
                                int i7 = rect.left;
                                int i8 = rect.bottom;
                                int paddingLeft = viewFindViewById2.getPaddingLeft() + i7;
                                if (viewFindViewById2.getBottom() + measuredHeight > (i6 * 4) / 5) {
                                    i8 = rect.top - measuredHeight;
                                }
                                popupWindow.setAnimationStyle(R.style.DropDownList_Animations_SlideDown);
                                if (currentFocus == null) {
                                    s7 s7Var = u7.g;
                                    my0 my0Var = vn4.g0().b;
                                    currentFocus = (my0Var == null || (window = my0Var.getWindow()) == null) ? null : window.getDecorView();
                                }
                                popupWindow.showAtLocation(currentFocus, 0, paddingLeft, i8);
                            }
                            break;
                    }
                }
            });
        }
        String string3 = H().getString(R.string.tv_filetransfer_clip_download_selection);
        string3.getClass();
        k62 k62Var = new k62();
        k62Var.a = (byte) 1;
        k62Var.b = string3;
        this.r0 = k62Var;
        String string4 = H().getString(R.string.tv_filetransfer_clip_clear_selection);
        string4.getClass();
        k62 k62Var2 = new k62();
        k62Var2.a = (byte) 0;
        k62Var2.b = string4;
        String strJ0 = J0();
        k62 k62Var3 = new k62();
        k62Var3.a = (byte) 2;
        k62Var3.b = strJ0;
        pk2 pk2Var2 = this.z0;
        if (pk2Var2 != null) {
            pk2Var2.d.r.add(this.r0);
        }
        pk2 pk2Var3 = this.z0;
        if (pk2Var3 != null) {
            pk2Var3.d.r.add(k62Var3);
        }
        pk2 pk2Var4 = this.z0;
        if (pk2Var4 != null) {
            pk2Var4.d.r.add(k62Var2);
        }
        pk2 pk2Var5 = this.z0;
        if (pk2Var5 != null) {
            pk2Var5.d.n = this.N0;
        }
        return this.y0;
    }

    @Override // o.fv2, o.ut2
    public void b0() {
        super.b0();
        this.A0 = null;
        this.E0 = null;
        pk2 pk2Var = this.z0;
        if (pk2Var != null) {
            if (pk2Var != null) {
                pk2Var.a();
            }
            this.z0 = null;
        }
        this.v0 = null;
        this.x0 = null;
        this.w0 = null;
        this.y0 = null;
    }

    @Override // o.ut2
    public final boolean e0(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.addFolder) {
            if (menuItem.getItemId() != R.id.fileTransferDisc) {
                return false;
            }
            P0();
            return true;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.F0 = R.string.tv_filetransfer_menu_newfolder;
        gk7Var.W0 = R.layout.dialog_fragment_new_folder;
        gk7Var.X0 = null;
        gk7Var.O0 = android.R.string.cancel;
        gk7Var.K0 = R.string.tv_filetransfer_create_folder_positive;
        D0("new_folder_positive", new r02(gk7Var, p02.Positive));
        D0("new_folder_negative", new r02(gk7Var, p02.Negative));
        gk7Var.N0();
        return true;
    }

    @Override // o.fv2, o.ut2
    public void f0() {
        super.f0();
        wk2 wk2Var = this.F0;
        if (wk2Var != null) {
            wk2Var.u = new WeakReference(null);
        }
        ListView listView = this.v0;
        if (listView != null) {
            this.E0 = listView.onSaveInstanceState();
        }
        wk2 wk2Var2 = this.F0;
        if (wk2Var2 != null) {
            wk2Var2.f2421o.o(wk2Var2.t);
        }
    }

    @Override // o.fv2, o.ut2
    public void g0() {
        super.g0();
        wk2 wk2Var = this.F0;
        if (wk2Var != null) {
            wk2Var.u = new WeakReference(this);
        }
        if (C() == null) {
            ye4.c("FileTransferFragment", "onResume(): FileTransferActivity is NULL");
            return;
        }
        zg2 zg2Var = zg2.H0;
        if (zg2Var == null) {
            zg2Var = new zg2();
            zg2.H0 = zg2Var;
        }
        zg2 zg2Var2 = zg2Var;
        if (zg2Var.G0) {
            if (zg2Var2 == null) {
                zg2Var2 = new zg2();
                zg2.H0 = zg2Var2;
            }
            zg2Var2.A0();
        }
        ArrayList arrayList = this.B0;
        byte b = 0;
        if (arrayList != null) {
            xt2 xt2VarC = C();
            ListView listView = this.v0;
            wk2 wk2Var2 = this.F0;
            lk2 lk2Var = new lk2(xt2VarC, listView, arrayList, this.M0, wk2Var2 != null ? wk2Var2.a1() : false, this.U0);
            this.A0 = lk2Var;
            ListView listView2 = this.v0;
            if (listView2 != null) {
                listView2.setAdapter((ListAdapter) lk2Var);
            }
            this.B0 = null;
            Q0();
            O0();
        } else {
            wk2 wk2Var3 = this.F0;
            if (wk2Var3 != null) {
                wk2Var3.m1();
            }
        }
        View view = this.y0;
        if (view != null) {
            view.post(new ak2(this, b));
        }
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        ListView listView = this.v0;
        if (listView != null) {
            bundle.putParcelable("liststate", listView.onSaveInstanceState());
        } else {
            Parcelable parcelable = this.E0;
            if (parcelable != null) {
                bundle.putParcelable("liststate", parcelable);
            }
        }
        wk2 wk2Var = this.F0;
        ArrayList arrayListX0 = wk2Var != null ? wk2Var.X0() : null;
        if (arrayListX0 != null && (!arrayListX0.isEmpty())) {
            bundle.putParcelableArrayList("selecteditems", arrayListX0);
        }
        wk2 wk2Var2 = this.F0;
        bundle.putString("directory", wk2Var2 != null ? wk2Var2.t : null);
        wk2 wk2Var3 = this.F0;
        bundle.putBoolean("checkable", wk2Var3 != null ? wk2Var3.a1() : true);
        bundle.putString("deletion_url", this.D0);
        bundle.putParcelable("rename_file", this.G0);
        ListView listView2 = this.v0;
        if (listView2 == null || listView2.getAdapter() == null) {
            return;
        }
        ListView listView3 = this.v0;
        ListAdapter adapter = listView3 != null ? listView3.getAdapter() : null;
        lk2 lk2Var = adapter instanceof lk2 ? (lk2) adapter : null;
        List list = lk2Var != null ? lk2Var.f1370o : null;
        if (list == null) {
            list = ea2.m;
        }
        bundle.putParcelableArrayList("listitems", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        bundle.putLong("timestamp", System.currentTimeMillis());
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.d(this);
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        s7 s7Var = u7.g;
        vn4.g0();
        u7.e(this);
    }

    @Override // o.ut2, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.getClass();
        view.getClass();
        G0(contextMenu);
    }

    @Override // o.db3
    public final boolean v() {
        wk2 wk2Var = this.F0;
        return wk2Var != null && wk2Var.c1();
    }
}

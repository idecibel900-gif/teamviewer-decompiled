package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.preference.PreferenceScreen;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewer.market.mobile.network.NetworkServiceRC;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends Handler {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(zt6 zt6Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 5;
        this.b = zt6Var;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0248  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v14, types: [char, int] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        ?? r17;
        boolean z;
        vx3 vx3Var;
        int i3;
        int size;
        yt2[] yt2VarArr;
        int i4 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                int i5 = message.what;
                if (i5 == -3 || i5 == -2 || i5 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i5 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                cy3 cy3Var = (cy3) this.b;
                int i6 = message.what;
                if (i6 == 1) {
                    cy3Var.l(message.arg1);
                    return;
                }
                if (i6 == 2) {
                    cy3Var.t.setVisibility(4);
                    return;
                }
                byte b = 3;
                if (i6 == 3) {
                    tx3 tx3Var = cy3Var.H[cy3Var.l0];
                    cy3Var.b(cy3Var.d0, tx3Var.i, tx3Var.j, cy3Var.B0);
                    sendMessageDelayed(Message.obtain(this, 3), 50L);
                    return;
                }
                if (i6 != 4) {
                    return;
                }
                int i7 = cy3Var.m0;
                if (i7 != 0 && (i = cy3Var.d0) >= 0) {
                    tx3[] tx3VarArr = cy3Var.H;
                    if (i >= tx3VarArr.length) {
                        return;
                    }
                    tx3 tx3Var2 = tx3VarArr[i];
                    Context context = cy3Var.K0;
                    HashMap map = cy3Var.G;
                    int[] iArr = cy3Var.y;
                    PopupWindow popupWindow = cy3Var.z;
                    int i8 = tx3Var2.q;
                    if (i8 != 0) {
                        View view = (View) map.get(tx3Var2);
                        cy3Var.A = view;
                        if (view == null) {
                            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i7, (ViewGroup) null);
                            cy3Var.A = viewInflate;
                            cy3Var.B = (cy3) viewInflate.findViewById(R.id.keyboardView);
                            View viewFindViewById = cy3Var.A.findViewById(R.id.closeButton);
                            if (viewFindViewById != null) {
                                viewFindViewById.setOnClickListener(cy3Var);
                            }
                            cy3Var.B.setOnKeyboardActionListener(new nx3(cy3Var, b));
                            CharSequence charSequence = tx3Var2.n;
                            if (charSequence != null) {
                                int paddingRight = cy3Var.getPaddingRight() + cy3Var.getPaddingLeft();
                                vx3Var = new vx3(context, i8);
                                vx3Var.i = 0;
                                ux3 ux3Var = new ux3(vx3Var);
                                ux3Var.b = vx3Var.c;
                                ux3Var.a = vx3Var.b;
                                ux3Var.c = vx3Var.a;
                                ux3Var.d = vx3Var.d;
                                ux3Var.f = 12;
                                int i9 = 0;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                while (i9 < charSequence.length()) {
                                    int iCharAt = charSequence.charAt(i9);
                                    boolean z3 = z2;
                                    if (i11 < Integer.MAX_VALUE) {
                                        i3 = i4;
                                        if (vx3Var.b + i12 + paddingRight > vx3Var.k) {
                                        }
                                        tx3 tx3Var3 = new tx3(ux3Var);
                                        tx3Var3.i = i12;
                                        tx3Var3.j = i10;
                                        tx3Var3.b = String.valueOf((char) iCharAt);
                                        tx3Var3.a = new int[]{iCharAt};
                                        i11++;
                                        i12 += tx3Var3.e + tx3Var3.g;
                                        vx3Var.j.add(tx3Var3);
                                        ux3Var.e.add(tx3Var3);
                                        if (i12 > vx3Var.i) {
                                            vx3Var.i = i12;
                                        }
                                        i9++;
                                        z2 = z3;
                                        i4 = i3;
                                    } else {
                                        i3 = i4;
                                    }
                                    i10 += vx3Var.d + vx3Var.c;
                                    i11 = i3;
                                    i12 = i11;
                                    tx3 tx3Var4 = new tx3(ux3Var);
                                    tx3Var4.i = i12;
                                    tx3Var4.j = i10;
                                    tx3Var4.b = String.valueOf((char) iCharAt);
                                    tx3Var4.a = new int[]{iCharAt};
                                    i11++;
                                    i12 += tx3Var4.e + tx3Var4.g;
                                    vx3Var.j.add(tx3Var4);
                                    ux3Var.e.add(tx3Var4);
                                    if (i12 > vx3Var.i) {
                                        vx3Var.i = i12;
                                    }
                                    i9++;
                                    z2 = z3;
                                    i4 = i3;
                                }
                                i2 = i4;
                                z = z2;
                                vx3Var.h = i10 + vx3Var.c;
                                vx3Var.q.add(ux3Var);
                            } else {
                                i2 = 0;
                                z = true;
                                vx3Var = new vx3(context, i8);
                            }
                            cy3Var.B.setKeyboard(vx3Var);
                            cy3Var.B.setPopupParent(cy3Var);
                            cy3Var.A.measure(View.MeasureSpec.makeMeasureSpec(cy3Var.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(cy3Var.getHeight(), Integer.MIN_VALUE));
                            map.put(tx3Var2, cy3Var.A);
                            r17 = z;
                        } else {
                            i2 = 0;
                            r17 = 1;
                            cy3Var.B = (cy3) view.findViewById(R.id.keyboardView);
                        }
                        cy3Var.getLocationInWindow(iArr);
                        cy3Var.j0 = cy3Var.getPaddingLeft() + tx3Var2.i;
                        cy3Var.k0 = cy3Var.getPaddingTop() + tx3Var2.j;
                        cy3Var.j0 = (cy3Var.j0 + tx3Var2.e) - cy3Var.A.getMeasuredWidth();
                        cy3Var.k0 -= cy3Var.A.getMeasuredHeight();
                        int paddingRight2 = cy3Var.A.getPaddingRight() + cy3Var.j0 + iArr[i2];
                        int paddingBottom = cy3Var.A.getPaddingBottom() + cy3Var.k0 + iArr[r17];
                        cy3 cy3Var2 = cy3Var.B;
                        cy3Var2.E = Math.max(paddingRight2, i2);
                        cy3Var2.F = paddingBottom;
                        PopupWindow popupWindow2 = cy3Var2.u;
                        if (popupWindow2.isShowing()) {
                            popupWindow2.dismiss();
                        }
                        cy3 cy3Var3 = cy3Var.B;
                        vx3 vx3Var2 = cy3Var.m;
                        boolean z4 = vx3Var2 != null ? vx3Var2.e : false;
                        vx3 vx3Var3 = cy3Var3.m;
                        if (vx3Var3 != null) {
                            for (tx3 tx3Var5 : vx3Var3.f) {
                                if (tx3Var5 != null) {
                                    tx3Var5.l = z4;
                                }
                            }
                            if (vx3Var3.e != z4) {
                                vx3Var3.e = z4;
                                cy3Var3.e();
                            }
                        }
                        popupWindow.setContentView(cy3Var.A);
                        popupWindow.setWidth(cy3Var.A.getMeasuredWidth());
                        popupWindow.setHeight(cy3Var.A.getMeasuredHeight());
                        popupWindow.showAtLocation(cy3Var, 0, paddingRight2, paddingBottom);
                        ?? r0 = r17;
                        cy3Var.C = r0;
                        cy3Var.e();
                        cy3Var.n0 = r0;
                        cy3Var.m(-1);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                yc4 yc4Var = (yc4) this.b;
                while (true) {
                    synchronized (((HashMap) yc4Var.n)) {
                        try {
                            size = ((ArrayList) yc4Var.p).size();
                            if (size <= 0) {
                                return;
                            }
                            yt2VarArr = new yt2[size];
                            ((ArrayList) yc4Var.p).toArray(yt2VarArr);
                            ((ArrayList) yc4Var.p).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        yt2 yt2Var = yt2VarArr[i13];
                        int size2 = ((ArrayList) yt2Var.f2642o).size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            xc4 xc4Var = (xc4) ((ArrayList) yt2Var.f2642o).get(i14);
                            xc4Var.getClass();
                            xc4Var.b.onReceive((Context) yc4Var.m, (Intent) yt2Var.n);
                        }
                    }
                }
                break;
            case 3:
                if (message.what != 1) {
                    return;
                }
                rq5 rq5Var = (rq5) this.b;
                PreferenceScreen preferenceScreen = (PreferenceScreen) rq5Var.q0.g;
                if (preferenceScreen != null) {
                    rq5Var.r0.setAdapter(new uq5(preferenceScreen));
                    preferenceScreen.i();
                    return;
                }
                return;
            case 4:
                wq6 wq6Var = (wq6) this.b;
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) wq6Var.a;
                message.getClass();
                int i15 = message.what;
                if (i15 != 0) {
                    if (i15 != 1) {
                        super.handleMessage(message);
                        return;
                    }
                    ye4.a("ServiceNetworkControlMethod", "handler stop requested");
                    ye4.a("ServiceNetworkControlMethod", "stopNetworkServiceImpl");
                    remoteControlApplication.stopService(new Intent(remoteControlApplication, (Class<?>) NetworkServiceRC.class));
                    return;
                }
                ye4.a("ServiceNetworkControlMethod", "handler start requested");
                ye4.a("ServiceNetworkControlMethod", "startNetworkServiceImpl");
                try {
                    Intent intent = new Intent(remoteControlApplication, (Class<?>) NetworkServiceRC.class);
                    intent.putExtra("com.teamviewer.teamviewer.extra.NETWORK_FOREGROUND", true);
                    String string = remoteControlApplication.getString(R.string.tv_notification_tap_to_return_content_title);
                    string.getClass();
                    String string2 = remoteControlApplication.getString(R.string.tv_notification_tap_to_return_ticker);
                    string2.getClass();
                    intent.putExtra("com.teamviewer.teamviewer.extra.NETWORK_NOTIFICATION", d82.i(remoteControlApplication, string, null, string2, R.drawable.ic_notification_rc, false, true, d82.n(remoteControlApplication), 13, xk7.GENERAL_NOTIFICATION, true, false));
                    remoteControlApplication.startForegroundService(intent);
                    wq6Var.d = true;
                    return;
                } catch (RuntimeException e) {
                    e41.s("Unable to start network service: ", e.getMessage(), "ServiceNetworkControlMethod");
                    return;
                }
            default:
                message.getClass();
                zt6 zt6Var = (zt6) this.b;
                ps6 ps6Var = zt6Var.d;
                if (ps6Var != null) {
                    zt6Var.d = null;
                    gk7 gk7Var = ps6Var.m;
                    ps6Var.m = null;
                    if (gk7Var != null) {
                        gk7Var.A0();
                    }
                    ps6Var.a();
                    nm nmVar = zt6Var.n;
                    nmVar.getClass();
                    ArrayList arrayList = nmVar.a;
                    for (WeakReference weakReference : lv0.P0(arrayList)) {
                        Object obj = weakReference.get();
                        if (obj != null) {
                        } else {
                            arrayList.remove(weakReference);
                        }
                    }
                }
                zt6Var.f = null;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ kd() {
        this.a = (byte) 0;
    }
}

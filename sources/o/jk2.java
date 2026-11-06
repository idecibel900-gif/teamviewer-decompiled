package o;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk2 implements View.OnClickListener {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ lk2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1176o;
    public final /* synthetic */ Object p;

    public /* synthetic */ jk2(CheckBox checkBox, lk2 lk2Var, int i) {
        this.p = checkBox;
        this.n = lk2Var;
        this.f1176o = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wk2 wk2Var;
        View view2;
        byte b = this.m;
        int i = this.f1176o;
        lk2 lk2Var = this.n;
        Object obj = this.p;
        switch (b) {
            case 0:
                d11 d11Var = (d11) obj;
                ListView listView = lk2Var.n;
                if (listView != null) {
                    listView.performItemClick(((LinearLayout) d11Var.m).getRootView(), i, 0L);
                }
                break;
            default:
                CheckBox checkBox = (CheckBox) obj;
                checkBox.setChecked(!checkBox.isChecked());
                List list = lk2Var.f1370o;
                ((nk7) list.get(i)).q = !((nk7) list.get(i)).q;
                ek2 ek2Var = lk2Var.p;
                nk7 nk7Var = (nk7) list.get(i);
                ik2 ik2Var = ek2Var.a;
                int i2 = ik2.W0;
                nk7Var.getClass();
                wk2 wk2Var2 = ik2Var.F0;
                if (wk2Var2 != null) {
                    ArrayList<nk7> arrayList = new ArrayList(wk2Var2.X0());
                    boolean zIsEmpty = arrayList.isEmpty();
                    boolean z = true;
                    boolean z2 = false;
                    for (nk7 nk7Var2 : arrayList) {
                        if (nk7Var.q && nk7Var.equals(nk7Var2)) {
                            z = false;
                        } else if (!nk7Var.q && nk7Var.equals(nk7Var2)) {
                            z2 = true;
                        }
                    }
                    if (z && nk7Var.q) {
                        arrayList.add(nk7Var);
                    }
                    if (z2) {
                        arrayList.remove(nk7Var);
                    }
                    wk2Var2.k1(arrayList);
                    ik2 ik2Var2 = (ik2) wk2Var2.u.get();
                    if (ik2Var2 != null) {
                        if (zIsEmpty && ik2Var2.F0 != null && wk2.Y0() == 1 && ik2Var2.C() != null && (wk2Var = ik2Var2.F0) != null && wk2Var.p.getInt("FILETRANSFER_LOAD_COUNT", 0) <= 5 && ((view2 = ik2Var2.x0) == null || view2.getVisibility() != 0)) {
                            View view3 = ik2Var2.x0;
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            View view4 = ik2Var2.x0;
                            if (view4 != null) {
                                view4.startAnimation(AnimationUtils.loadAnimation(ik2Var2.C(), R.anim.fade_in_slow));
                            }
                            View view5 = ik2Var2.y0;
                            if (view5 != null) {
                                view5.removeCallbacks(ik2Var2.C0);
                            }
                            ak2 ak2Var = new ak2(ik2Var2, (byte) 1);
                            ik2Var2.C0 = ak2Var;
                            View view6 = ik2Var2.y0;
                            if (view6 != null) {
                                view6.postDelayed(ak2Var, 5000L);
                            }
                        }
                        ik2Var2.R0(false);
                    }
                }
                break;
        }
    }

    public /* synthetic */ jk2(lk2 lk2Var, d11 d11Var, int i) {
        this.n = lk2Var;
        this.p = d11Var;
        this.f1176o = i;
    }
}

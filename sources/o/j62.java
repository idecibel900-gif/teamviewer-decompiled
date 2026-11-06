package o;

import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class j62 implements AdapterView.OnItemClickListener {
    public final FileTransferActivity m;
    public xk1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PopupWindow f1134o;
    public final int p;
    public final View q;
    public final ArrayAdapter r;

    public j62(FileTransferActivity fileTransferActivity) {
        this.m = fileTransferActivity;
        PopupWindow popupWindow = new PopupWindow(fileTransferActivity);
        this.f1134o = popupWindow;
        popupWindow.setBackgroundDrawable(new BitmapDrawable(fileTransferActivity.getResources()));
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        this.p = fileTransferActivity.getResources().getDimensionPixelSize(R.dimen.filetransfer_clip_dropdown_max_width);
        Object systemService = fileTransferActivity.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dropdownlist_layout, (ViewGroup) null);
        viewInflate.getClass();
        this.q = viewInflate;
        ArrayAdapter arrayAdapter = new ArrayAdapter(fileTransferActivity, R.layout.dropdownlist_item);
        this.r = arrayAdapter;
        ListView listView = (ListView) viewInflate.findViewById(R.id.dropdownlist_items);
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setOnItemClickListener(this);
        popupWindow.setContentView(viewInflate);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        view.getClass();
        xk1 xk1Var = this.n;
        if (xk1Var != null) {
            k62 k62Var = (k62) this.r.getItem(i);
            byte b = k62Var != null ? k62Var.a : (byte) 0;
            ik2 ik2Var = (ik2) xk1Var.n;
            if (b == 0) {
                ListView listView = ik2Var.v0;
                if (listView != null) {
                    ListAdapter adapter = listView.getAdapter();
                    if (adapter instanceof lk2) {
                        wk2 wk2Var = ik2Var.F0;
                        if (wk2Var != null) {
                            wk2Var.i1(true);
                        }
                        ((lk2) adapter).q = true;
                        if (ik2Var.F0 != null) {
                            bd4 bd4Var = bd4.k;
                            if (bd4Var == null) {
                                bd4Var = new bd4();
                                bd4.k = bd4Var;
                            }
                            ea2 ea2Var = ea2.m;
                            bd4Var.b = ea2Var;
                            ca6 ca6Var = ca6.g;
                            if (ca6Var == null) {
                                ca6Var = new ca6();
                                ca6.g = ca6Var;
                            }
                            ca6Var.b = ea2Var;
                        }
                        ik2Var.L0();
                        ik2Var.R0(false);
                        wk2 wk2Var2 = ik2Var.F0;
                        if (wk2Var2 != null) {
                            wk2Var2.i1(true);
                        }
                    } else {
                        ye4.c("FileTransferFragment", "dropdownlistener: no adapter available");
                    }
                } else {
                    ye4.c("FileTransferFragment", "dropdownlistener: no filetransfer list available");
                }
            } else if (b == 1) {
                wk2 wk2Var3 = ik2Var.F0;
                if (wk2Var3 != null) {
                    String str = wk2Var3.t;
                    str.getClass();
                    wk2Var3.f2421o.m(str, wk2Var3.V0());
                }
            } else if (b == 2) {
                pk2 pk2Var = ik2Var.z0;
                if (pk2Var != null) {
                    pk2Var.a();
                }
                FileTransferActivity fileTransferActivity = (FileTransferActivity) ik2Var.C();
                if (fileTransferActivity != null) {
                    fileTransferActivity.runOnUiThread(new dk2(ik2Var, fileTransferActivity));
                }
            }
        }
        this.f1134o.dismiss();
    }
}

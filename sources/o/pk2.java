package o;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class pk2 {
    public final FileTransferActivity a;
    public final PopupWindow b;
    public final View c;
    public final j62 d;
    public int e;
    public final int f;
    public int g;

    public pk2(FileTransferActivity fileTransferActivity) {
        this.a = fileTransferActivity;
        PopupWindow popupWindow = new PopupWindow(fileTransferActivity);
        this.b = popupWindow;
        popupWindow.setBackgroundDrawable(new BitmapDrawable(fileTransferActivity.getResources()));
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setOutsideTouchable(false);
        Object systemService = fileTransferActivity.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popupwindow_filetransfer_clip, (ViewGroup) null);
        viewInflate.getClass();
        this.c = viewInflate;
        b(R.dimen.filetransfer_clip_offset_right_x);
        this.f = (int) fileTransferActivity.getResources().getDimension(R.dimen.filetransfer_clip_offset_y);
        popupWindow.setContentView(viewInflate);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        this.d = new j62(fileTransferActivity);
    }

    public final void a() {
        this.b.dismiss();
        this.d.f1134o.dismiss();
    }

    public final void b(int i) {
        Rect rect = new Rect();
        FileTransferActivity fileTransferActivity = this.a;
        View decorView = fileTransferActivity.getWindow().getDecorView();
        decorView.getClass();
        decorView.getWindowVisibleDisplayFrame(rect);
        this.e = ((int) fileTransferActivity.getResources().getDimension(i)) + (decorView.getWidth() - rect.right);
    }
}

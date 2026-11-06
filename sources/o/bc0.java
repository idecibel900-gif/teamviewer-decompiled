package o;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ bc0(byte b) {
        this.a = b;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehaviorL;
        switch (this.a) {
            case 0:
                dialogInterface.getClass();
                s90 s90Var = (s90) dialogInterface;
                FrameLayout frameLayout = (FrameLayout) s90Var.findViewById(R.id.design_bottom_sheet);
                frameLayout.getClass();
                BottomSheetBehavior.x(frameLayout).B(3);
                s90Var.l().D = true;
                break;
            case 1:
                dialogInterface.getClass();
                s90 s90Var2 = (s90) dialogInterface;
                FrameLayout frameLayout2 = (FrameLayout) s90Var2.findViewById(R.id.design_bottom_sheet);
                if (frameLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams instanceof cd1) {
                        zc1 zc1Var = ((cd1) layoutParams).a;
                        if (zc1Var instanceof BottomSheetBehavior) {
                            ((BottomSheetBehavior) zc1Var).B(3);
                        }
                    }
                }
                s90Var2.l().D = true;
                break;
            case 2:
                s90 s90Var3 = dialogInterface instanceof s90 ? (s90) dialogInterface : null;
                FrameLayout frameLayout3 = s90Var3 != null ? (FrameLayout) s90Var3.findViewById(R.id.design_bottom_sheet) : null;
                if (frameLayout3 != null) {
                    BottomSheetBehavior.x(frameLayout3).B(3);
                }
                if (s90Var3 != null && (bottomSheetBehaviorL = s90Var3.l()) != null) {
                    bottomSheetBehaviorL.D = true;
                    break;
                }
                break;
            default:
                dialogInterface.getClass();
                s90 s90Var4 = (s90) dialogInterface;
                FrameLayout frameLayout4 = (FrameLayout) s90Var4.findViewById(R.id.design_bottom_sheet);
                if (frameLayout4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = frameLayout4.getLayoutParams();
                    if (layoutParams2 instanceof cd1) {
                        zc1 zc1Var2 = ((cd1) layoutParams2).a;
                        if (zc1Var2 instanceof BottomSheetBehavior) {
                            ((BottomSheetBehavior) zc1Var2).B(3);
                        }
                    }
                }
                s90Var4.l().D = true;
                break;
        }
    }
}
